package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationAllowedAudiences implements ValuedEnum {
    Me("me"),
    Organization("organization"),
    FederatedOrganizations("federatedOrganizations"),
    Everyone("everyone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OrganizationAllowedAudiences(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationAllowedAudiences forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "me": return Me;
            case "organization": return Organization;
            case "federatedOrganizations": return FederatedOrganizations;
            case "everyone": return Everyone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
