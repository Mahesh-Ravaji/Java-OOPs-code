public class Sedan extends Car {
    public Sedan(String make, String model) {
      super(make, model);
    }
  
    @Override
    public void allocateAccessories() {
      System.out.println("Allocating accessories for sedan car: " + getMake() + " " + getModel());
    }
  
    @Override
    public void finalMakeup() {
      System.out.println("Performing final makeup for sedan car: " + getMake() + " " + getModel());
    }
  }