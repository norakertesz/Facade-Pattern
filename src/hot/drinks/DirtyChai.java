package hot.drinks;

public class DirtyChai extends CaffeineBeveage{

    @Override
    protected void boilWater() {
        System.out.println("Heat tee water 100 deg C, heat espresso water 94 deg C heat milk to max 66 deg C");
    }

    @Override
    protected void brew() {
        System.out.println("Brew tea with tea water, add foamed milk, add nicely extracted espresso");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Nothing");
    }
}
