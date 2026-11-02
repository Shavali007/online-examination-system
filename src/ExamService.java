public class ExamService {
    public int calculatePassingMarks(int totalMarks) {
        return 40;
    }
    public boolean login(String username, String password) {
    return username.equals("admin") &&
           password.equals("1234");
}
public boolean isValidExam(int totalMarks) {
    return totalMarks > 0;
}
public int calculateResult(int obtainedMarks) {
    return obtainedMarks;
}
}