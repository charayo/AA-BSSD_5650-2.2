public class Duck extends Animal {
    public Duck(){
        setCovering("feathers");
        setFlyingType(new CanFly());
        setWalkingType(new TwoLegs());
    }
    public String eat() {
        return "ate some bread";
    }

    @Override
    public String speak() {
        return "quacks";
    }
    @Override
    public String animalName() {
        return "Duck";
    }
}
