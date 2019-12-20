package tp_note_1;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
        int hours = 0, minutes = 0, seconds = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours: ");
        hours = s.nextInt();
        System.out.print("Please input minutes: ");
        minutes = s.nextInt();
        System.out.print("Please input seconds: ");
        seconds = s.nextInt();
        
        System.out.println("--------------------------------------------------");
        System.out.println("Number of seconds = " + hours + "x3600 + " + minutes + "x60 + " + seconds + " = " + (hours*3600+minutes*60+seconds) + " seconds");
        
	}
}
