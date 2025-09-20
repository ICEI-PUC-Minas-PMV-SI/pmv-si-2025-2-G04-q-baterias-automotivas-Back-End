package com.idiesoftware.baterias24hrs.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;
    private boolean ativo = true;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}