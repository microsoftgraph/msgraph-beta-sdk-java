package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /** Intune application identifier. */
    private String _applicationId;
    /** The collection property of AppLogUploadRequest. */
    private java.util.List<AppLogCollectionRequest> _appLogCollectionRequests;
    /** Intune Mobile Application Troubleshooting History Item */
    private java.util.List<MobileAppTroubleshootingHistoryItem> _history;
    /** Device identifier created or collected by Intune. */
    private String _managedDeviceIdentifier;
    /** Identifier for the user that tried to enroll the device. */
    private String _userId;
    /**
     * Instantiates a new MobileAppTroubleshootingEvent and sets the default values.
     * @return a void
     */
    public MobileAppTroubleshootingEvent() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppTroubleshootingEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingEvent
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingEvent();
    }
    /**
     * Gets the applicationId property value. Intune application identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this._applicationId;
    }
    /**
     * Gets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @return a appLogCollectionRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AppLogCollectionRequest> getAppLogCollectionRequests() {
        return this._appLogCollectionRequests;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppTroubleshootingEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationId", (n) -> { currentObject.setApplicationId(n.getStringValue()); });
            this.put("appLogCollectionRequests", (n) -> { currentObject.setAppLogCollectionRequests(n.getCollectionOfObjectValues(AppLogCollectionRequest::createFromDiscriminatorValue)); });
            this.put("history", (n) -> { currentObject.setHistory(n.getCollectionOfObjectValues(MobileAppTroubleshootingHistoryItem::createFromDiscriminatorValue)); });
            this.put("managedDeviceIdentifier", (n) -> { currentObject.setManagedDeviceIdentifier(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the history property value. Intune Mobile Application Troubleshooting History Item
     * @return a mobileAppTroubleshootingHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingHistoryItem> getHistory() {
        return this._history;
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this._managedDeviceIdentifier;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeCollectionOfObjectValues("appLogCollectionRequests", this.getAppLogCollectionRequests());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeStringValue("managedDeviceIdentifier", this.getManagedDeviceIdentifier());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the applicationId property value. Intune application identifier.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this._applicationId = value;
    }
    /**
     * Sets the appLogCollectionRequests property value. The collection property of AppLogUploadRequest.
     * @param value Value to set for the appLogCollectionRequests property.
     * @return a void
     */
    public void setAppLogCollectionRequests(@javax.annotation.Nullable final java.util.List<AppLogCollectionRequest> value) {
        this._appLogCollectionRequests = value;
    }
    /**
     * Sets the history property value. Intune Mobile Application Troubleshooting History Item
     * @param value Value to set for the history property.
     * @return a void
     */
    public void setHistory(@javax.annotation.Nullable final java.util.List<MobileAppTroubleshootingHistoryItem> value) {
        this._history = value;
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     * @return a void
     */
    public void setManagedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this._managedDeviceIdentifier = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
