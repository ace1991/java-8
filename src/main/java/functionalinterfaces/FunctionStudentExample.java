package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> functionStudent = (students -> {

        Map<String,Double> studentHashMap = new HashMap<>();

        students.forEach(student -> {
            if(PredicateStudentExample.p1.test(student)) {
                studentHashMap.put(student.getName(), student.getGpa());
            }
        });
        return studentHashMap;
    });

    public static void main(String[] args) {

        System.out.println(functionStudent.apply(StudentDataBase.getAllStudents()));

    }
}
