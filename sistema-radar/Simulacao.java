package sistema_radar;

public class Simulacao {
public static void main(String[] args) {
    Carro opala =  new Carro();
    opala.ano = 76;
    opala.modelo = "Comodoro";
    opala.placa = "ACLR300";
    opala.velocidade = 0;

    Radar radar = new Radar();
    radar.localizacao = "Pistão Sul";
    radar.limitevelocidade = 60;

    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();
    opala.acelerar();

    radar.avaliarvelocidade(opala);
}
}
