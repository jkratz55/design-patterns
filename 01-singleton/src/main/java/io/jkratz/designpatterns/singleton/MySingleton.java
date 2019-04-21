package io.jkratz.designpatterns.singleton;

/**
 * This class is an example of a thread safe singleton that utilizes lazy initialization.
 * The use of the static inner class LazyInit is referred to as Initialization on Demand
 * Holder (IODH). IODH utilizes lazy class initialization. The JVM won't execute a class's
 * static initializer until the class is accessed, this applies to static inner classes as
 * well.
 * <p>
 * Note: It is still technically possible to create multiple instances of this class using
 * reflection, serialization, and cloning. Personally I don't feel it is worth the extra effort
 * and code to prevent those methods. If someone is hacking code like that then all hope is lost
 * anyway.
 *
 * @author Joseph Kratz (joseph.kratz06@gmail.com)
 */
public class MySingleton {

  private MySingleton() {
  }

  public static MySingleton getInstance() {
    return LazyInit.INSTANCE;
  }

  @Override
  public String toString() {
    return "I am an singleton";
  }

  private static class LazyInit {
    private static final MySingleton INSTANCE = new MySingleton();
  }
}
