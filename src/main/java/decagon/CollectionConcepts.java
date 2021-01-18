package decagon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);
        // otherProducst
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        
        // 0. Iterable
        // 1. Collection with foreach
        // 2. Can't print out and remove - CME
        // 3. refactor to iterator
/*
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext())
        {
            final Product product = iterator.next();
            if (product.getWeight() > 20)
            {
                System.out.println(product);
            }
            else
            {
                iterator.remove();
            }
        }
        */

        for (Product product : products) {
            if (product.getWeight() > 20)
            {
                product.setWeight(20);
                System.out.println(product);
            }
            else
            {
                // common gotcha (even the .clear() and .add())
                // do not modify the collection in the foreach loop
                products.remove(product);
            }
        }

        System.out.println(products);
        

        // 4. other methods

        System.out.printf("size: %d\n", products.size());
        System.out.printf("isEmpty: %b\n", products.isEmpty());

        System.out.println(products.contains(floorPanel));

        products.remove(floorPanel);

        System.out.println(products.contains(floorPanel));

        // 5. removeAll
        Collection<Product> otherProducts = new ArrayList<>();
        // why does this return boolean
        System.out.println(otherProducts.add(door));
        otherProducts.add(window);

        products.removeAll(otherProducts);
        System.out.println(products);
    }
}
