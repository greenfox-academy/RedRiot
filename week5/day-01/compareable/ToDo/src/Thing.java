public class Thing implements Comparable <Thing>{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }


  @Override
  public int compareTo(Thing thisIsAThing) {
    if (this.completed == thisIsAThing.completed) {
      return this.name.compareTo(thisIsAThing.name);
    } else if (completed == true) {
      return -1;
    } else {
      return 1;
    }


  }
}