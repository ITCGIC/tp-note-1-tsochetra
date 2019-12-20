package tp_note_1;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels: ");
        float riel_money = s.nextFloat();
        
        System.out.println("-------------------------------------------------");
        System.out.println(riel_money + " RIELS = " + riel_money / 4000 +" USD");
	}
}
