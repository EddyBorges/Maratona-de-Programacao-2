import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int soma=0, cont=0;
        while (X != 0) {
        	cont = 0;
        	soma = 0;
        	while (cont < 5) {
        		if (X % 2 == 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        	X = leitor.nextInt();
        }
    }
	
}
