class Light {
    public void turnOn() {
        System.out.println("Light on");
    }
    public void turnOff() {
        System.out.println("Light off");
    }
}
class Thermostat {
    public void setTemperature(int temp) {
        System.out.println("Thermostat set temperature: " + temp);
    }
    public void turnOff() {
        System.out.println("Thermostat turn off");
    }
}
class SecuritySystem {
    public void turnOn() {
        System.out.println("Security System turn On");
    }
    public void turnOff() {
        System.out.println("Security System turn Off");
    }
}
class EntertainmentSystem {
    public void playMusic () {
        System.out.println("EntertainmentSystem play music");
    }
    public void playMovie () {
        System.out.println("EntertainmentSystem play movie");
    }
    public void turnOn() {
        System.out.println("EntertainmentSystem turn On");
    }
    public void turnOff() {
        System.out.println("EntertainmentSystem turn Off");
    }
}

class SmartHomeFacade { // упрощает взаимодействие с несколькими девайсами
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;
    public SmartHomeFacade() {
        light = new Light();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
        entertainmentSystem = new EntertainmentSystem();
    }
    public void leaveHome() {
        System.out.println("Leaving home: ");
        light.turnOff();
        thermostat.turnOff();
        securitySystem.turnOn();
        entertainmentSystem.turnOff();
    }
    public void arriveHome() {
        System.out.println("Arriving home: ");
        entertainmentSystem.playMusic();
        thermostat.setTemperature(20);
        light.turnOn();
        securitySystem.turnOff();
    }
    public void nightMode() {
        System.out.println("Settings for Night mode: ");
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.turnOn();
        entertainmentSystem.turnOff();
    }
    public void movieMode() {
        System.out.println("Settings for Movie mode: ");
        light.turnOff();
        entertainmentSystem.turnOn();
        entertainmentSystem.playMovie();
    }
}