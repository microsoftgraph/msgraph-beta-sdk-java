package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Notification extends Entity implements Parsable {
    /**
     * Instantiates a new Notification and sets the default values.
     */
    public Notification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Notification
     */
    @jakarta.annotation.Nonnull
    public static Notification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Notification();
    }
    /**
     * Gets the displayTimeToLive property value. Sets how long (in seconds) this notification content stays in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification stays in the user's Windows Action Center.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDisplayTimeToLive() {
        return this.backingStore.get("displayTimeToLive");
    }
    /**
     * Gets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayTimeToLive", (n) -> { this.setDisplayTimeToLive(n.getIntegerValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(PayloadTypes::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(NotificationPriority::forValue)); });
        deserializerMap.put("targetHostName", (n) -> { this.setTargetHostName(n.getStringValue()); });
        deserializerMap.put("targetPolicy", (n) -> { this.setTargetPolicy(n.getObjectValue(TargetPolicyEndpoints::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for grouping notifications together.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.backingStore.get("groupName");
    }
    /**
     * Gets the payload property value. The payload property
     * @return a PayloadTypes
     */
    @jakarta.annotation.Nullable
    public PayloadTypes getPayload() {
        return this.backingStore.get("payload");
    }
    /**
     * Gets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @return a NotificationPriority
     */
    @jakarta.annotation.Nullable
    public NotificationPriority getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetHostName() {
        return this.backingStore.get("targetHostName");
    }
    /**
     * Gets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @return a TargetPolicyEndpoints
     */
    @jakarta.annotation.Nullable
    public TargetPolicyEndpoints getTargetPolicy() {
        return this.backingStore.get("targetPolicy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("displayTimeToLive", this.getDisplayTimeToLive());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("groupName", this.getGroupName());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeStringValue("targetHostName", this.getTargetHostName());
        writer.writeObjectValue("targetPolicy", this.getTargetPolicy());
    }
    /**
     * Sets the displayTimeToLive property value. Sets how long (in seconds) this notification content stays in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification stays in the user's Windows Action Center.
     * @param value Value to set for the displayTimeToLive property.
     */
    public void setDisplayTimeToLive(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("displayTimeToLive", value);
    }
    /**
     * Sets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for grouping notifications together.
     * @param value Value to set for the groupName property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupName", value);
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final PayloadTypes value) {
        this.backingStore.set("payload", value);
    }
    /**
     * Sets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final NotificationPriority value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @param value Value to set for the targetHostName property.
     */
    public void setTargetHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetHostName", value);
    }
    /**
     * Sets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @param value Value to set for the targetPolicy property.
     */
    public void setTargetPolicy(@jakarta.annotation.Nullable final TargetPolicyEndpoints value) {
        this.backingStore.set("targetPolicy", value);
    }
}
