package tp_note_1;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
        int start_hours, start_minutes, start_seconds, end_hours, end_minutes, end_seconds;

        Scanner s = new Scanner(System.in);

        System.out.println("Program for calculating cost of a call.");
        
        System.out.print("Please input start hours: ");
        start_hours = s.nextInt();
        System.out.print("Please input start minutes: ");
        start_minutes = s.nextInt();
        System.out.print("Please input start seconds: ");
        start_seconds = s.nextInt();

        System.out.print("Please input end hours: ");
        end_hours = s.nextInt();
        System.out.print("Please input end minutes: ");
        end_minutes = s.nextInt();
        System.out.print("Please input end seconds: ");
        end_seconds = s.nextInt();

        int total_start_seconds = start_hours * 3600 + start_minutes * 60 + start_seconds;
        int total_end_seconds = end_hours * 3600 + end_minutes * 60 + end_seconds;
        if(total_end_seconds < total_start_seconds) {
            System.out.print("Invalid input.");
            
        } else {
            int total_call = total_end_seconds - total_start_seconds;

            double cost = (total_call * 0.05) / 60;

            int hours = total_call / 3600;
            int seconds = total_call - hours * 3600;
            
            int minutes = seconds / 60;
            seconds = seconds - minutes * 60;
            
            System.out.println("-----------------------------------------");
            System.out.println("Total call duration: " + hours + "h " + minutes + "mn " + minutes + "s");
            System.out.println("Total cost of this call: " + cost + "$");
        }
        
	}
}
