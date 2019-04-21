package io.jkratz.designpatterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {

  @Test
  public void testFactoryWithCircle() {
    Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
    Assertions.assertEquals(Circle.class, shape.getClass());
  }

  @Test
  public void testFactoryWithRectangle() {
    Shape shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
    Assertions.assertEquals(Rectangle.class, shape.getClass());
  }

  @Test
  public void testFactoryWithSquare() {
    Shape shape = ShapeFactory.getShape(ShapeType.SQUARE);
    Assertions.assertEquals(Square.class, shape.getClass());
  }

  @Test
  public void testFactoryWithTriangle() {
    Shape shape = ShapeFactory.getShape(ShapeType.TRIANGLE);
    Assertions.assertEquals(Triangle.class, shape.getClass());
  }
}
