package hot.drinks;

public abstract class CaffeineBeveage {
    //template methode
    //provides our skeleton of our algo

    final void prepareRecipe(){
        //steps that can't be changed by subclasses
        boilWater();
        brew();
        pourIn();
        addCondiments();
    }
    protected  void boilWater(){

        System.out.println("Boil water 100 deg C");
    }

    protected abstract void brew();

    protected void pourIn(){

        System.out.println("Pour into our favourite cup");
    }
        protected abstract void addCondiments();


}
