package SimpleFactoryMethod;
import java.util.Scanner;

public abstract class AbstractShoe implements Shoe{

  private String type;

  public AbstractShoe(String type){
    this.type = type;
  }

  public static void main(String[] args) {
    Scanner myShoe = new Scanner(System.in);
    String shoeType = myShoe.nextLine();

    Shoe shoe;

    if (shoeType.equals("hiker")){
      shoe = new HikingBoot();
    }
    else if (shoeType.equals("runner")){
      shoe = new RunningShoe();
    }
    else if (shoeType.equals("casual")){
      shoe = new Sneaker();
    }
    else if (shoeType.equals("summer")){
      shoe = new Sandal();
    }
  }

}
