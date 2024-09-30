public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;
    private String OperatingHours;


    private CinemaConfig() {
        // приватный чтобы не создавались объекты извне
    }

    // метод для получения единственного экземпляра
    public static CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig(); // создаем объект, если его нет еще, если есть, то используется он
        }
        return instance;
    }

    // методы для получения и установки конфигураций (название, количество залов, часы работы) кинотеатра
    public void setCinemaName(String name) {
        this.cinemaName = name;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setNumberOfScreens(int screens) {
        this.numberOfScreens = screens;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setOperatingHours(String OperatingHours) {
        this.OperatingHours = OperatingHours;
    }

    public String getOperatingHours() {
        return OperatingHours;
    }
}
