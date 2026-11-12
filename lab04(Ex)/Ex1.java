package lab04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class Ex1 {
    public static void main(String[] args) {
        Random r = new Random();
        try(FileWriter file = new FileWriter("Random.csv");) {
            file.write("No, Random Number\n");
            for(int i=1;i<=500;i++){
                int num = r.nextInt(500)+1;
                file.write(i+".Lucky number: "+num+"\n");
            }
            file.close();
            System.out.println("File successfully created!");
        } catch (IOException e) {
            System.out.println("Error:"+e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Random.csv"))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }

        }catch(IOException e){
        System.out.println("Error "+e);
        }
}
}
