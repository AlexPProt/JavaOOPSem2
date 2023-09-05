package CatEat;

public class MainClass {
    public static void main (String[] args){

        Cat[] cats={
        new Cat("Barsik",5,false),
        new Cat("Marsik",10,false),
        new Cat("Persik",15,false),
        new Cat("Rizhik",20,false)};

        Plate plate=new Plate(30);
        plate.info();

        for (Cat cat:cats) {
            if (plate.getFood() - cat.getAppetite()>=0) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
                cat.eat();
            }
            cat.getCat();
        }

        plate.info();


    }
}
