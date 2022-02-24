package br.com.unifatecie;

import br.com.unifatecie.classes.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        cc.sacar(550);
        //pr.alterarNome("Carmen");
        cc.imprimir();

    }
}
