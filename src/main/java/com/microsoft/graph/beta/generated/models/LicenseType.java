package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates whether tenant has a valid Intune Endpoint Privilege Management license. Possible value are : 0 - notPaid, 1 - paid, 2 - trial. See LicenseType enum for more details. Default notPaid .
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LicenseType implements ValuedEnum {
    /** Indicates the tenant has neither trial or paid license. */
    NotPaid("notPaid"),
    /** Indicates the tenant has paid Endpoint Privilege Management license. */
    Paid("paid"),
    /** Indicates the tenant has trial Endpoint Privilege Management license. */
    Trial("trial"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LicenseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LicenseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notPaid": return NotPaid;
            case "paid": return Paid;
            case "trial": return Trial;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
