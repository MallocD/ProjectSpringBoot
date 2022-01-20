package com.prejeto.PersonAPI.entity;

import com.prejeto.PersonAPI.enums.PhoneType;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {

    @Id//Gera ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gera um valor em sequencia
    private Long id;

    @Enumerated(EnumType.STRING)//Dis que é do tipo enum
    @Column(nullable = false)//Criar uma coluna que não aceita nulos // not null banco de dados
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
