package exercicios_repeticao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int X, Y;
	
	
	System.out.println ("Digite dois números");
	X=leitor.nextInt();
	Y=leitor.nextInt();
	
	System.out.println(soma(X,Y));

	
	}


public static int soma(int X, int Y) 
{
	int maior, menor, total;
	total = 0;
	
	if (X>Y)
	{
	maior = X;
	menor = Y;
	}
	
	else 
	{	
	maior = Y;	
	menor = X;
	}
	
	for (int W = menor; W <= maior; W+=1 )	
	{
	total += W;
	}
	return total;
	



}




}

