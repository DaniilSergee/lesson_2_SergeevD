public class Main {
    public static void main(String[] args) {
        System.out.println (stroll(23, 34));
        System.out.println (stroll(20, 21));
        System.out.println (stroll(15, 5));
        System.out.println (stroll(50, -1));
        System.out.println (stroll(8, -2));
        System.out.println (stroll(generateRandomAge(), 10));

    }
    public static String stroll(int num1, int num2) {
        if (num1 >= 20 && num1 <= 45 && num2 >= 20 && num2 <= 30){
            return "Можно идти гулять";
        } else if (num1 < 20 && num2 >= 0 && num2 <= 28) {
            return "Можно идти гулять";
        } else if (num1 > 45 && num2 >= -10 && num2 <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static  int generateRandomAge() {
        int randomAge = (int) (Math.random() * 100);
        return randomAge;

    }
}