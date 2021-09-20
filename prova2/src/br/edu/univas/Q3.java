package br.edu.univas;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] nota = new int[50];
		int en;
		int aprovado = 0, recuper = 0, depen = 0;
		float pAp, pRe, pDe;
		
		for (int i = 0 ;i < 50 ;i++) {
			en = i + 1;
			
			System.out.println("Digite a nota do aluno de nº "+ en+":");
			nota[i] = ler.nextInt();
			
			if (nota[i] >= 60) {
				
				aprovado++;
				
				
			} else if (nota[i] >= 30 && nota[i] < 60) {
				
				
				recuper++;
				
				
				
			} else {
				
				depen++;
				
				
			}
			
			
			
		}
		
		pAp = (aprovado * 2);    // PERDAO PELO CALCULO LASTIMAVEL DE PORCENTAGEM(se estiver errado).
		pRe = (recuper * 2); 
		pDe = (depen * 2);
		
		
		System.out.println("Aprovados: "+ aprovado);
		System.out.println("Recuperação: "+ recuper);
		System.out.println("Dependência: "+ depen);
		System.out.println("A porcentagem na faixa dos aprovados é de: "+ pAp+"%.");
		System.out.println("A porcentagem na faixa dos de recuperação é de: "+ pRe+"%.");
		System.out.println("A porcentagem na faixa dos de dependência é de: "+ pDe+"%.");
        
        
		ler.close();	
	}

}
