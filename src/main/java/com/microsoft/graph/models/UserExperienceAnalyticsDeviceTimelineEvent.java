package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device event entity contains NRT device event details.
 */
public class UserExperienceAnalyticsDeviceTimelineEvent extends Entity implements Parsable {
    /**
     * The id of the device where the event occurred.
     */
    private String deviceId;
    /**
     * The time the event occured.
     */
    private OffsetDateTime eventDateTime;
    /**
     * The details provided by the event, format depends on event type.
     */
    private String eventDetails;
    /**
     * Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
     */
    private DeviceEventLevel eventLevel;
    /**
     * The name of the event. Examples include: BootEvent, LogonEvent, AppCrashEvent, AppHangEvent.
     */
    private String eventName;
    /**
     * The source of the event. Examples include: Intune, Sccm.
     */
    private String eventSource;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceTimelineEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceTimelineEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceTimelineEvent
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceTimelineEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceTimelineEvent();
    }
    /**
     * Gets the deviceId property value. The id of the device where the event occurred.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the eventDateTime property value. The time the event occured.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * Gets the eventDetails property value. The details provided by the event, format depends on event type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventDetails() {
        return this.eventDetails;
    }
    /**
     * Gets the eventLevel property value. Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
     * @return a deviceEventLevel
     */
    @javax.annotation.Nullable
    public DeviceEventLevel getEventLevel() {
        return this.eventLevel;
    }
    /**
     * Gets the eventName property value. The name of the event. Examples include: BootEvent, LogonEvent, AppCrashEvent, AppHangEvent.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this.eventName;
    }
    /**
     * Gets the eventSource property value. The source of the event. Examples include: Intune, Sccm.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventSource() {
        return this.eventSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventDetails", (n) -> { this.setEventDetails(n.getStringValue()); });
        deserializerMap.put("eventLevel", (n) -> { this.setEventLevel(n.getEnumValue(DeviceEventLevel.class)); });
        deserializerMap.put("eventName", (n) -> { this.setEventName(n.getStringValue()); });
        deserializerMap.put("eventSource", (n) -> { this.setEventSource(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventDetails", this.getEventDetails());
        writer.writeEnumValue("eventLevel", this.getEventLevel());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeStringValue("eventSource", this.getEventSource());
    }
    /**
     * Sets the deviceId property value. The id of the device where the event occurred.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the eventDateTime property value. The time the event occured.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the eventDetails property value. The details provided by the event, format depends on event type.
     * @param value Value to set for the eventDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDetails(@javax.annotation.Nullable final String value) {
        this.eventDetails = value;
    }
    /**
     * Sets the eventLevel property value. Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
     * @param value Value to set for the eventLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventLevel(@javax.annotation.Nullable final DeviceEventLevel value) {
        this.eventLevel = value;
    }
    /**
     * Sets the eventName property value. The name of the event. Examples include: BootEvent, LogonEvent, AppCrashEvent, AppHangEvent.
     * @param value Value to set for the eventName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventName(@javax.annotation.Nullable final String value) {
        this.eventName = value;
    }
    /**
     * Sets the eventSource property value. The source of the event. Examples include: Intune, Sccm.
     * @param value Value to set for the eventSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventSource(@javax.annotation.Nullable final String value) {
        this.eventSource = value;
    }
}
