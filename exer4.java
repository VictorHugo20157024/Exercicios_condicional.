import java.util.Scanner;

	public class exer4 {
		
		public  static  void  main ( String[] args ) {
			// TODO Auto-generated method stub

			try (Scanner leitor = new Scanner ( System.in)) {
				int v, h, p;
				
				System.out.println( " Escreva na ordem decrescente o tamanho dos lados do seu triângulo e mostre de qual tipo é: " );
				v = leitor.nextInt ();
				h = leitor.nextInt ();
				p = leitor.nextInt ();
				
				if (v == h && h == p)
					System.out.println ( " É um triângulo equilátero. " );
				
				if (v == h && h != p)
					System.out.println ( " É um triângulo isósceles. " );
				
				if (v != h && h != p && v != p)
					System.out.println ( " É um triângulo escaleno. " );
			}
			
			
		}

	}
	
	

