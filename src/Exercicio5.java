
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);	
		
		int codigo, quantidade, codigo2, quantidade2;
		double valorunit, valorunit2, compratotal;
		
		System.out.print("C�digo da pe�a 1: ");
		codigo = sc.nextInt();
		
		System.out.print("Quantidade de pe�as 1: ");
		quantidade = sc.nextInt();
		
		System.out.printf("Valor: R$");
		valorunit = sc.nextDouble();
		
			
		System.out.print("C�digo da pe�a 2: ");
		codigo2 = sc.nextInt();
		
		System.out.print("Quantidade de pe�as 2: ");
		quantidade2 = sc.nextInt();
		
		System.out.printf("Valor: R$");
		valorunit2 = sc.nextDouble();
		
		compratotal = quantidade * valorunit + quantidade2 * valorunit2;
		
		System.out.printf("O valor total de pe�as compradas � de: %.2f%n", compratotal);
		
		sc.close();
	}

}
