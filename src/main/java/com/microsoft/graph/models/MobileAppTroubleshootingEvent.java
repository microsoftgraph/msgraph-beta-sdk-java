package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing a users device application install status.
 */
public class MobileAppTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /**
     * Intune application identifier.
     */
    private String applicationId;
    /**
     * The collection property of AppLogUploadRequest.
     */
    private java.util.List<AppLogCollectionRequest> appLogCollectionRequests;
    /**
     * Device identifier created or collected by Intune.
     */
    private String deviceId;
    /**
     * Intune Mobile Application Troubleshooting History Item
     */
    private java.util.List<MobileAppTroubleshootingHistoryItem> history;
    /**
     * Device identifier created or collected by Intune.
     */
    private String managedDeviceIdentifier;
    /**
     * Identifier for the user that tried to enroll the device.
     */
    private String userId;
    /**
     * Instantiates a new mobileAppTroubleshootingEvent and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MobileAppTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppTroubleshootingEvent
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingEvent();
    }
    /**
     * Gets the applicationId property value. Intune application identifier.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @return a appLogCollectionRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppLogCollectionRequest> getAppLogCollectionRequests() {
        return this.appLogCollectionRequests;
    }
    /**
     * Gets the deviceId property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a mobileAppTroubleshootingHistoryItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingHistoryItem> getHistory() {
        return this.history;
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.managedDeviceIdentifier;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.applicationId = value;
    }
    /**
     * Sets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @param value Value to set for the appLogCollectionRequests property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<AppLogCollectionRequest> value) {
        this.appLogCollectionRequests = value;
    }
    /**
     * Sets the deviceId property value. Device identifier created or collected by Intune.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the history property value. Intune Mobile Application Troubleshooting History Item
     * @param value Value to set for the history property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<MobileAppTroubleshootingHistoryItem> value) {
        this.history = value;
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceIdentifier = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
