public abstract class Car {
  protected String make;
  protected String model;

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public abstract void allocateAccessories();

  public abstract void finalMakeup();

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }
}

// public class Hatchback extends Car {
//   public Hatchback(String make, String model) {
//     super(make, model);
//   }

//   @Override
//   public void allocateAccessories() {
//     System.out.println("Allocating accessories for hatchback car: " + getMake() + " " + getModel());
//   }

//   @Override
//   public void finalMakeup() {
//     System.out.println("Performing final makeup for hatchback car: " + getMake() + " " + getModel());
//   }
// }

// public class Sedan extends Car {
//   public Sedan(String make, String model) {
//     super(make, model);
//   }

//   @Override
//   public void allocateAccessories() {
//     System.out.println("Allocating accessories for sedan car: " + getMake() + " " + getModel());
//   }

//   @Override
//   public void finalMakeup() {
//     System.out.println("Performing final makeup for sedan car: " + getMake() + " " + getModel());
//   }
// }

// public class SUV extends Car {
//   public SUV(String make, String model) {
//     super(make, model);
//   }

//   @Override
//   public void allocateAccessories() {
//     System.out.println("Allocating accessories for SUV car: " + getMake() + " " + getModel());
//   }

//   @Override
//   public void finalMakeup() {
//     System.out.println("Performing final makeup for SUV car: " + getMake() + " " + getModel());
//   }
// }

// public class CarFactory {
//   public static Car getCar(String carType, String make, String model) {
//     if (carType == null) {
//       return null;
//     }
//     if (carType.equalsIgnoreCase("HATCHBACK")) {
//       return new Hatchback(make, model);
//     } else if (carType.equalsIgnoreCase("SEDAN")) {
//       return new Sedan(make, model);
//     } else if (carType.equalsIgnoreCase("SUV")) {
//       return new SUV(make, model);
//     }
//     return null;
//   }
// }

public class TestFactoryPattern {
  public static void main(String[] args) {
    Car hatchback = CarFactory.getCar("HATCHBACK", "Toyota", "Yaris");
    hatchback.allocateAccessories();
    hatchback.finalMakeup();

    Car sedan = CarFactory.getCar("SEDAN", "Honda", "Civic");
    sedan.allocateAccessories();
    sedan.finalMakeup();

    Car suv = CarFactory.getCar("SUV", "Ford", "Explorer");
    suv.allocateAccessories();
    suv.finalMakeup();
    
  }
}
