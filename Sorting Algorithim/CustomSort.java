import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class CustomSort {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78)
        };

        // Sort by score descending
        Arrays.sort(students, Comparator.comparingInt((Student s) -> s.score).reversed());

        System.out.println(Arrays.toString(students)); 
        // [Bob: 92, Alice: 85, Charlie: 78]
    }
}
