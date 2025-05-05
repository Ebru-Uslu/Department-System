public class Master extends GraduateStudents{
    public Master(String nameSurname, String year, String graduationYear) {
        super( nameSurname, year, graduationYear);

    }
    public boolean checkGraduate(){//master ogrencilernin mezuniyet şartlarını kontrol eder
        if(takenCourses.size()>=7 && lectureInformation()/25>= 2.5) {//en az 7 ders ve 2.5 ortalama
            System.out.println("Tebrikler , yüksek lisans belgesi almaya hak kazandınız");
            return true;
        }
        else {
            System.out.println("Master belgesi alamadınız,seneye bir daha kardeşim");
            return false;
        }
    }
}
