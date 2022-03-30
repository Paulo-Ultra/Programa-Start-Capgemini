package Generics.Embarque;

import Generics.Controle.Aeronaves;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aeronaves air = new Aeronaves();
        System.out.println("Informe o nr da aeronaves");
        int nrAerponaves = sc.nextInt();

        //Adicionando voos
        for (int i = 0; i < nrAerponaves; i++){
            int nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }

        System.out.println("O primeiro a decolar vai ser o nr: " + air.primeiroVoo());
        air.listaVoos();
        sc.close();

    }
}
