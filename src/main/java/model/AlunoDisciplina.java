package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by daniel on 15/12/2016.
 */
@Entity
@Table(name = "alunodisciplina")
public class AlunoDisciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int     id_alunoDisciplina;

    private int     notaFormalN1;
    private boolean getNotaFormalN1Aplicada;
    private int     notaConhecimentosGerais;
    private boolean notaConhecimentosGeraisAplicada;
    private int     notaProcessualN1;
    private boolean notaProcessualN1Aplicada;
    private int     mediaN1;

    private int     notaFormalN2;
    private boolean getNotaFormalN2Aplicada;
    private int     notaProcessualN2;
    private boolean notaProcessualN2Aplicada;
    private int     mediaN2;

    private int     notaFormalN3;
    private boolean getNotaFormalN3Aplicada;
    private int     mediaN3;

    private int     notaFormalN4;
    private boolean getNotaFormalN4Aplicada;
    private int     mediaN4;

    private int     mediaGeral;

    private boolean aprovado;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    public int getId_alunodisclina() {
        return id_alunoDisciplina;
    }

    public void setId_alunodisclina(int id_alunodisclina) {
        this.id_alunoDisciplina = id_alunodisclina;
    }

    public int getNotaFormalN1() {
        return notaFormalN1;
    }

    public void setNotaFormalN1(int notaFormalN1) {
        this.notaFormalN1 = notaFormalN1;
    }

    public boolean isGetNotaFormalN1Aplicada() {
        return getNotaFormalN1Aplicada;
    }

    public void setGetNotaFormalN1Aplicada(boolean getNotaFormalN1Aplicada) {
        this.getNotaFormalN1Aplicada = getNotaFormalN1Aplicada;
    }

    public int getNotaConhecimentosGerais() {
        return notaConhecimentosGerais;
    }

    public void setNotaConhecimentosGerais(int notaConhecimentosGerais) {
        this.notaConhecimentosGerais = notaConhecimentosGerais;
    }

    public boolean isNotaConhecimentosGeraisAplicada() {
        return notaConhecimentosGeraisAplicada;
    }

    public void setNotaConhecimentosGeraisAplicada(boolean notaConhecimentosGeraisAplicada) {
        this.notaConhecimentosGeraisAplicada = notaConhecimentosGeraisAplicada;
    }

    public int getNotaProcessualN1() {
        return notaProcessualN1;
    }

    public void setNotaProcessualN1(int notaProcessualN1) {
        this.notaProcessualN1 = notaProcessualN1;
    }

    public boolean isNotaProcessualN1Aplicada() {
        return notaProcessualN1Aplicada;
    }

    public void setNotaProcessualN1Aplicada(boolean notaProcessualN1Aplicada) {
        this.notaProcessualN1Aplicada = notaProcessualN1Aplicada;
    }

    public int getMediaN1() {
        return mediaN1;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setMediaN1(int mediaN1) {
        this.mediaN1 = mediaN1;
    }

    public int getNotaFormalN2() {
        return notaFormalN2;
    }

    public void setNotaFormalN2(int notaFormalN2) {
        this.notaFormalN2 = notaFormalN2;
    }

    public boolean isGetNotaFormalN2Aplicada() {
        return getNotaFormalN2Aplicada;
    }

    public void setGetNotaFormalN2Aplicada(boolean getNotaFormalN2Aplicada) {
        this.getNotaFormalN2Aplicada = getNotaFormalN2Aplicada;
    }

    public int getNotaProcessualN2() {
        return notaProcessualN2;
    }

    public void setNotaProcessualN2(int notaProcessualN2) {
        this.notaProcessualN2 = notaProcessualN2;
    }

    public boolean isNotaProcessualN2Aplicada() {
        return notaProcessualN2Aplicada;
    }

    public void setNotaProcessualN2Aplicada(boolean notaProcessualN2Aplicada) {
        this.notaProcessualN2Aplicada = notaProcessualN2Aplicada;
    }

    public int getMediaN2() {
        return mediaN2;
    }

    public void setMediaN2(int mediaN2) {
        this.mediaN2 = mediaN2;
    }

    public int getNotaFormalN3() {
        return notaFormalN3;
    }

    public void setNotaFormalN3(int notaFormalN3) {
        this.notaFormalN3 = notaFormalN3;
    }

    public boolean isGetNotaFormalN3Aplicada() {
        return getNotaFormalN3Aplicada;
    }

    public void setGetNotaFormalN3Aplicada(boolean getNotaFormalN3Aplicada) {
        this.getNotaFormalN3Aplicada = getNotaFormalN3Aplicada;
    }

    public int getMediaN3() {
        return mediaN3;
    }

    public void setMediaN3(int mediaN3) {
        this.mediaN3 = mediaN3;
    }

    public int getNotaFormalN4() {
        return notaFormalN4;
    }

    public void setNotaFormalN4(int notaFormalN4) {
        this.notaFormalN4 = notaFormalN4;
    }

    public boolean isGetNotaFormalN4Aplicada() {
        return getNotaFormalN4Aplicada;
    }

    public void setGetNotaFormalN4Aplicada(boolean getNotaFormalN4Aplicada) {
        this.getNotaFormalN4Aplicada = getNotaFormalN4Aplicada;
    }

    public int getMediaN4() {
        return mediaN4;
    }

    public void setMediaN4(int mediaN4) {
        this.mediaN4 = mediaN4;
    }

    public int getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(int mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
