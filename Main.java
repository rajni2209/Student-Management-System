import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO st = new StudentDAO();
        while (true){
            System.out.println("\n1.Add in table");
            System.out.println("2.Update in table");
            System.out.println("3.Delete from table");
            System.out.println("4.View Table Data");
            System.out.println("5.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter department");
                    String dept = sc.nextLine();
                    st.addStudent(name,age,dept);
                    break;
                case 2:
                    System.out.println("Enter student id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new name: ");
                    String newname = sc.nextLine();
                    System.out.println("Enter new age: ");
                    int newage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new department");
                    String newdept = sc.nextLine();
                    st.updateStudent(id,newname,newage,newdept);
                    break;
                case 3:
                    System.out.println("Enter student id: ");
                    int delID = sc.nextInt();
                    st.deleteStudent(delID);
                    break;
                case 4:
                    System.out.println("The data in table");
                    st.viewStudents();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice!");
            }
        }
    }
}