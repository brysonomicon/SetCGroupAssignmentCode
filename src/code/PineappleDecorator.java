public class PineappleDecorator
        extends PizzaDecorator
{
    public PineappleDecorator(final Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 1.50;
    }
}
