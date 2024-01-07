package exerciciosalario;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o salario do usuario1 ");
		double salariousuario1 = scanner.nextDouble();
		
		Scanner usuario2 = new Scanner(System.in);
		System.out.println("Digite o salario do usuario2 ");
		double salariousuario2 = scanner.nextDouble();

		
		Scanner usuario3 = new Scanner(System.in);
		System.out.println("Digite o salario do usuario3 ");
		double salariousuario3 = scanner.nextDouble();

		
		Scanner usuario4 = new Scanner(System.in);
		System.out.println("Digite o salario do usuario4 ");
		double salariousuario4 = scanner.nextDouble();

		double media = (salariousuario1 + salariousuario2 + salariousuario3 + salariousuario4)/4;
		System.out.println("a média é:" + media);
}
}
