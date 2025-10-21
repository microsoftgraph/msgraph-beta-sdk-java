package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PluginCatalogScope implements ValuedEnum {
    None("none"),
    User("user"),
    Workspace("workspace"),
    Tenant("tenant"),
    Global("global"),
    GeoGlobal("geoGlobal"),
    UserWorkspace("userWorkspace"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PluginCatalogScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PluginCatalogScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "user": return User;
            case "workspace": return Workspace;
            case "tenant": return Tenant;
            case "global": return Global;
            case "geoGlobal": return GeoGlobal;
            case "userWorkspace": return UserWorkspace;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
