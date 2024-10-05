import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enteer side x: ");
        x = scanner.nextDouble();

        System.out.print("Enteer side x: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

    }
}