package TDD.monprojet;
import java.util.HashMap;

import java.util.Map;







public class MultiCurrencyCalculator {

    private Map<String, Currency> currencies = new HashMap<>();



    public void addCurrency(Currency currency) {

        currencies.put(currency.getCode(), currency);

    }



    public double convertCurrency(String fromCurrencyCode, String toCurrencyCode, double amount) {

        if (!currencies.containsKey(fromCurrencyCode) || !currencies.containsKey(toCurrencyCode)) {

            throw new IllegalArgumentException("Unknown currency code");

        }

        Currency fromCurrency = currencies.get(fromCurrencyCode);

        Currency toCurrency = currencies.get(toCurrencyCode);

        double exchangeRate = toCurrency.getExchangeRate() / fromCurrency.getExchangeRate();

        return amount * exchangeRate;

    }



    public Map<String, Currency> getCurrencies() {

        return currencies;

    }
}