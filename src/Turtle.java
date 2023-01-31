public class Turtle extends Animal {
    public Turtle(){
        setCovering("Shell");
        setFlyingType(new CantFly());
        setWalkingType(new FourLegs());
    }
    @Override
    public String eat() {
        return "ate some plants";
    }

    @Override
    public String speak() {
        return "makes a funny sound";
    }
    @Override
    public String animalName() {
        return "Turtle";
    }
}
