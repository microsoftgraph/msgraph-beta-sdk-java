package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows MAM data transfer locations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsManagedAppDataTransferLocations implements ValuedEnum {
    /** No locations selected. */
    None("none"),
    /** OneDrive for Business. Data transferred to or from this location is subject to app protection policy. */
    OneDriveForBusiness("oneDriveForBusiness"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsManagedAppDataTransferLocations(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsManagedAppDataTransferLocations forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
