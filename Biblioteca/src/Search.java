import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public void reading(){

        System.out.println();
        int counter = 0;
        try{
            FileReader fr;
            fr = new FileReader("arq.txt");
            BufferedReader bf = new BufferedReader(fr);
            String  line = bf.readLine();
            
            while (line != null) {
                counter++;
                System.out.println(line);
                line = bf.readLine();

                if(counter%8 == 0){
                    System.out.println("\n");
                }
            }


        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        } 
    } 
}
