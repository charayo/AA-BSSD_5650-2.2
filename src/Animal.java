public abstract class Animal {
    private String  covering;
    private IFlys flyingType;
    private IWalks walkingType;
    public abstract String speak();
    public abstract String eat();
    public abstract String animalName();

    public String fly(){
        return flyingType.fly();
    }
    public String walk(){
        return walkingType.walk();
    }
    public void setWalkingType(IWalks walkingType) {
        this.walkingType = walkingType;
    }

    public void setFlyingType(IFlys flyingType) {
        this.flyingType = flyingType;
    }

    public void setCovering(String covering) {
        this.covering = covering;
    }
    public String pet(){
        return "petting " + covering;
    }
}
