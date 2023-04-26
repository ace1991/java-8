package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3.9);
        //Map con nombre student + actividades de este
        Map<String, List<String>> studentsMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(studentPredicate)
                .peek((student -> {
                    System.out.println("After 1st filter: " + student);
                }))
                .filter(studentGpaPredicate)
                .peek((student -> {
                    System.out.println("After 2nd filter: " + student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        Map<String, List<String>> studentsMapParallel = StudentDataBase.getAllStudents().parallelStream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentsMap);
        System.out.println(studentsMapParallel);
    }
}
