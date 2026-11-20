package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes how and when to install an app, specifically whether the app may be downloaded over cellular connections. Maps to Apple&apos;s AppManagedInstallBehaviorObject declaration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DdmAppAllowDownloadsOverCellular implements ValuedEnum {
    /** The device downloads apps of any size using a cellular network. */
    AlwaysOn("alwaysOn"),
    /** The device doesn&apos;t download apps using a cellular network. The device pauses the automatic install or update operation until a different network is active. */
    AlwaysOff("alwaysOff"),
    /** The device uses the settings for the corresponding store when downloading apps. */
    StoreSettings("storeSettings"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DdmAppAllowDownloadsOverCellular(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DdmAppAllowDownloadsOverCellular forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
