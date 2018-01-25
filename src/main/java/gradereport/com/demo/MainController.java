package gradereport.com.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class MainController {

@RequestMapping("/")
public String showIndex()
{
    String StudentName="";
    String StudentNumber="";
    int StudentGrade=0;


   Scanner keyboard=new Scanner (System.in) ;
    StudentName= keyboard.nextLine();

    StudentNumber= keyboard.nextLine();
    System.out.println("Enter student number");

    StudentName= keyboard.nextLine();
    System.out.println("Enter student score");

    StudentGrade= keyboard.nextInt();

                if (StudentGrade >= 45)
            {
                System.out.print("A");
                return "A";
            }
            else if(StudentGrade >= 40 )
            {
                System.out.print("B");
                return "B";
            }
            else if( StudentGrade >= 35)
            {
                    System.out.print("C");
                    return"c";
                }
          else if (StudentGrade >=30)
          {

            System.out.print("D");
            return"D";
                }
            else System.out.print("F");
                return"F";

        }
    }




