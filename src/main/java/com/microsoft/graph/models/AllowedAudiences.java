package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AllowedAudiences implements ValuedEnum {
    Me("me"),
    Family("family"),
    Contacts("contacts"),
    GroupMembers("groupMembers"),
    Organization("organization"),
    FederatedOrganizations("federatedOrganizations"),
    Everyone("everyone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AllowedAudiences(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AllowedAudiences forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "me": return Me;
            case "family": return Family;
            case "contacts": return Contacts;
            case "groupMembers": return GroupMembers;
            case "organization": return Organization;
            case "federatedOrganizations": return FederatedOrganizations;
            case "everyone": return Everyone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
