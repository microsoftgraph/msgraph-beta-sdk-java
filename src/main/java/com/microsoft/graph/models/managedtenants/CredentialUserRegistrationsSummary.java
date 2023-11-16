package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialUserRegistrationsSummary extends Entity implements Parsable {
    /**
     * Instantiates a new CredentialUserRegistrationsSummary and sets the default values.
     */
    public CredentialUserRegistrationsSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CredentialUserRegistrationsSummary
     */
    @jakarta.annotation.Nonnull
    public static CredentialUserRegistrationsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationsSummary();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.BackingStore.get("lastRefreshedDateTime");
    }
    /**
     * Gets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMfaAndSsprCapableUserCount() {
        return this.BackingStore.get("mfaAndSsprCapableUserCount");
    }
    /**
     * Gets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMfaConditionalAccessPolicyState() {
        return this.BackingStore.get("mfaConditionalAccessPolicyState");
    }
    /**
     * Gets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMfaExcludedUserCount() {
        return this.BackingStore.get("mfaExcludedUserCount");
    }
    /**
     * Gets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMfaRegisteredUserCount() {
        return this.BackingStore.get("mfaRegisteredUserCount");
    }
    /**
     * Gets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDefaultsEnabled() {
        return this.BackingStore.get("securityDefaultsEnabled");
    }
    /**
     * Gets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSsprEnabledUserCount() {
        return this.BackingStore.get("ssprEnabledUserCount");
    }
    /**
     * Gets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSsprRegisteredUserCount() {
        return this.BackingStore.get("ssprRegisteredUserCount");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.BackingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.BackingStore.get("tenantId");
    }
    /**
     * Gets the tenantLicenseType property value. The license type associated with the tenant; for example, AADFree, AADPremium1, AADPremium2.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantLicenseType() {
        return this.BackingStore.get("tenantLicenseType");
    }
    /**
     * Gets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUserCount() {
        return this.BackingStore.get("totalUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the mfaAndSsprCapableUserCount property value. The number of users that are capable of performing multi-factor authentication or self service password reset. Optional. Read-only.
     * @param value Value to set for the mfaAndSsprCapableUserCount property.
     */
    public void setMfaAndSsprCapableUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("mfaAndSsprCapableUserCount", value);
    }
    /**
     * Sets the mfaConditionalAccessPolicyState property value. The state of a conditional access policy that enforces multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaConditionalAccessPolicyState property.
     */
    public void setMfaConditionalAccessPolicyState(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("mfaConditionalAccessPolicyState", value);
    }
    /**
     * Sets the mfaExcludedUserCount property value. The number of users in the multi-factor authentication exclusion security group (Microsoft 365 Lighthouse - MFA exclusions). Optional. Read-only.
     * @param value Value to set for the mfaExcludedUserCount property.
     */
    public void setMfaExcludedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("mfaExcludedUserCount", value);
    }
    /**
     * Sets the mfaRegisteredUserCount property value. The number of users registered for multi-factor authentication. Optional. Read-only.
     * @param value Value to set for the mfaRegisteredUserCount property.
     */
    public void setMfaRegisteredUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("mfaRegisteredUserCount", value);
    }
    /**
     * Sets the securityDefaultsEnabled property value. A flag indicating whether Identity Security Defaults is enabled. Optional. Read-only.
     * @param value Value to set for the securityDefaultsEnabled property.
     */
    public void setSecurityDefaultsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("securityDefaultsEnabled", value);
    }
    /**
     * Sets the ssprEnabledUserCount property value. The number of users enabled for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprEnabledUserCount property.
     */
    public void setSsprEnabledUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("ssprEnabledUserCount", value);
    }
    /**
     * Sets the ssprRegisteredUserCount property value. The number of users registered for self service password reset. Optional. Read-only.
     * @param value Value to set for the ssprRegisteredUserCount property.
     */
    public void setSsprRegisteredUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("ssprRegisteredUserCount", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tenantId", value);
    }
    /**
     * Sets the tenantLicenseType property value. The license type associated with the tenant; for example, AADFree, AADPremium1, AADPremium2.
     * @param value Value to set for the tenantLicenseType property.
     */
    public void setTenantLicenseType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tenantLicenseType", value);
    }
    /**
     * Sets the totalUserCount property value. The total number of users in the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalUserCount property.
     */
    public void setTotalUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalUserCount", value);
    }
}
