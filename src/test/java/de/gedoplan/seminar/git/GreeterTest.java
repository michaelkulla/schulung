package de.gedoplan.seminar.git;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {

  @Test
  public void testGreet() {
    Greeter greeter = new Greeter();
    String name = "Klaus";
    String expected = "Hello Klaus!";

    assertThat(greeter.greet(name), is(equalTo(expected)));
  }
}