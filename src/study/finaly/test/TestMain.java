package study.finaly.test;

import study.finaly.school.School;
import study.finaly.school.Score;
import study.finaly.school.Student;
import study.finaly.school.Subject;
import study.finaly.school.report.GenerateGradeReport;
import study.finaly.utils.Define;

public class TestMain {

    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject dance;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);
        dance = new Subject("댄스", Define.DANCE);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
        goodSchool.addSubject(dance);
    }


    public void createStudent() {
        // 테스트 과목 생
        Student student1 = new Student(181213, "안성원", korean);
        Student student2 = new Student(181518, "오태훈", math);
        Student student3 = new Student(171230, "이동호", korean);
        Student student4 = new Student(171255, "조성욱", korean);
        Student student5 = new Student(171590, "최태평", math);

        // gooSchool에 학생 추가
        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        // 국어 과목을 수강하는 학생 등록
        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        // 수학 과목을 수강하는 학생 등록
        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        // 댄스 과목을 수강하는 학새 등록
        dance.register(student1);
        dance.register(student2);
        dance.register(student3);

        // 각 학생의 과목 점수 추
        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 65);
        addScoreForStudent(student1, dance, 95);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 56);
        addScoreForStudent(student2, dance, 85);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);
        addScoreForStudent(student3, dance, 55);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
    }


    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
