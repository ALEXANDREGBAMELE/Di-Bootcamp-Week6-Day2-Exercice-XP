package Exercice1;
import java.util.Scanner;
public class Convertir {
	
	
	public static void main(String[] args) {
		//Variable
		String classement = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entez un point");
		double point = sc.nextDouble();
		System.out.println(point);
		
		if( point >= 93 && point <= 100) {
			classement = "UN";
		}
		
		if( point >= 90 && point <= 92) {
			classement = "A-";
		}
		
		if( point >= 87 && point <= 89) {
			classement = "B+";
		}
		
		if( point >= 83 && point <= 86) {
			classement = "B";
		}
		
		if( point >= 80 && point <= 82) {
			classement = "B-";
		}
		
		if( point >= 77 && point <= 79) {
			classement = "C+";
		}
		
		if( point >= 70 && point <= 76) {
			classement = "C";
		}
		
		if( point >= 60 && point <= 69) {
			classement = "re";
		}
		
		if( point >= 0 && point <= 59) {
			classement = "F";
		}
		else {System.out.println("La valeur entrer n'est pas reconnu veillez ressayer svp");}
		
		System.out.println(classement);
	}
}
