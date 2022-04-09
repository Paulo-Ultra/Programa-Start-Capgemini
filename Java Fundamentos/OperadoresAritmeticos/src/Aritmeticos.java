
public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
	
		// soma
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println("O resultado da soma é : " + num3);
		
		// subtracao
		num1 = 10;
		num2 = 20;
		num3 = num1 - num2;
		System.out.println("O resultado da subtracao é : " + num3);
		
		// multiplicacao
		num1 = 10;
		num2 = 20;
		num3 = num1 * num2;
		System.out.println("O resultado da multiplicacao é : " + num3);
		
		// divisao
		num1 = 20;
		num2 = 2;
		num3 = num1 / num2;
		System.out.println("O resultado da divisao é : " + num3);
		System.out.println("----------------------------------");
		// incrementando (somando de 1 em 1)
		num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("----------------------------------");
		// decrementando (subtraindo de 1 em 1)
		num1 = 10;
		while (num1 > 0) {
			System.out.println(num1);
			num1--;
		}	
	}

}
