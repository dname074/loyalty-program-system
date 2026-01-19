package com.dname074.loyalty_program_system.model;

import com.dname074.loyalty_program_system.exception.ResourceAlreadyExistsException;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(
        name="users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email")
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime registrationDate;
    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Membership> memberships = new ArrayList<>();
    // orphanRemoval -> jeśli obiekt zostanie usuniety z listy to rowniez zostanie usunieta jego encja z bazy
    // cascadetype.REMOVE -> jeśli obiekt User zostanie usunięty to wszystkie obiekty zalezne od niego rowniez zostaną usunięte z bazy
    @PrePersist
    private void prePersistConfig() {
        this.registrationDate = LocalDateTime.now();
    }

    public void addMembership(LoyaltyProgram loyaltyProgram) {
        boolean membershipExists = memberships.stream()
                .anyMatch(membership -> membership.getProgram().equals(loyaltyProgram));

        if (membershipExists) {
            throw new ResourceAlreadyExistsException("To członkostwo zostało już zarejestrowane");
        }

        Membership membership = new Membership();
        membership.setUser(this);
        membership.setProgram(loyaltyProgram);
        memberships.add(membership);
    }
}

