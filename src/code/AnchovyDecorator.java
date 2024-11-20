public class AnchovyDecorator
        extends PizzaDecorator
{
    public AnchovyDecorator(final Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Anchovies";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 2.50;
    }
}
