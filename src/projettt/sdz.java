package projettt;

import java.util.Scanner;

public class sdz {

	public static void main(String[] args) {
//		calculer__moy_nmbres(4,2,6);
//		permuteVar(1,2);
//		factorielle(8);
		reverse("WayToLearnX");
	}
	
// programme Java pour afficher l’aire et le périmètre d’un cercle.

	public static void  calculer_air_per(double r) {
			double air =  r * r * 3.14;
			
			double per = r * 2 * 3.14;
			
			System.out.println("le perimetre est "+per);
			
			System.out.println("le perimetre est "+air);

	}
	
//	programme Java qui prend trois nombres en entrée pour calculer et afficher la moyenne des nombres.
	public static void calculer__moy_nmbres(double a, double b, double c) {
		double moy  = (a + b+ c)/3;
		System.out.print(moy);
	}
	
//	 programme Java pour permuter deux variables.
	public static void permuteVar(int a, int b) {
		System.out.println("avant echange "+ a + " "+ b);
		int c = b;
		b = a;
		a = c;
		System.out.print("apres echange "+ a + " "+ b);

	}
	
//	méthode qui calcule la factorielle d’un nombre donné.
	public static void factorielle(int a) {
		int num = 1;
		for (int i = a; i >0; i--) {
			num = num * i;
			System.out.println(num);
			
		}
	
	}
	
   //méthode qui inverse une chaîne.
	public static void reverse(String s) {
		String newWord  = "";
		for (int i = s.length()-1; i >= 0; i--) {
		 newWord  +=s.charAt(i);
		 if (i == 0) {
				System.out.println(newWord);
		}
		}
	}
}
