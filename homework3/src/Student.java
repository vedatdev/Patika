public class Student {
    private final int id; //attribute is final because we dont need to change after we initialize
    private final String name; //attribute is final because we dont need to change after we initialize
    private final double cgpa; //attribute is final because we dont need to change after we initialize

    //All args constructor
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // There is only getter methods because attributes of class are final so we cant change or we cant set again.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }


}
