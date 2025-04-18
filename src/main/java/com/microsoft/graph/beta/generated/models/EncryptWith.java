package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EncryptWith implements ValuedEnum {
    Template("template"),
    UserDefinedRights("userDefinedRights");
    public final String value;
    EncryptWith(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EncryptWith forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "template": return Template;
            case "userDefinedRights": return UserDefinedRights;
            default: return null;
        }
    }
}
