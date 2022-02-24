package br.com.unifatecie.classes;

/*
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
normalmente usario o lombok para getter e setters mais como foi pedido no exercicio para criar os metodos acessores.

*/

public class ContaCorrente {

    private int conta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(){//Construtor
        this.setAgencia(810);
        this.setConta(143510);
        this.setNomeCliente("Inácio Mecena");
        this.setSaldo(0);

    }


    public void depositar(float v){
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Deposito de: " + this.getSaldo() +
                " realizado na conta de: " + this.getNomeCliente());

    }
    public int sacar(float v) {
        int status;
        if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            status = 1;
            System.out.println("Saque de: " + v + " realizado na conta de: " + this.getNomeCliente());
        } else {
            status = 0;
        System.out.println("Saldo insuficiente!");
        }
        return status;

    }
    public void imprimir(){
        System.out.println("---------------");
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Correntista: " + this.getNomeCliente());
        System.out.println("Saldo: " + this.getSaldo());

    }
}
