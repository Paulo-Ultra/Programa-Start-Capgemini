package estruturascondicionalerepeticao;

import java.util.Scanner;

public class ExercicioVinteDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        //A variável foi criada fora do for para poder utilizá-la no cálculo das médias
        int i = 0;
        for(; i < 3; i++){
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o preço de custo do produto: ");
            precoCusto = sc.nextFloat();
            System.out.print("Digite o preço de venda do produto: ");
            precoVenda = sc.nextFloat();

            totalCusto += precoCusto;
            totalVenda += precoVenda;

            if(precoCusto == precoVenda) {
                System.out.println("Houve empate entre o preço de custo e de venda");
            } else {
                if(precoCusto > precoVenda) {
                    System.out.println("Houve prejuízo");
                } else {
                    System.out.println("Houve lucro");
                }

            }
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + " preço de venda = " + precoVenda);
        }
        System.out.println("A média do preço de venda é de: " + String.format("%.2f", totalVenda / i));
        System.out.println("A média do preço de custo é de: " + String.format("%.2f",totalCusto / i));
    }
}
