public class Doctoral extends GraduateStudents{
    public Doctoral(String nameSurname, String year, String graduationYear) {
        super( nameSurname, year, graduationYear);
    }
    public boolean checkGraduate(){//doktora ogrencilernin mezuniyet şartlarını kontrol eder
        if(takenCourses.size()>=8 && lectureInformation()/25>= 3) { //en az 8 ders ve 3 ortalama
            System.out.println("Tebrikler , doktora belgesi almaya hak kazandınız");
            return true;
        }
        else {
            System.out.println("Doktora belgesi kazanamadınız,seneye bir daha kardeşim");
            return false;
        }
    }
}
