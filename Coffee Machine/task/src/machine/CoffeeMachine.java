package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void machineStock(int waterStock, int milkStock, int beanStock, int cupStock, int moneyStock){
        System.out.println("The coffee machine has:");
        System.out.println(waterStock + " of water");
        System.out.println(milkStock + " of milk");
        System.out.println(beanStock + " of coffee beans");
        System.out.println(cupStock + " of disposable cups");
        System.out.println(moneyStock + " of money");
    }
    public static void  mainMenu() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        System.out.print("> ");
    }
    public static String coffeeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        System.out.print("> ");
        return scanner.next();
    }
    public static int fillWater(int water) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print("> ");
        int newWater = scanner.nextInt();
        return water + newWater;
    }
    public static int fillMilk(int milk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of milk do you want to add:");
        System.out.print("> ");
        int newMilk = scanner.nextInt();
        return milk + newMilk;
    }
    public static int fillBean(int bean) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans do you want to add:");
        System.out.print("> ");
        int newBean = scanner.nextInt();
        return bean + newBean;
    }
    public static int fillCup(int cups) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        System.out.print("> ");
        int newCups = scanner.nextInt();
        return cups + newCups;
    }
    public static int fillMoney(int moneyStart, int cost) {
        return moneyStart + cost;
    }
    public static int useWater(int waterStart, int waterUsed) {
        return waterStart - waterUsed;
    }
    public static int useMilk(int milkStart, int milkUsed) {
        return milkStart - milkUsed;
    }
    public static int useBean(int beanStart, int beanUsed) {
        return beanStart - beanUsed;
    }
    public static int useCup(int cupStart) {
        return cupStart - 1;
    }
    public static boolean checkWater (int waterStart, int waterNeeded) {
        return waterStart >= waterNeeded;
    }
    public static boolean checkMilk (int milkStart, int milkNeeded) {
        return milkStart >= milkNeeded;
    }
    public static boolean checkBeans (int beansStart, int beansNeeded) {
        return beansStart >= beansNeeded;
    }
    public static boolean checkCups (int cupsStart) {
        return cupsStart > 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //starting stock
        int waterStock = 400;
        int milkStock = 540;
        int beanStock = 120;
        int cupStock = 9;
        int moneyStock = 550;
        //costs
        int waterEs = 250;
        int beanEs = 16;
        int moneyEs = 4;
        int waterLa = 350;
        int milkLa = 75;
        int beanLa = 20;
        int moneyLa = 7;
        int waterCap = 200;
        int milkCap = 100;
        int beanCap = 12;
        int moneyCap = 6;
        //machine on
        boolean stopped = false;
        while (!stopped) {
            mainMenu();
            String action = scanner.next();
            switch (action) {
                case "buy":
                    String choice = coffeeMenu();
                    switch (choice) {
                        case "1":  //espresso
                            if (checkWater(waterStock, waterEs) && checkBeans(beanStock, beanEs) && checkCups(cupStock)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterStock = useWater(waterStock, waterEs);
                                beanStock = useBean(beanStock, beanEs);
                                cupStock = useCup(cupStock);
                                moneyStock = fillMoney(moneyStock, moneyEs);
                            } else if (!checkWater(waterStock, waterEs)) {
                                System.out.println("Sorry, not enough water!");
                            } else if (!checkBeans(beanStock, beanEs)) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (!checkCups(cupStock)) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "2":  //latte
                            if (checkWater(waterStock, waterLa) && checkBeans(beanStock, beanLa) && checkMilk(milkStock,milkLa)&& checkCups(cupStock)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterStock = useWater(waterStock, waterLa);
                                milkStock = useMilk(milkStock, milkLa);
                                beanStock = useBean(beanStock, beanLa);
                                cupStock = useCup(cupStock);
                                moneyStock = fillMoney(moneyStock, moneyLa);
                            } else if (!checkWater(waterStock, waterLa)) {
                                System.out.println("Sorry, not enough water!");
                            } else if (!checkBeans(beanStock, beanLa)) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (!checkCups(cupStock)) {
                                System.out.println("Sorry, not enough cups!");
                            } else if (!checkMilk(milkStock, milkLa)) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            break;
                        case "3":  //cappuccino
                            if (checkWater(waterStock, waterCap) && checkBeans(beanStock, beanCap) && checkMilk(milkStock,milkCap)&& checkCups(cupStock)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterStock = useWater(waterStock, waterCap);
                                milkStock = useMilk(milkStock, milkCap);
                                beanStock = useBean(beanStock, beanCap);
                                moneyStock = fillMoney(moneyStock, moneyCap);
                                cupStock = useCup(cupStock);
                            } else if (!checkWater(waterStock, waterCap)) {
                                System.out.println("Sorry, not enough water!");
                            } else if (!checkBeans(beanStock, beanCap)) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (!checkCups(cupStock)) {
                                System.out.println("Sorry, not enough cups!");
                            } else if (!checkMilk(milkStock, milkCap)) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case "fill":
                    waterStock = fillWater(waterStock);
                    milkStock = fillMilk(milkStock);
                    beanStock = fillBean(beanStock);
                    cupStock = fillCup(cupStock);
                    break;
                case "take":
                    System.out.println("I gave you " + moneyStock);
                    moneyStock = 0;
                    break;
                case "remaining":
                    machineStock(waterStock, milkStock, beanStock, cupStock, moneyStock);
                    break;
                case "exit":
                    stopped = true;
                    break;
                default:
                    break;

            }
        }
    }
}
