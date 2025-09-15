package atividade1;

public class Main {
    public static void main(String[] args){

        Computador pc =  new Computador ( 16, 250, 8, 3.5f);

        SistemaOperacional os = new SistemaOperacional (pc);

        Programa cs = new Programa ( 8, 100,  4, 100000);
        Programa stardew = new Programa ( 4, 300,  2, 10000);
        Programa dbd = new Programa ( 17, 250,  8, 90000);

        System.out.println("\n--- Executando Programa 1 ---");
        os.executarPrograma(cs);

        System.out.println("\n--- Executando Programa 2 ---");
        os.executarPrograma(stardew);

        System.out.println("\n--- Executando Programa 3 ---");
        os.executarPrograma(dbd);


    }
}

