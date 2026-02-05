import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("../archivo.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}