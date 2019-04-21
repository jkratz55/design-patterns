package io.jkratz.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MySingletonTest {

  @Test
  @DisplayName("Get Instance Successful")
  public void testSingleton() {
    MySingleton mySingleton = MySingleton.getInstance();
    Assertions.assertNotNull(mySingleton);
  }

  @Test
  @DisplayName("Should returns same instance")
  public void testSameInstance() {
    MySingleton mySingleton1 = MySingleton.getInstance();
    MySingleton mySingleton2 = MySingleton.getInstance();
    Assertions.assertSame(mySingleton1, mySingleton2);
    Assertions.assertEquals(mySingleton1, mySingleton2);
  }
}
