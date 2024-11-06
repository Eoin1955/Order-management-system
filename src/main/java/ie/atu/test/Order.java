package ie.atu.test;

public class Order {
    private String orderid;
    private String name;
    private String product_name;
    private String quantity;

    public Order() {
        this.orderid = "";
        this.name = "";
        this.product_name = "";
        this.quantity = "";
    }

    public void Order(){
        this.orderid = orderid;
        this.name = name;
        this.product_name = product_name;
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

    public String getProduct_name() {
        return pname;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", name='" + name + '\'' +
                ", pname='" + product_name + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

