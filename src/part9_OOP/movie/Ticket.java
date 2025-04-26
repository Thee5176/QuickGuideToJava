package part9_OOP.movie;

public class Ticket {
    private double cost;
    private String time;

    //constructor
    public Ticket(double cost, String time){
        this.cost = cost;
        this.time = time;  //format "0:00 pm"
    }

    //Getter

    public double getCost() {
        return cost;
    }

    public String getTime() {
        return time;
    }

    public String[] getParsedTime(){
        time = this.getTime();
        String hour = time.substring(0,1);
        String min = time.substring(2,3);
        String noon = time.substring(4,6);

        return new String[]{hour, min, noon};
    }

    public int getTicketHour(){
        String[] parsedTime = this.getParsedTime();
        int ticketHour = Integer.parseInt(parsedTime[0]);
        boolean beforeNoon = parsedTime[2].equals("am");
        ticketHour = beforeNoon ? ticketHour : ticketHour + 12;

        return ticketHour;
    }

    public boolean isEveningTime(){
        int ticketHour = getTicketHour();

        return ticketHour >= 18 && ticketHour < 22;
    }

    public int bulkDiscount(int n){
        int discount;
        if(n>9){
            discount = 20; //20% off for 10 amd more tickets
        } else if (n>5) {
            discount = 10; //10% off for 5-9 tickets
        } else{
            discount = 0;
        }
        return discount;
    }

    public static void main(String[] args){
        Ticket myTicket = new Ticket(30d,"2:45 pm");
        System.out.println(myTicket.isEveningTime());
    }
}
