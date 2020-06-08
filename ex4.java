package exercicios_repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int X, Y;
	String operacao;
	
	System.out.println ("Digite dois números");
	X=leitor.nextInt();
	Y=leitor.nextInt();
	
	System.out.println ("Digite uma operação aritmética (+,-,*,/)");
	operacao=leitor.next();
	
	
	if    (operacao.equals("+")||operacao.equals("-")||operacao.equals("*")||operacao.equals("/"))
	{	
	aritmetica (X, Y, operacao);
	}
	else 	
	{
	System.out.println ("Simbolo não identificado.");	
	}
	
	

	}


public static void aritmetica(int X, int Y, String operadog) 
{

{
switch (operadog)	
{
case "+": System.out.println ("A soma dos numeros é "+(X+Y));  break;
case "-": System.out.println ("A subtração dos numeros é "+(X-Y));  break;
case "*": System.out.println ("A multiplicação dos numeros é "+(X*Y));  break;
case "/": System.out.println ("A divisão dos numeros é "+(X/Y));  break;

}
}










}

}