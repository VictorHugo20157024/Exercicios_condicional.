import java.util.Scanner;

public class exer3 {
	
	public  static  void  main ( String[] args ) {
		// TODO Auto-generated method stub

		
		try (Scanner leitor = new Scanner ( System.in )) {
			float s;
			
			System.out.println ( " mostre seu antigo salário: " );
			s = leitor.nextFloat ();
			
			if (s >  0  && s <= 1000 )
			System.out.println ( " Seu salário terá o aumento de 15% , e agora  vai ser " + (s + (s / 100 * 15 )));	
			
			if (s >  1000.01  && s <= 2500 )
				System.out.println ( " Seu salário terá o aumento de 7% ,e agora ser de " + (s + (s / 100 * 7 )));
		}
		
		System.out.println ( " Seu salário continua o mesmo. " );	
		
		
		
		}

}


