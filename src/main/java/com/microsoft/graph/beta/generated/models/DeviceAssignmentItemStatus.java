package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible assignment item action status values for the application or configuration regarding their executed action on the managed device. For example, a configuration included in the deviceAssignmentItems list has just been executed the action. Its status starts with inProgress until it's successfully removed to reflect as removed status or failed to be removed to reflect as error status on the managed device. Similar status change happens for restoration process
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceAssignmentItemStatus implements ValuedEnum {
    /** Default. Indicates that the device assignment action to remove or restore an application or a configuration is 'initiated' on the managed device */
    Initiated("initiated"),
    /** Indicates that the device assignment action to remove or restore an application or a configuration is 'in progress' on the managed device */
    InProgress("inProgress"),
    /** Indicates that the application or configuration has been successfully removed on the managed device */
    Removed("removed"),
    /** Indicates that the application or configuration has failed to be removed or restored on the managed device. The error may be retriable depending on the intent action message and error code */
    Error("error"),
    /** Indicates that the application or configuration has been successfully restored on the managed device */
    Succeeded("succeeded"),
    /** Evolvable enumeration sentinel value. Do not use */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceAssignmentItemStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAssignmentItemStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "initiated": return Initiated;
            case "inProgress": return InProgress;
            case "removed": return Removed;
            case "error": return Error;
            case "succeeded": return Succeeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
