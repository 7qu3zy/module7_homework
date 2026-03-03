package TemplateBeverage;

public class Tea extends Beverage {

    protected void brew(){
        System.out.println("Завариваем чай");
    }

    protected void addCondiments(){
        System.out.println("Добавляем лимон");
    }
}