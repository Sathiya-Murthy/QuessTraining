public class Q9DiscountUsingCommanLine {
    public static void main(String[] args) {
        int Price=Integer.parseInt(args[0]);
        int Quantity=Integer.parseInt(args[1]);
        int total;
        if(Quantity>=10) {
            total=Price*Quantity;
            int discount=(total/100)*10;
            total-=discount;
            System.out.println("Total: "+total);
        }
        else {
            total=Price*Quantity;
            System.out.println("Total: "+total);
        }


    }
}
