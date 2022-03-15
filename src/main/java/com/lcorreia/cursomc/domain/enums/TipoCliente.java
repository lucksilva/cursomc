package com.lcorreia.cursomc.domain.enums;

public enum TipoCliente {

    PESSOAFISICA(100, "Pessoa Física"),
    PESSOAJURIDICA(200, "Pessoa Jurídica");

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod){
        if (cod == null){
            return null;
        }

        for(TipoCliente x : TipoCliente.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalArgumentException("Id invalido: " + cod);
    }
}
