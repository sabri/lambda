package lambda.functionalInterface;


import java.util.List;

public class Instructor {
    String name;
    int yearsofexp;
    String title;

    boolean onlinecourse;
    List<String> courses;

    public Instructor(String name, int yearsofexp, String title, boolean onlinecourse, List<String> courses) {
        this.name = name;
        this.yearsofexp = yearsofexp;
        this.title = title;
        this.onlinecourse = onlinecourse;
        this.courses = courses;
    }





    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsofexp +
                ", title='" + title + '\'' +
                ", onlineCourses=" + onlinecourse +
                ", courses=" + courses +
                '}';
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setYearsofexp(int yearsofexp) {
        this.yearsofexp = yearsofexp;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setOnlinecourse(boolean onlinecourse) {
        this.onlinecourse = onlinecourse;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearsofexp() {
        return yearsofexp;
    }

    public String getTitle() {
        return title;
    }



    public boolean isOnlinecourse() {
        return onlinecourse;
    }

    public List<String> getCourses() {
        return courses;
    }
}
