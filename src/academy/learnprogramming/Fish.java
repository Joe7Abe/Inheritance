package academy.learnprogramming;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int gills, int eyes, int fins) {
        super(name, 1, 1, weight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){
        System.out.println("moveMuscles() called");

    }
    private void moveBackFin(){
        System.out.println("moveBackFin() called");

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}
