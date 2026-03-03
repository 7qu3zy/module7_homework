package TemplateBeverage;

import java.util.Scanner;

public class Coffee extends Beverage {

    protected void brew(){
        System.out.println("Завариваем кофе");
    }

    protected void addCondiments(){
        System.out.println("Добавляем сахар и молоко");
    }

    protected boolean customerWantsCondiments(){

        System.out.println("Добавить сахар? (y/n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        return answer.equalsIgnoreCase("y");
    }
}