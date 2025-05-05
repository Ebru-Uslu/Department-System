public abstract class Lecturer {// Lecturer classını özel olarak çağırıp kullanmayacağımız için abstract olarak tanımladık, alt class
    // olarak akademisyen ve bölüm başkanı oluşturduğumuz için bu classı main içerisinde çağırmayacağız.

    private String name,surname,title, idNum; // lecturer için isim,soyisim,unvan ve idnum bilgileri.
    private Courses course; // Sekreterin lecturer'a course eklemesi yapabilmesi için.
    public Lecturer(String title,String name,String surname,Courses course) {
        this.title = title;  //unvan
        this.name =name;
        this.surname=surname;
        this.idNum = generateIdNumber();
        this.setCourse(course);
    }

    public Lecturer(String title,String name,String surname) {
        this.title = title;
        this.name = name;
        this.surname = surname;
    }

    public abstract String generateIdNumber(); // Akademisyen ve bölüm başkanı için bir idnumarası oluşturmak için kullanılan fonksiyon
    // alt classlarda tekrar Override edeceğimiz için burada abstract olarak tanımladık.


    String getTitle() {
        return title;
    }

    String getIdNum() {
        return idNum;
    }

    String getFullName() { // İsmin ilk harfi büyük ve soyisim Tamamen büyük olacak şekilde bir string döndürür.
        return name.substring(0,1).toUpperCase() + name.substring(1) + " " + surname.toUpperCase();
    }

    public String toString() { // Unvan bilgisi ile birlikte bir string döndürür.
        return title + " " + getFullName();
    }


    public Courses getCourse() {
        return course;
    }


    public void setCourse(Courses course) {
        this.course = course;
    }



}