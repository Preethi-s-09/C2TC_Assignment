package entityclassassignment1;

public class StudentMain {
    public static void main(String[] args) {
        // Create 3 student objects
        Student s1 = new Student();
        s1.setName("Alice");
        s1.setRollNo(101);
        s1.setGrade("A");

        Student s2 = new Student();
        s2.setName("Bob");
        s2.setRollNo(102);
        s2.setGrade("B");

        Student s3 = new Student();
        s3.setName("Charlie");
        s3.setRollNo(103);
        s3.setGrade("A+");

        // Output in single-line per student
        System.out.println(s1.getName() + " " + s1.getRollNo() + " " + s1.getGrade());
        System.out.println(s2.getName() + " " + s2.getRollNo() + " " + s2.getGrade());
        System.out.println(s3.getName() + " " + s3.getRollNo() + " " + s3.getGrade());
    }
}
