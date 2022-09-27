package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class CredentialUserRegistrationsSummary extends Entity implements Parsable {
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only. */
    private Integer _mfaAndSsprCapableUserCount;
    /** The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only. */
    private String _mfaConditionalAccessPolicyState;
    /** The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only. */
    private Integer _mfaExcludedUserCount;
    /** The number of users registered for multi-factor authentication. Optional. Read-only. */
    private Integer _mfaRegisteredUserCount;
    /** A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only. */
    private Boolean _securityDefaultsEnabled;
    /** The number of users enabled for self service password reset. Optional. Read-only. */
    private Integer _ssprEnabledUserCount;
    /** The number of users registered for self service password reset. Optional. Read-only. */
    private Integer _ssprRegisteredUserCount;
    /** The display name for the managed tenant. Required. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only. */
    private String _tenantId;
    /** The total number of users in the given managed tenant. Optional. Read-only. */
    private Integer _totalUserCount;
    /**
     * Instantiates a new credentialUserRegistrationsSummary and sets the default values.
     * @return a void
     */
    public CredentialUserRegistrationsSummary() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.credentialUserRegistrationsSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a credentialUserRegistrationsSummary
     */
    @javax.annotation.Nonnull
    public static CredentialUserRegistrationsSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationsSummary();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CredentialUserRegistrationsSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("mfaAndSsprCapableUserCount", (n) -> { currentObject.setMfaAndSsprCapableUserCount(n.getIntegerValue()); });
            this.put("mfaConditionalAccessPolicyState", (n) -> { currentObject.setMfaConditionalAccessPolicyState(n.getStringValue()); });
            this.put("mfaExcludedUserCount", (n) -> { currentObject.setMfaExcludedUserCount(n.getIntegerValue()); });
            this.put("mfaRegisteredUserCount", (n) -> { currentObject.setMfaRegisteredUserCount(n.getIntegerValue()); });
            this.put("securityDefaultsEnabled", (n) -> { currentObject.setSecurityDefaultsEnabled(n.getBooleanValue()); });
            this.put("ssprEnabledUserCount", (n) -> { currentObject.setSsprEnabledUserCount(n.getIntegerValue()); });
            this.put("ssprRegisteredUserCount", (n) -> { currentObject.setSsprRegisteredUserCount(n.getIntegerValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("totalUserCount", (n) -> { currentObject.setTotalUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this._lastRefreshedDateTime;
    }
    /**
     * Gets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaAndSsprCapableUserCount() {
        return this._mfaAndSsprCapableUserCount;
    }
    /**
     * Gets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMfaConditionalAccessPolicyState() {
        return this._mfaConditionalAccessPolicyState;
    }
    /**
     * Gets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaExcludedUserCount() {
        return this._mfaExcludedUserCount;
    }
    /**
     * Gets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaRegisteredUserCount() {
        return this._mfaRegisteredUserCount;
    }
    /**
     * Gets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDefaultsEnabled() {
        return this._securityDefaultsEnabled;
    }
    /**
     * Gets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSsprEnabledUserCount() {
        return this._ssprEnabledUserCount;
    }
    /**
     * Gets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSsprRegisteredUserCount() {
        return this._ssprRegisteredUserCount;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUserCount() {
        return this._totalUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeIntegerValue("mfaAndSsprCapableUserCount", this.getMfaAndSsprCapableUserCount());
        writer.writeStringValue("mfaConditionalAccessPolicyState", this.getMfaConditionalAccessPolicyState());
        writer.writeIntegerValue("mfaExcludedUserCount", this.getMfaExcludedUserCount());
        writer.writeIntegerValue("mfaRegisteredUserCount", this.getMfaRegisteredUserCount());
        writer.writeBooleanValue("securityDefaultsEnabled", this.getSecurityDefaultsEnabled());
        writer.writeIntegerValue("ssprEnabledUserCount", this.getSsprEnabledUserCount());
        writer.writeIntegerValue("ssprRegisteredUserCount", this.getSsprRegisteredUserCount());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("totalUserCount", this.getTotalUserCount());
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @param value Value to set for the mfaAndSsprCapableUserCount property.
     * @return a void
     */
    public void setMfaAndSsprCapableUserCount(@javax.annotation.Nullable final Integer value) {
        this._mfaAndSsprCapableUserCount = value;
    }
    /**
     * Sets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaConditionalAccessPolicyState property.
     * @return a void
     */
    public void setMfaConditionalAccessPolicyState(@javax.annotation.Nullable final String value) {
        this._mfaConditionalAccessPolicyState = value;
    }
    /**
     * Sets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @param value Value to set for the mfaExcludedUserCount property.
     * @return a void
     */
    public void setMfaExcludedUserCount(@javax.annotation.Nullable final Integer value) {
        this._mfaExcludedUserCount = value;
    }
    /**
     * Sets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaRegisteredUserCount property.
     * @return a void
     */
    public void setMfaRegisteredUserCount(@javax.annotation.Nullable final Integer value) {
        this._mfaRegisteredUserCount = value;
    }
    /**
     * Sets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @param value Value to set for the securityDefaultsEnabled property.
     * @return a void
     */
    public void setSecurityDefaultsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._securityDefaultsEnabled = value;
    }
    /**
     * Sets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprEnabledUserCount property.
     * @return a void
     */
    public void setSsprEnabledUserCount(@javax.annotation.Nullable final Integer value) {
        this._ssprEnabledUserCount = value;
    }
    /**
     * Sets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprRegisteredUserCount property.
     * @return a void
     */
    public void setSsprRegisteredUserCount(@javax.annotation.Nullable final Integer value) {
        this._ssprRegisteredUserCount = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    public void setTotalUserCount(@javax.annotation.Nullable final Integer value) {
        this._totalUserCount = value;
    }
}
