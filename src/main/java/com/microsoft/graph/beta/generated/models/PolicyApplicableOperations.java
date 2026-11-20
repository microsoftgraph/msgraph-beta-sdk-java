package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyApplicableOperations implements ValuedEnum {
    Create("create"),
    UpdateOrUpsert("updateOrUpsert"),
    Delete("delete"),
    InvokeAction("invokeAction"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyApplicableOperations(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyApplicableOperations forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "create": return Create;
            case "updateOrUpsert": return UpdateOrUpsert;
            case "delete": return Delete;
            case "invokeAction": return InvokeAction;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
