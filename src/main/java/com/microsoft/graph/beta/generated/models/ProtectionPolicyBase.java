package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectionPolicyBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProtectionPolicyBase} and sets the default values.
     */
    public ProtectionPolicyBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProtectionPolicyBase}
     */
    @jakarta.annotation.Nonnull
    public static ProtectionPolicyBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.exchangeProtectionPolicy": return new ExchangeProtectionPolicy();
                case "#microsoft.graph.oneDriveForBusinessProtectionPolicy": return new OneDriveForBusinessProtectionPolicy();
                case "#microsoft.graph.sharePointProtectionPolicy": return new SharePointProtectionPolicy();
            }
        }
        return new ProtectionPolicyBase();
    }
    /**
     * Gets the billingPolicyId property value. The billingPolicyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingPolicyId() {
        return this.backingStore.get("billingPolicyId");
    }
    /**
     * Gets the createdBy property value. The identity of person who created the policy.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the policy was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The name of the policy to be created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billingPolicyId", (n) -> { this.setBillingPolicyId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("protectionMode", (n) -> { this.setProtectionMode(n.getEnumValue(BackupPolicyProtectionMode::forValue)); });
        deserializerMap.put("protectionPolicyArtifactCount", (n) -> { this.setProtectionPolicyArtifactCount(n.getObjectValue(ProtectionPolicyArtifactCount::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionSettings", (n) -> { this.setRetentionSettings(n.getCollectionOfObjectValues(RetentionSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ProtectionPolicyStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the policy is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the lastModifiedBy property value. The identity of the person who last modified the policy.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the policy was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the protectionMode property value. The protectionMode property
     * @return a {@link BackupPolicyProtectionMode}
     */
    @jakarta.annotation.Nullable
    public BackupPolicyProtectionMode getProtectionMode() {
        return this.backingStore.get("protectionMode");
    }
    /**
     * Gets the protectionPolicyArtifactCount property value. The count of artifacts in the protection policy by status. Returned only on $select.
     * @return a {@link ProtectionPolicyArtifactCount}
     */
    @jakarta.annotation.Nullable
    public ProtectionPolicyArtifactCount getProtectionPolicyArtifactCount() {
        return this.backingStore.get("protectionPolicyArtifactCount");
    }
    /**
     * Gets the retentionSettings property value. Contains the retention setting details for the policy.
     * @return a {@link java.util.List<RetentionSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionSetting> getRetentionSettings() {
        return this.backingStore.get("retentionSettings");
    }
    /**
     * Gets the status property value. The aggregated status of the protection units associated with the policy. The possible values are: inactive, activeWithErrors, updating, active, unknownFutureValue.
     * @return a {@link ProtectionPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public ProtectionPolicyStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("billingPolicyId", this.getBillingPolicyId());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("protectionMode", this.getProtectionMode());
        writer.writeObjectValue("protectionPolicyArtifactCount", this.getProtectionPolicyArtifactCount());
        writer.writeCollectionOfObjectValues("retentionSettings", this.getRetentionSettings());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the billingPolicyId property value. The billingPolicyId property
     * @param value Value to set for the billingPolicyId property.
     */
    public void setBillingPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("billingPolicyId", value);
    }
    /**
     * Sets the createdBy property value. The identity of person who created the policy.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the policy was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The name of the policy to be created.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the policy is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity of the person who last modified the policy.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the policy was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the protectionMode property value. The protectionMode property
     * @param value Value to set for the protectionMode property.
     */
    public void setProtectionMode(@jakarta.annotation.Nullable final BackupPolicyProtectionMode value) {
        this.backingStore.set("protectionMode", value);
    }
    /**
     * Sets the protectionPolicyArtifactCount property value. The count of artifacts in the protection policy by status. Returned only on $select.
     * @param value Value to set for the protectionPolicyArtifactCount property.
     */
    public void setProtectionPolicyArtifactCount(@jakarta.annotation.Nullable final ProtectionPolicyArtifactCount value) {
        this.backingStore.set("protectionPolicyArtifactCount", value);
    }
    /**
     * Sets the retentionSettings property value. Contains the retention setting details for the policy.
     * @param value Value to set for the retentionSettings property.
     */
    public void setRetentionSettings(@jakarta.annotation.Nullable final java.util.List<RetentionSetting> value) {
        this.backingStore.set("retentionSettings", value);
    }
    /**
     * Sets the status property value. The aggregated status of the protection units associated with the policy. The possible values are: inactive, activeWithErrors, updating, active, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ProtectionPolicyStatus value) {
        this.backingStore.set("status", value);
    }
}
