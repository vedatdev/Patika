import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    //PriorityQueue is a queue that have some priorities.
    // In this queue Student going to be adding queue for priority queue parameter.
    private final PriorityQueue<Student> queue = new PriorityQueue<>(
      Comparator.comparing(Student::getCgpa).reversed()// In default comparing is sorting smaller to bigger
              // but our case we want to bigger to smaller cgpa. We use reversed function because of this.
              .thenComparing(Student::getName)
              .thenComparing(Student::getId)
    );

    //This method returns list of student that providing events that entered by the user
    public List<Student> getStudents(List<String> events){
        events.forEach((event) ->{
            if (event.equals("SERVED")) {
                queue.poll();
            } else if (event.split(" ")[0].equals("ENTER")) {

                String[] details = event.split(" ");
                /*
                Splitting line of text to " " character
                details[0] -> process SERVED or ENTER
                details[1] -> name
                details[2] -> cgpa
                details[3] -> id
                 */
                queue.add(new Student(Integer.parseInt(details[3]),details[1], Double.parseDouble(details[2])));//adding in queue
            }
        });

        List<Student> students = new ArrayList<>();//student list initialize

        while(!queue.isEmpty()){        // Listing elements in queue
            students.add(queue.poll());
        }

        return  students;

    }

}
