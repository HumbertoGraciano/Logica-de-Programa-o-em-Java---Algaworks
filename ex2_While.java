
public class ex2_While {
	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 0;
		
		while (i < numeros.length) {
			Integer mod = numeros[i] % 3;
			if (mod == 0) {
				System.out.println(numeros[i]);
			}
			i++;
		}
				
	}
}
