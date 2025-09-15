package atividade1;

public class Computador {
    public Integer memoriaRAM;
    public Integer SSD;
    public Integer nucleos;
    public Float operacoesPorSegundo;

    public Computador ( Integer memoriaRAM, Integer SSD, Integer nucleos, Float operacoesPorSegundo ){
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public void setSSD( Integer SSD){
        this.SSD = SSD;
    }

    public Integer getMemoriaRAM(){
        return this.memoriaRAM;
    }

    public void setMemoriaRAMA ( Integer memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getNucleos(){
        return this.nucleos;
    }

    public void setNucleos( Integer nucleos){
        this.nucleos = nucleos;
    }

    public Float getOperacoesPorSegundo(){
        return this.operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo (Float operacoesPorSegundo){
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
}