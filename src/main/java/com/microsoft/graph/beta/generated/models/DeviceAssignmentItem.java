package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the application or configuration included in the ChangeAssignments action execution or result. For action execution, it represents the application or configuration intended to be uninstalled or removed on the managed device. For action result, it represents the live reporting data for this application or configuration regarding its removal or restoration process.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAssignmentItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceAssignmentItem} and sets the default values.
     */
    public DeviceAssignmentItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceAssignmentItem}
     */
    @jakarta.annotation.Nonnull
    public static DeviceAssignmentItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAssignmentItem();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the assignmentItemActionIntent property value. A list of possible assignment item action intent values on the application or configuration when executing this action on the managed device. For example, if the application or configuration is intended to be removed on the managed device, then the intent value is remove, and if the application or configuration already under removal through previous actions and is now intended to be restored on the managed device, then the intent value is restore
     * @return a {@link DeviceAssignmentItemIntent}
     */
    @jakarta.annotation.Nullable
    public DeviceAssignmentItemIntent getAssignmentItemActionIntent() {
        return this.backingStore.get("assignmentItemActionIntent");
    }
    /**
     * Gets the assignmentItemActionStatus property value. A list of possible assignment item action status values for the application or configuration regarding their executed action on the managed device. For example, a configuration included in the deviceAssignmentItems list has just been executed the action. Its status starts with inProgress until it&apos;s successfully removed to reflect as removed status or failed to be removed to reflect as error status on the managed device. Similar status change happens for restoration process
     * @return a {@link DeviceAssignmentItemStatus}
     */
    @jakarta.annotation.Nullable
    public DeviceAssignmentItemStatus getAssignmentItemActionStatus() {
        return this.backingStore.get("assignmentItemActionStatus");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the errorCode property value. The error code for the application or configuration regarding the failed executed action on the managed device. Read-Only. Returned in the action result. 0 is default value and indicates no failure. Valid values -9.22337203685478E+18 to 9.22337203685478E+18. This property is read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("assignmentItemActionIntent", (n) -> { this.setAssignmentItemActionIntent(n.getEnumValue(DeviceAssignmentItemIntent::forValue)); });
        deserializerMap.put("assignmentItemActionStatus", (n) -> { this.setAssignmentItemActionStatus(n.getEnumValue(DeviceAssignmentItemStatus::forValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getLongValue()); });
        deserializerMap.put("intentActionMessage", (n) -> { this.setIntentActionMessage(n.getStringValue()); });
        deserializerMap.put("itemDisplayName", (n) -> { this.setItemDisplayName(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("itemSubTypeDisplayName", (n) -> { this.setItemSubTypeDisplayName(n.getStringValue()); });
        deserializerMap.put("itemType", (n) -> { this.setItemType(n.getEnumValue(DeviceAssignmentItemType::forValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intentActionMessage property value. The intent action message for the application or configuration regarding the executed action on the managed device. When the action is on error, this property provides message on the reason of failure. When the action is in progress, this property provides message on what&apos;s being processed on the device. Read-Only. Returned in the action result. Can be null. Max length is 1500. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIntentActionMessage() {
        return this.backingStore.get("intentActionMessage");
    }
    /**
     * Gets the itemDisplayName property value. The item displayName name for the application or configuration. Read-Only. Returned in the action result. Default value is null. The property value cannot be modified and is automatically populated with the action result. Max length is 200. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemDisplayName() {
        return this.backingStore.get("itemDisplayName");
    }
    /**
     * Gets the itemId property value. The unique identifier for the application or configuration. ItemId is required property which needs to be set in the action POST request parameter for the DeviceAssignmentItem intended to remove. Max length is 40
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.backingStore.get("itemId");
    }
    /**
     * Gets the itemSubTypeDisplayName property value. Indicates the specific type for the application or configuration. For example, unknown, application, appConfiguration, exploitProtection, bitLocker, deviceControl, microsoftEdgeBaseline, attackSurfaceReductionRulesConfigMgr, endpointDetectionandResponse, windowsUpdateforBusiness, microsoftDefenderFirewallRules, applicationControl, microsoftDefenderAntivirusexclusions, microsoftDefenderAntivirus, wiredNetwork, derivedPersonalIdentityVerificationCredential, windowsHealthMonitoring, extensions, mxProfileZebraOnly, deviceFirmwareConfigurationInterface, deliveryOptimization, identityProtection, kiosk, overrideGroupPolicy, domainJoinPreview, pkcsImportedCertificate, networkBoundary, endpointProtection, microsoftDefenderAtpWindows10Desktop, sharedMultiUserDevice, deviceFeatures, secureAssessmentEducation, wiFiImport, editionUpgradeAndModeSwitch, vpn, custom, softwareUpdates, deviceRestrictionsWindows10Team, email, trustedCertificate, scepCertificate, emailSamsungKnoxOnly, pkcsCertificate, deviceRestrictions, wiFi, settingsCatalog. Read-Only. Returned in the action result. Default value is null. The property value cannot be modified and is automatically populated with the action result. Max length is 200. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemSubTypeDisplayName() {
        return this.backingStore.get("itemSubTypeDisplayName");
    }
    /**
     * Gets the itemType property value. A list of possible device assignment item types to execute this action on the managed device. Device assignment item represents existing assigned Intune resource such as application or configuration. Currently supported device assignment item types are Application, DeviceConfiguration, DeviceManagementConfigurationPolicy and MobileAppConfiguration
     * @return a {@link DeviceAssignmentItemType}
     */
    @jakarta.annotation.Nullable
    public DeviceAssignmentItemType getItemType() {
        return this.backingStore.get("itemType");
    }
    /**
     * Gets the lastActionDateTime property value. The date and time when the application or configuration was initiated an action execution. Read-Only. Returned in the action result. The property value cannot be modified and is automatically populated when the action is initiated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2025 would look like this: &apos;2025-01-01T00:00:00Z&apos;. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the application or configuration was last modified because of either action execution or status change. Read-Only. Returned in the action result. The property value cannot be modified and is automatically populated when the action is initiated or the device has a status change. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2025 would look like this: &apos;2025-01-01T00:00:00Z&apos;. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentItemActionIntent", this.getAssignmentItemActionIntent());
        writer.writeEnumValue("assignmentItemActionStatus", this.getAssignmentItemActionStatus());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeEnumValue("itemType", this.getItemType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the assignmentItemActionIntent property value. A list of possible assignment item action intent values on the application or configuration when executing this action on the managed device. For example, if the application or configuration is intended to be removed on the managed device, then the intent value is remove, and if the application or configuration already under removal through previous actions and is now intended to be restored on the managed device, then the intent value is restore
     * @param value Value to set for the assignmentItemActionIntent property.
     */
    public void setAssignmentItemActionIntent(@jakarta.annotation.Nullable final DeviceAssignmentItemIntent value) {
        this.backingStore.set("assignmentItemActionIntent", value);
    }
    /**
     * Sets the assignmentItemActionStatus property value. A list of possible assignment item action status values for the application or configuration regarding their executed action on the managed device. For example, a configuration included in the deviceAssignmentItems list has just been executed the action. Its status starts with inProgress until it&apos;s successfully removed to reflect as removed status or failed to be removed to reflect as error status on the managed device. Similar status change happens for restoration process
     * @param value Value to set for the assignmentItemActionStatus property.
     */
    public void setAssignmentItemActionStatus(@jakarta.annotation.Nullable final DeviceAssignmentItemStatus value) {
        this.backingStore.set("assignmentItemActionStatus", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the errorCode property value. The error code for the application or configuration regarding the failed executed action on the managed device. Read-Only. Returned in the action result. 0 is default value and indicates no failure. Valid values -9.22337203685478E+18 to 9.22337203685478E+18. This property is read-only.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the intentActionMessage property value. The intent action message for the application or configuration regarding the executed action on the managed device. When the action is on error, this property provides message on the reason of failure. When the action is in progress, this property provides message on what&apos;s being processed on the device. Read-Only. Returned in the action result. Can be null. Max length is 1500. This property is read-only.
     * @param value Value to set for the intentActionMessage property.
     */
    public void setIntentActionMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("intentActionMessage", value);
    }
    /**
     * Sets the itemDisplayName property value. The item displayName name for the application or configuration. Read-Only. Returned in the action result. Default value is null. The property value cannot be modified and is automatically populated with the action result. Max length is 200. This property is read-only.
     * @param value Value to set for the itemDisplayName property.
     */
    public void setItemDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemDisplayName", value);
    }
    /**
     * Sets the itemId property value. The unique identifier for the application or configuration. ItemId is required property which needs to be set in the action POST request parameter for the DeviceAssignmentItem intended to remove. Max length is 40
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemId", value);
    }
    /**
     * Sets the itemSubTypeDisplayName property value. Indicates the specific type for the application or configuration. For example, unknown, application, appConfiguration, exploitProtection, bitLocker, deviceControl, microsoftEdgeBaseline, attackSurfaceReductionRulesConfigMgr, endpointDetectionandResponse, windowsUpdateforBusiness, microsoftDefenderFirewallRules, applicationControl, microsoftDefenderAntivirusexclusions, microsoftDefenderAntivirus, wiredNetwork, derivedPersonalIdentityVerificationCredential, windowsHealthMonitoring, extensions, mxProfileZebraOnly, deviceFirmwareConfigurationInterface, deliveryOptimization, identityProtection, kiosk, overrideGroupPolicy, domainJoinPreview, pkcsImportedCertificate, networkBoundary, endpointProtection, microsoftDefenderAtpWindows10Desktop, sharedMultiUserDevice, deviceFeatures, secureAssessmentEducation, wiFiImport, editionUpgradeAndModeSwitch, vpn, custom, softwareUpdates, deviceRestrictionsWindows10Team, email, trustedCertificate, scepCertificate, emailSamsungKnoxOnly, pkcsCertificate, deviceRestrictions, wiFi, settingsCatalog. Read-Only. Returned in the action result. Default value is null. The property value cannot be modified and is automatically populated with the action result. Max length is 200. This property is read-only.
     * @param value Value to set for the itemSubTypeDisplayName property.
     */
    public void setItemSubTypeDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemSubTypeDisplayName", value);
    }
    /**
     * Sets the itemType property value. A list of possible device assignment item types to execute this action on the managed device. Device assignment item represents existing assigned Intune resource such as application or configuration. Currently supported device assignment item types are Application, DeviceConfiguration, DeviceManagementConfigurationPolicy and MobileAppConfiguration
     * @param value Value to set for the itemType property.
     */
    public void setItemType(@jakarta.annotation.Nullable final DeviceAssignmentItemType value) {
        this.backingStore.set("itemType", value);
    }
    /**
     * Sets the lastActionDateTime property value. The date and time when the application or configuration was initiated an action execution. Read-Only. Returned in the action result. The property value cannot be modified and is automatically populated when the action is initiated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2025 would look like this: &apos;2025-01-01T00:00:00Z&apos;. This property is read-only.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the application or configuration was last modified because of either action execution or status change. Read-Only. Returned in the action result. The property value cannot be modified and is automatically populated when the action is initiated or the device has a status change. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2025 would look like this: &apos;2025-01-01T00:00:00Z&apos;. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
