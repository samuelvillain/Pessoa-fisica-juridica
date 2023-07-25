package entities;

public class PessoaFisica extends DadosPessoa {
    private double gastosSaude;
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto(){
        if (getRendaAnual() < 20000.00) {
            return (getRendaAnual() * 0.15) - (gastosSaude * 0.50);
        } else {
            return (getRendaAnual() * 0.25) - (gastosSaude * 0.50);
        }
    }

}
