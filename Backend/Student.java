public class Student {
    private int id;
    private String name;
    private String course;
    private String email;
    private String phone;
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }
}
