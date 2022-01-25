package com.prejeto.PersonAPI.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data//Serve para criar os getters e setters
@Builder//Cria o corpo
@AllArgsConstructor//Cria todos os construtores
@NoArgsConstructor
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)//unique, o valor da coluna tem que ser unico
    private String cpf;

    private String birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;

    }
