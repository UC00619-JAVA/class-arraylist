public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent("Ana", 16);
        classroom.addStudent("Rui", 9);
        classroom.addStudent("Eva", 14);
        classroom.addStudent("Leo", 12);

        classroom.showAll();
        System.out.println("Average: " + classroom.getAverage());

        Student best = classroom.getBest();
        System.out.println("Best: " + best.name() + " (" + best.grade() + ")");
        System.out.println("Passed: " + classroom.countPassed() + " of " + classroom.size());

        Student found = classroom.findByName("Eva");
        if (found != null) {
            System.out.print("Found: ");
            found.show();
        }

        if (classroom.findByName("Zoe") == null) {
            System.out.println("Not found: Zoe");
        }

        // Extra
        classroom.removeFailed();
        System.out.println("After removing failed students:");
        classroom.showAll();
    }
}
