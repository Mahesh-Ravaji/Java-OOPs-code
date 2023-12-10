
public class CarFactory {
    public static Car getCar(String carType, String make, String model) {
      if (carType == null) {
        return null;
      }
      if (carType.equalsIgnoreCase("HATCHBACK")) {
        return new Hatchback(make, model);
      } else if (carType.equalsIgnoreCase("SEDAN")) {
        return new Sedan(make, model);
      } else if (carType.equalsIgnoreCase("SUV")) {
        return new SUV(make, model);
      }
      return null;
    }
  }
  