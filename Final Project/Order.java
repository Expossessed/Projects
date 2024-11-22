public class Order {
    private int OrderID = 0;
    private String Details = "";

    public int getOrderID(){
        return OrderID;
    }
    public void setOrderID(){
        this.OrderID = OrderID;
    }
    public String getDetails(){
        return Details;
    }
    public void Details(){
        this.Details = Details;
    }


    @Override
    public String toString(){
        return "OrderID: " + OrderID + ", Details: " + Details;
    }

}
