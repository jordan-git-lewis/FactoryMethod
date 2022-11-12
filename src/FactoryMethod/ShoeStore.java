package FactoryMethod;

public abstract class ShoeStore {

  private final SimpleShoeFactory factory;

  public ShoeStore(SimpleShoeFactory factory){
    this.factory = factory;
  }

  public Shoe orderShoe(String style){
    Shoe shoe;

    shoe = createShoe(style);
    shoe.getMaterials();
    shoe.assembleShoe();
    shoe.packageShoe();

    return shoe;
  }

  abstract Shoe createShoe(String style);
}

