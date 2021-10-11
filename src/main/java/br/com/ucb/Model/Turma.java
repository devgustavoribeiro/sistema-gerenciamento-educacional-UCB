package br.com.ucb.Model;

import java.util.ArrayList;

// GUSTAVO
public class Turma {

   private Integer id;
   private String anoEscolar;
   private String turno;
   private String professor;
   private Integer qtdAlunos;


   ArrayList<Turma> turma = new ArrayList<Turma>();

   public Turma(Integer id, String anoEscolar, String turno, String professor, Integer qtdAlunos) {
      this.id = id;
      this.anoEscolar = anoEscolar;
      this.turno = turno;
      this.professor = professor;
      this.qtdAlunos = qtdAlunos;

   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getAnoEscolar() {
      return anoEscolar;
   }

   public void setAnoEscolar(String anoEscolar) {
      this.anoEscolar = anoEscolar;
   }

   public String getTurno() {
      return turno;
   }

   public void setTurno(String turno) {
      this.turno = turno;
   }

   public String getProfessor() {
      return professor;
   }

   public void setProfessor(String professor) {
      this.professor = professor;
   }

   public Integer getQtdAlunos() {
      return qtdAlunos;
   }

   public void setQtdAlunos(Integer qtdAlunos) {
      this.qtdAlunos = qtdAlunos;
   }



   @Override
   public String toString() {
      return "Turma{" + "id=" + id + ", anoEscolar='" + anoEscolar + '\'' + ", turno='" + turno + '\'' + ", professor='" + professor + '\'' + ", qtdAlunos='" + qtdAlunos + '\'';
   }

}
