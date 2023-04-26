package methodreferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {



    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThan3;

    public static boolean greaterThan3(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
