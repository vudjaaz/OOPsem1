package seminar2;

public interface ActorBehavior {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
