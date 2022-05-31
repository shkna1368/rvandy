package pattern_matching;

public class Runner {

    public static void main(String[] args) {
Vehicle vehicle=new Car(5,"72aEr");
//traditional way
        if (vehicle instanceof Car) {
              ((Car) vehicle).getNumberOfSeats();
        } else if (vehicle instanceof Truck) {
             ((Truck) vehicle).getLoadCapacity();
        } else {
            throw new RuntimeException("Unknown instance of Vehicle");
        }

//pattern matching
        if (vehicle instanceof Car car) {
             car.getNumberOfSeats();
        } else if (vehicle instanceof Truck truck) {
             truck.getLoadCapacity();
        } else {
            throw new RuntimeException("Unknown instance of Vehicle");
        }



    }

    }

