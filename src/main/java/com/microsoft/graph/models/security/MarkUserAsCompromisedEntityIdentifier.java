package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MarkUserAsCompromisedEntityIdentifier implements ValuedEnum {
    AccountObjectId("accountObjectId"),
    InitiatingProcessAccountObjectId("initiatingProcessAccountObjectId"),
    ServicePrincipalId("servicePrincipalId"),
    RecipientObjectId("recipientObjectId"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MarkUserAsCompromisedEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MarkUserAsCompromisedEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accountObjectId": return AccountObjectId;
            case "initiatingProcessAccountObjectId": return InitiatingProcessAccountObjectId;
            case "servicePrincipalId": return ServicePrincipalId;
            case "recipientObjectId": return RecipientObjectId;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
