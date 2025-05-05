public class LecturerOffices extends Areas{

    private String officeNo;
    // This provides to show information about which lecturer will be in relavent Lecturer Office
    private Lecturer Lecturer;

    LecturerOffices(String officeNo,String Location,Lecturer Lecturer,int Capacity){
        super(Location,Capacity);
        this.officeNo = officeNo;
        this.Lecturer = Lecturer;
    }

    String get_officeNo() {
        return officeNo;
    }

    void setNewLecturer(Lecturer newLecturer) {
        this.Lecturer = newLecturer;
    }

    String get_lecturerInformation() {
        return Lecturer.toString();
    }
}