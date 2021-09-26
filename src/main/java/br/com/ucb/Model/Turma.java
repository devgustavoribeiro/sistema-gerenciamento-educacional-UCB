package br.com.ucb.Model;

import javax.persistence.*;

@Entity
@Table(name = "Turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
