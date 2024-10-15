public class Main {
    public static void main(String[] args) {
        // 1
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("MP3", "song.mp3");
        AudioPlayer wavPlayer = new AudioAdapter("WAV");
        mp3Player.play("WAV", "song.wav");
        AudioPlayer aacPlayer = new AudioAdapter("AAC");
        mp3Player.play("AAC", "song.aac");
        System.out.println("---------------------------------------------------------------------------------");

        // 2
        Device tv = new TvDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.setChannel(7);
        basicRemote.setVolume(10);
        System.out.println();
        Device soundSystem = new SoundSystemDevice();
        RemoteControl advancedRemote = new AdvancedRemote(soundSystem);
        advancedRemote.power();
        advancedRemote.setVolume(33);
        System.out.println("---------------------------------------------------------------------------------");

        // 3
        //individual
        MenuComponent pizza = new MenuItem("Pizza", "Squared pizza with a pear and blue cheese", 9.99);
        MenuComponent burger = new MenuItem("Burger", "Double beef burger", 7.99);
        MenuComponent fries = new MenuItem("Fries", "Crispy french fries", 2.99);
        MenuComponent soda = new MenuItem("Soda", "Refreshing mango-passion fruit soda", 1.99);
        //add them в основное меню
        MenuComponent mainMenu = new Menu("Main Menu", "All main dishes");
        mainMenu.add(pizza);
        mainMenu.add(burger);
        //add them в добавочное меню
        MenuComponent sideMenu = new Menu("Not main Menu", "All second/starters dishes");
        sideMenu.add(fries);
        sideMenu.add(soda);
        //главное меню с основным и добавочным
        MenuComponent allMenus = new Menu("All Menus", "Complete restaurant menu");
        allMenus.add(mainMenu);
        allMenus.add(sideMenu);
        allMenus.print();
        System.out.println("---------------------------------------------------------------------------------");

        // 4
        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " $" + margherita.getCost());
        margherita = new CheeseTopping(margherita);
        margherita = new MushroomTopping(margherita);
        Pizza vegeterian = new VegeterianPizza();
        System.out.println(vegeterian.getDescription() + " $" + vegeterian.getCost());
        vegeterian = new MushroomTopping(vegeterian);
        vegeterian = new CheeseTopping(vegeterian);
        System.out.println(vegeterian.getDescription() + " $" + vegeterian.getCost());
        System.out.println("---------------------------------------------------------------------------------");

        // 5
        SmartHomeFacade smartHome = new SmartHomeFacade();
        System.out.println("---start of the day---");
        smartHome.leaveHome();
        System.out.println("---later---");
        smartHome.arriveHome();
        System.out.println("---later---");
        smartHome.movieMode();
        System.out.println("---later---");
        smartHome.nightMode();
        System.out.println("---end of the day---");
        System.out.println("---------------------------------------------------------------------------------");

        // 6
        TextEditor editor = new TextEditor();
        editor.insertCharacter('I', "Arial", 14, 0);
        editor.insertCharacter('m', "Arial", 14, 3);
        editor.insertCharacter(' ', "Arial", 14, 1);
        editor.insertCharacter('a', "Arial", 14, 2);
        editor.insertCharacter(' ', "Arial", 14, 4);
        editor.insertCharacter('A', "Arial", 14, 5);
        editor.insertCharacter('s', "Arial", 14, 6);
        editor.insertCharacter('s', "Arial", 14, 7);
        editor.insertCharacter('e', "Arial", 14, 8);
        editor.insertCharacter('m', "Arial", 14, 9);
        editor.insertCharacter('!', "Arial", 14, 10);
        editor.insertCharacter(')', "Arial", 14, 11);
        editor.insertCharacter(')', "Arial", 14, 12);
        editor.render();
        System.out.println("---------------------------------------------------------------------------------");

        // 7
        OnlineCourse course = new OnlineCourse(3);
        course.addLecture(new ProxyVideoLecture("Introduction to Java"));
        course.addLecture(new ProxyVideoLecture("Object-Oriented Programming"));
        course.addLecture(new ProxyVideoLecture("Software Design Patterns"));
        System.out.println("Course Lectures:");
        course.showCourseInfo();
        System.out.println("----Lectures----");
        System.out.println("Playing Lecture 1:");
        course.playLecture(0); // 1st time loading and playing
        System.out.println("----Playing lecture----");
        System.out.println("Playing Lecture 1 again:");
        course.playLecture(0); // shouldn't
        System.out.println("----Playing lecture----");
        System.out.println("Playing Lecture 3:");
        course.playLecture(2);
    }
}