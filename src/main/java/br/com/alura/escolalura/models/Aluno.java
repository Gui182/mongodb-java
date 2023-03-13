package br.com.alura.escolalura.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

public class Aluno {

    private ObjectId id;
    private String nome;
    private Date dataNascimento;
    private List<Nota> notas;
    private Curso curso;
    private List<Habilidade> habilidades;
    private Contato contato;

    public ObjectId getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public List<Nota> getNotas() {
        if (notas == null) {
            notas = new ArrayList<Nota>();
        }

        return notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Habilidade> getHabilidades() {
        if (habilidades == null) {
            habilidades = new ArrayList<Habilidade>();
        }

        return habilidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Aluno criarId() {
        setId(new ObjectId());
        return this;
    }

    public Aluno adicionar(Aluno aluno, Habilidade habilidade) {
        List<Habilidade> habilidades = aluno.getHabilidades();
        habilidades.add(habilidade);
        aluno.setHabilidades(habilidades);
        return aluno;
    }

    public Aluno adicionar(Aluno aluno, Nota nota) {
        List<Nota> notas = aluno.getNotas();
        notas.add(nota);
        aluno.setNotas(notas);
        return aluno;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
