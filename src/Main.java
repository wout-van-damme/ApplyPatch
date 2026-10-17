import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) {

        try {
            String diff = Files.readString(Paths.get("examples/helloworld.patch"));

            System.out.println(PatchService.parse(diff));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}