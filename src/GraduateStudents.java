public class GraduateStudents extends Students{
    private String graduationYear;//ogrencinin mezun oldugu yil
    public GraduateStudents(String nameSurname,String year,String graduationYear){
        super(nameSurname,year);
        this.graduationYear=graduationYear;
    }
    public String getGraduationYear(){
        return graduationYear;
    }
}
