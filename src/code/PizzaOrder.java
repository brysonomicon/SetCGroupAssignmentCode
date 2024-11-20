import java.util.Scanner;

public class PizzaOrder
{
    public Pizza order()
    {
        final Scanner scanner;
        Pizza pizza;
        boolean ordering;

        scanner = new Scanner(System.in);
        pizza = new PlainPizza();
        ordering = true;

        System.out.println("Welcome to Set C's Pizza Palace!");
        System.out.println("Current total: " + pizza.getCost() + System.lineSeparator());

        while(ordering)
        {
            final int choice;

            System.out.println("Choose a topping to add: ");
            System.out.println("1. Cheese (+$1.50)");
            System.out.println("2. Pepperoni(+$2.00)");
            System.out.println("3. Anchovies(+$2.50)");
            System.out.println("4. Ham(+$2.50)");
            System.out.println("5. Pineapple(+1.50)");

            choice = scanner.nextInt();

            switch(choice)
            {
                case 1 ->
                {
                    pizza = new CheeseDecorator(pizza);
                    System.out.println("Added Cheese! Current cost: $" + pizza.getCost());
                }
                case 2 ->
                {
                    pizza = new PepperoniDecorator(pizza);
                    System.out.println("Added Pepperoni! Current cost: $" + pizza.getCost());
                }
                case 3 ->
                {
                    pizza = new AnchovyDecorator(pizza);
                    System.out.println("Added Olives! Current cost: $" + pizza.getCost());
                }
                case 4 ->
                {
                    pizza = new HamDecorator(pizza);
                    System.out.println("Added Ham! Current cost: $" + pizza.getCost());
                }
                case 5 ->
                {
                    pizza = new PineappleDecorator(pizza);
                    System.out.println("Added Pineapple! Current cost: $" + pizza.getCost());
                }
                case 6 ->
                {
                    ordering = false;
                    System.out.println("Order complete! Final pizza: " + pizza.getDescription());
                    System.out.println("Total cost: $" + pizza.getCost());
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
        return pizza;
    }

    public static void main(final String[] args)
    {
        final PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.order();
    }
}

