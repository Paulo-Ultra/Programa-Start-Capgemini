package Generics.Embarque;

import Generics.Controle.AeronavesComGenerics;

import javax.swing.*;
import java.util.Scanner;

public class PrincipalComGenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
        AeronavesComGenerics<String> air = new AeronavesComGenerics<>();
        System.out.println("Informe o nr de aeronaves");
        int nrAeronaves = sc.nextInt();

        for(int i = 0; i < nrAeronaves; i++){
            String nrVoo = JOptionPane.showInputDialog("Informe o numero do voo");
            air.addVoo(nrVoo);
        }
        air.primeiroVoo();
        String x = (String) air.primeiroVoo();
        System.out.println("O primeiro a decolar é o voo: " + x);
        air.listaVoos();
        sc.close();
    }
}
