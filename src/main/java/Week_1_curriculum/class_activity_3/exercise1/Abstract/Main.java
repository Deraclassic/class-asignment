package Week_1_curriculum.class_activity_3.exercise1.Abstract;

public class Main {
    public static void main(String[] args) {
        Developers d1 = new Developers(1,"Emmanuel");
        Developers d2 = new Developers(2,"Euel");
        Developers d3 = new Developers(3,"manuel");
        Developers d4 = new Developers(4,"nuel") ;
        Developers d5 = new Developers(3,"anuel");

        Developers.institute="semi-colon";

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
    }
}
