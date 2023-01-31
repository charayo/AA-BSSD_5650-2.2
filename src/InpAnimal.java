public class InpAnimal extends Animal {
    String name;
    int no_of_legs;
    String can_it_fly;
    String food;
    String sound;
    public InpAnimal(String name, int no_of_legs, String can_it_fly, String food, String sound){
        this.name = name;
        this.no_of_legs = no_of_legs;
        this.can_it_fly = can_it_fly;
        this.food = food;
        this.sound = sound;

//        For flying ability
        if(this.can_it_fly.toLowerCase() == "yes"){
            setFlyingType(new CanFly());
        }else{
            setFlyingType(new CantFly());
        }
//        For the leg options
        if(this.no_of_legs == 4){
            setWalkingType(new FourLegs());
        } else if (this.no_of_legs == 2) {
            setWalkingType(new TwoLegs());
        }else{
            setWalkingType(new NoLegs());
        }

    }
    public String eat() {
        return "ate some " + this.food;
    }

    @Override
    public String speak() {
        return sound;
    }
    public String animalName(){
        return this.name;
    }
}
