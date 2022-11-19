package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics device performance entity contains device performance details. */
public class UserExperienceAnalyticsAppHealthDevicePerformanceDetails extends Entity implements Parsable {
    /** The friendly name of the application for which the event occurred. */
    private String _appDisplayName;
    /** The publisher of the application. */
    private String _appPublisher;
    /** The version of the application. */
    private String _appVersion;
    /** The name of the device. */
    private String _deviceDisplayName;
    /** The id of the device. */
    private String _deviceId;
    /** The time the event occurred. */
    private OffsetDateTime _eventDateTime;
    /** The type of the event. */
    private String _eventType;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthDevicePerformanceDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthDevicePerformanceDetails
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDevicePerformanceDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDevicePerformanceDetails();
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application for which the event occurred.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appPublisher property value. The publisher of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this._appPublisher;
    }
    /**
     * Gets the appVersion property value. The version of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppVersion() {
        return this._appVersion;
    }
    /**
     * Gets the deviceDisplayName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the eventDateTime property value. The time the event occurred.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * Gets the eventType property value. The type of the event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventType() {
        return this._eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthDevicePerformanceDetails currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { currentObject.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appVersion", (n) -> { currentObject.setAppVersion(n.getStringValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventType", (n) -> { currentObject.setEventType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventType", this.getEventType());
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application for which the event occurred.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appPublisher property value. The publisher of the application.
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this._appPublisher = value;
    }
    /**
     * Sets the appVersion property value. The version of the application.
     * @param value Value to set for the appVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppVersion(@javax.annotation.Nullable final String value) {
        this._appVersion = value;
    }
    /**
     * Sets the deviceDisplayName property value. The name of the device.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the eventDateTime property value. The time the event occurred.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the eventType property value. The type of the event.
     * @param value Value to set for the eventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventType(@javax.annotation.Nullable final String value) {
        this._eventType = value;
    }
}
