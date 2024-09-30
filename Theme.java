interface Button { //кнопка имеет только одну функцию - менять тему
    void render();
}

class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Dark Theme Button");
    }
}

class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Light Theme Button");
    }
}

interface UIFactory { //создается кнопка
    Button createButton();
}

//и потом они делятся на светлую и темную

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }
}