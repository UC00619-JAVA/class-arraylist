public record Student(String name, double grade) {

    public void show() {
        System.out.println(name + " - " + grade);
    }
}
