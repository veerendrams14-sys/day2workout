class Car1 {
    private int speed;

    public void setSpeed(int speed){
    if(speed>=0){
        this.speed = speed;
    } else {
        System.out.println("Speed is negative");
    }
}
    public int getSpeed(){
        return speed;
    }
}
public class cCar{
    public static void main(String[] args){
        Car1 c1 = new Car1();

        c1.setSpeed(50);
        System.out.println("Car speed: " + c1.getSpeed());
        c1.setSpeed(-20);
        System.out.println("Car speed: " + c1.getSpeed());
        }
    }