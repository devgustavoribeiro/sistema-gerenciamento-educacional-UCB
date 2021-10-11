package br.com.ucb.Model;

import java.util.ArrayList;

// GUSTAVO
public class Turma {

   private Integer id;
   private Integer anoEscolar;
   private Integer turno;
   private Funcionario professor;
   private Integer qtdAlunos;
   private Aluno alunos;

   ArrayList<Turma> turmas = new ArrayList<Turma>();

   public Turma(Integer id, Integer anoEscolar, Integer turno, Funcionario professor, Integer qtdAlunos, Aluno alunos) {
      this.id = id;
      this.anoEscolar = anoEscolar;
      this.turno = turno;
      this.professor = professor;
      this.qtdAlunos = qtdAlunos;
      this.alunos = alunos;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getAnoEscolar() {
      return anoEscolar;
   }

   public void setAnoEscolar(Integer anoEscolar) {
      this.anoEscolar = anoEscolar;
   }

   public Integer getTurno() {
      return turno;
   }

   public void setTurno(Integer turno) {
      this.turno = turno;
   }

   public Funcionario getProfessor() {
      return professor;
   }

   public void setProfessor(Funcionario professor) {
      this.professor = professor;
   }

   public Integer getQtdAlunos() {
      return qtdAlunos;
   }

   public void setQtdAlunos(Integer qtdAlunos) {
      this.qtdAlunos = qtdAlunos;
   }

   public Aluno getAlunos() {
      return alunos;
   }

   public void setAlunos(Aluno alunos) {
      this.alunos = alunos;
   }

   @Override
   public String toString() {
      return "Turma{" + "id=" + id + ", anoEscolar='" + anoEscolar + '\'' + ", turno='" + turno + '\'' + ", professor='" + professor + '\'' + ", qtdAlunos='" + qtdAlunos + '\'' + ", alunos='" + alunos + '\'' + '}';
   }

}
