package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcUserSettingsPersistenceStorageSizeCategory implements ValuedEnum {
    FourGB("fourGB"),
    EightGB("eightGB"),
    SixteenGB("sixteenGB"),
    ThirtyTwoGB("thirtyTwoGB"),
    SixtyFourGB("sixtyFourGB"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserSettingsPersistenceStorageSizeCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcUserSettingsPersistenceStorageSizeCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fourGB": return FourGB;
            case "eightGB": return EightGB;
            case "sixteenGB": return SixteenGB;
            case "thirtyTwoGB": return ThirtyTwoGB;
            case "sixtyFourGB": return SixtyFourGB;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
