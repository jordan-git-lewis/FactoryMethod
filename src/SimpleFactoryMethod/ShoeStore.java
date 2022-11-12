package SimpleFactoryMethod;

public class ShoeStore {

  private final SimpleShoeFactory factory;

  public ShoeStore(SimpleShoeFactory factory){
    this.factory = factory;
  }

  public Shoe orderShoe(String style){
    Shoe shoe;

    shoe = factory.createShoe(style);
    shoe.getMaterials();
    shoe.assembleShoe();
    shoe.packageShoe();

    return shoe;
  }
}

