class Instructor implements UserPortal {
    private String instructorName;
    public void updateStudentGrade(Student student, GradeLevel newGrade) {
        student.grade = newGrade;
        System.out.println("Instructor " + this.instructorName + " has updated the grade for: " + student.studentName + " to " + newGrade);}
    @Override
    public void manageStudentRecords(Student student)
    {this.updateStudentGrade(student, GradeLevel.B_Plus);}
}