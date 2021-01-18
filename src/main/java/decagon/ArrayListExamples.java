package decagon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArrayListExamples
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Map<String, Product> sm = new HashMap<String, Product>();
        sm.put("1", door);
        sm.put("3", window);
        sm.put("2", floorPanel);
        // sm.get("2");
        System.out.println(sm.get("2"));

        /*
        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);



        // p1 -> p2 -> p3 -> p4 -> p4 -> p5

        System.out.println(products);

        // Lists auto-resize, with add method
        products.add(window);

        System.out.println(products);

        // We can query for size
        System.out.println(products.size());

        // Lists have order, we retrieve elements by index
        for (int i = 0; i < products.size(); i++)
        {
            // Generic get method
            Product product = products.get(i);
            System.out.println(product);
        }

        // can loop over them with a for each loop
        for (Product product : products)
        {
            System.out.println(product);
        }

        // Can still add duplicates though
        products.add(window);
        */
    }
}
