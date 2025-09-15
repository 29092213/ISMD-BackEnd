package com.ismd.avaliacao.Dtos;

import com.ismd.avaliacao.Enums.EnumRespostas;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AvaliacaoDto(@NotNull LocalDate data, @NotBlank String hora, @NotBlank String atendente_nome,@NotBlank String atendimento,@NotBlank String motivos) {
}
