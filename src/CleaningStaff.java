import java.util.Random;
public class CleaningStaff extends  Staff{

    public CleaningStaff(String nameSurname,int workingHours) {
        super(nameSurname,workingHours);
        super.setIdNum(generateIdNumber());
        setTaskInformation("Temizlik calisanin gorevleri: \n" +
                "1.Fakultedeki yerleri supurmek,silmek. \n" +
                "2.Gorev alanindaki tuvalet, lavabo temizligini yapmak.\n" +
                "3.Eksilen temizlik malzemelerinin takviyesini yapmak. \n" +
                "4.Gorev alanindaki cöpleri toplamak,cop kovalarini bosaltmak.");

    }

    @Override
    public String generateIdNumber() {//her temizlik görevlisine farklı id atar
        Random random = new Random();
        String idNumber = "300";
        for(int i=0;i<6;i++){
            idNumber+= random.nextInt(10);
        }
        return idNumber;
    }

    public void cleanArea(SocialAreas area) {
        System.out.println(area.getName()+" "+area.getLocation()+" "+ "Temizlendi");//area parametre alıp neresi temizlendiyse orası çıktıda görünecek
    }

    public void cleanArea(Classrooms area) {
        System.out.println(area.get_classroomNo()+" "+area.getLocation()+" "+ "Temizlendi");//area parametre alıp neresi temizlendiyse orası çıktıda görünecek
    }

    public void cleanArea(AsistantStaffOffices area) {
        System.out.println(area.get_officeNo()+" "+area.getLocation()+" "+ "Temizlendi");//area parametre alıp neresi temizlendiyse orası çıktıda görünecek
    }


    @Override
    public int calculateSalary() {// günlük çalışma saatine göre maaş hesaplaması
        int salary= 80*20*getWorkingHours();
        return salary;
    }

}
