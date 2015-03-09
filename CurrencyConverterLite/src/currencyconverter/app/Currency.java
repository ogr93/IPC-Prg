package currencyconverter.app;

/**
 * Model class to characterize World currencies, like U.S.Dollars or British Pounds
 */
public enum Currency {
    USD("U.S. Dollar", 1.0),
    GBP("British Pound", 1.56285),
    EUR("Euro", 1.22293);

    /**
     * Conversion rate, from relative to U.S. Dollars
     */
    private double dollarConversionRate;
    /**
     * Full Currency name
     */
    private String fullName;

    Currency(String fullName, double dollarConversionRate) {
        this.dollarConversionRate = dollarConversionRate;
        this.fullName = fullName;
    }

    public double getDollarConversionRate() {
        return dollarConversionRate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return name();
    }

}
