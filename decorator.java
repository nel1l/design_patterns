interface Pizza {
    String getDescription();
    double getCost();
}
class MargheritaPizza implements Pizza { // конкретный класс пиццы
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
    @Override
    public double getCost() {
        return 3.50;
    }
}
class VegeterianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegeterian Pizza";
    }
    @Override
    public double getCost() {
        return 5.20;
    }
}
abstract class ToppingDecorator implements Pizza { // можно добавить экстра ингредиенты
    protected Pizza pizza; // Wraps a pizza object to add functionality
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription(); // новое описание
    }
    @Override
    public double getCost() {
        return pizza.getCost(); // новая цена
    }
}
class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}
class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 3.50;
    }
}
