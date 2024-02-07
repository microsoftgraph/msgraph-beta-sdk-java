package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AggregatedPolicyCompliance extends Entity implements Parsable {
    /**
     * Instantiates a new AggregatedPolicyCompliance and sets the default values.
     */
    public AggregatedPolicyCompliance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AggregatedPolicyCompliance
     */
    @jakarta.annotation.Nonnull
    public static AggregatedPolicyCompliance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AggregatedPolicyCompliance();
    }
    /**
     * Gets the compliancePolicyId property value. Identifier for the device compliance policy. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompliancePolicyId() {
        return this.backingStore.get("compliancePolicyId");
    }
    /**
     * Gets the compliancePolicyName property value. Name of the device compliance policy. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompliancePolicyName() {
        return this.backingStore.get("compliancePolicyName");
    }
    /**
     * Gets the compliancePolicyPlatform property value. Platform for the device compliance policy. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, androidAOSP, all. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompliancePolicyPlatform() {
        return this.backingStore.get("compliancePolicyPlatform");
    }
    /**
     * Gets the compliancePolicyType property value. The type of compliance policy. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompliancePolicyType() {
        return this.backingStore.get("compliancePolicyType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliancePolicyId", (n) -> { this.setCompliancePolicyId(n.getStringValue()); });
        deserializerMap.put("compliancePolicyName", (n) -> { this.setCompliancePolicyName(n.getStringValue()); });
        deserializerMap.put("compliancePolicyPlatform", (n) -> { this.setCompliancePolicyPlatform(n.getStringValue()); });
        deserializerMap.put("compliancePolicyType", (n) -> { this.setCompliancePolicyType(n.getStringValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("numberOfCompliantDevices", (n) -> { this.setNumberOfCompliantDevices(n.getLongValue()); });
        deserializerMap.put("numberOfErrorDevices", (n) -> { this.setNumberOfErrorDevices(n.getLongValue()); });
        deserializerMap.put("numberOfNonCompliantDevices", (n) -> { this.setNumberOfNonCompliantDevices(n.getLongValue()); });
        deserializerMap.put("policyModifiedDateTime", (n) -> { this.setPolicyModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.backingStore.get("lastRefreshedDateTime");
    }
    /**
     * Gets the numberOfCompliantDevices property value. The number of devices that are in a compliant status. Optional. Read-only.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNumberOfCompliantDevices() {
        return this.backingStore.get("numberOfCompliantDevices");
    }
    /**
     * Gets the numberOfErrorDevices property value. The number of devices that are in an error status. Optional. Read-only.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNumberOfErrorDevices() {
        return this.backingStore.get("numberOfErrorDevices");
    }
    /**
     * Gets the numberOfNonCompliantDevices property value. The number of device that are in a non-compliant status. Optional. Read-only.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNumberOfNonCompliantDevices() {
        return this.backingStore.get("numberOfNonCompliantDevices");
    }
    /**
     * Gets the policyModifiedDateTime property value. The date and time the device policy was last modified. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPolicyModifiedDateTime() {
        return this.backingStore.get("policyModifiedDateTime");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("compliancePolicyId", this.getCompliancePolicyId());
        writer.writeStringValue("compliancePolicyName", this.getCompliancePolicyName());
        writer.writeStringValue("compliancePolicyPlatform", this.getCompliancePolicyPlatform());
        writer.writeStringValue("compliancePolicyType", this.getCompliancePolicyType());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeLongValue("numberOfCompliantDevices", this.getNumberOfCompliantDevices());
        writer.writeLongValue("numberOfErrorDevices", this.getNumberOfErrorDevices());
        writer.writeLongValue("numberOfNonCompliantDevices", this.getNumberOfNonCompliantDevices());
        writer.writeOffsetDateTimeValue("policyModifiedDateTime", this.getPolicyModifiedDateTime());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the compliancePolicyId property value. Identifier for the device compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyId property.
     */
    public void setCompliancePolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("compliancePolicyId", value);
    }
    /**
     * Sets the compliancePolicyName property value. Name of the device compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyName property.
     */
    public void setCompliancePolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("compliancePolicyName", value);
    }
    /**
     * Sets the compliancePolicyPlatform property value. Platform for the device compliance policy. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, androidAOSP, all. Optional. Read-only.
     * @param value Value to set for the compliancePolicyPlatform property.
     */
    public void setCompliancePolicyPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("compliancePolicyPlatform", value);
    }
    /**
     * Sets the compliancePolicyType property value. The type of compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyType property.
     */
    public void setCompliancePolicyType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("compliancePolicyType", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the numberOfCompliantDevices property value. The number of devices that are in a compliant status. Optional. Read-only.
     * @param value Value to set for the numberOfCompliantDevices property.
     */
    public void setNumberOfCompliantDevices(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("numberOfCompliantDevices", value);
    }
    /**
     * Sets the numberOfErrorDevices property value. The number of devices that are in an error status. Optional. Read-only.
     * @param value Value to set for the numberOfErrorDevices property.
     */
    public void setNumberOfErrorDevices(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("numberOfErrorDevices", value);
    }
    /**
     * Sets the numberOfNonCompliantDevices property value. The number of device that are in a non-compliant status. Optional. Read-only.
     * @param value Value to set for the numberOfNonCompliantDevices property.
     */
    public void setNumberOfNonCompliantDevices(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("numberOfNonCompliantDevices", value);
    }
    /**
     * Sets the policyModifiedDateTime property value. The date and time the device policy was last modified. Optional. Read-only.
     * @param value Value to set for the policyModifiedDateTime property.
     */
    public void setPolicyModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("policyModifiedDateTime", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
