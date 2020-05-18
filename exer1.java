import java.util.Scanner;

    public class exer1 {
		
		public static void main (String[] args) {
		  //TODO Auto-generated method stub

			try (Scanner leitor = new Scanner (System. in)) {
				int x;

				System.out.println (" Mostre um numero e descubra se ele esta entre 20 e 90:");
				x = leitor.nextInt ();

				if (x >  20 && x <= 90)
				System.out.println ("Ele esta entre 20 e 90!");

				
				else
				
					System.out.println ("E menor que 20 ou maior que  90!");
				
			} }
		
		
		
	}
