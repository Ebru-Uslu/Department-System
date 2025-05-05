public class CourseGrade {
    private Courses courses; //ders
    private double midtermGrade;// vize
    private double finalGrade;//final

    public CourseGrade(Courses courses) {//derse göre özelleştirme
        this.courses = courses;
    }

    public double getAverageGrade(){//dersin ortalaması
        return midtermGrade*0.6+ finalGrade*0.4;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Courses getCourses() {
        return courses;
    }
}
