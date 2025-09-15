package com.ismd.avaliacao.Model;

import com.ismd.avaliacao.Enums.EnumRespostas;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class AvaliacaoModel implements Serializable {

    private static final long SerialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID AvaliacaoId;

    private LocalDate data;
    private String hora;
    private String atendente_nome;
    private String atendimento;
    private String motivos;

    public UUID getAvaliacaoId() {
        return AvaliacaoId;
    }

    public void setAvaliacaoId(UUID avaliacaoId) {
        AvaliacaoId = avaliacaoId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAtendente_nome() {
        return atendente_nome;
    }

    public void setAtendente_nome(String atendente_nome) {
        this.atendente_nome = atendente_nome;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
    }
}
