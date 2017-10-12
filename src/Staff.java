import java.util.ArrayList;

public class Staff {
    private String name;
    private String post;
    private ArrayList<Equipment> arrayOfEquip;


    public Staff(String name, String post) {
        this.name = name;
        this.post = post;
        this.arrayOfEquip = new ArrayList<>();
        OfficeInspector.office.addToOffice(this);
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

    public int equipmentCost(){
        int result = 0;
        for (Equipment item:arrayOfEquip){
            result += item.getCost();
        }
        return result;
    }

    public String equipmentCostToString(){
        return (getName() + " has equipment at total cost of " + equipmentCost());
    }
}
