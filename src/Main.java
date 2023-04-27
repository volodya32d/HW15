import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number? ");
        int number = Integer.parseInt(scanner.next());

        if ((number == 9) || (number == 10))
            System.out.println("Well");
        else if ((number == 7) || (number == 8))
            System.out.println("Good");
        else if(number == 6)
            System.out.println("Acceptable");
        else if(number == 5)
            System.out.println("Bad");
        else if ((number >= 0) && (number <= 4))
            System.out.println("Very Bad");
        else
            System.out.println("Not valid");

        switch(number)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Very Bad");
                break;
            case 5:
                System.out.println("Bad");
                break;
            case 6:
                System.out.println("Acceptable");
                break;
            case 7:
            case 8:
                System.out.println("Good");
                break;
            case 9:
            case 10:
                System.out.println("Well");
                break;
            default:
                System.out.println("Not valid");
                break;
        }
    }
}