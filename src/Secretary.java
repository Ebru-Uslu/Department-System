import java.util.ArrayList;
import java.util.Random;


public class Secretary extends Staff {

    static int counter = 0;
    private Academician academician;
    private ArrayList<Lecturer> lecturers = new ArrayList<>();//

    public Secretary(String nameSurname, int workingHours) {
        super(nameSurname, workingHours);
        setTaskInformation("Sekreterin gorevleri:\n" +
                "1.Cagrilari cevaplamak, mesajlari not almak ve yazismaları yonetmek.\n" +
                "2.Gunluk is raporu tutmak. \n" +
                "3.Toplanti tarihlerini duzenlemek ve taraflara hatirlatmak. \n" +
                "4.Is yukunu onceliklendirmek.");
    }

    @Override
    public String generateIdNumber() {
        Random random = new Random();
        String idNumber = "100";
        for (int i = 0; i < 6; i++) {
            idNumber += random.nextInt(10);
        }
        return idNumber;
    }

    public Academician getAcademician() {
        return this.academician;
    }

    @Override
    public int calculateSalary() {//gunluk calisma saatlerine gore maas hesaplar
        int salary = 100 * 20 * getWorkingHours();
        return salary;
    }

    void addLecturer(String title, String Name, String Surname,Courses courses) {
        //akademisyen objesi olusturarak bu objeyi lecturer arraylistine ekler
        Academician newAcademician2 = new Academician(title, Name, Surname,courses);
        lecturers.add(newAcademician2);
        counter++;
        System.out.println(counter + ". akademisyen eklendi.");
    }

    void deleteLecturer(String idNumber) {
        //hocanın id numarasına göre ders siler
        for (int i = 0; i < lecturers.size(); i++) {
            if (lecturers.get(i).getIdNum().equals(idNumber)) {
                lecturers.remove(i);
                counter--;
            }
        }

    }
    void showLecturer() {//akademisyenlerin bilgisini verir
        for (int i = 0; i < lecturers.size(); i++) {
           System.out.printf("%d. %s %s %s %s \n", i + 1,lecturers.get(i).getCourse().getCourseName() ,lecturers.get(i).getCourse().getCourseCode(),lecturers.get(i).getTitle(), lecturers.get(i).getFullName());
        }

    }

}