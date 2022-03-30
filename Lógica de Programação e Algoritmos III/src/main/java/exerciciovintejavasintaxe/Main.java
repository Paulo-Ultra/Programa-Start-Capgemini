package exerciciovintejavasintaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano de fabricação: ");
            anoFabricacao = sc.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = sc.nextFloat();

            if(anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }

            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é de: " + valorPagar);

            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
            desejaRepetir = sc.next().charAt(0);

        }
        System.out.println("O total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("O total de carros: " + totalCarros);
    }
}
