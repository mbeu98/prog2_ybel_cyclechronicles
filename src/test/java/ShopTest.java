import cyclechronicles.Order;
import cyclechronicles.Shop;
import cyclechronicles.Type;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ShopTest {
    Order race1;
    Order gravel1;
    Order ebike1;
    Order fixie1;
    Order race2;
    Order race3;
    Order race4;
    Order race5;
    Order race6;

    @BeforeEach
    void setUp() {
        race1 = mock(Order.class);
        gravel1 = mock(Order.class);
        ebike1 = mock(Order.class);
        fixie1 = mock(Order.class);
        race2 = mock(Order.class);
        race3 = mock(Order.class);
        race4 = mock(Order.class);
        race5 = mock(Order.class);
        race6 = mock(Order.class);}




    //gÄK1
    @Test
    void testAcceptTrue(){
        Shop shop = new Shop();
        when(race1.getCustomer()).thenReturn("Customer1");
        when(race1.getBicycleType()).thenReturn(Type.RACE);
        assertTrue(shop.accept(race1));
    }
    //uÄK1
    @Test
    void testAcceptFalseTypeGravel(){
        Shop shop = new Shop();
        when(gravel1.getCustomer()).thenReturn("Customer1");
        when(gravel1.getBicycleType()).thenReturn(Type.GRAVEL);
        assertFalse(shop.accept(gravel1));

    }
    //uÄK2
    @Test
    void testAcceptFalseTypeEbike(){
        Shop shop = new Shop();
        when(ebike1.getCustomer()).thenReturn("Customer1");
        when(ebike1.getBicycleType()).thenReturn(Type.EBIKE);
        assertFalse(shop.accept(ebike1));
    }
    //uÄK3
    @Test
    void testAcceptFalsePendingOrderCustomer(){
        Shop shop = new Shop();
        when(race1.getCustomer()).thenReturn("Customer1");
        when(race1.getBicycleType()).thenReturn(Type.RACE);
        when(fixie1.getCustomer()).thenReturn("Customer1");
        when(fixie1.getBicycleType()).thenReturn(Type.FIXIE);
        shop.accept(fixie1);
        assertFalse(shop.accept(race1));
    }
    //uÄK4
    @Test
    void testAcceptFalsePendingOrderSize(){
        Shop shop = new Shop();
        //Customer 1
        when(race1.getCustomer()).thenReturn("Customer1");
        when(race1.getBicycleType()).thenReturn(Type.RACE);
        //Customer 2
        when(race2.getCustomer()).thenReturn("Customer2");
        when(race2.getBicycleType()).thenReturn(Type.RACE);
        //Customer 3
        when(race3.getCustomer()).thenReturn("Customer3");
        when(race3.getBicycleType()).thenReturn(Type.RACE);
        //Customer 4
        when(race4.getCustomer()).thenReturn("Customer4");
        when(race4.getBicycleType()).thenReturn(Type.RACE);
        //Customer 5
        when(race5.getCustomer()).thenReturn("Customer5");
        when(race5.getBicycleType()).thenReturn(Type.RACE);
        //Customer 6
        when(race6.getCustomer()).thenReturn("Customer6");
        when(race6.getBicycleType()).thenReturn(Type.RACE);

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

