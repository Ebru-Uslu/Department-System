
public class SocialAreas extends Areas{
    private String Name;

    SocialAreas(String Name,String Location,int capacity){
        super(Location,capacity);
        this.Name = Name;
    }

    String getName() {
        return Name;
    }

}