/*
* Program       : classDriver.java
* Purpose       : This code works as a driver for object construction in the classSection class.
* Programmer    : Justin Kennelly
* Date          : 7/18/2021
*/

public class classDriver {
    public static void main(String[] args) {
        // initialize object
        classSection classA = new classSection();
        // set attributes to object
        classA.setCRN(20008);
        classA.setDepartment("CIS");
        classA.setCourseNum(131);
        classA.setInstructionMode("Online");
        classA.setMeetingDays("N/A");
        classA.setMeetingTimes("N/A");
        classA.setCapacity(30);
        classA.setEnrollment(30);
        classA.setInstructorID(666);
        // print object details
        System.out.println("Class Info 1:");
        System.out.println(classA.toString());
        // create another object using parameter values
        classSection classB = new classSection(30069 , "SPA", 102, "Online", "N/A" , "N/A", 28, 28, 1001);
        // print object details
        System.out.println("Class Info 2:");
        System.out.println(classB.toString());    
    }

}
