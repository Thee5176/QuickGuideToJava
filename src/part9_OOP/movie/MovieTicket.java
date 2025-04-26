package part9_OOP.movie;

public class MovieTicket extends Ticket {
    private final String movieName;

    //Constructure
    public MovieTicket(double cost, String time, String movieName){
        super(cost, time);
        this.movieName = movieName;
    }

    //Getter
    public String getMovieName() {
        return movieName;
    }

    //Method
    public int afternoonDiscount(){
        int discount;
        int ticketHour = this.getTicketHour();
        if(ticketHour>11 && ticketHour<18){
            discount = 10; //20% off for 10 amd more tickets
        } else{
            discount = 0;
        }
        return discount;
    }

    @Override
    public int bulkDiscount(int n){
        int discount;
        if(n>9){
            discount = 10; //10% off for 10 amd more tickets
        } else{
            discount = 0;
        }
        return discount;
    }

    public static void main(String[] args){
        MovieTicket myMovieTicket = new MovieTicket(30, "4:55 pm", "Conan: The Movie 26");

        //Test afternoonDiscount
        int timeDiscount = myMovieTicket.afternoonDiscount();
        System.out.println(timeDiscount);

        int bulkDiscount = myMovieTicket.bulkDiscount(10);
        System.out.println(bulkDiscount);

        bulkDiscount = myMovieTicket.bulkDiscount(3);
        System.out.println(bulkDiscount);
    }
}
