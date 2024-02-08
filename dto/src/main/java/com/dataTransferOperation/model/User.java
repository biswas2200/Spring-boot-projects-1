package com.dataTransferOperation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usersTable")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long userId;
    private String email;
    @Column( name = "user_firstName")
    private String firstName;
    @Column( name = "user_lastName")
    private String lastName;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "location_id")
    private Location location;

}
