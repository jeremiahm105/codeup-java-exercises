package grades;
import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;
    public Student(String name, int grades){
        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grades);
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public String getName(){
        return this.name;
    }

    public double getGradeAverage(){
        double totalGradeAverage = 0;
        for(int grade : grades){
            totalGradeAverage += grade;
        }
        return totalGradeAverage / grades.size();
    }

    public static void main(String[] args) {

//        Student StudentA = new Student("jay", 90);
//        System.out.println(StudentA.getGradeAverage());
//        System.out.println(StudentA.getName());
//        StudentA.addGrade(50);
//        System.out.println(StudentA.getGradeAverage());


    }
}