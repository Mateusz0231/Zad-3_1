import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try{
      Service1 s = new Service1();
      String Name;
      String Date;
      int Age;
      int wybor;
      int x=0;
      while(x<3)
             {
      System.out.println("Co chcesz zrobić");
    System.out.println("1.Dopisanie studenta");
      System.out.println("2.Lista studentów");
      System.out.println("3.koniec programu");
    Scanner to = new Scanner(System.in);
        wybor=to.nextInt();
      
      switch(wybor)
           
    
        {
            
        //comit 3_1a
          case 1:
            
            System.out.println("Dopisanie studenta");
            System.out.println("Podaj imię studenta");
            Name=to.next();
            System.out.println("Podaj datę urodzenia studenta");
            Date=to.next();
            System.out.println("Podaj wiek studenta");
            Age=to.nextInt();
            s.addStudent(new Student(Name,Date, Age));
            
            break;
        
      //comit 3_1b
        case 2:
        
        System.out.println("Lista studentów");
            var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
        }
          case 3:
            System.out.println("Koniec programu");
            x=4;
            break;
        }
        }
        
      

      
        
            } catch (IOException e) {

    }
    
}
}
        
  




    
      
    

    

    

        
  
