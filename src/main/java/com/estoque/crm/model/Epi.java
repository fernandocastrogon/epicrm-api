package com.estoque.crm.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Epi {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incremento obrigado pelo banco de dados
    private Long id;

    @NotEmpty
    private String descricao;

    @NotNull
    private int ca;

    @Future (message = "A validade está vencida")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate validadeCa;

    @NotEmpty
    private String categoria;

    @NotNull
    private int quantidadeEstoque;


}
