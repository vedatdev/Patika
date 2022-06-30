package entities;

//Enum class that have bill types.

public enum BillType {

    Phone(1),
    Internet(2),
    WaterBill(3);



    private final int id;

    BillType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
