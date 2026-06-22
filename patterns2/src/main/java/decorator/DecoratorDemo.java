package decorator;

interface Coffee {
    String getDescription();
}

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Кофе";
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + молоко";
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee =
                new MilkDecorator(new SimpleCoffee());

        System.out.println(
                coffee.getDescription());
    }
}