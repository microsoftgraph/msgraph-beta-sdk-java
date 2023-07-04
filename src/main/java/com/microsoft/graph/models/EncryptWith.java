package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EncryptWith implements ValuedEnum {
    Template("template"),
    UserDefinedRights("userDefinedRights");
    public final String value;
    EncryptWith(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EncryptWith forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "template": return Template;
            case "userDefinedRights": return UserDefinedRights;
            default: return null;
        }
    }
}
