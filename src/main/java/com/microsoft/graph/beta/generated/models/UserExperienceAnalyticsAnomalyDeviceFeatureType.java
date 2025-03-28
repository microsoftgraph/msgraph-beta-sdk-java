package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the device&apos;s feature type. Possible values are: manufacturer, model, osVersion, application or driver.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsAnomalyDeviceFeatureType implements ValuedEnum {
    /** Indicates the manufacturer name as device feature type. */
    Manufacturer("manufacturer"),
    /** Indicates the model as a device feature type. */
    Model("model"),
    /** Indicates the OS as a device feature type. */
    OsVersion("osVersion"),
    /** Indicates the application as a device feature type. */
    Application("application"),
    /** Indicates the driver as a device feature type. */
    Driver("driver"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsAnomalyDeviceFeatureType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsAnomalyDeviceFeatureType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manufacturer": return Manufacturer;
            case "model": return Model;
            case "osVersion": return OsVersion;
            case "application": return Application;
            case "driver": return Driver;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
