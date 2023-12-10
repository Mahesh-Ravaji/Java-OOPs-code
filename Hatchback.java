
public class Hatchback extends Car {
    public Hatchback(String make, String model) {
      super(make, model);
    }
  
    @Override
    public void allocateAccessories() {
      System.out.println("Allocating accessories for hatchback car: " + getMake() + " " + getModel());
    }
  
    @Override
    public void finalMakeup() {
      System.out.println("Performing final makeup for hatchback car: " + getMake() + " " + getModel());
    }
  }
  