import java.util.Scanner;

public class PodajImie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię!");
        String name = scanner.nextLine();
        System.out.println(name);
        if (!name.isEmpty() && (!name.endsWith("a") || name.equalsIgnoreCase("Barnaba") || name.equalsIgnoreCase("Kuba"))) {
            System.out.println("Cześć " + name + " jesteś mężczyzną ");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Cześć " + name + " jesteś kobietą");

        } else {
            System.out.println("Nie podałeś imienia");
        }


    }
}