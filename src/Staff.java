

public abstract class Staff {
    private String idNum;
    private String nameSurname;

    private String taskInformation;
    private int workingHours;//gunluk


    public Staff(String nameSurname,int workingHours){
        this.nameSurname=nameSurname;
        this.workingHours=workingHours;
    }

    public abstract String generateIdNumber() ;
    public abstract int calculateSalary();

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getNameSurname(){
        return nameSurname;
    }

    public void setTaskInformation(String taskInformation){
        this.taskInformation=taskInformation;
    }

    public String getTaskInformation() {
        return taskInformation;
    }

    public int getWorkingHours() {
        return workingHours;
    }

}
