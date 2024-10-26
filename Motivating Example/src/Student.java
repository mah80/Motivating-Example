class Student implements UserPortal {
    private String studentName;
    public String enrollmentYear;
    private GradeLevel grade;

    @Override
    public void manageStudentRecords(Student student)
    {System.out.println("Current Grade: " + this.grade);}

    public void displayEnrollmentYear()
    {System.out.println("Enrollment Year: " + this.enrollmentYear);}
}