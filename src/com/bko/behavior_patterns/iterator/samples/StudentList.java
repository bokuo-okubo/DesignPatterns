package com.bko.behavior_patterns.iterator.samples;

public class StudentList{
    protected Student[] students;
    private int last = 0;

    public StudentList(){} //コンストラクタ
    public StudentList(int studentCount){ //オーバーロード
        this.students = new Student[studentCount];
    }

    //リストの最後に、新しくStudentを追加する。(push)
    public void add(Student student){
        students[last] = student;
        last++;
    }

    public Student getStudentAt(int index){
        return students[index];
    }

    public int getLastNum(){
        return last;
    }
}