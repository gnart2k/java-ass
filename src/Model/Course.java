package Model;

public class Course {
    private String courseID;
    private String courseName;
    private double courseDuration;
    private String status;
    private String flag;


    public Course() {
        this.courseID = null;
        this.courseName = null;
        this.courseDuration = 0.0;
        this.status = null;
        this.flag = null;
    }
    public Course(String courseID , String courseName, double courseDuration, String type, String flag) {
        this.courseID  = courseID;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.status = type;
        this.flag = flag;
    }

    public String getCourseCode() {
        return courseID;
    }

    public void setCourseCode(String courseCode) {
        this.courseID = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(double courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String type) {
        this.status = type;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Course {" +
                "courseCode='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                ", status='" + status + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
