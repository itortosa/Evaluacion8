import java.util.Vector;

public class Order {

  public String number;

  public Date ordered;

  public Date shipped;

  public Address ship_to;

  public OrderStatus status;

  public Integer total;

    public Vector  1;
    /**
   * 
   * @element-type Payment
   */
  public Vector  myPayment;
    /**
   * 
   * @element-type LineItem
   */
  public Vector  line_item;

}