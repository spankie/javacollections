package decagon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<Product>
{
    // Set do not add any additional
    // methods to the collection interface
    private Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier)
    {
        products.addAll(supplier.getProducts());
    }

    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
