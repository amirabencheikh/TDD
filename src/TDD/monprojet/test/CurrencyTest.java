/**
 * 
 */
package TDD.monprojet.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author admin
 *
 */
import static org.junit.Assert.assertEquals;

import TDD.monprojet.Currency;

public class CurrencyTest {

    @Test

    public void testGetCode() {

        Currency currency = new Currency("USD", 1.0);

        assertEquals("USD", currency.getCode());

    }



    @Test

    public void testGetExchangeRate() {

        Currency currency = new Currency("USD", 1.0);

        assertEquals(1.0, currency.getExchangeRate(), 0.001);

    }

}
