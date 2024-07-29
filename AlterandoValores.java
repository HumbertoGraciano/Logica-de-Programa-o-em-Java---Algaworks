import java.util.Scanner;

public class AlterandoValores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.print("Digite a forma de pagamento [1 A vista / 2 A prazo]: ");
		Integer tipoPagamento = sc.nextInt();
		
		boolean pagamentoAvista = tipoPagamento.equals(1);
		
		double juros = 0.0;
		
		if(!pagamentoAvista) {
			juros = 10.0;
		}
		
		double acrescimo = valorProduto * juros / 100;
		
		double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		sc.close();
	}

}
