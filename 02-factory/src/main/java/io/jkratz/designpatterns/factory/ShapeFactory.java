package io.jkratz.designpatterns.factory;

public class ShapeFactory {

  private ShapeFactory() {
  }

  public static Shape getShape(ShapeType shapeType) {

    Shape shape = null;
    switch (shapeType) {
      case CIRCLE:
        shape = new Circle();
        break;
      case SQUARE:
        shape = new Square();
        break;
      case TRIANGLE:
        shape = new Triangle();
        break;
      case RECTANGLE:
        shape = new Rectangle();
        break;
      default:
        throw new IllegalArgumentException(String.format("%s is not a supported shape type", shapeType.toString()));
    }
    return shape;
  }
}
