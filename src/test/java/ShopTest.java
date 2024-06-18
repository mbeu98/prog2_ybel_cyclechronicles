import cyclechronicles.Order;
import cyclechronicles.Shop;
import cyclechronicles.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ShopTest {
    //gÄK1
    @Test
    void testAcceptTrue(){
        Shop shop = new Shop();
        Order race1 = new Order("Customer1", Type.RACE);
        assertTrue(shop.accept(race1));
    }
    //uÄK1
    @Test
    void testAcceptFalseTypeGravel(){
        Shop shop = new Shop();
        Order gravel1 = new Order("Customer1", Type.GRAVEL);
        assertFalse(shop.accept(gravel1));

    }
    //uÄK2
    @Test
    void testAcceptFalseTypeEbike(){
        Shop shop = new Shop();
        Order ebike1 = new Order("Customer1", Type.EBIKE);
        assertFalse(shop.accept(ebike1));
    }
    //uÄK3
    @Test
    void testAcceptFalsePendingOrderCustomer(){
        Shop shop = new Shop();
        Order race1 = new Order("Customer1", Type.RACE);
        Order fixie1 = new Order("Customer1", Type.FIXIE);
        shop.accept(fixie1);
        assertFalse(shop.accept(race1));
    }
    //uÄK4
    @Test
    void testAcceptFalsePendingOrderSize(){
        Shop shop = new Shop();
        //Customer 1
        Order race1 = new Order("Customer1", Type.RACE);
        //Customer 2
        Order race2 = new Order("Customer2", Type.RACE);
        //Customer 3
        Order race3 = new Order("Customer3", Type.RACE);
        //Customer 4
        Order race4 = new Order("Customer4", Type.RACE);
        //Customer 5
        Order race5 = new Order("Customer5", Type.RACE);
        //Customer 6
        Order race6 = new Order("Customer6", Type.RACE);
        shop.accept(race1);
        shop.accept(race2);
        shop.accept(race3);
        shop.accept(race4);
        shop.accept(race5);
        assertFalse(shop.accept(race5));
    }
    /*
    //gÄK2gw
    @Test
    void testAcceptTruePendingOrderSize4(){
        Shop shop = new Shop();
        //Customer 1
        Order race1 = new Order("Customer1", Type.RACE);
        //Customer 2
        Order race2 = new Order("Customer2", Type.RACE);
        //Customer 3
        Order race3 = new Order("Customer3", Type.RACE);
        //Customer 4
        Order race4 = new Order("Customer4", Type.RACE);
        //Customer 5
        Order race5 = new Order("Customer5", Type.RACE);
        shop.accept(race1);
        shop.accept(race2);
        shop.accept(race3);
        assertTrue(shop.accept(race4));

    }
    //uÄK5gw
    @Test
    void testAcceptFalsePendingOrderSize5(){
        Shop shop = new Shop();
        //Customer 1
        Order race1 = new Order("Customer1", Type.RACE);
        //Customer 2
        Order race2 = new Order("Customer2", Type.RACE);
        //Customer 3
        Order race3 = new Order("Customer3", Type.RACE);
        //Customer 4
        Order race4 = new Order("Customer4", Type.RACE);
        //Customer 5
        Order race5 = new Order("Customer5", Type.RACE);
        shop.accept(race1);
        shop.accept(race2);
        shop.accept(race3);
        shop.accept(race4);
        assertFalse(shop.accept(race5));

    }*/



}

