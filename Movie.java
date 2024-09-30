interface Movie { // у любого фильма будет название и тип показа
    String getTitle();
    String getType();
}

class RegularMovie implements Movie {
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "Regular";
    }
}

class IMAXMovie implements Movie {
    private String title;

    public IMAXMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "IMAX";
    }
}

class ThreeDMovie implements Movie {
    private String title;

    public ThreeDMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "3D";
    }
}

interface MovieFactory { //создание самого фильма
    Movie createMovie(String title);
}

//и потом выбор определенного типа показа

class RegularMovieFactory implements MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

class IMAXMovieFactory implements MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}

class ThreeDMovieFactory implements MovieFactory {
    public Movie createMovie(String title) {
        return new ThreeDMovie(title);
    }
}