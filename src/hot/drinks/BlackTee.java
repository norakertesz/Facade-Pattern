package hot.drinks;

public class BlackTee extends CaffeineBeveage {

    @Override
    protected void brew() {
        System.out.println("Steep tee leaves 5 minutes");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add honey");
    }
}
