

public class OfficeInspector {
    public static void main(String[] args) {
        Staff s1 = new Staff("Harry","worker");
        Staff s2 = new Staff("Garry","manager");
        Staff s3 = new Staff("Ron","cleaner");

        Equipment e1 = new Equipment("eraser", 5);
        Equipment e2 = new Equipment("pen", 10);
        Equipment e3 = new Equipment("pencil", 8);
        Equipment e4 = new Equipment("paper", 1);
        Equipment e5 = new Equipment("mob", 20);

        System.out.println(s2.printAllEquipment());
        s2.setOwnerToEquipment(e1);
        s2.setOwnerToEquipment(e2);
        System.out.println(s2.printAllEquipment());
        s1.setOwnerToEquipment(e2);
        s1.setOwnerToEquipment(e4);
        s1.setOwnerToEquipment(e3);
        s3.setOwnerToEquipment(e5);


    }
}

