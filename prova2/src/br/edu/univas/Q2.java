package br.edu.univas;

import java.util.Scanner;

public class Q2 {

	
	public static void menu() {
		
		System.out.println("Informe o tipo de ação: ");
		System.out.println("1- receita");
		System.out.println("2- despesa");
		System.out.println("0- sair");
		
	}
	
	public static void main(String[] args) {
		
         Scanner ler = new Scanner(System.in);
		
		  int menu = 1;
		  int opcao;
		  
		  double operacao1, operacao2;
		  double receita = 0;
		  double despesa = 0;
		  double saldo;
		  
		   do {
			 
			   menu();
			   
			   opcao = ler.nextInt();
			   
			 switch (opcao) {
			 
			 case 1:
				 
				  operacao1 = 0;
				  System.out.println("Digite o valor dessa operação de receita:");
				   
				  operacao1 = ler.nextDouble();
				  
				  receita += operacao1;
				 
				 break;
			 
			 case 2:
				 operacao2 = 0;
				 System.out.println("Digite o valor dessa operação de despesa:");
				 
				 operacao2 = ler.nextDouble();
				 
				 despesa += operacao2;
				 
				 
				 break;
			 
				 
			 case 0:
				 
				 menu++;
				 
				 break;
			 
			 
			 
			 default: 
				 
				 System.out.println("Opção invalida, coloque uma valida!!!");
				 
				 break;
			 
			 }  
			   
			   
			   
			   
		   } while (menu < 2);
		
		
		   saldo = receita - despesa;
		
		   System.out.println("Seu saldo ao final do mes foi de R$"+ saldo);
		
		
         
         
		ler.close();
	}

}
