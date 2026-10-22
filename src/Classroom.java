import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public void showAll() {
        for (Student s : students) {
            s.show();
        }
    }

    public double getAverage() {
        double sum = 0;
        for (Student s : students) {
            sum += s.grade();
        }
        return sum / students.size();
    }

    public Student getBest() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.grade() > best.grade()) {
                best = s;
            }
        }
        return best;
    }

    public int countPassed() {
        int total = 0;
        for (Student s : students) {
            if (s.grade() >= 9.5) {
                total++;
            }
        }
        return total;
    }

    public int size() {
        return students.size();
    }

    // Returns null when there is no student with that name
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.name().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // Extra: go backwards so that removing does not skip anyone
    public void removeFailed() {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).grade() < 9.5) {
                students.remove(i);
            }
        }
    }
}
