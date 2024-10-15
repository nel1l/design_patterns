interface VideoLecture {
    void play();
    String getInfo();
}
class RealVideoLecture implements VideoLecture { // типа показ лекции, но с loading delay
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() { // если видео показывается в первый раз
        System.out.println("Loading video: " + title);
    }

    @Override
    public String getInfo() {
        return "Video Title: " + title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}

class ProxyVideoLecture implements VideoLecture { //действует как прокси чтобы отложить загрузку пока она не нужна будет
    private String title;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title) {
        this.title = title; // сохраняет тайтл, но не запускает сразу загрузку
    }

    @Override
    public String getInfo() {
        return "Video Title: " + title;
    }

    @Override
    public void play() { //загружает видео тогда когда оно уже играет
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title); // Lazy loading
        }
        realVideoLecture.play();
    }
}

class OnlineCourse {
    private VideoLecture[] lectures;
    private int index = 0;

    public OnlineCourse(int numberOfLectures) {
        lectures = new VideoLecture[numberOfLectures];
    }

    public void addLecture(VideoLecture lecture) {
        lectures[index] = lecture;
        index++;
    }

    public void showCourseInfo() {
        for (int i = 0; i < index; i++) {
            System.out.println(lectures[i].getInfo());
        }
    }

    public void playLecture(int lectureNumber) {
        if (lectureNumber >= 0 && lectureNumber < index) {
            lectures[lectureNumber].play();
        } else {
            System.out.println("Invalid lecture number");
        }
    }
}

