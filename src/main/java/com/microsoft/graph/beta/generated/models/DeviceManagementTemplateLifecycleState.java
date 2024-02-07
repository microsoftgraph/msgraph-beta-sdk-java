package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes current lifecycle state of a template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementTemplateLifecycleState implements ValuedEnum {
    /** Invalid */
    Invalid("invalid"),
    /** Draft */
    Draft("draft"),
    /** Active */
    Active("active"),
    /** Superseded */
    Superseded("superseded"),
    /** Deprecated */
    Deprecated("deprecated"),
    /** Retired */
    Retired("retired");
    public final String value;
    DeviceManagementTemplateLifecycleState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementTemplateLifecycleState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "draft": return Draft;
            case "active": return Active;
            case "superseded": return Superseded;
            case "deprecated": return Deprecated;
            case "retired": return Retired;
            default: return null;
        }
    }
}
