package com.example.boot_rest_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String employee_id;

    @NonNull
    private String first_name;

    @NonNull
    private String last_name;

    @NonNull
    private String email;

    @NonNull
    private String title;
}
