package model;

import java.util.HashMap;

public class Transcript {

    private String studentName;
    private Integer studentID;
    private Double total = 0.0;
    private Integer numClasses = 0;
    HashMap<String, Double> grades = new HashMap<String, Double>();

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() { return this.studentName; }
    public int getStudentID() { return this.studentID; }


    public void addGrade(String course, double grade){
        this.total += grade;
        this.numClasses++;
        this.grades.put(course, grade);
    }

    //TODO: Design specification for this method
    // This method should return course name and grade in some consistent String format
    public String getCourseAndGrade(String course){
        Double grade = this.grades.get(course);

        String courseAndGrade = String.format("%1s: %2s", course, grade);

        return courseAndGrade;
    }

    //TODO: Design specification for this method
    //
    public void printTranscript(){
        this.grades.keySet().iterator().forEachRemaining(System.out::println);
    }

    //TODO: Design specification for this method
    //
    public double getGPA(){ return this.total / this.numClasses; }
}
