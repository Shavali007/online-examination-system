public class ExamService {
    public int calculatePassingMarks(int totalMarks) {
        return 40;
    }
    public boolean login(String username, String password) {
    return username.equals("admin") &&
           password.equals("1234");
}
}