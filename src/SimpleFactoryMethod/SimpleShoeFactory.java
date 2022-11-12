package SimpleFactoryMethod;

public class SimpleShoeFactory {

  public Shoe createShoe(String style){
    Shoe shoe = null;
    if (style.equals("hiker")){
      shoe = new HikingBoot();
    }
    else if (style.equals("runner")){
      shoe = new RunningShoe();
    }
    else if (style.equals("casual")){
      shoe = new Sneaker();
    }
    else if (style.equals("summer")){
      shoe = new Sandal();
    }
    return shoe;
  }
}

