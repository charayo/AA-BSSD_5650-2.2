public class Dog extends Animal {
    public Dog(){
        setCovering("fur");
        setFlyingType(new CantFly());
        setWalkingType(new FourLegs());
    }
    @Override
    public String eat() {
        return "ate some kibble";
    }

    @Override
    public String speak() {
        return "barks";
    }
    @Override
    public String animalName() {
        return "Dog";
    }
}
