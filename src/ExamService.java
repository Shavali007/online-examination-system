public class ExamService {

    public boolean isPassed(int marks) {
        return marks >= 40;
    }

    public int calculateScore(int correctAnswers) {
        return correctAnswers * 2;
    }
}