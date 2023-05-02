package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccountTargetContentType implements ValuedEnum {
    Unknown("unknown"),
    IncludeAll("includeAll"),
    AddressBook("addressBook"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccountTargetContentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountTargetContentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "includeAll": return IncludeAll;
            case "addressBook": return AddressBook;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
