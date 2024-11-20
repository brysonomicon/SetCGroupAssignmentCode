public abstract class PizzaDecorator
        implements Pizza
{
    private Pizza pizza;

    public PizzaDecorator(final Pizza pizza)
    {
        this.pizza = pizza;
    }


    @Override
    public String getDescription()
    {
        return pizza.getDescription();
    }

    @Override
    public double getCost()
    {
        return pizza.getCost();
    }
}
