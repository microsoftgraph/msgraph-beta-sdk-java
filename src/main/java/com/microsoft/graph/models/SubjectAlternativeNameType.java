package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Subject Alternative Name Options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubjectAlternativeNameType implements ValuedEnum {
    /** No subject alternative name. */
    None("none"),
    /** Email address. */
    EmailAddress("emailAddress"),
    /** User Principal Name (UPN). */
    UserPrincipalName("userPrincipalName"),
    /** Custom Azure AD Attribute. */
    CustomAzureADAttribute("customAzureADAttribute"),
    /** Domain Name Service (DNS). */
    DomainNameService("domainNameService"),
    /** Universal Resource Identifier (URI). */
    UniversalResourceIdentifier("universalResourceIdentifier");
    public final String value;
    SubjectAlternativeNameType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubjectAlternativeNameType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "emailAddress": return EmailAddress;
            case "userPrincipalName": return UserPrincipalName;
            case "customAzureADAttribute": return CustomAzureADAttribute;
            case "domainNameService": return DomainNameService;
            case "universalResourceIdentifier": return UniversalResourceIdentifier;
            default: return null;
        }
    }
}
