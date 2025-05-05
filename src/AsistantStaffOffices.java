public class AsistantStaffOffices extends Areas{

    private String officeNo; // Ofis numarasını tutar.
    private Staff Staff; // Ofiste yer alacak staff'ı tutar.

    AsistantStaffOffices(String officeNo,String Location,int Capacity,Staff Staff){
        super(Location,Capacity);
        this.officeNo = officeNo;
        this.Staff = Staff;
    }

    void set_officeNo(String new_officeNo) {
        this.officeNo = new_officeNo;
    }

    String get_officeNo() {
        return officeNo;
    }

    void set_newStaff(Staff newStaff) {// bu ofisi başka bir staff'a atamak için kullanılır.
        this.Staff = newStaff;
    }

    String get_staffInformation() { // ofis içerisindeki staff hakkında bilgi verir.
        return Staff.getNameSurname();
    }

}