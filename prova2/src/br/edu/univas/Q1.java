package br.edu.univas;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float[] peso = new float[100];
		float[] altura = new float[100];
		float[] imc = new float[100];
		int contador = 0;
		
		
		for (int i = 0;i < 100; i++) {
			 int j = i + 1;
			
			System.out.println("Por favor, digite o peso da pessoa de nº "+ j +": ");
			peso[i] = ler.nextFloat();
			
			
		}		
		
        for (int i = 0;i < 100; i++) {
             int j = i + 1;
			
			System.out.println("Por favor, digite a altura da pessoa de nº "+ j +": ");
			altura[i] = ler.nextFloat();
		
        	
			
			
		}	
		
        for (int i = 0; i < 100; i++) {
        	
        	imc[i] = peso[i] / (altura[i] * altura[i]);
        	
        	if (imc[i] >= 18.5 && imc[i] <= 24.9) {
        		
        		contador++;
        		
        	}
        	
        	
        }
        
		
        System.out.println("A porcentagem de pessoas na faixa do 'normal' é de: "+ contador + "%.");
        
		
		
		ler.close();
		
	}

}
