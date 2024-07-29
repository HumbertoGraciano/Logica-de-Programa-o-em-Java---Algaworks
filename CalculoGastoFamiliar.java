import java.util.Scanner;

public class CalculoGastoFamiliar {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor da sua conta bancaria: ");
	double contabancaria = scanner.nextDouble();
	
	System.out.print("Digite o valor da  sua conta de luz: ");
	double  contaLuz = scanner.nextDouble();
	
	System.out.print("Digite o valor da sua conta de agua: ");
	double contaAgua = scanner.nextDouble();
	
	System.out.print("Digite o valor da sua conta de Telefone: ");
	double contaTelefone = scanner.nextDouble();
	
	System.out.print("Digite o valor da Escola do seu filho: ");
	double escolaFilho = scanner.nextDouble();
			
	System.out.print("Digite o valor da fatura de seu cartão: ");
	double faturaCartao = scanner.nextDouble();
	
	System.out.print("Digite o valor dos seus gastos em supermercado: ");
	double mercado = scanner.nextDouble();
	
	double gastoTotal = 0.0;
	gastoTotal += contaLuz;
	gastoTotal += contaAgua;
	gastoTotal += contaTelefone;
	gastoTotal += escolaFilho;
	gastoTotal += faturaCartao;
	gastoTotal += mercado;
	
	System.out.println("O valor total dos seus gastos é de: " + gastoTotal);
	
	double pagarContas = contabancaria -= gastoTotal;
	
	System.out.println("Seu saldo bancario após pagar as suas contas será de: " + pagarContas);
	
	scanner.close();
}
}
