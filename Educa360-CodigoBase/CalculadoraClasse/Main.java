import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculadora calculadora2000 = new Calculadora();
		
		double n1, n2;
		char c;
		
		System.out.println("Insira o primeiro número: ");
		n1 = input.nextInt();
		
		System.out.println("Insira a operação: ");
		input = new Scanner(System.in);
		c = input.nextLine().charAt(0);
		
		System.out.println("Insira o segundo número: ");
		n2 = input.nextInt();
		
		double result = calculadora2000.calcular(n1, c, n2);
		
		System.out.println("O resultado é " + result);

	}

}
