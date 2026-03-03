package TemplateBeverage;

public class Main {

    public static void main(String[] args){

        System.out.println("Чай:");
        Beverage tea = new Tea();
        tea.prepare();

        System.out.println("\nКофе:");
        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}