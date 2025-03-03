package de.ait.homework33;

public class Gift {

    public String name;
    private GiftCategory category;
    private GiftStatus status;

    public Gift(String name, GiftCategory category, GiftStatus status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public GiftCategory getCategory() {
        return category;
    }

    public GiftStatus getStatus() {
        return status;
    }

    public void setStatus(GiftStatus status) {
        this.status = status;
    }
}
