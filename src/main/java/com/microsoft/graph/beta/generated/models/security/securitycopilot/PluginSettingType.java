package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PluginSettingType implements ValuedEnum {
    String("string"),
    Bool("bool"),
    Array("array"),
    Enum("enum"),
    SecretString("secretString"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PluginSettingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PluginSettingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "string": return String;
            case "bool": return Bool;
            case "array": return Array;
            case "enum": return Enum;
            case "secretString": return SecretString;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
