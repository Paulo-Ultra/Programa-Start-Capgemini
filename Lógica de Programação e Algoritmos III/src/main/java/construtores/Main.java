package construtores;

import construtores.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa(75.0f,1.70f);

        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(sc.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(sc.nextFloat());

        objetoPessoa.getPeso();

        System.out.println("IMC = " + String.format("%.2f",objetoPessoa.calcularIMC()));
    }
}
