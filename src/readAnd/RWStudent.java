package readAnd;

import Store.Store;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RWStudent {
    private File file = new File("products.csv");
    public void writeFile(List<Store> students){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Store student:students) {
                line += student.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Store> readFile() {
        List<Store> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
//                String[] points = data[2].split(";");
                System.out.println(Arrays.toString(data));
//                Student student = new Student(Integer.parseInt(data[0]), data[1], Double.parseDouble(points[0]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
