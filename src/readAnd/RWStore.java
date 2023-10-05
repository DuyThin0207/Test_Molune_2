package readAnd;

import Store.Store;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RWStore {
    public static Scanner input = new Scanner(System.in);
    private File file = new File("products.csv");
    public void writeFile(List<Store> students){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Store store:students) {
                line += store.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Store> readFile() {
        List<Store> stores = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
               Store store = new Store(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4]);
                stores.add(store);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stores;
    }
}
