package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa();

        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.peso = sc.nextFloat();
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.altura = sc.nextFloat();

        //sem orientação a objetos
//        imc = peso / (altura * altura);
//        System.out.println("IMC = " + imc);

        //
        System.out.println("IMC = " + String.format("%.2f",objetoPessoa.calcularIMC()));
    }
}
