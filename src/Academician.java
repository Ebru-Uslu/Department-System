import java.util.ArrayList;
import java.util.Random;

public class Academician extends Lecturer{
    ArrayList<Courses> Courses = new ArrayList<Courses>(); //ders eklemek için arraylist oluşturduk
    ArrayList <CourseGrade> takenCourses;//dersin notlarını öğrenciye eklemek için arraylist
    private static int counter = 100;//sekreterin id'ye göre akademisyen işlemleri için kullandık

    public String generateIdNumber(){//her öğretmene farklı id
        String idNumber = "600100";
        idNumber += Integer.toString(counter);
        return idNumber;
    }
    public Academician(String title,String name,String surname,Courses course) {
        super(title, name, surname,course);
        counter++;
    }


    void addCourse(Courses newCourse) { //akademisyen ders eklemesi yapar

        if(Courses.size() <= 10) { //10 ders sınırı için if else
            Courses.add(newCourse);
            newCourse.setLecturer(this);//this,mainde newlenen lecturer
        }
        else {
            System.out.println("This lecturer access to max course number.");
        }
    }

    void deleteCourse(String courseCode) { //Akademisyen ders koduna göre ders siler

        for(int i = 0;i<Courses.size();i++) {
            if(Courses.get(i).getCourseCode().equals(courseCode)) {
                Courses.remove(i);
            }
        }

    }
    void showCourses() { //akademisyenin derslerini gosterir
        System.out.println("\nCourses which is given by " );
        for(int i=0;i<Courses.size();i++) {
            System.out.printf("%d: %s\n",i+1,Courses.get(i).getCourseName());
        }
    }
    void assignLesson(Students student,Courses course) throws ExceptionNotAvailable {
        //akademisyen,öğrenciye ders ataması yapar
        try {
            //if ve else if ifadelerinin içi,dersleri ve öğrencileri lisans ve lisansüstü şeklinde ayırarak işlem yapar.Lisans öğrencisine lisansüstü dersi atanırsa hata verir.
            if (student instanceof UndergraduateStudents && course instanceof UndergraduateCourses) {
                CourseGrade crg = new CourseGrade(course);
                System.out.println(crg.getCourses().getCourseName());
                student.takenCourses.add(crg);
                course.courseStudents.add(student);
            } else if (student instanceof GraduateStudents && course instanceof  GraduateCourses) {
                CourseGrade crg = new CourseGrade(course);
                System.out.println(crg.getCourses().getCourseName());
                student.takenCourses.add(crg);
                course.courseStudents.add(student);
            }
            else {
                throw new ExceptionNotAvailable("Ders ogrenci icin uygun degildir.");
            }

        }
        catch (Exception e){
                System.out.println(e.getMessage());//hata mesajı verir

        }

    }
}
