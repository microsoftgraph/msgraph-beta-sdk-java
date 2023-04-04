package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Android Device Owner policy required password type. */
public enum AndroidDeviceOwnerRequiredPasswordType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** There must be a password set, but there are no restrictions on type. */
    Required("required"),
    /** At least numeric. */
    Numeric("numeric"),
    /** At least numeric with no repeating or ordered sequences. */
    NumericComplex("numericComplex"),
    /** At least alphabetic password. */
    Alphabetic("alphabetic"),
    /** At least alphanumeric password */
    Alphanumeric("alphanumeric"),
    /** At least alphanumeric with symbols. */
    AlphanumericWithSymbols("alphanumericWithSymbols"),
    /** Low security biometrics based password required. */
    LowSecurityBiometric("lowSecurityBiometric"),
    /** Custom password set by the admin. */
    CustomPassword("customPassword");
    public final String value;
    AndroidDeviceOwnerRequiredPasswordType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerRequiredPasswordType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "required": return Required;
            case "numeric": return Numeric;
            case "numericComplex": return NumericComplex;
            case "alphabetic": return Alphabetic;
            case "alphanumeric": return Alphanumeric;
            case "alphanumericWithSymbols": return AlphanumericWithSymbols;
            case "lowSecurityBiometric": return LowSecurityBiometric;
            case "customPassword": return CustomPassword;
            default: return null;
        }
    }
}
