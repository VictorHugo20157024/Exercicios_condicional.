import java.util.Scanner;

	public class exer5 {
		
		public  static  void  main ( String[] args ) {
			// TODO Auto-generated method stub
			
		
			Scanner leitor =  new Scanner ( System.in);
			
			float x, y, z, c, m;
			int mat;
			
			System.out.println ( " Descubra qual foi o seu resultado em Física! Digite sua matriz: " );
			mat = leitor.nextInt ();
			
			System.out.println ( " Digite qual foi a sua primeira das quatro notas: " );
			x = leitor.nextFloat ();
			
			System.out.println ( " Digite sua segunda nota: " );
			y = leitor.nextFloat ();
			
			System.out.println ( " Digite sua terceira nota: " );
			z = leitor.nextFloat ();
			
			System.out.println ( " Digite sua quarta nota: " );
			c = leitor.nextFloat ();
			m = ((x + y + z + c) / 4 );
			
			System.out.println ( " Sua média foi de " + m);
			(m > = 7 )
			   
			System.out.println ( "  aluno referente à matriz " + mat + " foi aprovado " );
			if (m >=  3,5  m <= 7 );
				
				System.out.println ( "  aluno referente à matriz " + mat + " está de recuperação. " );
			if (m <= 3,5 );
				
			System.out.println ( " aluno referente à matriz " + mat + " foi reprovado "  );
			
			
			
			
		}


}
