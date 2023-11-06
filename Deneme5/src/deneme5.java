import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
		// Dik kenarları verilen bir üçgenin hipotenüsünü bulma
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üçgenin dik kenarlarının uzunluklarını giriniz:");
		//int a;
	    //int b;		
		//  a = scanner.nextInt();
		//   b = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double h = Math.sqrt(a*a+b*b);
		System.out.println("hipotenüs:" + h);
		scanner.close();
		
		
		

	}

}
