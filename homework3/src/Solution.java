import java.util.*;

public class Solution {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {

        int totalEvents = Integer.parseInt(scanner.nextLine()); // scanning size of entries
        List<String> events = new ArrayList<>();

        while(totalEvents-- != 0){              //scanning entries
            String event = scanner.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events); // list of students by priority

        if (students.isEmpty()){            //writing the list on console if list is not empty
            System.out.println("EMPTY");
        }else{
            for(Student student: students){
                System.out.println(student.getName());
            }
        }

    }
}
