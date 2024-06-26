package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing a users device application install status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /**
     * Instantiates a new {@link MobileAppTroubleshootingEvent} and sets the default values.
     */
    public MobileAppTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppTroubleshootingEvent}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingEvent();
    }
    /**
     * Gets the applicationId property value. Intune application identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
    }
    /**
     * Gets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @return a {@link java.util.List<AppLogCollectionRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppLogCollectionRequest> getAppLogCollectionRequests() {
        return this.backingStore.get("appLogCollectionRequests");
    }
    /**
     * Gets the deviceId property value. Device identifier created or collected by Intune.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("appLogCollectionRequests", (n) -> { this.setAppLogCollectionRequests(n.getCollectionOfObjectValues(AppLogCollectionRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(MobileAppTroubleshootingHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceIdentifier", (n) -> { this.setManagedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Intune Mobile Application Troubleshooting History Item
     * @return a {@link java.util.List<MobileAppTroubleshootingHistoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingHistoryItem> getHistory() {
        return this.backingStore.get("history");
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.backingStore.get("managedDeviceIdentifier");
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeCollectionOfObjectValues("appLogCollectionRequests", this.getAppLogCollectionRequests());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeStringValue("managedDeviceIdentifier", this.getManagedDeviceIdentifier());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the applicationId property value. Intune application identifier.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
    }
    /**
     * Sets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @param value Value to set for the appLogCollectionRequests property.
     */
    public void setAppLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<AppLogCollectionRequest> value) {
        this.backingStore.set("appLogCollectionRequests", value);
    }
    /**
     * Sets the deviceId property value. Device identifier created or collected by Intune.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the history property value. Intune Mobile Application Troubleshooting History Item
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<MobileAppTroubleshootingHistoryItem> value) {
        this.backingStore.set("history", value);
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     */
    public void setManagedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceIdentifier", value);
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
