import java.sql.*;

public class StudentDAO {

    private Connection conn;

    public StudentDAO(){
        this.conn = DatabaseConnection.getConnection();
    }
    public void addStudent(String name , int age , String dept){
        try{
            String query = "insert into students (name , age , department) values (?,?,?)";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1 , name);
            stm.setInt(2,age);
            stm.setString(3,dept);
            stm.execute();
            System.out.println("Data added successfully!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateStudent(int id , String name , int age , String dept){
        try{
            String query = "update students set name = ? , age = ?, department = ? where id = ?";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1,name);
            stm.setInt(2,age);
            stm.setString(3,dept);
            stm.setInt(4,id);
            int rowUpdated = stm.executeUpdate();
            if(rowUpdated > 0){
                System.out.println("Updated Sucessfully");
            }else{
                System.out.println("student not found!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id){
        try{
            String query = "delete from students where id = ?";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1,id);
            int rowDeleted = stm.executeUpdate();
            if(rowDeleted > 0){
                System.out.println("deleted successfully!");
            }else{
                System.out.println("student nor found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents(){
        try{
            Statement stm = conn.createStatement();
            String query = "select * from students";
            ResultSet res = stm.executeQuery(query);
            System.out.println("\nID | Name | Age | Department");
            while(res.next()){
                System.out.printf("%d | %s | %d | %s\n" , res.getInt("id") , res.getString("name") , res.getInt("age") , res.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
