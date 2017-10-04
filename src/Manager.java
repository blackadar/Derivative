import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {
    private static Scanner in = new Scanner(System.in);
    private static Writer writer;

    public static void main(String[] args){
        System.out.print("Output File: ");
        try {
            writer = new Writer(in.nextLine());
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to access directory.");
        }

        System.out.print("Start Value: ");
        int startValue = in.nextInt();

        System.out.print("Stop Value: ");
        int stopValue = in.nextInt();

        writer.writeDataSet(Calculator.table(startValue, stopValue));
    }
}
