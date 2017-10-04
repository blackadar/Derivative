import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {

    private File file;
    private PrintWriter printer;

    public Writer(String fileLocation) throws FileNotFoundException {
        file = new File(fileLocation);
        printer = new PrintWriter(file);
    }

    private void write(String toFile){
        printer.write(toFile + "\t");
        printer.flush();
    }

    private void newLine(){
        printer.write("\n");
        printer.flush();
    }

    public void writeData(double[] data){
        for(double d : data){
            write(Double.toString(d));
        }
        newLine();
    }

    public void writeDataSet(double[][] data){
        for(double[] d : data){
            writeData(d);
        }
    }
}
