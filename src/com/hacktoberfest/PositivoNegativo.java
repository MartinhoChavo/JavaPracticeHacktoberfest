package com.hacktoberfest;

import java.util.Scanner;
public class PositivoNegativo {

	public static void main(String[] args) {
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero: ");
		num=sc.nextInt();
		
		while(num!=0) // mientras num sea distinto de 0
		{
		if(num>0)
		// mayor que cero: positivo
		System.out.println("Positivo");
		else
		// si no es positivo: es negativo
			
		System.out.println("Negativo");
		// repetimos el proceso y volvemos a leer num
		
		System.out.print("Introduzca otro n�mero: ");
		num=sc.nextInt();
		}
		// al salir del mientras tenemos la certeza que num es 0
		}
		}

