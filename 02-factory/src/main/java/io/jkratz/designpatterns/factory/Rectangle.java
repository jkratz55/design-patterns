package io.jkratz.designpatterns.factory;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("I am a rectangle");
  }
}
