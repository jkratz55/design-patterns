package io.jkratz.designpatterns.factory;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("I am a circle");
  }
}
