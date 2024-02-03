package hot.drinks;

public class CocoaExtra extends CaffeineBeveage{
    @Override
    protected void boilWater() {

        System.out.println("Heat milk to max 66 deg C");
    }

    @Override
    protected void brew() {
        System.out.println("Mix milk with organic cocoa powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add pocket coffee so we have caffeine");
    }
}
