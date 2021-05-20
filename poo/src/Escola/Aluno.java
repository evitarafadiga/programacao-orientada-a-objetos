package Escola;

import java.time.LocalDate;


public class Aluno {
    long id = 0;
    String ra = "";
    String nome = "";
    LocalDate nascimento;

    public Aluno(long id, String ra, String nome, LocalDate nascimento) {
        this.id = id;
        this.ra = ra;
        this.nome= nome;
        this.nascimento = nascimento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }



}
