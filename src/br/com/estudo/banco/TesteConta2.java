package br.com.estudo.banco;

public class TesteConta2
{
    public static void main(String[] args)
    {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia(1111);
        contaCorrente.setNumero(2222);
        contaCorrente.setTipo("PF");
        contaCorrente.setChequeEspecial(1000);
    }
}
