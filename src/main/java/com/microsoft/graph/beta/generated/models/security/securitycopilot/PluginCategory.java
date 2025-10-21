package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PluginCategory implements ValuedEnum {
    Hidden("hidden"),
    Microsoft("microsoft"),
    MicrosoftConnectors("microsoftConnectors"),
    Other("other"),
    Web("web"),
    Testing("testing"),
    Plugin("plugin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PluginCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PluginCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hidden": return Hidden;
            case "microsoft": return Microsoft;
            case "microsoftConnectors": return MicrosoftConnectors;
            case "other": return Other;
            case "web": return Web;
            case "testing": return Testing;
            case "plugin": return Plugin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
