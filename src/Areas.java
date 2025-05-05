public abstract class Areas {
    private String Location; // Areaların nerede olduğunu göstermesi için.
    private int Capacity; // İlgili areanın kapasitesini gösterir.
    private boolean Available;// İlgili areanın müsaitlik durumunu gösterir.

    Areas(String Location,int Capacity){
        this.Location = Location;
        this.Capacity = Capacity;
    }

    String getLocation() {
        return Location;
    }

    void setLocation(String newLocation) {
        this.Location = newLocation;
    }

    int getCapacity() {
        return Capacity;
    }
    void setAvailable(boolean Available) {// İlgili area'nın müsaitlik durumu ayarlanır.
        this.Available = Available;
    }
    void setCapacity(int newCapacity) {
        this.Capacity = newCapacity;
    }

    void checkStatus() { // İlgili area'nın müsait olup olmadığını gösterir.

        if(!Available) {
            System.out.println("Now,Here is not Available. There are some works for waiting to do or It's full of people.");
        }
        else {
            System.out.println("Now,Here is Available. It can be used.");
        }

    }

    void checkCapacity(int Capacity) { // İlgili area'nın yüzde kaç dolu olduğunu gösterir.

        if(Capacity/this.getCapacity() >= 1) { // oran olarak 1 veya daha fazla ise bu area dolmuştur.
            System.out.println("Now,Here is full of people.There are no place for new people.");
            this.setAvailable(false);
        }
        else { // değil ise ne kadar dolu olduğunu gösterir.
            System.out.println("Now,Here reached %"+ ((double)Capacity/(double)this.getCapacity())*100 + " fullness,However There are still place for new people.");
            this.setAvailable(true);
        }
    }


}