package part9_OOP.timer;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.188 タイマークラスを活用する
//8.9.189 タイマー：停止、続く
public class TimerDriver {
    public static void main( String[] args ){
        Timer master_t = new Timer();
        Timer lap_t = new Timer();
        Scanner scanner = new Scanner(System.in);

        master_t.starts();
        lap_t.starts();
        System.out.println("Timer starts!");
        System.out.println("Enter \"p\" to toggle pause/unpause");
        System.out.println("Enter \"q\" to quit");

        String input;
        do {
            //Ask for user input
            lap_t.starts();
            input = scanner.nextLine();

            if( input.equals("p") ){
                //pause and continue
                master_t.togglePause();
                lap_t.togglePause();
                String status = master_t.getIsPaused() ? "unpaused" : "paused";
                System.out.printf("Enter p again to %s\n", status);
            }

            if( !master_t.getIsPaused() ) {
                //Print time duration
                double lap_duration = lap_t.elapsedSeconds();
                double master_duration = master_t.elapsedSeconds();

                System.out.printf("Laps Timer: %s\n", Timer.formattedTime(lap_duration));
                System.out.printf("Total Timer: %s\n", Timer.formattedTime(master_duration));
                System.out.println("Enter \"p\" to pause or \"q\" to quit");
            }
        } while( !input.equals("q") );

        scanner.close();
        System.out.println("Timers stopped");
    }
}
