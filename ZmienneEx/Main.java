package ZmienneEx;

public class Main {
    public static void main(String [] args) {

        int age = 22;
        double weight = 47.0;
        double height = 1.75;
        double bmi = weight / height / height;
        bmi = (int) bmi;

        System.out.println("Twój wiek to: " + age + " lata");
        System.out.println("Twoja waga to: " + weight + "kg");
        System.out.println("Twój wzrost to: " + height + "m:");
        System.out.println("Twoje bmi to: " + bmi);

    }


}
