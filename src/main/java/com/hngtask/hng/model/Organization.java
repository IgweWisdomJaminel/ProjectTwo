package com.hngtask.hng.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orgId;

    @NotBlank(message = "Organisation name is required")
    private String name;

    private String description;

    @ManyToMany(mappedBy = "organisations", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();
}

