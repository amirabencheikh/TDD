/**
 * 
 */
package TDD.monprojet.test;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import TDD.monprojet.Currency;

import TDD.monprojet.MultiCurrencyCalculator;

public class MultiCurrencyCalculatorTest {

    private MultiCurrencyCalculator calculator;

    private Currency usdCurrency;

    private Currency eurCurrency;



    @Before

    public void setUp() {

        calculator = new MultiCurrencyCalculator();

        usdCurrency = new Currency("USD", 1.0);

        eurCurrency = new Currency("EUR", 0.85);

    }



    @Test

    public void testAddCurrency() {

        calculator.addCurrency(usdCurrency);

        assertEquals(1, calculator.getCurrencies().size());

        assertTrue(calculator.getCurrencies().containsKey("USD"));

    }


    @Test

    public void testConvertCurrency() {

        calculator.addCurrency(usdCurrency);

        calculator.addCurrency(eurCurrency);

        assertEquals(85.0, calculator.convertCurrency("EUR", "USD", 100.0), 0.001);

        assertEquals(117.64705882352942, calculator.convertCurrency("USD", "EUR", 100.0), 0.001);


    }


    @Test(expected = IllegalArgumentException.class)

    public void testConvertCurrencyWithUnknownCurrency() {

        calculator.convertCurrency("JPY", "USD", 100.0);

    }

}