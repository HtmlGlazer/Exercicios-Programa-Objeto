package sistema_radar;

public class Radar {
    public String localizacao;
    public Integer limitevelocidade;

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
