
public class SUV extends Car {
    public SUV(String make, String model) {
      super(make, model);
    }
  
    @Override
    public void allocateAccessories() {
      System.out.println("Allocating accessories for SUV car: " + getMake() + " " + getModel());
    }
  
    @Override
    public void finalMakeup() {
      System.out.println("Performing final makeup for SUV car: " + getMake() + " " + getModel());
    }
  }