public class TicketBooking {
    //итоговые
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    private TicketBooking(TicketBookingBuilder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.snackCombo = builder.snackCombo;
    }

    public static class TicketBookingBuilder {
        //а тут создаются по очереди
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;

        public TicketBookingBuilder(String MovieTitle, String snackCombo, String seatNumber) {
            this.movieTitle = MovieTitle;
            this.snackCombo = snackCombo;
            this.seatNumber = seatNumber;
        }

        public TicketBooking build() {
            return new TicketBooking(this); //возвращает готовый объект (забронированный билет)
        }
    }
}