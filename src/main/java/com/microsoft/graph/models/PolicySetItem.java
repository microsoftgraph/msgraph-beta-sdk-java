package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceCompliancePolicyPolicySetItem;
import com.microsoft.graph.models.DeviceConfigurationPolicySetItem;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyPolicySetItem;
import com.microsoft.graph.models.DeviceManagementScriptPolicySetItem;
import com.microsoft.graph.models.EnrollmentRestrictionsConfigurationPolicySetItem;
import com.microsoft.graph.models.IosLobAppProvisioningConfigurationPolicySetItem;
import com.microsoft.graph.models.ManagedAppProtectionPolicySetItem;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationPolicySetItem;
import com.microsoft.graph.models.MdmWindowsInformationProtectionPolicyPolicySetItem;
import com.microsoft.graph.models.MobileAppPolicySetItem;
import com.microsoft.graph.models.TargetedManagedAppConfigurationPolicySetItem;
import com.microsoft.graph.models.Windows10EnrollmentCompletionPageConfigurationPolicySetItem;
import com.microsoft.graph.models.WindowsAutopilotDeploymentProfilePolicySetItem;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the properties used for PolicySet Item. */
public class PolicySetItem extends Entity implements Parsable {
    /** Creation time of the PolicySetItem. */
    private OffsetDateTime _createdDateTime;
    /** DisplayName of the PolicySetItem. */
    private String _displayName;
    /** The errorCode property */
    private ErrorCode _errorCode;
    /** Tags of the guided deployment */
    private java.util.List<String> _guidedDeploymentTags;
    /** policySetType of the PolicySetItem. */
    private String _itemType;
    /** Last modified time of the PolicySetItem. */
    private OffsetDateTime _lastModifiedDateTime;
    /** PayloadId of the PolicySetItem. */
    private String _payloadId;
    /** The enum to specify the status of PolicySet. */
    private PolicySetStatus _status;
    /**
     * Instantiates a new policySetItem and sets the default values.
     * @return a void
     */
    public PolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.policySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policySetItem
     */
    @javax.annotation.Nonnull
    public static PolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. DisplayName of the PolicySetItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a errorCode
     */
    @javax.annotation.Nullable
    public ErrorCode getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PolicySetItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getEnumValue(ErrorCode.class)); });
            this.put("guidedDeploymentTags", (n) -> { currentObject.setGuidedDeploymentTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("itemType", (n) -> { currentObject.setItemType(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("payloadId", (n) -> { currentObject.setPayloadId(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(PolicySetStatus.class)); });
        }};
    }
    /**
     * Gets the guidedDeploymentTags property value. Tags of the guided deployment
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGuidedDeploymentTags() {
        return this._guidedDeploymentTags;
    }
    /**
     * Gets the itemType property value. policySetType of the PolicySetItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemType() {
        return this._itemType;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the PolicySetItem.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the payloadId property value. PayloadId of the PolicySetItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadId() {
        return this._payloadId;
    }
    /**
     * Gets the status property value. The enum to specify the status of PolicySet.
     * @return a policySetStatus
     */
    @javax.annotation.Nullable
    public PolicySetStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. DisplayName of the PolicySetItem.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final ErrorCode value) {
        this._errorCode = value;
    }
    /**
     * Sets the guidedDeploymentTags property value. Tags of the guided deployment
     * @param value Value to set for the guidedDeploymentTags property.
     * @return a void
     */
    public void setGuidedDeploymentTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._guidedDeploymentTags = value;
    }
    /**
     * Sets the itemType property value. policySetType of the PolicySetItem.
     * @param value Value to set for the itemType property.
     * @return a void
     */
    public void setItemType(@javax.annotation.Nullable final String value) {
        this._itemType = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the PolicySetItem.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the payloadId property value. PayloadId of the PolicySetItem.
     * @param value Value to set for the payloadId property.
     * @return a void
     */
    public void setPayloadId(@javax.annotation.Nullable final String value) {
        this._payloadId = value;
    }
    /**
     * Sets the status property value. The enum to specify the status of PolicySet.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final PolicySetStatus value) {
        this._status = value;
    }
}
