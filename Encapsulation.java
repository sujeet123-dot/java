class Human{
  private int age = 19;
  private String name = "sujeet";

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int a) {
    age = a;
  }

  public void setName(String n) {
    name = n;
  }
  
}


public class Encapsulation {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(19);
    obj.setName("sujeet");
    System.out.println(obj.getName() + ":" + obj.getAge());
  }
}
