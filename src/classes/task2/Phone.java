package classes.task2;

public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber(String name) {
        System.out.print(name);
        return number;
    }

    public String receiveCall(String name) {
        return ("Вам звонит: " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Вам звонит: " + name + " " + number);
    }

    public static int[] sendMessage(int... number) {
        return number;
    }

    @Override
    public String toString() {
        return
                "number = " + number +
                        ", model = " + model +
                        ", weight = " + weight;
    }
}
