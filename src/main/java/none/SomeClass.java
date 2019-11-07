package none;

public class SomeClass {

  private final String aString;

  public SomeClass(String aString) {
    this.aString = aString;
  }

  public SomeClass(String aString, Object... things) {
    this(aString);
  }

}
