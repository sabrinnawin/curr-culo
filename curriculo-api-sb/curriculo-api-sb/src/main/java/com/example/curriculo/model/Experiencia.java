package com.example.curriculo.model;

import jakarta.persistence.*;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;
    private String cargo;
    private String descricao;
    private String dataInicio;
    private String dataFim;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

    // getters and setters
}
