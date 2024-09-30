interface MovieSchedule extends Cloneable { //встроенный, нужен чтобы использовать клон()
    MovieSchedule clone();
    void setMovie(String movie);
    void setTime(String time);
    String getDetails(); //получение информации о фильме и времени
}

class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public StandardSchedule() {}

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone(); //новый объект - копия исходного объекта
        } catch (CloneNotSupportedException e) { //если клонирование не поддерживается, но у нас такой ошибки не должно быть, так как используем clonable
            throw new AssertionError();
        }
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return "Movie: " + movie + '\n' + "Time: " + time;
    }
}


