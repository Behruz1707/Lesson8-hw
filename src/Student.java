public class Student {
    private String id;
    private String name;
    private String course;
    private int exam1;
    private int exam2;
    private int exam3;
    private int assignment1;
    private int assignment2;

    public Student(String id, String name, String course,
                   int exam1, int exam2, int exam3,
                   int assignment1, int assignment2) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    public int totalExamScore(){
        return exam1+exam2+exam3;
    }
    public int totalAssignmentScore(){
        return assignment1+assignment2;
    }
    public double finalGrade(){
        double exams = totalExamScore()/3.;
        double assignments = totalAssignmentScore()/2.;
        return exams*0.7 + assignments*0.3;
    }

    public String writeInfo(Student student){
        return "Student id : " + id + "\n" +
                "Student name : " + name + "\n" +
                "Student course : " + course + "\n" +
                "Total exam score : " + totalExamScore() + "\n" +
                "Total assignment score : " + totalAssignmentScore() + "\n" +
                "Final  grade  : " +finalGrade() + "%\n";
    }


}
