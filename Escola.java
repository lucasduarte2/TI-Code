/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estga.poo.escola;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Escola {

    public static void main(String[] args) {
        // Criar alunos
        Aluno aluno1 = new Aluno(123, "Bruno");
        Aluno aluno2 = new Aluno(456, "Pirre");

        Aluno aluno8 = new Aluno(321, "Tiago");
        Aluno aluno9 = new Aluno(654, "Cravo");
        
        // Adicionar notas
        aluno1.adicionarNota(15.5f);
        aluno1.adicionarNota(8.0f);
        aluno2.adicionarNota(19.0f);
        aluno2.adicionarNota(8.5f);
        
        aluno9.adicionarNota(1.1f);
        aluno9.adicionarNota(8.0f);
        aluno8.adicionarNota(9.0f);
        aluno8.adicionarNota(2.7f);

        // Criar turma
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        
        // Alunos
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);

        turma2.adicionarAluno(aluno8);
        turma2.adicionarAluno(aluno9);
        
        // Mostra os alunos e as suas notas
        turma1.listarAlunos();
        turma2.listarAlunos();
        
        //Remover aluno
        turma2.removerAluno(aluno9);
        System.out.println("---------------------------- Remover Aluno -----------------------------");
        turma2.listarAlunos();
    }
}

//Exercicio (a)

 class Aluno {
    private int numMecanografico;
    private String nome;
    private List<Float> notas;


    public Aluno(int numMecanografico, String nome) {
        this.numMecanografico = numMecanografico;
        this.nome = nome;
        this.notas = new ArrayList<Float>();
    }

    //Definir numMecanografico
    public int getNumMecanografico() {
        return numMecanografico;
    }
    public void setNumMecanografico(int numMecanografico) {
        this.numMecanografico = numMecanografico;
    }

        //Definir Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

        //Definir Notas
    public void adicionarNota(float nota) {
        this.notas.add(nota);
    }
    public float calcularMedia() {
        if (notas.size() == 0) {
            return 0;
        }

        //Calcular a media das notas
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}

//Exercicio (b)
class Turma {
    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Número mecanográfico: " + aluno.getNumMecanografico() +
                               ", Nome: " + aluno.getNome() +
                               ", Média de classificações: " + aluno.calcularMedia());
        }
    }
}

