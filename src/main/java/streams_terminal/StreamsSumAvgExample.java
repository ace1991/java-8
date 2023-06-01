package streams_terminal;

import data.StudentDataBase;
import data.Student;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {
    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Total No of notebooks : " + sum());
        System.out.println("Average No of notebooks : " + average());
    }
}
