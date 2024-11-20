public class HamDecorator
    extends PizzaDecorator
{

    public HamDecorator(final Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Ham";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 2.50;
    }
}
