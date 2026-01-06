package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StructuredDataEntryValueType implements ValuedEnum {
    DateTime("dateTime"),
    Boolean("boolean"),
    Byte("byte"),
    String("string"),
    Integer32("integer32"),
    UnsignedInteger32("unsignedInteger32"),
    Integer64("integer64"),
    UnsignedInteger64("unsignedInteger64"),
    StringArray("stringArray"),
    ByteArray("byteArray"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    StructuredDataEntryValueType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StructuredDataEntryValueType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dateTime": return DateTime;
            case "boolean": return Boolean;
            case "byte": return Byte;
            case "string": return String;
            case "integer32": return Integer32;
            case "unsignedInteger32": return UnsignedInteger32;
            case "integer64": return Integer64;
            case "unsignedInteger64": return UnsignedInteger64;
            case "stringArray": return StringArray;
            case "byteArray": return ByteArray;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
