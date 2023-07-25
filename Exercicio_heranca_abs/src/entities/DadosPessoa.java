package entities;

import static java.lang.String.format;

public abstract class DadosPessoa {
    private String nome;
    private  double rendaAnual;
    public DadosPessoa(){
    }

    public DadosPessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return nome + ": $ " + String.format("%.2f", imposto());
    }

    public abstract double imposto();
}


