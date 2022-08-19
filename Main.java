import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Variáveis do programa
		double salario, total;
		
		//Solicitação de informações do usuário
		System.out.println("Informe o seu salário bruto mensal: ");
		salario = sc.nextDouble();
		
		//Verificação da alíquota em que o usuário se enquadra (conforme a tabela progressiva de IR)
		// Faixa de ISENÇÃO
		if (salario < 1903.98) {
			System.out.println("Isento de Imposto de Renda!");
		}
		// Alíquota de 7,5%
		else if (salario >= 1903.99 && salario <= 2826.65) {
			total = (salario*0.075)-142.80;
			System.out.printf("Imposto a pagar de R$ %.2f%n", total);
		}
		// Alíquota de 15%
		else if (salario >= 2826.66 && salario <= 3751.05) {
			total = (salario*0.15)-354.80;
			System.out.printf("Imposto a pagar de R$ %.2f%n", total);
		}
		// Alíquota de 22,5%
		else if (salario >= 3751.06 && salario <= 4664.68) {
			total = (salario*0.225)-636.13;
			System.out.printf("Imposto a pagar de R$ %.2f%n", total);
		}
		// Alíquota de 27,5%
		else if (salario > 4664.68) {
			total = (salario*0.275)-869.36;
			System.out.printf("Imposto a pagar de R$ %.2f%n", total);
		}
		else {
			System.out.println("Digite um valor válido!");
		}
				
		sc.close();
	}
}