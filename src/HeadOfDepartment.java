import java.util.*; // Random kütüphanesini kullanabilmek için import edildi.

public class HeadOfDepartment extends Lecturer { // Lecturer classından bölüm başkanını ayırt edebilmek için oluşturuldu.


    HeadOfDepartment(String title, String name, String surname) {
        super(title, name, surname);
    }

    public String generateIdNumber() { // Tek bir bölüm başkanı olacağı için sadece ona özel bir ıdNumarası oluşturup döndürür.
        String idNumber = "600100000";
        return idNumber;
    }

    private String createCertificateNumber() { //Mezun olacak öğrenciler için her birine özel bir sertifika numarası oluşturmak için kullanılır.
        Random random = new Random();
        String Alfabet = "ABCDEFGHIJKLMNOPRSTUVYZ"; // Alfabe harflerinin tanımlandığı string.
        String certiNum = "";
        for (int i = 0; i < 3; i++) { // bu döngüde sertifika numarasının ilk 3 hanesi alfabet stringinden rastgele bir şekilde alınıyor.
            int temp = random.nextInt(22);
            certiNum += Alfabet.substring(temp - 1, temp);
        }
        for (int j = 0; j < 6; j++) {// bu döngüde ise sertifika numarasının diğer 6 hanesini rastgele rakamlardan oluşacak şekilde ayarlıyor.
            certiNum += random.nextInt(10);
        }
        return certiNum; // oluşturulan sertifika numarasını geri döndürüyor.
    }

    public void issueGraduateCertificate(UndergraduateStudents Student) {// Undergraduate öğrenciler için mezuniyet sertifikası oluşturuyor.


        if (Student.takenCourses.size() >= 40 && Student.lectureInformation() / 25 >= 2.0) {//Toplam aldığı dersin en az 40 ve genel ortalamasının
            System.out.println("Cong!,You can take your GruaduateCertificate.\n"         // en az 2.0 olup olmadığını kontrol ediyor.
                    + "Your Certificate Number: " + createCertificateNumber()
                    + "\nDo not forget to save this number to print in University."); //Eğer şartları sağlıyorsa sertifika numarası oluşturulup ekranda
        }                                                                              //Sertifika alabileceği söyleniyor.
        else {//Şarlar sağlanmaz ise bu kısım çalışıyor.
            System.out.println("Unfortunately,You can not gruaduate for not providing all conditions now.");
        }

    }

    public void issueGraduateCertificate(Master Student) {// Master öğrencileri için mezuniye sertifikası oluşturuyor.
        boolean isProper; // bu boolean değeri alttaki fonksiyondan gelecek true veya false değerini tutuyor.
        isProper = Student.checkGraduate();//Bu fonksiyon Master öğrencisinin sertifika alıp alamayacağını kontrol ediyor ona göre true veya false değeri döndürüyor.
        if (isProper) {// eğer değer true ise buraya girip sertifika numarası oluşturuyor bu öğrenci için.
            System.out.println("Cong!,You can take your GruaduateCertificate.\n"
                    + "Your Certificate Number: " + createCertificateNumber()
                    + "\nDo not forget to save this number to print in University.");
        } else {//false ise sertifika alamayacağını söylüyor.
            System.out.println("Unfortunately,You can not gruaduate for not providing all conditions now.");
        }
    }

    public void issueGraduateCertificate(Doctoral Student) {// Doktora öğrencileri için mezuniye sertifikası oluşturuyor
        boolean isProper;// bu boolean değeri alttaki fonksiyondan gelecek true veya false değerini tutuyor.
        isProper = Student.checkGraduate();//Bu fonksiyon Doktora öğrencisinin sertifika alıp alamayacağını kontrol ediyor ona göre true veya false değeri döndürüyor.
        if (isProper) {// eğer değer true ise buraya girip sertifika numarası oluşturuyor bu öğrenci için.
            System.out.println("Cong!,You can take your GruaduateCertificate.\n"
                    + "Your Certificate Number: " + createCertificateNumber()
                    + "\nDo not forget to save this number to print in University.");
        } else {//false ise sertifika alamayacağını söylüyor.
            System.out.println("Unfortunately,You can not gruaduate for not providing all conditions now.");
        }
    }
}