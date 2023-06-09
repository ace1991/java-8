package streams_terminal;

import data.StudentDataBase;
import data.Student;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {
        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet())); // this avoids the additional map intermediate operation.
        System.out.println("namesSet : " + namesSet);
        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList())); // this avoids the additional map intermediate operation.
        System.out.println("namesList : " + namesList);
    }
}
