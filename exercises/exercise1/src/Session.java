import java.util.ArrayList;
import java.util.Arrays;

public class Session {
    public Student studentList[];

    public Session() {
        studentList = new Student[20];
    }

    public void getAverageQuizScores() {
        for (Student student : studentList) {
            float sum = 0.0f;
            for (int i = 0; i < student.quizScore.length; i++) {
                sum += student.quizScore[i];
            }
        System.out.printf("The average quiz score for %s is %f.%n", student.getName(), sum / student.quizScore.length);
        }
    }

    public void getSortedQuizScores() {
        ArrayList<Float> quizScore = new ArrayList<>();
        for (Student student : studentList) {
            quizScore.addAll(new ArrayList<>(Arrays.asList(student.quizScore)));
        }
        Object[] scores = quizScore.toArray();
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
    }

    public void getNamesOfPartTimeStudent() {
        for (Student student : studentList) {
            if (student instanceof PartTimeStudent) {
                System.out.printf("One of part time students is %s\n", student.getName());
            }
        }
    }

    public void getExamScoresOfFullTimeStudent() {
        for (Student student : studentList) {
            if (student instanceof FullTimeStudent) {
                System.out.printf("Exam Scores of full time student %s are %s,%s\n", student.getName(), ((FullTimeStudent) student).getExamScore1(),((FullTimeStudent) student).getExamScore2());
            }
        }
    }
}







