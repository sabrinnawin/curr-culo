package com.example.curriculo.model;

import jakarta.persistence.*;

@Entity
public class Educacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instituicao;
    private String grau;
    private String curso;
    private String dataInicio;
    private String dataFim;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

    // getters and setters
}
