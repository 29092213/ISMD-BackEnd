package com.ismd.avaliacao.Service;

import com.ismd.avaliacao.Dtos.AvaliacaoDto;
import com.ismd.avaliacao.Model.AvaliacaoModel;
import com.ismd.avaliacao.Repositories.AvaliacaoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepositorie avaliacaoRepositorie;

    public AvaliacaoModel Register(AvaliacaoDto dto){
        AvaliacaoModel model = new AvaliacaoModel();
        model.setData(dto.data());
        model.setHora(dto.hora());
        model.setAtendente_nome(dto.atendente_nome());
        model.setAtendimento(dto.atendimento());
        model.setMotivos(dto.motivos());
        return avaliacaoRepositorie.save(model);
    }

    public List<AvaliacaoModel> ListarReacoes(){
        return avaliacaoRepositorie.findAll();
    }
}
