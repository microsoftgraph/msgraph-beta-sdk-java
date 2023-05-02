package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Android For Work required password type. */
public enum AndroidForWorkRequiredPasswordType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Low security biometrics based password required. */
    LowSecurityBiometric("lowSecurityBiometric"),
    /** Required. */
    Required("required"),
    /** At least numeric password required. */
    AtLeastNumeric("atLeastNumeric"),
    /** Numeric complex password required. */
    NumericComplex("numericComplex"),
    /** At least alphabetic password required. */
    AtLeastAlphabetic("atLeastAlphabetic"),
    /** At least alphanumeric password required. */
    AtLeastAlphanumeric("atLeastAlphanumeric"),
    /** At least alphanumeric with symbols password required. */
    AlphanumericWithSymbols("alphanumericWithSymbols");
    public final String value;
    AndroidForWorkRequiredPasswordType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidForWorkRequiredPasswordType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "lowSecurityBiometric": return LowSecurityBiometric;
            case "required": return Required;
            case "atLeastNumeric": return AtLeastNumeric;
            case "numericComplex": return NumericComplex;
            case "atLeastAlphabetic": return AtLeastAlphabetic;
            case "atLeastAlphanumeric": return AtLeastAlphanumeric;
            case "alphanumericWithSymbols": return AlphanumericWithSymbols;
            default: return null;
        }
    }
}
