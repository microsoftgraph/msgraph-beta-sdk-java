package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the delivery optimization download priority level for app content. This controls whether the download uses background bandwidth (minimal impact on other network activity) or foreground bandwidth (prioritized download at the expense of other network traffic).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority implements ValuedEnum {
    /** Indicates that no delivery optimization priority is configured. The download uses normal background priority, which minimizes impact on other network activity. This is the default value when the property is omitted. */
    NotConfigured("notConfigured"),
    /** Indicates that the app content download uses foreground priority, which prioritizes the download over background network tasks. This may result in faster installation but increased network bandwidth consumption. In National Cloud environments, this value is accepted and stored but has no effect on device behavior. */
    Foreground("foreground"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "foreground": return Foreground;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
