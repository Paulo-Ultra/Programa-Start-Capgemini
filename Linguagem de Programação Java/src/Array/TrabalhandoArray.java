package Array;

import javax.swing.*;

public class TrabalhandoArray {
    public static void main(String[] args) {
        //declarando array de países
        String[] paises = new String[4];
        //Declarando array de números
        int[] numeros = new int[10];

        //Abastecendo o array de países
       /* for(int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Digite o  nome de um país: ");
        }
        //Listando o array de países
        for (String listaPaises : paises) {
            System.out.println(listaPaises);
        }*/

        for(int i = 0; i < 10; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        }

        for(Integer listaNumeros : numeros){
            System.out.println(listaNumeros);
        }
    }
}
