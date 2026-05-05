import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int earnings = 0;
        int spendings = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите операцию и введите её номер: " +
                    "\n1. Добавить новый доход " +
                    "\n2. Добавить новый расход " +
                    "\n3. Выбрать систему налогообложения");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;

                case 2:
                    System.out.println("Введите сумму расхода:");
                    String spendStr = scanner.nextLine();
                    int spend = Integer.parseInt(spendStr);
                    spendings += spend;
                    break;

                case 3:
                    int earningsMinusSpendingsUSN = Tax.taxEarningsMinusSpendings(earnings, spendings);
                    int earningUSN = Tax.taxEarnings(earnings);
                    SystemComparation.compareSystems(earningsMinusSpendingsUSN, earningUSN);
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}
