import java.util.Scanner;

public class EntendendoFor {

	public static void main(String[] args) {
		//for(int i=0; i<10;i = i + 2) {
			//System.out.println(i);
			
			Scanner leitor = new Scanner(System.in);
			int n, res;
			
			System.out.println("Você quer calcular a tabuada de qual número?");
			n = leitor.nextInt();
			
			for(int contador=1;contador<=10;contador++) {
			res = n * contador;
			System.out.println(n + " x " + contador + " = " + res);
			}	
			leitor.close();
			}	
			
			
			
		}



