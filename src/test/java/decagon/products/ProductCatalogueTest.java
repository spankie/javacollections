package decagon.products;

import org.junit.Test;

import decagon.ProductCatalogue;
import decagon.TreeProductCatalogue;

import static decagon.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class ProductCatalogueTest
{
    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception
    {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void treeShouldOnlyHoldUniqueProducts() throws Exception
    {
        TreeProductCatalogue catalogue = new TreeProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void shouldFindLightVanProducts() throws Exception
    {
        TreeProductCatalogue catalogue = new TreeProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }


    @Test
    public void shouldFindHeavyVanProducts() throws Exception
    {
        TreeProductCatalogue catalogue = new TreeProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
    }
}
