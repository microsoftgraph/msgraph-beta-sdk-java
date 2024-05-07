package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessAudienceReason implements ValuedEnum {
    None("none"),
    ResourcelessRequest("resourcelessRequest"),
    ConfidentialClientIdToken("confidentialClientIdToken"),
    ConfidentialClientNonIdToken("confidentialClientNonIdToken"),
    ResourceMapping("resourceMapping"),
    ResourceMappingDefault("resourceMappingDefault"),
    ScopeMapping("scopeMapping"),
    ScopeMappingDefault("scopeMappingDefault"),
    DelegatedScope("delegatedScope"),
    FirstPartyResourceDefault("firstPartyResourceDefault"),
    ThirdPartyResourceDefault("thirdPartyResourceDefault"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessAudienceReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessAudienceReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "resourcelessRequest": return ResourcelessRequest;
            case "confidentialClientIdToken": return ConfidentialClientIdToken;
            case "confidentialClientNonIdToken": return ConfidentialClientNonIdToken;
            case "resourceMapping": return ResourceMapping;
            case "resourceMappingDefault": return ResourceMappingDefault;
            case "scopeMapping": return ScopeMapping;
            case "scopeMappingDefault": return ScopeMappingDefault;
            case "delegatedScope": return DelegatedScope;
            case "firstPartyResourceDefault": return FirstPartyResourceDefault;
            case "thirdPartyResourceDefault": return ThirdPartyResourceDefault;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
