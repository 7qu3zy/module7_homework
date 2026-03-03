package TemplateBeverage;

public abstract class Beverage {

    public final void prepare(){

        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments())
            addCondiments();
    }

    private void boilWater(){
        System.out.println("Кипятим воду");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    private void pourInCup(){
        System.out.println("Наливаем в чашку");
    }

    protected boolean customerWantsCondiments(){
        return true;
    }
}