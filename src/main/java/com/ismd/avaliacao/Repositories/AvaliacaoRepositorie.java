package com.ismd.avaliacao.Repositories;

import com.ismd.avaliacao.Model.AvaliacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AvaliacaoRepositorie extends JpaRepository<AvaliacaoModel, UUID> {
}
