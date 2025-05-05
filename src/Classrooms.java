import java.util.ArrayList;

public class Classrooms extends Areas{

    private String classroomNo; // sınıf numarasını gösterir
    private ArrayList<Courses> Courses = new ArrayList<Courses>(); // bu sınıfta verilen dersleri tutar.

    Classrooms(String classroomNo,String Location,int Capacity){
        super(Location,Capacity);
        this.classroomNo = classroomNo;
    }

    String get_classroomNo() {
        return classroomNo;
    }

    void set_classroomNo(String new_classroomNo) {
        this.classroomNo = new_classroomNo;
    }


    void addCourse(Courses newCourse) { // bu sınıfa ders eklemek için kullanılır.
        Courses.add(newCourse);
    }


    void deleteCourse(String courseCode) { // bu sınıftan coursecode'u kontrol edilerek ders silmek için kullanılır.

        for(int i = 0;i<Courses.size();i++) {
            if(Courses.get(i).getCourseCode().equals(courseCode)) {
                Courses.remove(i);
            }
        }
    }

    void showCourses() { // bu sınıfta verilen dersleri göstermek için kullanılır.

        System.out.println("\nCourses which is given in " + get_classroomNo());
        for(int i=0;i<Courses.size();i++) {
            System.out.printf("%d: %s\n",i+1,Courses.get(i).getCourseCode());
        }

    }


}