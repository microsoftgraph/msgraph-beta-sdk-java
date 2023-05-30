package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag. */
public enum DeviceScopeParameter implements ValuedEnum {
    /** Device Scope parameter is not set */
    None("none"),
    /** use Scope Tag as parameter for the device scope configuration. */
    ScopeTag("scopeTag"),
    /** Placeholder value for future expansion. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeParameter(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceScopeParameter forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "scopeTag": return ScopeTag;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
