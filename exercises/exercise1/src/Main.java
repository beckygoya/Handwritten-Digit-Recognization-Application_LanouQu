import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        // Construct 20 students, if id can be divided by 3, set as full time.
        for (int i = 0; i < session.studentList.length; i++) {
            if (i % 3 == 0) {
                FullTimeStudent fullTimeStudent = new FullTimeStudent("FullTimeStudent-" + i);
                session.studentList[i] = fullTimeStudent;
                Random rd = new Random();
                fullTimeStudent.setExamScore1(100 * rd.nextFloat());
                fullTimeStudent.setExamScore2(100 * rd.nextFloat());
            } else {
                session.studentList[i] = new PartTimeStudent("PartTimeStudent-" + i);
            }
            for (int j = 0; j < session.studentList[i].quizScore.length; j++) {
                Random rd = new Random();
                session.studentList[i].quizScore[j] = 100 * rd.nextFloat();
            }
        }
        session.getAverageQuizScores();
        session.getSortedQuizScores();
        session.getNamesOfPartTimeStudent();
        session.getExamScoresOfFullTimeStudent();

    }
}
