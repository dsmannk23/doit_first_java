package study.finaly.school;

import java.util.ArrayList;

import study.finaly.utils.Define;

public class Subject {
    private String subjectName; // 과목 이름
    private int subjectId;      // 과목 고유 번호
    private int gradeType;      // 학점 평가 정책

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE; // 학정 평가 정책은 기본으로 A,B방식을 사용
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    // 수강 신청 메소
    public void register(Student student) {
        studentList.add(student);
    }
}
