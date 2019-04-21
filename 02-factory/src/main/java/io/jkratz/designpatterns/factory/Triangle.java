package io.jkratz.designpatterns.factory;

public class Triangle implements Shape {

  @Override
  public void draw() {
    System.out.println("I am a triangle");
  }
}
