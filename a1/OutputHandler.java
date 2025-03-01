import java.io.*;

public class OutputHandler {
    public void writeResults(String fileName, double mean1, double stdDev1, double mean2, double stdDev2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
              writer.write("Tabla 1: Columna 1\n";
            writer.write("Media: " + mean1 + "\n");
            writer.write("Desviacion estandar: " + stdDev1 + "\n\n");

            writer.write("Tabla 1: Columna 2\n");
            writer.write("Media: " + mean2 + "\n");
            writer.write("Ddesviacion estandar: "  + stdDev2 + "\n");
        } catch (IOException e) {

            e.printStackTrace();
 

        }
    }
}

