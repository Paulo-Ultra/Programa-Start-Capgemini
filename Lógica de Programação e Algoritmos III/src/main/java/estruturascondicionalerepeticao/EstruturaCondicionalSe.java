package estruturascondicionalerepeticao;

import java.sql.SQLOutput;

public class EstruturaCondicionalSe {
    public static void main(String[] args) {

        int media = 7;

        // >
        // >=
        // <
        // <=
        // ==
        // !=

        // &&
        // ||
        // !

        if(media >= 7){
            if(media == 10) {
                System.out.println("Aprovado com média máxima");
            } else {
                System.out.println("Aprovado");
            }
        } else {
            System.out.println("Reprovado");
        }
    }
}

