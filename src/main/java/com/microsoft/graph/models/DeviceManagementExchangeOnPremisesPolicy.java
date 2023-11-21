package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Singleton entity which represents the Exchange OnPremises policy configured for a tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementExchangeOnPremisesPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementExchangeOnPremisesPolicy and sets the default values.
     */
    public DeviceManagementExchangeOnPremisesPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementExchangeOnPremisesPolicy
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementExchangeOnPremisesPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeOnPremisesPolicy();
    }
    /**
     * Gets the accessRules property value. The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization
     * @return a java.util.List<DeviceManagementExchangeAccessRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExchangeAccessRule> getAccessRules() {
        return this.backingStore.get("accessRules");
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a OnPremisesConditionalAccessSettings
     */
    @jakarta.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this.backingStore.get("conditionalAccessSettings");
    }
    /**
     * Gets the defaultAccessLevel property value. Access Level in Exchange.
     * @return a DeviceManagementExchangeAccessLevel
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessLevel getDefaultAccessLevel() {
        return this.backingStore.get("defaultAccessLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessRules", (n) -> { this.setAccessRules(n.getCollectionOfObjectValues(DeviceManagementExchangeAccessRule::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessSettings", (n) -> { this.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultAccessLevel", (n) -> { this.setDefaultAccessLevel(n.getEnumValue(DeviceManagementExchangeAccessLevel.class)); });
        deserializerMap.put("knownDeviceClasses", (n) -> { this.setKnownDeviceClasses(n.getCollectionOfObjectValues(DeviceManagementExchangeDeviceClass::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationContent", (n) -> { this.setNotificationContent(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the knownDeviceClasses property value. The list of device classes known to Exchange
     * @return a java.util.List<DeviceManagementExchangeDeviceClass>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExchangeDeviceClass> getKnownDeviceClasses() {
        return this.backingStore.get("knownDeviceClasses");
    }
    /**
     * Gets the notificationContent property value. Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getNotificationContent() {
        return this.backingStore.get("notificationContent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessRules", this.getAccessRules());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeEnumValue("defaultAccessLevel", this.getDefaultAccessLevel());
        writer.writeCollectionOfObjectValues("knownDeviceClasses", this.getKnownDeviceClasses());
        writer.writeByteArrayValue("notificationContent", this.getNotificationContent());
    }
    /**
     * Sets the accessRules property value. The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization
     * @param value Value to set for the accessRules property.
     */
    public void setAccessRules(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExchangeAccessRule> value) {
        this.backingStore.set("accessRules", value);
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     */
    public void setConditionalAccessSettings(@jakarta.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this.backingStore.set("conditionalAccessSettings", value);
    }
    /**
     * Sets the defaultAccessLevel property value. Access Level in Exchange.
     * @param value Value to set for the defaultAccessLevel property.
     */
    public void setDefaultAccessLevel(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessLevel value) {
        this.backingStore.set("defaultAccessLevel", value);
    }
    /**
     * Sets the knownDeviceClasses property value. The list of device classes known to Exchange
     * @param value Value to set for the knownDeviceClasses property.
     */
    public void setKnownDeviceClasses(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExchangeDeviceClass> value) {
        this.backingStore.set("knownDeviceClasses", value);
    }
    /**
     * Sets the notificationContent property value. Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.
     * @param value Value to set for the notificationContent property.
     */
    public void setNotificationContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("notificationContent", value);
    }
}
