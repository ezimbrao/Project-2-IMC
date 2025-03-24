package br.com.fecaf;

import br.com.fecaf.model.Imc;
import br.com.fecaf.model.Pessoa;

public class App {

    public static void main(String[] args) {
        System.out.println("Calculadora IMC");

        // Instancia new pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();


        //cadastrar pessoa 1
        pessoa1.cadastrarPessoa();
        pessoa1.cadastrarPessoa();

        //Instanciar Objeto IMC
        Imc imc = new Imc();

        // calcular IMC
        imc.calcularImc(pessoa1.peso, pessoa1.altura);

        pessoa1.statusImc = imc.classficarImc();

        pessoa1.exibirInformacoes();


        //calcular IMC pessoa 2

        imc.calcularImc(pessoa2.peso, pessoa2.altura);

        pessoa2.statusImc = imc.classficarImc();

        pessoa2.exibirInformacoes();

    }

}
