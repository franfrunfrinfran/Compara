package Compara;

import java.util.Scanner;

public class Comparar {
	public static void main(String[] args) {

	int num1, num2;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dame un n�mero");
	num1=teclado.nextInt();
	System.out.println("Dame otro n�mero");
	num2=teclado.nextInt();
	
	if (num1==num2) {
		System.out.println("Los n�meros son iguales");
	}
	else {
		if(num1<num2){
			System.out.println("El numero "+ num1 + " es menor que "+num2);
		}
		else {
			System.out.println("El numero "+ num2 + " es menor que "+num1);
		}
	
	}
	teclado.close();
  }
}
