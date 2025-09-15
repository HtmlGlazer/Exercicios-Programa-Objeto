package atividade1;

public class Programa {
    public Integer memoriaRAMAlocada;
    public Integer SSDOcupado;
    public Integer nucleos;
    public Integer quantidadeOperacoes;

    public Programa ( Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes ){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getSSDOcupado(){
        return this.SSDOcupado;
    }

    public void setSSDOcupado( Integer SSDOcupado){
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getMemoriaRAMAlocada(){
        return this.memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada ( Integer memoriaRAMAlocada){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getNucleos(){
        return this.nucleos;
    }

    public void setNucleos( Integer nucleos){
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeOperacoes(){
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes (Integer quantidadeOperacoes){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}