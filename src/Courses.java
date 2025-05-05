import java.util.ArrayList;

public abstract class Courses {
    private String courseCode;
    private String courseName;
    private double credit;
    private Classrooms courseLocation;
    private Lecturer lecturer;
    ArrayList <Students> courseStudents=new ArrayList<>();


    public Courses(String courseCode,String courseName,double credit,Classrooms courseLocation){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credit=credit;
        this.courseLocation=courseLocation;
    }
    public Courses(String courseCode,String courseName,double credit){//ders eklemek için ekstra constructor
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credit=credit;
    }
    public void listStudents(){//dersi alan ogrencileri gosterir
        for (int i=0;i<courseStudents.size();i++){
            System.out.println(courseStudents.get(i).toString());
        }
    }
    public void showStudentsGPA(){
        //dersin ogrencilerinin notlarını toplar,genel ortalamayı bulmak için ogrenci sayısına boler
        double total=0;
        for(int i=0;i<courseStudents.size();i++){
            for(int j=0;j<courseStudents.get(i).takenCourses.size();j++){
                if (courseStudents.get(i).takenCourses.get(j).getCourses().getCourseName()==this.courseName){
                    total+= courseStudents.get(i).takenCourses.get(j).getAverageGrade();

                }
            }
        }
        System.out.print(courseName+ " dersini alanların ortalaması: "+total/courseStudents.size());
    }

    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredit() {
        return credit;
    }

    public Classrooms getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(Classrooms courseLocation) {
        this.courseLocation = courseLocation;
    }

    public void setCourseStudents(ArrayList<Students> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<Students> getCourseStudents() {
        return courseStudents;
    }

}
