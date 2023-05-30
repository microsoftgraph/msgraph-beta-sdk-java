package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Indicates the type of execution status of the device management script. */
public enum RunState implements ValuedEnum {
    /** Unknown result. */
    Unknown("unknown"),
    /** Script is run successfully. */
    Success("success"),
    /** Script failed to run. */
    Fail("fail"),
    /** Discovery script hits error. */
    ScriptError("scriptError"),
    /** Script is pending to execute. */
    Pending("pending"),
    /** Script is not applicable for this device. */
    NotApplicable("notApplicable");
    public final String value;
    RunState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RunState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "fail": return Fail;
            case "scriptError": return ScriptError;
            case "pending": return Pending;
            case "notApplicable": return NotApplicable;
            default: return null;
        }
    }
}
