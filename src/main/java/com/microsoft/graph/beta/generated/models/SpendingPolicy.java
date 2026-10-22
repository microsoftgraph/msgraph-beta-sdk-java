package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A policy that governs Copilot Credits consumption for an audience. Every policy is one ofits derived types, identified by @odata.type on create.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpendingPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SpendingPolicy} and sets the default values.
     */
    public SpendingPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpendingPolicy}
     */
    @jakarta.annotation.Nonnull
    public static SpendingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.allUsersSpendingPolicy": return new AllUsersSpendingPolicy();
                case "#microsoft.graph.selectedGroupsSpendingPolicy": return new SelectedGroupsSpendingPolicy();
            }
        }
        return new SpendingPolicy();
    }
    /**
     * Gets the billingMethods property value. How Copilot consumption is billed when more than one method may apply. This is a flags enum,so combined values such as prepaidCredits,payAsYouGo are valid.
     * @return a {@link EnumSet<CostManagementBillingMethods>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CostManagementBillingMethods> getBillingMethods() {
        return this.backingStore.get("billingMethods");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. When the policy was created. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The policy display name. Must be 10-64 characters, letters, digits, and spaces only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailThresholdSettings property value. Notify-only email threshold configuration for the policy. Alerts are delivered by emailonly. Addressed beneath the policy rather than returned inline in the policy response.
     * @return a {@link CostManagementAlertSetting}
     */
    @jakarta.annotation.Nullable
    public CostManagementAlertSetting getEmailThresholdSettings() {
        return this.backingStore.get("emailThresholdSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billingMethods", (n) -> { this.setBillingMethods(n.getEnumSetValue(CostManagementBillingMethods::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailThresholdSettings", (n) -> { this.setEmailThresholdSettings(n.getObjectValue(CostManagementAlertSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("periodLimit", (n) -> { this.setPeriodLimit(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("perUserLimit", (n) -> { this.setPerUserLimit(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceSettings", (n) -> { this.setServiceSettings(n.getCollectionOfObjectValues(SpendingPolicyServiceSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SpendingPolicyStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. When the policy was last modified. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the periodLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getPeriodLimit() {
        return this.backingStore.get("periodLimit");
    }
    /**
     * Gets the perUserLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getPerUserLimit() {
        return this.backingStore.get("perUserLimit");
    }
    /**
     * Gets the serviceSettings property value. Per-service settings contained by the policy. Add a service with POST; remove one bysetting its state to disabled, which retains the entry in that state.
     * @return a {@link java.util.List<SpendingPolicyServiceSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SpendingPolicyServiceSetting> getServiceSettings() {
        return this.backingStore.get("serviceSettings");
    }
    /**
     * Gets the status property value. Lifecycle status of a spending policy.
     * @return a {@link SpendingPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public SpendingPolicyStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("billingMethods", this.getBillingMethods());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("emailThresholdSettings", this.getEmailThresholdSettings());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeObjectValue("periodLimit", this.getPeriodLimit());
        writer.writeObjectValue("perUserLimit", this.getPerUserLimit());
        writer.writeCollectionOfObjectValues("serviceSettings", this.getServiceSettings());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the billingMethods property value. How Copilot consumption is billed when more than one method may apply. This is a flags enum,so combined values such as prepaidCredits,payAsYouGo are valid.
     * @param value Value to set for the billingMethods property.
     */
    public void setBillingMethods(@jakarta.annotation.Nullable final EnumSet<CostManagementBillingMethods> value) {
        this.backingStore.set("billingMethods", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. When the policy was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The policy display name. Must be 10-64 characters, letters, digits, and spaces only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailThresholdSettings property value. Notify-only email threshold configuration for the policy. Alerts are delivered by emailonly. Addressed beneath the policy rather than returned inline in the policy response.
     * @param value Value to set for the emailThresholdSettings property.
     */
    public void setEmailThresholdSettings(@jakarta.annotation.Nullable final CostManagementAlertSetting value) {
        this.backingStore.set("emailThresholdSettings", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. When the policy was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the periodLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the periodLimit property.
     */
    public void setPeriodLimit(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("periodLimit", value);
    }
    /**
     * Sets the perUserLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the perUserLimit property.
     */
    public void setPerUserLimit(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("perUserLimit", value);
    }
    /**
     * Sets the serviceSettings property value. Per-service settings contained by the policy. Add a service with POST; remove one bysetting its state to disabled, which retains the entry in that state.
     * @param value Value to set for the serviceSettings property.
     */
    public void setServiceSettings(@jakarta.annotation.Nullable final java.util.List<SpendingPolicyServiceSetting> value) {
        this.backingStore.set("serviceSettings", value);
    }
    /**
     * Sets the status property value. Lifecycle status of a spending policy.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SpendingPolicyStatus value) {
        this.backingStore.set("status", value);
    }
}
