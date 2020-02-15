import java.util.Scanner;

public class PayDesk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        BaseCard card;
        double[] turnOverAndValue = new double[2];

        System.out.printf("1. Bronze%n" +
                "2. Silver%n" +
                "3. Gold%n" +
                "Enter number of the card:");
        outerloop:
        while (true) {
            String n = scanner.nextLine().trim();
            switch (n) {
                case "1":
                    readDate(scanner, turnOverAndValue);
                    card = new Bronze(turnOverAndValue[0]);
                    result.append(card.toString(turnOverAndValue[1]));
                    break outerloop;
                case "2":
                    readDate(scanner, turnOverAndValue);
                    card = new Silver(turnOverAndValue[0]);
                    result.append(card.toString(turnOverAndValue[1]));
                    break outerloop;
                case "3":
                    readDate(scanner, turnOverAndValue);
                    card = new Gold(turnOverAndValue[0]);
                    result.append(card.toString(turnOverAndValue[1]));
                    break outerloop;
                default:
                    System.out.println("Incorrect input, try again!");
            }
        }
        System.out.println(result.toString());
    }

    private static void readDate(Scanner scanner, double[] turnOverAndValue) {
        while (true) {
            try {
                System.out.print("Turnover:");
                turnOverAndValue[0] = Double.parseDouble(scanner.nextLine());
                System.out.print("Purchase value:");
                turnOverAndValue[1] = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect date!");
            }
        }
    }
}
