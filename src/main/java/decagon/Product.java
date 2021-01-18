package decagon;

import java.util.Comparator;
import java.util.Objects;


public class Product
{
    public static final Comparator<Product> BY_WEIGHT
        = new Comparator<Product>()
    {
        public int compare(final Product p1, final Product p2)
        {
            return Integer.compare(p1.getWeight(), p2.getWeight());
        }
    };

    private final String name;
    private int weight;

    public Product(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Product{" +
            "name='" + name + '\'' +
            ", weight=" + weight +
            '}';
    }
    // return Objects.hash(name, weight);

    // @Override
    // public int hashCode() {
    //     // final int prime = 31;
    //     // int result = 1;
    //     // result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     // result = prime * result + weight;
    //     // return result;
    //     return Objects.hash(name, weight);
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Product other = (Product) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (weight != other.weight)
    //         return false;
    //     return true;
    // }
}
