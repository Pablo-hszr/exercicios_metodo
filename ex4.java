package exercicios_repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int X, Y;
	String operacao;
	
	System.out.println ("Digite dois n�meros");
	X=leitor.nextInt();
	Y=leitor.nextInt();
	
	System.out.println ("Digite uma opera��o aritm�tica (+,-,*,/)");
	operacao=leitor.next();
	
	
	if    (operacao.equals("+")||operacao.equals("-")||operacao.equals("*")||operacao.equals("/"))
	{	
	aritmetica (X, Y, operacao);
	}
	else 	
	{
	System.out.println ("Simbolo n�o identificado.");	
	}
	
	

	}


public static void aritmetica(int X, int Y, String operadog) 
{

{
switch (operadog)	
{
case "+": System.out.println ("A soma dos numeros � "+(X+Y));  break;
case "-": System.out.println ("A subtra��o dos numeros � "+(X-Y));  break;
case "*": System.out.println ("A multiplica��o dos numeros � "+(X*Y));  break;
case "/": System.out.println ("A divis�o dos numeros � "+(X/Y));  break;

}
}










}

}