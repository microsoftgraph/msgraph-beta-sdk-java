package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegatedAdminRelationshipOperationType implements ValuedEnum {
    DelegatedAdminAccessAssignmentUpdate("delegatedAdminAccessAssignmentUpdate"),
    UnknownFutureValue("unknownFutureValue"),
    DelegatedAdminRelationshipUpdate("delegatedAdminRelationshipUpdate");
    public final String value;
    DelegatedAdminRelationshipOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminRelationshipOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delegatedAdminAccessAssignmentUpdate": return DelegatedAdminAccessAssignmentUpdate;
            case "unknownFutureValue": return UnknownFutureValue;
            case "delegatedAdminRelationshipUpdate": return DelegatedAdminRelationshipUpdate;
            default: return null;
        }
    }
}
