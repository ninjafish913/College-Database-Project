import java.util.ArrayList;

public class DatabaseDriver 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> studentDatabase = new ArrayList<Student>();
        studentDatabase.add(new Student("James", "james@gmail.com", "Computer Science", 2, 4.0));
        studentDatabase.add(new Student("Steve", "steve@gmail.com", "Mathematics", 3, 3.0));
        studentDatabase.add(new Student("Jane", "jane@gmail.com", "English", 1, 0.0));
        studentDatabase.add(new Student("Anne", "anne@gmail.com", "Computer Science", 4, 3.5));

        ArrayList<BandMember> bandDatabase = new ArrayList<BandMember>();
            
        for (Student student : studentDatabase)
        {
            bandDatabase.add(new BandMember(student));
        }

        BandMember.printRoster();
    }
}