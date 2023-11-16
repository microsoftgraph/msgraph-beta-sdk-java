package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for PolicySet Item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicySetItem extends Entity implements Parsable {
    /**
     * Instantiates a new PolicySetItem and sets the default values.
     */
    public PolicySetItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicySetItem
     */
    @jakarta.annotation.Nonnull
    public static PolicySetItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceCompliancePolicyPolicySetItem": return new DeviceCompliancePolicyPolicySetItem();
                case "#microsoft.graph.deviceConfigurationPolicySetItem": return new DeviceConfigurationPolicySetItem();
                case "#microsoft.graph.deviceManagementConfigurationPolicyPolicySetItem": return new DeviceManagementConfigurationPolicyPolicySetItem();
                case "#microsoft.graph.deviceManagementScriptPolicySetItem": return new DeviceManagementScriptPolicySetItem();
                case "#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem": return new EnrollmentRestrictionsConfigurationPolicySetItem();
                case "#microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem": return new IosLobAppProvisioningConfigurationPolicySetItem();
                case "#microsoft.graph.managedAppProtectionPolicySetItem": return new ManagedAppProtectionPolicySetItem();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationPolicySetItem": return new ManagedDeviceMobileAppConfigurationPolicySetItem();
                case "#microsoft.graph.mdmWindowsInformationProtectionPolicyPolicySetItem": return new MdmWindowsInformationProtectionPolicyPolicySetItem();
                case "#microsoft.graph.mobileAppPolicySetItem": return new MobileAppPolicySetItem();
                case "#microsoft.graph.targetedManagedAppConfigurationPolicySetItem": return new TargetedManagedAppConfigurationPolicySetItem();
                case "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem": return new Windows10EnrollmentCompletionPageConfigurationPolicySetItem();
                case "#microsoft.graph.windowsAutopilotDeploymentProfilePolicySetItem": return new WindowsAutopilotDeploymentProfilePolicySetItem();
            }
        }
        return new PolicySetItem();
    }
    /**
     * Gets the createdDateTime property value. Creation time of the PolicySetItem.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. DisplayName of the PolicySetItem.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a ErrorCode
     */
    @jakarta.annotation.Nullable
    public ErrorCode getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(ErrorCode.class)); });
        deserializerMap.put("guidedDeploymentTags", (n) -> { this.setGuidedDeploymentTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("itemType", (n) -> { this.setItemType(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PolicySetStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the guidedDeploymentTags property value. Tags of the guided deployment
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGuidedDeploymentTags() {
        return this.backingStore.get("guidedDeploymentTags");
    }
    /**
     * Gets the itemType property value. policySetType of the PolicySetItem.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getItemType() {
        return this.backingStore.get("itemType");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the PolicySetItem.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the payloadId property value. PayloadId of the PolicySetItem.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.backingStore.get("payloadId");
    }
    /**
     * Gets the status property value. The enum to specify the status of PolicySet.
     * @return a PolicySetStatus
     */
    @jakarta.annotation.Nullable
    public PolicySetStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeCollectionOfPrimitiveValues("guidedDeploymentTags", this.getGuidedDeploymentTags());
        writer.writeStringValue("itemType", this.getItemType());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. Creation time of the PolicySetItem.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. DisplayName of the PolicySetItem.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final ErrorCode value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the guidedDeploymentTags property value. Tags of the guided deployment
     * @param value Value to set for the guidedDeploymentTags property.
     */
    public void setGuidedDeploymentTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("guidedDeploymentTags", value);
    }
    /**
     * Sets the itemType property value. policySetType of the PolicySetItem.
     * @param value Value to set for the itemType property.
     */
    public void setItemType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemType", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the PolicySetItem.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the payloadId property value. PayloadId of the PolicySetItem.
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadId", value);
    }
    /**
     * Sets the status property value. The enum to specify the status of PolicySet.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PolicySetStatus value) {
        this.backingStore.set("status", value);
    }
}
