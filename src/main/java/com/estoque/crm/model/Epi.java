package com.estoque.crm.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Epi {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incremento obrigado pelo banco de dados
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int ca;

    @Column(nullable = false)
    private LocalDate validadeCa;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private int quantidadeEstoque;


}
