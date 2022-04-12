public class Student {

  private String Name;
  private String Date;
  private int Age;
//comit 3_2
  public Student(String name, String date, int age) {
    Name = name;
    Date=date;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetDate() {return Date;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Date +" "+ Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error","Parse Error", -1);
    return new Student(data[0],data[1], Integer.parseInt(data[2]));
  }
}