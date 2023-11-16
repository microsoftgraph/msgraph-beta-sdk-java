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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceTimelineEvent extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceTimelineEvent and sets the default values.
     */
    public UserExperienceAnalyticsDeviceTimelineEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceTimelineEvent
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceTimelineEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceTimelineEvent();
    }
    /**
     * Gets the deviceId property value. The id of the device where the event occurred.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the eventDateTime property value. The time the event occured.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * Gets the eventDetails property value. The details provided by the event, format depends on event type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEventDetails() {
        return this.backingStore.get("eventDetails");
    }
    /**
     * Gets the eventLevel property value. Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
     * @return a DeviceEventLevel
     */
    @jakarta.annotation.Nullable
    public DeviceEventLevel getEventLevel() {
        return this.backingStore.get("eventLevel");
    }
    /**
     * Gets the eventName property value. The name of the event. Examples include: BootEvent, LogonEvent, AppCrashEvent, AppHangEvent.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEventName() {
        return this.backingStore.get("eventName");
    }
    /**
     * Gets the eventSource property value. The source of the event. Examples include: Intune, Sccm.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEventSource() {
        return this.backingStore.get("eventSource");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the eventDateTime property value. The time the event occured.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the eventDetails property value. The details provided by the event, format depends on event type.
     * @param value Value to set for the eventDetails property.
     */
    public void setEventDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventDetails", value);
    }
    /**
     * Sets the eventLevel property value. Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
     * @param value Value to set for the eventLevel property.
     */
    public void setEventLevel(@jakarta.annotation.Nullable final DeviceEventLevel value) {
        this.backingStore.set("eventLevel", value);
    }
    /**
     * Sets the eventName property value. The name of the event. Examples include: BootEvent, LogonEvent, AppCrashEvent, AppHangEvent.
     * @param value Value to set for the eventName property.
     */
    public void setEventName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventName", value);
    }
    /**
     * Sets the eventSource property value. The source of the event. Examples include: Intune, Sccm.
     * @param value Value to set for the eventSource property.
     */
    public void setEventSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventSource", value);
    }
}
