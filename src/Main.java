
import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Integer> inputList = new ArrayList<>();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("src/input1.txt"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("src/input2.txt"));

        String val;

        // Add integers from file to list
        while((val = bufferedReader1.readLine()) != null) {
            inputList.add(Integer.parseInt(val));
        }
        bufferedReader1.close();

        while((val = bufferedReader2.readLine()) != null) {
            inputList.add(Integer.parseInt(val));
        }
        bufferedReader2.close();

        // Sort the list of integers
        Collections.sort(inputList);

        // Write sorted list of elements to the output file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/output.txt"));
        for(int i=0;i<inputList.size();i++){
            bufferedWriter.write(inputList.get(i).toString()+"\n");
        }

        bufferedWriter.close();
    }
}