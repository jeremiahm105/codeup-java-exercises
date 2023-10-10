package AbstractPractice;

public class AbstractCar extends AbstractVehicle{
    @Override
    void go() {
        System.out.println("the driver is driving the car");

    }
}
//now we can no longer create an instance of the vehicle class because its abstract