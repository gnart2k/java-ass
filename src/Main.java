import Controller.CourseManager;

public class Main {
    public static void main(String[] args) {
        CourseManager cm= new CourseManager();
//        cm.ls.add(new Course("1", "java", 20,  "available", "mandatory"));
//        cm.ls.add(new Course("2", "java", 20,  "available", "optional"));
//        cm.ls.add(new Course("3", "java", 20,  "available", "optional"));
//        cm.ls.add(new Course("4", "java", 20,  "available", "optional"));
        cm.menu();
    }
}