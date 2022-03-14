package de.gedoplan.seminar.git;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {

  @Test
  public void testGreet() {
    Greeter greeter = new Greeter();
    String name = "Klaus";
    String expected = "Hello Klaus!";

    Assertions.assertEquals(expected, greeter.greet(name));
  }
}