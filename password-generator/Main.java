import java.util.Scanner;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
