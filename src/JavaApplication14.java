import java.io.FileWriter;
import java.io.IOException;

public class JavaApplication14 {

    public static void main(String[] args) {

        writeHelloToFile("hello.txt");


    }

    private static void writeHelloToFile(String s) {

        try (FileWriter writer = new FileWriter("hellotxt")) {
                writer.write("Привет из Java !");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
