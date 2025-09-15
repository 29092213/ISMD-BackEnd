package com.ismd.avaliacao.Controller;

import com.ismd.avaliacao.Dtos.AvaliacaoDto;
import com.ismd.avaliacao.Model.AvaliacaoModel;
import com.ismd.avaliacao.Service.AvaliacaoService;
import com.ismd.avaliacao.Service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AVALIAR")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @Autowired
    private EmailService emailService;

    @CrossOrigin
    @PostMapping("/Create")
    ResponseEntity<String> Create (@RequestBody @Valid AvaliacaoDto dto){
        avaliacaoService.Register(dto);
        emailService.sendEmail(
                "luizjdf13@gmail.com",
                "Avaliação Recebida",
                "Somos gratos pelo FeedBack, a equipe ISMD agradece a sinceridade.");
        return ResponseEntity.status(HttpStatus.CREATED).body("tudo certo");

    }

    @GetMapping("/FindAll")
    ResponseEntity<List<AvaliacaoModel>> FindAll(){
        return ResponseEntity.status(HttpStatus.OK).body(avaliacaoService.ListarReacoes());
    }

    @CrossOrigin
    @PostMapping("/receber-dados")
    public String dadosRecebidos (){
        return "Dados recebidos com sucesso";
    }


}
