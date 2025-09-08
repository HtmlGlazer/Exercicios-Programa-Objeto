package sistema_radar;

public class Radar {
    private String localizacao;
    private Integer limitevelocidade;

    public Radar( String localizacao, Integer limitevelocidade){
        this.localizacao = localizacao;
        this.limitevelocidade = limitevelocidade;
    }

    public String getlocalizacao(){
        return this.localizacao;
    }

    public void setlocalizacao( String localizacao){
        this.localizacao = localizacao;
    }

    public Integer getlimitevelocidade(){
        return this.limitevelocidade;
    }

    public void setlimitevelocidade( Integer limitevelocidade){
        this.limitevelocidade = limitevelocidade;
    }   

    public void emitirnotificacao(String placa, Integer velocidadeobservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+velocidadeobservada);
        System.out.println("Localização: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limitevelocidade);
    }

    public void avaliarvelocidade(Carro carro){
        if (carro.velocidade > this.limitevelocidade) {
        emitirnotificacao(carro.placa , carro.velocidade);
        }
    }
    
}
