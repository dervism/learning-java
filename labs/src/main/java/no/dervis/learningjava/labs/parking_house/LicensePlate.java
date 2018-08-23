package no.dervis.learningjava.labs.parking_house;

/**
 * Plate number patterns:
 *
 * https://en.wikipedia.org/wiki/Vehicle_registration_plate
 * https://en.wikipedia.org/wiki/Vehicle_registration_plates_of_Europe
 *
 */

public enum LicensePlate {
    // Scandinavia
    NORWAY("no", "LL DDDDD"),
    DENMARK("dk", "LL DDDDD"),
    FINLAND("fi", "LLL-DDD"),
    SWEDEN("se", "LLL DDD"),
    ICELAND("ic", "LL LDD"),

    // EU
    POLAND("pl", "LLL DDDDD"),
    FRANCE("fr", "LL-DDD-LL"),
    GERMANY("ge", "LL LL DDD"),
    UK("uk", "LL DD LLL"),
    IRELAND("ir", "DDD-L-DDDDD"),
    ITALY("it", "LL DDD LL"),
    SPAIN("sp", "DDDD LLL"),

    // Americas
    US("us", "LLL-DDDD"),
    CANADA("ca", "LLL-DDDD"),
    MEXICO("me", "LLL-DD-DD"),
    BRAZIL("br", "LLL.DDDD"),
    ARGENTINA("ar", "LL DDD LL");

    private String pattern;
    private String countryCode;

    LicensePlate(String countryCode, String pattern) {
        this.pattern = pattern;
        this.countryCode = countryCode;
    }

    public String getPattern() {
        return pattern;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
