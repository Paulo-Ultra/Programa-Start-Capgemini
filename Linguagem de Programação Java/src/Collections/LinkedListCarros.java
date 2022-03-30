package Collections;

import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {
        /*
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()
         */

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        //add Mazda ao início
        cars.addFirst("Mazda");
        System.out.println(cars);

        //add Bugatti ao final
        cars.addLast("Bugatti");
        System.out.println(cars);

        //carro = cars.get(3);

        //Removendo Mazda
        cars.removeFirst();
        System.out.println(cars.getFirst());
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars.getLast());
        System.out.println(cars);

        cars.clear();
        if(cars.isEmpty()){
            System.out.println("LinkedList vazio");
        }

    }
}
