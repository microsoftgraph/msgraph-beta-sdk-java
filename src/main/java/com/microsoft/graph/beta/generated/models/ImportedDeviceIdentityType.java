package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ImportedDeviceIdentityType implements ValuedEnum {
    /** Unknown value of importedDeviceIdentityType. */
    Unknown("unknown"),
    /** Device Identity is of type imei. */
    Imei("imei"),
    /** Device Identity is of type serial number. */
    SerialNumber("serialNumber"),
    /** Device Identity is of type manufacturer + model + serial number semi-colon delimited tuple with enforced order. */
    ManufacturerModelSerial("manufacturerModelSerial");
    public final String value;
    ImportedDeviceIdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImportedDeviceIdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "imei": return Imei;
            case "serialNumber": return SerialNumber;
            case "manufacturerModelSerial": return ManufacturerModelSerial;
            default: return null;
        }
    }
}
