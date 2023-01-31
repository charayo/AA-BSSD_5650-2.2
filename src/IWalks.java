public interface IWalks {
    String walk();
}
class TwoLegs implements IWalks{
    @Override
    public String walk(){
        return "Can walk on two legs";
    }
}
class FourLegs implements IWalks{
    @Override
    public String walk() {
        return "Can walk on four legs";
    }
}
class NoLegs implements IWalks{
    @Override
    public String walk() {
        return "Has no legs, so, can't walk";
    }
}
