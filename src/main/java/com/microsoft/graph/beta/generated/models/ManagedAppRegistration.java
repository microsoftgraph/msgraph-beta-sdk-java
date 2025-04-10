package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The ManagedAppEntity is the base entity type for all other entity types under app management workflow.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppRegistration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedAppRegistration} and sets the default values.
     */
    public ManagedAppRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppRegistration}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedAppRegistration": return new AndroidManagedAppRegistration();
                case "#microsoft.graph.iosManagedAppRegistration": return new IosManagedAppRegistration();
                case "#microsoft.graph.windowsManagedAppRegistration": return new WindowsManagedAppRegistration();
            }
        }
        return new ManagedAppRegistration();
    }
    /**
     * Gets the appIdentifier property value. The app package Identifier
     * @return a {@link MobileAppIdentifier}
     */
    @jakarta.annotation.Nullable
    public MobileAppIdentifier getAppIdentifier() {
        return this.backingStore.get("appIdentifier");
    }
    /**
     * Gets the applicationVersion property value. App version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationVersion() {
        return this.backingStore.get("applicationVersion");
    }
    /**
     * Gets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @return a {@link java.util.List<ManagedAppPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getAppliedPolicies() {
        return this.backingStore.get("appliedPolicies");
    }
    /**
     * Gets the azureADDeviceId property value. The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureADDeviceId() {
        return this.backingStore.get("azureADDeviceId");
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deviceManufacturer property value. The device manufacturer for the current app registration
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.backingStore.get("deviceManufacturer");
    }
    /**
     * Gets the deviceModel property value. The device model for the current app registration
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * Gets the deviceName property value. Host device name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceTag() {
        return this.backingStore.get("deviceTag");
    }
    /**
     * Gets the deviceType property value. Host device type
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdentifier", (n) -> { this.setAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("applicationVersion", (n) -> { this.setApplicationVersion(n.getStringValue()); });
        deserializerMap.put("appliedPolicies", (n) -> { this.setAppliedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("azureADDeviceId", (n) -> { this.setAzureADDeviceId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { this.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("flaggedReasons", (n) -> { this.setFlaggedReasons(n.getCollectionOfEnumValues(ManagedAppFlaggedReason::forValue)); });
        deserializerMap.put("intendedPolicies", (n) -> { this.setIntendedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedAppLogCollectionRequests", (n) -> { this.setManagedAppLogCollectionRequests(n.getCollectionOfObjectValues(ManagedAppLogCollectionRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managementSdkVersion", (n) -> { this.setManagementSdkVersion(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ManagedAppOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("platformVersion", (n) -> { this.setPlatformVersion(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @return a {@link java.util.List<ManagedAppFlaggedReason>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppFlaggedReason> getFlaggedReasons() {
        return this.backingStore.get("flaggedReasons");
    }
    /**
     * Gets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @return a {@link java.util.List<ManagedAppPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getIntendedPolicies() {
        return this.backingStore.get("intendedPolicies");
    }
    /**
     * Gets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the managedAppLogCollectionRequests property value. Zero or more log collection requests triggered for the app.
     * @return a {@link java.util.List<ManagedAppLogCollectionRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppLogCollectionRequest> getManagedAppLogCollectionRequests() {
        return this.backingStore.get("managedAppLogCollectionRequests");
    }
    /**
     * Gets the managedDeviceId property value. The Managed Device identifier of the host device. Value could be empty even when the host device is managed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the managementSdkVersion property value. App management SDK version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementSdkVersion() {
        return this.backingStore.get("managementSdkVersion");
    }
    /**
     * Gets the operations property value. Zero or more long running operations triggered on the app registration.
     * @return a {@link java.util.List<ManagedAppOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the platformVersion property value. Operating System version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatformVersion() {
        return this.backingStore.get("platformVersion");
    }
    /**
     * Gets the userId property value. The user Id to who this app registration belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appIdentifier", this.getAppIdentifier());
        writer.writeStringValue("applicationVersion", this.getApplicationVersion());
        writer.writeCollectionOfObjectValues("appliedPolicies", this.getAppliedPolicies());
        writer.writeStringValue("azureADDeviceId", this.getAzureADDeviceId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeCollectionOfEnumValues("flaggedReasons", this.getFlaggedReasons());
        writer.writeCollectionOfObjectValues("intendedPolicies", this.getIntendedPolicies());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeCollectionOfObjectValues("managedAppLogCollectionRequests", this.getManagedAppLogCollectionRequests());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managementSdkVersion", this.getManagementSdkVersion());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeStringValue("platformVersion", this.getPlatformVersion());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the appIdentifier property value. The app package Identifier
     * @param value Value to set for the appIdentifier property.
     */
    public void setAppIdentifier(@jakarta.annotation.Nullable final MobileAppIdentifier value) {
        this.backingStore.set("appIdentifier", value);
    }
    /**
     * Sets the applicationVersion property value. App version
     * @param value Value to set for the applicationVersion property.
     */
    public void setApplicationVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationVersion", value);
    }
    /**
     * Sets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @param value Value to set for the appliedPolicies property.
     */
    public void setAppliedPolicies(@jakarta.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.backingStore.set("appliedPolicies", value);
    }
    /**
     * Sets the azureADDeviceId property value. The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered.
     * @param value Value to set for the azureADDeviceId property.
     */
    public void setAzureADDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureADDeviceId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deviceManufacturer property value. The device manufacturer for the current app registration
     * @param value Value to set for the deviceManufacturer property.
     */
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceManufacturer", value);
    }
    /**
     * Sets the deviceModel property value. The device model for the current app registration
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the deviceName property value. Host device name
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @param value Value to set for the deviceTag property.
     */
    public void setDeviceTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceTag", value);
    }
    /**
     * Sets the deviceType property value. Host device type
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @param value Value to set for the flaggedReasons property.
     */
    public void setFlaggedReasons(@jakarta.annotation.Nullable final java.util.List<ManagedAppFlaggedReason> value) {
        this.backingStore.set("flaggedReasons", value);
    }
    /**
     * Sets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @param value Value to set for the intendedPolicies property.
     */
    public void setIntendedPolicies(@jakarta.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.backingStore.set("intendedPolicies", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the managedAppLogCollectionRequests property value. Zero or more log collection requests triggered for the app.
     * @param value Value to set for the managedAppLogCollectionRequests property.
     */
    public void setManagedAppLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<ManagedAppLogCollectionRequest> value) {
        this.backingStore.set("managedAppLogCollectionRequests", value);
    }
    /**
     * Sets the managedDeviceId property value. The Managed Device identifier of the host device. Value could be empty even when the host device is managed.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managementSdkVersion property value. App management SDK version
     * @param value Value to set for the managementSdkVersion property.
     */
    public void setManagementSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementSdkVersion", value);
    }
    /**
     * Sets the operations property value. Zero or more long running operations triggered on the app registration.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<ManagedAppOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the platformVersion property value. Operating System version
     * @param value Value to set for the platformVersion property.
     */
    public void setPlatformVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("platformVersion", value);
    }
    /**
     * Sets the userId property value. The user Id to who this app registration belongs.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
