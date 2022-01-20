package com.prejeto.PersonAPI.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data//Anotações
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @Size(min = 11, max = 14)
    private String cpf;

    private String birthDate;

    @Valid//Validação através dass anotações de cada atributo
    @NotEmpty
    private List<PhoneDTO> phoneS;


}
