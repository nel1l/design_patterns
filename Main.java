// Usage
public class Main {
    public static void main(String[] args) {

        // для Singleton
        System.out.println("----------singleton----------");
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Festival Cinema");
        config.setNumberOfScreens(5);
        config.setOperatingHours("10:00 - 01:00");
        System.out.println(config.getCinemaName() + ":" + '\n' + "         "  +
                "number of screens " + config.getNumberOfScreens() + '\n' + "         "  +
                "working hours " + config.getOperatingHours());
        System.out.println("------------------------------");
        System.out.println();

        // для Factory Method
        System.out.println("----------factory----------");
        MovieFactory factory = new IMAXMovieFactory(); // в нашем случае это imax
        Movie movie = factory.createMovie("Joker: Folie à Deux in IMAX 70MM Film");
        System.out.println("Movie: " + '\n' + "         " + movie.getTitle() + '\n' + "         "  +
                "Type: " + movie.getType());
        System.out.println("-------------------------------");
        System.out.println();

        // для Abstract Factory
        System.out.println("----------abstract factory----------");
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();
        System.out.println("-------------------------------");
        System.out.println();

        // для Builder
        System.out.println("----------biulder----------");
        TicketBooking booking = new TicketBooking.TicketBookingBuilder("Inside out 2", "F15", "Popcorn and Soda")
                .build();
        //System.out.println(booking);
        System.out.println();
        //System.out.println("---------- booking -----------");
        System.out.println("------------------------------");
        System.out.println();

        // для Prototype
        System.out.println("----------prototype----------");
        StandardSchedule schedule = new StandardSchedule(); //создаем объект
        schedule.setTime("20:30"); //добавляем время

        MovieSchedule eveningSchedule = schedule.clone(); //создаем его копию
        eveningSchedule.setMovie("Kung Fu Panda 4");
        System.out.println(eveningSchedule.getDetails());
        System.out.println("-------------------------------");
    }
}