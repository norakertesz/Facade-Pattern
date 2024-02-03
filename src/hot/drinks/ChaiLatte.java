package hot.drinks;

public class ChaiLatte extends CaffeineBeveage {
    @Override
    protected void boilWater() {
        System.out.println("Heat a bit of water 100 deg C, heat milk to max 66 deg C");
    }
    @Override
    protected void brew() {
        System.out.println("Brew tea with water, then add warm milk");

    }



    @Override
    protected void addCondiments() {
        System.out.println("Add caramel sauce");
    }
}
