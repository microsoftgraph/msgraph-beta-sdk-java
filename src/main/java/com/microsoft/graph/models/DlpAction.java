package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DlpAction implements ValuedEnum {
    NotifyUser("notifyUser"),
    BlockAccess("blockAccess"),
    DeviceRestriction("deviceRestriction");
    public final String value;
    DlpAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DlpAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notifyUser": return NotifyUser;
            case "blockAccess": return BlockAccess;
            case "deviceRestriction": return DeviceRestriction;
            default: return null;
        }
    }
}
