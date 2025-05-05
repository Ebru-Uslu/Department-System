import java.util.ArrayList;
import java.util.Random;

public abstract class Students {
    private String idNum;
    private String nameSurname;
    private String year;//okula baslangic tarihi

    ArrayList <CourseGrade> takenCourses=new ArrayList<CourseGrade>();//ogrencinin ders bilgilerini tutar

    public Students(String nameSurname,String year){
        this.idNum=generateIdNumber();
        this.nameSurname=nameSurname;
        this.year=year;
    }
    public String generateIdNumber() {
        Random random = new Random();
        String idNumber = "200";
        for(int i=0;i<6;i++){
            idNumber+= random.nextInt(10);
        }
        return idNumber;
    }
    public String toString(){
        return this.idNum + " " + this.nameSurname + " " + this.year;
    }
    public double lectureInformation(){//ogrencinin ders notlarıyla ilgili bilgilerini tutar
        double creditSum=0;//tüm derslerin toplam kredisi
        double weightedSum=0;//dersin kredisi ve ortalamasının çarpımı
        for(int i=0;i<takenCourses.size();i++) {
            //vize,final,ortalamayi yazdirir
            System.out.println("Ders adi: "+takenCourses.get(i).getCourses().getCourseName() +" Vize: "+ takenCourses.get(i).getMidtermGrade()+" Final: "+takenCourses.get(i).getFinalGrade()+" Ortalama: "+takenCourses.get(i).getAverageGrade());
            weightedSum+= takenCourses.get(i).getAverageGrade()*takenCourses.get(i).getCourses().getCredit();
            creditSum+= takenCourses.get(i).getCourses().getCredit();
        }
        System.out.println(weightedSum/creditSum);
        return  weightedSum/creditSum;

    }

    public String getIdNum(){
        return idNum;
    }
    public String getnameSurname(){
        return nameSurname;
    }

    public String getYear() {
        return year;
    }
}
