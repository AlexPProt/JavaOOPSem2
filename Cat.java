package CatEat;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite, boolean full){
        this.name=name;
        this.appetite=appetite;
        this.full=full;
    }
    public void eat(){
        this.full=true;
    }
    public int getAppetite(){
        return this.appetite;
    }

    public void getCat (){
        if (this.full==true)
            System.out.printf("Кот %s cыт",this.name);
        else
            System.out.printf("Кот %s голоден", this.name);
        System.out.println();
    }
}
