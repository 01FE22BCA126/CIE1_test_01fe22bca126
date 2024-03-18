public class StudentCourses {
    int[] marks={36,37,40,35};
    String[] courses={"C#","ML","PALR","Devops"};
    public void displayCourses(){
        System.out.println("Student Courses are:");
        for(int i=0;i<=courses.length;i++){
            System.out.println(courses[i]+"\n");
        }
    }
    public void displayMarks(){
        System.out.println("Student Marks are:");
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]+"\n");
        }
    }
    
}
