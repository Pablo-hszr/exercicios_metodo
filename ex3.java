package exercicios_repeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	double nota1, nota2, nota3, nota4, media;
	media = 0;
	
	
	System.out.println ("Digite a primeira nota.");
	nota1=leitor.nextDouble();
	
	System.out.println ("Digite a segunda nota.");
	nota2=leitor.nextDouble();
	
	System.out.println ("Digite a terceira nota.");
	nota3=leitor.nextDouble();
	
	System.out.println ("Digite a quarta nota.");
	nota4=leitor.nextDouble();
	
	media = (nota1+nota2+nota3+nota4)/4;
	System.out.println("A média do aluno é: "+media);
	System.out.println(media(media));
	
	

	
	



}

public static boolean media (double media)
{
if (media >= 7)
{
return true;	
}
else 	
{	
return false;	
}
}


}



