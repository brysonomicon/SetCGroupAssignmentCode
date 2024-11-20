public class CheeseDecorator
        extends PizzaDecorator
{
    public CheeseDecorator(final Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 1.50;
    }
}
