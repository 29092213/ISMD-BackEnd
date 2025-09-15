package com.ismd.avaliacao.Enums;

public enum EnumRespostas {

    PESSIMO("Não foi agradável"),
    RUIM("Abaixo do esperado"),
    MEDIO("O atendiemnto foi mediano"),
    BOM("O Atendimento foi acima da média"),
    EXCELENTE("O atendimento superou as expectativas");

    private String Descricao;

    EnumRespostas(String Descricao){
        this.Descricao = Descricao;
    }

    public String getDescricao() {
        return Descricao;
    }
}
