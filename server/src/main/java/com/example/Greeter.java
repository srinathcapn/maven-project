package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @person name
   * @return greeting string
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
