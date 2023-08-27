public class Main {

    public static void main(String[] args) {
        int price = 13_676;
        int mile = price / 20;
        if (price >= 20) {
            System.out.println("Начисляются:" + mile);

        } else {
            System.out.println(" Неначисляются:" + mile);
        }
    }
}