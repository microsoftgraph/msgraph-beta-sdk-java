package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of accounts that are allowed for Windows10SecureAssessment ConfigurationAccount.
 */
public enum SecureAssessmentAccountType implements ValuedEnum {
    /** Indicates an Azure AD account in format of AzureAD/username@tenant.com. */
    AzureADAccount("azureADAccount"),
    /** Indicates a domain account in format of domain/user or user@domain.com. */
    DomainAccount("domainAccount"),
    /** Indicates a local account in format of username. */
    LocalAccount("localAccount"),
    /** Indicates a local guest account in format of test name. */
    LocalGuestAccount("localGuestAccount");
    public final String value;
    SecureAssessmentAccountType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SecureAssessmentAccountType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureADAccount": return AzureADAccount;
            case "domainAccount": return DomainAccount;
            case "localAccount": return LocalAccount;
            case "localGuestAccount": return LocalGuestAccount;
            default: return null;
        }
    }
}
