package atividade1;

public class SistemaOperacional {
    
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public SistemaOperacional() {
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: espaco insuficiente no SSD para instalar o programa.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: memoria RAM insuficiente para executar o programa.");
            return false;
        }


        if (p.getNucleos() > computador.getNucleos()) {
            System.out.println("Erro: nao ha nucleos suficientes para executar o programa.");
            return false;
        }


        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.printf("Tempo de execução: %.2f segundos.%n", tempoExecucao);

        return true;
    }
}
