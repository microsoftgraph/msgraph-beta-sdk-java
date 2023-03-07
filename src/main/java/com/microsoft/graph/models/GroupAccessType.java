package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum GroupAccessType implements ValuedEnum {
    None("none"),
    PrivateEscaped("privateEscaped"),
    Secret("secret"),
    PublicEscaped("publicEscaped");
    public final String value;
    GroupAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "private": return PrivateEscaped;
            case "secret": return Secret;
            case "public": return PublicEscaped;
            default: return null;
        }
    }
}
