package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies the update behavior of the apps installed via VPP. Apps in packages are not automatically updated. Maps to Apple&apos;s AppManagedUpdateBehaviorObject declaration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DdmAppAutomaticAppUpdates implements ValuedEnum {
    /** The device automatically updates the app to the latest version. */
    AlwaysOn("alwaysOn"),
    /** The device never automatically updates the app. */
    AlwaysOff("alwaysOff"),
    /** The device uses the settings for the corresponding store to determine when to automatically update the app. */
    StoreSettings("storeSettings"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DdmAppAutomaticAppUpdates(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DdmAppAutomaticAppUpdates forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alwaysOn": return AlwaysOn;
            case "alwaysOff": return AlwaysOff;
            case "storeSettings": return StoreSettings;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
