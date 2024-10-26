class Classroom {
    private String classroomNumber;
    public Course course;

    public void displayInstructorInfo() {
        Instructor instructor = new Instructor("Steve William");
        System.out.println("Instructor " + instructor.instructorName + " teaches course " + course.courseName + " in classroom " + classroomNumber);}
}