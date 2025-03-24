package br.com.fecaf.model;

public class Imc {

    //Isso é um atributo

    public double imc;

    public String statusImc;

    public void calcularImc (int peso, double altura) {
        imc = peso / (altura * altura);
        System.out.println("O seu IMC é: " + imc);
    }



    public String classficarImc () {
        if (imc < 18.5) {
            statusImc = "Abaixo do peso....";

        } else if (imc > 18.5 && imc < 24.99) {
            statusImc = "Normal...";
        } else if (imc > 24.99 && imc < 29.99) {
            statusImc = "Sobrepeso...";
        } else {
            statusImc = "Obeso....";
        }
        System.out.println("O seu status é; " + statusImc);
        return statusImc;
    }
}
