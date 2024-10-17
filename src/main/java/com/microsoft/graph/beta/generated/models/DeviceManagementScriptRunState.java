package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of execution status of the device management script. This status provides insights into whether the script has been successfully executed, encountered errors, or is pending execution.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementScriptRunState implements ValuedEnum {
    /** Default value. Indicates that the script execution status is unknown for the device. */
    Unknown("unknown"),
    /** Indicates that the script ran successfully for the device. */
    Success("success"),
    /** Indicates that the script resulted in failure for the device. */
    Fail("fail"),
    /** Indicates that the discovery script was unable to complete on the device. */
    ScriptError("scriptError"),
    /** Indicates that the script has not yet started running on the device. */
    Pending("pending"),
    /** Indicates that the script is not applicable for this device. */
    NotApplicable("notApplicable"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementScriptRunState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementScriptRunState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "fail": return Fail;
            case "scriptError": return ScriptError;
            case "pending": return Pending;
            case "notApplicable": return NotApplicable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
