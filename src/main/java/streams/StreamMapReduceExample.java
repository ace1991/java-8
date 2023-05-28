package streams;

import data.StudentDataBase;
import data.Student;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){

        int noOfNoteBooks=  StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((student -> student.getGradeLevel()>=3))
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks) //Stream<Integer>
                .reduce(0,Integer::sum);

        return noOfNoteBooks;

    }

    public static void main(String[] args) {
        System.out.println("noOfNoteBooks : " + noOfNoteBooks());
    }
}
