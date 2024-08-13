package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible assignment item action intent values on the application or configuration when executing this action on the managed device. For example, if the application or configuration is intended to be removed on the managed device, then the intent value is remove, and if the application or configuration already under removal through previous actions and is now intended to be restored on the managed device, then the intent value is restore
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceAssignmentItemIntent implements ValuedEnum {
    /** Default. Indicates that the deployed application or configuration is intended to be removed on the managed device */
    Remove("remove"),
    /** Indicates that the application or configuration already under removal through previous actions and is now intended to be restored on the managed device */
    Restore("restore"),
    /** Evolvable enumeration sentinel value. Do not use */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceAssignmentItemIntent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAssignmentItemIntent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "remove": return Remove;
            case "restore": return Restore;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
