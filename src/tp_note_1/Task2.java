package tp_note_1;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
        int hours = 0, minutes = 0, seconds = 0, temp;
        System.out.print("Input number of seconds: ");
        Scanner s = new Scanner(System.in);
        seconds = temp = s.nextInt();
            
        hours = seconds / 3600;
        seconds = seconds - hours * 3600;
        
        minutes = seconds / 60;
        seconds = seconds - minutes * 60;


        System.out.println("Time corresponding to " + temp + " seconds is " + hours + ":" + minutes + ":" + seconds);
	}
}
