package br.com.estudo.banco;

public class ContaCorrente extends Conta
{
    private String tipo;
    private double chequeEspecial;

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setChequeEspecial(double chequeEspecial)
    {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel()
    {
        return  super.getSaldo() + chequeEspecial;
    }

    @Override
    public void retirar(double valor)
    {
        valor += 10;
        super.retirar(valor);
    }
}
