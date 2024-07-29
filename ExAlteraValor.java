import java.util.Scanner;

public class ExAlteraValor {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor do produto: ");
	double valorProd = scanner.nextInt();
	
	System.out.print("Digite a quantidade de produtos: ");
	int quantidade = scanner.nextInt();
	
	double subTotal = valorProd * quantidade;
	
	double  desconto = 0.0;
	
	if (quantidade >= 10) {
		
		System.out.println("Parabens! Você ganhou 10% de desconto em suas compras");
		desconto = 10.0; 
	} 
	else {
		desconto = 0.0;
	}
	
	double totalDesconto = subTotal * desconto / 100;
	
	double total = subTotal - totalDesconto;
	
	System.out.println("Valor da compra: " + total);
	
	scanner.close();
	
	}
}
