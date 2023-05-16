package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Mdm Support Status of the setting. */
public enum MdmSupportedState implements ValuedEnum {
    /** Mdm support status of the setting is not known. */
    Unknown("unknown"),
    /** Setting is supported. */
    Supported("supported"),
    /** Setting is unsupported. */
    Unsupported("unsupported"),
    /** Setting is depcrecated. */
    Deprecated("deprecated");
    public final String value;
    MdmSupportedState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MdmSupportedState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "supported": return Supported;
            case "unsupported": return Unsupported;
            case "deprecated": return Deprecated;
            default: return null;
        }
    }
}
