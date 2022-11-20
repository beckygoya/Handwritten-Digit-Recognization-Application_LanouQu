public class FullTimeStudent extends Student {
    private float examScore[] = new float[2];

    public FullTimeStudent(String name) {
        super(name);
    }

    public float getExamScore1() {
        return this.examScore[0];
    }

    public float getExamScore2() {
        return this.examScore[1];
    }
    public void setExamScore1(float score1) {
        examScore[0] = score1;
    }

    public void setExamScore2(float score2) {
        examScore[1] = score2;
    }
}