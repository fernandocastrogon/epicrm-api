package com.estoque.crm.model;


import jakarta.persistence.*;
import lombok.Data;



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





}
