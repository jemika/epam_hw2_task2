import java.util.ArrayList;

public class Staff {
    private String name;
    private String post;
    private ArrayList<Equipment> arrayOfEquip;

    public Staff(String name, String post) {
        this.name = name;
        this.post = post;
        this.arrayOfEquip = new ArrayList<>();
    }

    public void setOwnerToEquipment(Equipment equipment) {
        this.arrayOfEquip.add(equipment);
    }

    public String printAllEquipment(){
        return (getName() + " has " + arrayOfEquip.toString());
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return (getName() + " on position " + getPost());
    }
}
