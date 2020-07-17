package academy.learnprogramming;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.walk() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");

    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(35);

    }
    public void run(){
        System.out.println("Dog.run() called");
        move(70);

    }

    private void chew(){
        System.out.println("Dog.chew() called");

    }




}
