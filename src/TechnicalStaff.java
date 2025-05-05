import java.util.Random;
 public class TechnicalStaff extends Staff{

    public TechnicalStaff(String nameSurname,int workingHours){
        super(nameSurname,workingHours);
        setTaskInformation("Teknisyenin gorevleri: \n" +
                "1.Mevcut alet,cihaz ve makinelerin gerekli bakim ve onarimlarini yapmak veya yaptirmak,gerektiginde bunlari fiilen kullanmak.\n" +
                "2.Konusuyla ilgili sartname, isletme ve bakim talimatlarini hazirlamak.\n" +
                "3.Arizalari teshis etmek ve onarmak. \n" +
                "4.Ag sorunlarini cozmek ve donanim ve yazilim yüklemek ve yapilandirmak .");
    }

    @Override
    public String generateIdNumber() {
        Random random = new Random();
        String idNumber = "400";
        for(int i=0;i<6;i++){
            idNumber+= random.nextInt(10);
        }
        return idNumber;
    }
     public void controlArea(SocialAreas area) {
         System.out.println(area.getName()+" "+area.getLocation()+" "+ "icindeki ekipmanlar kontrol edildi");//area parametre alıp neresi kontrol edildiyse orası çıktıda görünecek
     }

     public void controlArea(Classrooms area) {
         System.out.println(area.get_classroomNo()+" "+area.getLocation()+" "+ "icindeki ekipmanlar kontrol edildi");//area parametre alıp neresi kontrol edildiyse orası çıktıda görünecek
     }

     public void controlArea(AsistantStaffOffices area) {
         System.out.println(area.get_officeNo()+" "+area.getLocation()+" "+ "icindeki ekipmanlar kontrol edildi");//area parametre alıp neresi kontrol edildiyse orası çıktıda görünecek
     }

     @Override
     public int calculateSalary() {//gunluk calisma saatine gore maas hesaplar
         int salary = 70 * 20 * getWorkingHours();
         return salary;
     }

}
