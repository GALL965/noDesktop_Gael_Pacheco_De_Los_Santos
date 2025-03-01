import java.io.*;
import java.util.*;

public class InputHandler {
    public double[] readData(String fileName, int column) {
        List<Double> values = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                values.add(Double.parseDouble(parts[column]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values.stream().mapToDouble(Double::doubleValue).toArray();
    }
}

