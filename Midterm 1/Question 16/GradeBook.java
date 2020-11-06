import java.util.Random;
import java.util.*;

public class GradeBook {
    int[][] grades;

    public GradeBook(int numberOfStudents, int numberOfHWs) {
        grades = new int[numberOfStudents][numberOfHWs];
        Random rand = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfHWs; j++) {
                grades[i][j] = 50 + rand.nextInt(51);
            }
        }
    }

    public GradesIterator gradeIterator() {
        //TODO: should return anonymous object of type GradesIterator
        //If not sure, check the invoice example slides + source code
        return new GradesIterator() {
            public boolean hasNext() {
                if(currentRow == (grades.length - 1)) {
                    return (currentColumn < grades[0].length);
                }
                return (currentRow < grades.length);
            }

            public int next() {
                while (currentRow < grades.length) {
                    if(currentColumn < grades[0].length) {
                        return grades[currentRow][currentColumn++];
                    } else {
                        currentRow++;
                        currentColumn = 0;
                    }
                }
                return 0;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
            
            private int currentRow = 0;
            private int currentColumn = 0;  
        };      
    }

    public static void main(String[] args) {
        GradeBook gbook = new GradeBook(3, 2);
        GradesIterator iterator = gbook.gradeIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}