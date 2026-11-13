public class StudentController {
    public String getStudents() {
        return "All students";
    }

    public String getStudentById(int id) {
        return "Student ID: " + id;
    }
}
