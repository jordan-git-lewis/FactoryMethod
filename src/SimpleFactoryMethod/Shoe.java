package SimpleFactoryMethod;

/**
 * This interface represents the methods that go into producing a general shoe
 */
public interface Shoe {

  /**
   * collects the materials needed for making the shoe
   */
  void getMaterials();

  /**
   * Assembles the shoe into it's final form
   */
  void assembleShoe();

  /**
   * Packages the shoe for shipping
   */
  void packageShoe();
}
