/**
 * 
 */
package TDD.monprojet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import TDD.monprojet.Currency;

import TDD.monprojet.MultiCurrencyCalculator;



import static org.junit.Assert.assertEquals;



import org.junit.Before;



public class MultiCurrencyCalculatorTest {



    private MultiCurrencyCalculator calculator;

    private Currency usdCurrency;

    @Before

    public void setUp() {

        calculator = new MultiCurrencyCalculator();

        usdCurrency = new Currency("USD", 1.0);

        new Currency("EUR", 0.85);

    }



    @Test

    public void testAddCurrency() {

        calculator.addCurrency(usdCurrency);

        assertEquals(1, calculator.getCurrencies().size());

        assertTrue(calculator.getCurrencies().containsKey("USD"));

    }

}


