public class Main {
    public static void main(String[] args) {
        //Students students= new Students(201180080,"Ebru Nur Uslu","20");
       // System.out.println(students.getnameSurname());


        TechnicalStaff s=new TechnicalStaff("67832",10);
        System.out.println(s.calculateSalary());
        System.out.println(s.getTaskInformation());
        Staff staff = new Secretary("21",14);

        Classrooms classrooms= new Classrooms("23","sınıf");
        UndergraduateCourses courses= new UndergraduateCourses("1311313","mat",5,classrooms);
       // Academician lecturer= new Academician("front end","samet","ağbi");
      //  lecturer.addCourse(courses);
        System.out.println(courses.getLecturer());

        UndergraduateStudents students= new UndergraduateStudents("bfd dnsm","1999");

        Classrooms classroomss= new Classrooms("23","sınıf");
        Courses courses1= new UndergraduateCourses("101","mat",5,classroomss);
        Courses courses2= new UndergraduateCourses("192","FİZİK",5,classroomss);

        courses1.listStudents();
        courses1.showStudentsGPA();
        System.out.println(" ");
        Secretary secretary= new Secretary("oruç",13);
        secretary.addLecturer("doç","elif","mercan",courses);
        secretary.addLecturer("doç","elif","uslu",courses2);
        secretary.showLecturer();
        secretary.deleteLecturer("600100101");
        secretary.showLecturer();
    }
}