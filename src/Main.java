import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Write Monday or Tusday :");
            String day = scanner.nextLine();

            if (Objects.equals(day, "Monday")) {
                Week duishombu = Week.ДУЙШОМБУ;
                System.out.println(duishombu);
            } else if (Objects.equals(day, "Tusday")) {
                Week sheishembi = Week.ШЕЙШЕМБИ;
                System.out.println(sheishembi);
            } else System.out.println("Error!!!");
        }
    }
}