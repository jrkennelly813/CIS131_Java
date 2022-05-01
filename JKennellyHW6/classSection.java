/*
* Program       : classSection.java
* Purpose       : This code works as a constructor for an of ojbect of the class Section class.
* Programmer    : Justin Kennelly
* Date          : 7/18/2021
*/

public class classSection {
    // object attributes initialised
    protected int CRN;
    protected String department;
    protected int courseNum;
    protected String instructionMode;
    protected String meetingDays;
    protected String meetingTimes;
    protected int capacity;
    protected int enrollment;
    protected int instructorID;
  
    // class object construction
    public classSection() {
        this.CRN = 0;
        this.department = " ";
        this.courseNum= 0;
        this.instructionMode = " ";
        this.meetingDays = " ";
        this.meetingTimes = " ";
        this.capacity = 0;
        this.enrollment = 0;
        this.instructorID = 0;
    }

    // constructor with parameters
    public classSection(int CRN, String department, int courseNum, String instructionMode,
                                 String meetingDays, String meetingTimes, int capacity, 
                                 int enrollment, int instructorID) {
        this.CRN = CRN;
        this.department = department;
        this.courseNum = courseNum;
        this.instructionMode = instructionMode;
        this.meetingDays = meetingDays;
        this.meetingTimes = meetingTimes;
        this.capacity = capacity;
        this.enrollment = enrollment;
        this.instructorID = instructorID;
    }
  
    // getter methods for getting object data
    public int getCRN() {
        return CRN;
    }

    public String getDepartment() {
        return department;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getInstructionMode() {
        return instructionMode;
    }

    public String getMeetingDays() {
        return meetingDays;
    }

    public String getMeetingTimes() {
        return meetingTimes;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public int getInstructorID() {
        return instructorID;
    }
  
    // setter methods for constructing class objects
    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public void setInstructionMode(String instructionMode) {
        this.instructionMode = instructionMode;
    }

    public void setMeetingDays(String meetingDays) {
        this.meetingDays = meetingDays;
    }

    public void setMeetingTimes(String meetingTimes) {
        this.meetingTimes = meetingTimes;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    // method to return all of the object data in user readable form
    public String toString() {
        return  "***************************************** \n" +
                "CRN\t\t\t: " + CRN + "\n\n" +
                "Department\t\t: " +  department + "\n\n" +
                "Course Number\t\t: " +  courseNum + "\n\n" +
                "Instructional Mode\t: " + instructionMode + "\n\n" +
                "Meeting Days\t\t: " + meetingDays + "\n\n" +
                "Meeting Times\t\t: " + meetingTimes + "\n\n" +
                "Capacity\t\t: " + capacity + "\n\n" +
                "Enrollment\t\t: " + enrollment + "\n\n" +
                "Instructor ID\t\t: " + instructorID + "\n\n";
    }   
}
