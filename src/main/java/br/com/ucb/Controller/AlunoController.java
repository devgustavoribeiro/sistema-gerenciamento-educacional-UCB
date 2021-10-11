package br.com.ucb.Controller;

import br.com.ucb.Model.Aluno;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AlunoController extends GeradorID{
    SecureRandom random = new SecureRandom();
    //GeradorID geradorId = new GeradorID();
    String anoEscolhido;
    String turno;
    Scanner sc = new Scanner(System.in);
    List<Aluno> alunosMatriculados = new ArrayList<>();
    private static final String MSG_SUCESSO = "Aluno matriculado com sucesso!";

    public void matricularAluno(){
        Integer id = geradorId();
        System.out.println("Matricula: ");
        Integer matricula = random.nextInt(10000);
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("CPF: ");
        String cpf = sc.next();
        System.out.println("Data de nascimento: ");
        String dt = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Escolha o ano escolar:");
        mostraAnos();
        escolheAno();
        System.out.println("Escolha o turno:");
        System.out.println("1 - MATUTINO / 2 - VESPERTINO");
        escolheTurno();
        String status = StatusAluno.ATIVO.toString();

        Aluno a = new Aluno(id, matricula, nome, cpf, dt, email, anoEscolhido, status);
        salvarDados(a);
        System.out.println(MSG_SUCESSO);


    }

    public void listarEstudantes(){
        for(int i=0; i<alunosMatriculados.size(); i++){
            System.out.print(("ID = ") + alunosMatriculados.get(i).getId());
            System.out.println("Matricula: " + alunosMatriculados.get(i).getMatricula());
            System.out.println(("Nome = ") + alunosMatriculados.get(i).getNome());
            System.out.println(("CPF = ") + alunosMatriculados.get(i).getCpf());
            System.out.println(("Data de Nascimento = ") + alunosMatriculados.get(i).getDataNascimento());
            System.out.println(("E-mail = ") + alunosMatriculados.get(i).getEmail());
            System.out.println(("Ano Escolar = ") + alunosMatriculados.get(i).getAnoEscolar());
            System.out.println(("Status do Aluno = ") + alunosMatriculados.get(i).getStatusAluno());
        }
    }

    public void exibirAlunosAptosParaNovasTurmas(){
        for(int i=0; i<alunosMatriculados.size(); i++){
            if(alunosMatriculados.get(i).getStatusAluno() != "INATIVO" && alunosMatriculados.get(i).getStatusAluno() != "CURSANDO"){
                System.out.println("Matricula: " + alunosMatriculados.get(i).getMatricula());
                System.out.println("Nome: " + alunosMatriculados.get(i).getNome());
                System.out.println("Data de Nascimento: " + alunosMatriculados.get(i).getDataNascimento());
                System.out.println("Ano escolar: " + alunosMatriculados.get(i).getAnoEscolar());
                System.out.println("Email: " + alunosMatriculados.get(i).getEmail());

            }
        }
    }

    public void salvarDados(Aluno aluno) {
        alunosMatriculados.add(aluno);

    }

    public void mostraAnos(){
        AnoEscolar ano[] = AnoEscolar.values();
        for(AnoEscolar anoEscolar : ano){
            System.out.println(anoEscolar + " - " + anoEscolar.ordinal());
        }
    }

    public void escolheAno(){

        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                anoEscolhido = AnoEscolar.PRIMEIRO_ANO_EF.toString();
                break;
            case 2:
                anoEscolhido = AnoEscolar.SEGUNDO_ANO_EF.toString();
                break;
            case 3:
                anoEscolhido = AnoEscolar.TERCEIRO_ANO_EF.toString();
                break;
            case 4:
                anoEscolhido = AnoEscolar.QUARTO_ANO_EF.toString();
                break;
            case 5:
                anoEscolhido = AnoEscolar.QUINTO_ANO_EF.toString();
                break;
            case 6:
                anoEscolhido = AnoEscolar.SEXTO_ANO_EF.toString();
                break;
            case 7:
                anoEscolhido = AnoEscolar.SETIMO_ANO_EF.toString();
                break;
            case 8:
                anoEscolhido = AnoEscolar.OITAVO_ANO_EF.toString();
                break;
            case 9:
                anoEscolhido = AnoEscolar.NONO_ANO_EF.toString();
                break;
            case 10:
                anoEscolhido = AnoEscolar.PRIMEIRO_ANO_EM.toString();
                break;
            case 11:
                anoEscolhido = AnoEscolar.SEGUNDO_ANO_EM.toString();
                break;
            case 12:
                anoEscolhido = AnoEscolar.TERCEIRO_ANO_EM.toString();
                break;
            default:
                System.out.println("Não é possível inserir esse ano. Não existe no calendário acadêmico.");

        }


    }

    public void escolheTurno(){
        String turno;
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                turno = Turnos.MATUTINO.toString();
                break;
            case 2:
                turno = Turnos.VERPERTINO.toString();
                break;

        }
    }

    public void excluirAluno(){
        int escolha;
        String novoStatus;
        System.out.println("Digite a matricula do aluno que deseja excluir:");
        escolha = sc.nextInt();
        for(int i = 0; i<alunosMatriculados.size(); i++){
            if(alunosMatriculados.get(i).getMatricula() == escolha){
                novoStatus = StatusAluno.INATIVO.toString();
                alunosMatriculados.get(i).setStatusAluno(novoStatus);
            }
        }
    }

    public void alteraStatusParaAlunoCursando(Integer escolheAluno){
        for(int i=0; i<alunosMatriculados.size(); i++){
            if(escolheAluno == alunosMatriculados.get(i).getMatricula()){
                alunosMatriculados.get(i).setStatusAluno("CURSANDO");
            }

            }
    }



}




