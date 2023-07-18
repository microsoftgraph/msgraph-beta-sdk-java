package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUserRegistrationsSummary extends Entity implements Parsable {
    /**
     * Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     */
    private Integer mfaAndSsprCapableUserCount;
    /**
     * The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     */
    private String mfaConditionalAccessPolicyState;
    /**
     * The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     */
    private Integer mfaExcludedUserCount;
    /**
     * The number of users registered for multi-factor authentication. Optional. Read-only.
     */
    private Integer mfaRegisteredUserCount;
    /**
     * A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     */
    private Boolean securityDefaultsEnabled;
    /**
     * The number of users enabled for self service password reset. Optional. Read-only.
     */
    private Integer ssprEnabledUserCount;
    /**
     * The number of users registered for self service password reset. Optional. Read-only.
     */
    private Integer ssprRegisteredUserCount;
    /**
     * The display name for the managed tenant. Required. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     */
    private String tenantId;
    /**
     * The tenantLicenseType property
     */
    private String tenantLicenseType;
    /**
     * The total number of users in the given managed tenant. Optional. Read-only.
     */
    private Integer totalUserCount;
    /**
     * Instantiates a new credentialUserRegistrationsSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CredentialUserRegistrationsSummary() {
        super();
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mfaAndSsprCapableUserCount", (n) -> { this.setMfaAndSsprCapableUserCount(n.getIntegerValue()); });
        deserializerMap.put("mfaConditionalAccessPolicyState", (n) -> { this.setMfaConditionalAccessPolicyState(n.getStringValue()); });
        deserializerMap.put("mfaExcludedUserCount", (n) -> { this.setMfaExcludedUserCount(n.getIntegerValue()); });
        deserializerMap.put("mfaRegisteredUserCount", (n) -> { this.setMfaRegisteredUserCount(n.getIntegerValue()); });
        deserializerMap.put("securityDefaultsEnabled", (n) -> { this.setSecurityDefaultsEnabled(n.getBooleanValue()); });
        deserializerMap.put("ssprEnabledUserCount", (n) -> { this.setSsprEnabledUserCount(n.getIntegerValue()); });
        deserializerMap.put("ssprRegisteredUserCount", (n) -> { this.setSsprRegisteredUserCount(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("tenantLicenseType", (n) -> { this.setTenantLicenseType(n.getStringValue()); });
        deserializerMap.put("totalUserCount", (n) -> { this.setTotalUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Gets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaAndSsprCapableUserCount() {
        return this.mfaAndSsprCapableUserCount;
    }
    /**
     * Gets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMfaConditionalAccessPolicyState() {
        return this.mfaConditionalAccessPolicyState;
    }
    /**
     * Gets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaExcludedUserCount() {
        return this.mfaExcludedUserCount;
    }
    /**
     * Gets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMfaRegisteredUserCount() {
        return this.mfaRegisteredUserCount;
    }
    /**
     * Gets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDefaultsEnabled() {
        return this.securityDefaultsEnabled;
    }
    /**
     * Gets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSsprEnabledUserCount() {
        return this.ssprEnabledUserCount;
    }
    /**
     * Gets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSsprRegisteredUserCount() {
        return this.ssprRegisteredUserCount;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the tenantLicenseType property value. The tenantLicenseType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantLicenseType() {
        return this.tenantLicenseType;
    }
    /**
     * Gets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUserCount() {
        return this.totalUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeStringValue("tenantLicenseType", this.getTenantLicenseType());
        writer.writeIntegerValue("totalUserCount", this.getTotalUserCount());
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @param value Value to set for the mfaAndSsprCapableUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMfaAndSsprCapableUserCount(@javax.annotation.Nullable final Integer value) {
        this.mfaAndSsprCapableUserCount = value;
    }
    /**
     * Sets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaConditionalAccessPolicyState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMfaConditionalAccessPolicyState(@javax.annotation.Nullable final String value) {
        this.mfaConditionalAccessPolicyState = value;
    }
    /**
     * Sets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @param value Value to set for the mfaExcludedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMfaExcludedUserCount(@javax.annotation.Nullable final Integer value) {
        this.mfaExcludedUserCount = value;
    }
    /**
     * Sets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaRegisteredUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMfaRegisteredUserCount(@javax.annotation.Nullable final Integer value) {
        this.mfaRegisteredUserCount = value;
    }
    /**
     * Sets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @param value Value to set for the securityDefaultsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityDefaultsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.securityDefaultsEnabled = value;
    }
    /**
     * Sets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprEnabledUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsprEnabledUserCount(@javax.annotation.Nullable final Integer value) {
        this.ssprEnabledUserCount = value;
    }
    /**
     * Sets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprRegisteredUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsprRegisteredUserCount(@javax.annotation.Nullable final Integer value) {
        this.ssprRegisteredUserCount = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the tenantLicenseType property value. The tenantLicenseType property
     * @param value Value to set for the tenantLicenseType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantLicenseType(@javax.annotation.Nullable final String value) {
        this.tenantLicenseType = value;
    }
    /**
     * Sets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUserCount(@javax.annotation.Nullable final Integer value) {
        this.totalUserCount = value;
    }
}
