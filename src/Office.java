import java.util.ArrayList;

public class Office {
    private ArrayList<Staff> staff;

    public Office() {
        staff = new ArrayList<>();
    }

    public void addToOffice(Staff workers){
        staff.add(workers);
    }

    @Override
    public String toString() {
        return ("Now if office : " + staff.toString());
    }

    public int getTotalCots(){
        int result = 0;
        for (Staff worker:staff) {
            result += worker.equipmentCost();
        }
        return result;
    }

    public String getTotalCotsToString(){
        return ("Total office cost is " + getTotalCots());
    }

}
