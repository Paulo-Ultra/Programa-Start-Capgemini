package Collections;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        //construindo um arrylist para carros
        ArrayList<String> carros = new ArrayList<>();

        //Adicionando Carros ao arraylist
        carros.add("Fluence");
        carros.add("Jaguar");
        carros.add("BMW");
        carros.add("Mercedes");
        carros.add("Fusca");
        carros.add("Vectra");
        carros.add("Sandero");

        System.out.println(carros);

        //substituição de valores
        carros.set(4, "Mitsubishi");

        System.out.println(carros);

        // adicionando Carros ao arraylist com JOptionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        System.out.println(carros);

        //esvaziando o array
        //carros.clear();

        //System.out.println(carros);

        if(carros.isEmpty()){
            System.out.println("O vetor está vazio");
        }

        for(int i = 0; i < carros.size(); i++) {
            if ("BMM".equals(carros.get(i))) {
                carros.set(i, "Bugatti");
                break;
            } else {
                System.out.println("Não foi encontrado o argumento pesquisado");
            }
        }
        System.out.println(carros);
    }
}
