public class ExceptionNotAvailable extends Exception{
    //akademisyen classındaki dersleri ve öğrencileri lisans ve lisansüstü
    // şeklinde ayırmak için kullandığımız try-catch bloklarında kullanıldı.
    public ExceptionNotAvailable(String errorMessage) {
        super(errorMessage);
    }

}