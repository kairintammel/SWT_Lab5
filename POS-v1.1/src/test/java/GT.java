
import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import java.util.List;

public class GT {

	@Test(timeout = 4000)
	public void testGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCancelCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemAndSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.submitCurrentPurchase();
	}

}