package none;

import com.google.common.collect.ImmutableList;

public class SomeClass {

  private final String aString;

  public SomeClass(String path) {
    this.aString = "";
  }

  // Delete *any combination* of the below constructors and the test passes
  public SomeClass(String alias, String... path) {
    this("");
  }

  public SomeClass(String alias, ImmutableList<String> path) {
    this("");
  }

  public SomeClass(ImmutableList<String> path) {
    this("");
  }

}
