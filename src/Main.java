public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics", 10);
        Institution institution = new Institution("Green Valley School", "123 Elm St", 1990);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(institution);

        Student student2 = new Student("Bob", 22, "S54321");
        System.out.println("Are students the same? " + student.getName().equals(student2.getName()));
    }
}
