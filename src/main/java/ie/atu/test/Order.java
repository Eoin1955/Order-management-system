package ie.atu.test;

public class Order {
    private String orderid;
    private String name;
    private String pname;
    private String quantity;

    public Order() {
        this.orderid = "";
        this.name = "";
        this.pname = "";
        this.quantity = "";
    }

    public void Order(){
        this.orderid = orderid;
        this.name = name;
        this.pname = pname;
        this.quantity = quantity;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

