package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Notification extends Entity implements Parsable {
    /**
     * Sets how long (in seconds) this notification content will stay in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification will stay in the user's Windows Action Center.
     */
    private Integer displayTimeToLive;
    /**
     * Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     */
    private String groupName;
    /**
     * The payload property
     */
    private PayloadTypes payload;
    /**
     * Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     */
    private Priority priority;
    /**
     * Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     */
    private String targetHostName;
    /**
     * Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     */
    private TargetPolicyEndpoints targetPolicy;
    /**
     * Instantiates a new notification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Notification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a notification
     */
    @javax.annotation.Nonnull
    public static Notification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Notification();
    }
    /**
     * Gets the displayTimeToLive property value. Sets how long (in seconds) this notification content will stay in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification will stay in the user's Windows Action Center.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisplayTimeToLive() {
        return this.displayTimeToLive;
    }
    /**
     * Gets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayTimeToLive", (n) -> { this.setDisplayTimeToLive(n.getIntegerValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(PayloadTypes::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(Priority.class)); });
        deserializerMap.put("targetHostName", (n) -> { this.setTargetHostName(n.getStringValue()); });
        deserializerMap.put("targetPolicy", (n) -> { this.setTargetPolicy(n.getObjectValue(TargetPolicyEndpoints::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Gets the payload property value. The payload property
     * @return a PayloadTypes
     */
    @javax.annotation.Nullable
    public PayloadTypes getPayload() {
        return this.payload;
    }
    /**
     * Gets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @return a priority
     */
    @javax.annotation.Nullable
    public Priority getPriority() {
        return this.priority;
    }
    /**
     * Gets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetHostName() {
        return this.targetHostName;
    }
    /**
     * Gets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @return a targetPolicyEndpoints
     */
    @javax.annotation.Nullable
    public TargetPolicyEndpoints getTargetPolicy() {
        return this.targetPolicy;
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
        writer.writeIntegerValue("displayTimeToLive", this.getDisplayTimeToLive());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("groupName", this.getGroupName());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeStringValue("targetHostName", this.getTargetHostName());
        writer.writeObjectValue("targetPolicy", this.getTargetPolicy());
    }
    /**
     * Sets the displayTimeToLive property value. Sets how long (in seconds) this notification content will stay in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification will stay in the user's Windows Action Center.
     * @param value Value to set for the displayTimeToLive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayTimeToLive(@javax.annotation.Nullable final Integer value) {
        this.displayTimeToLive = value;
    }
    /**
     * Sets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     * @param value Value to set for the groupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupName(@javax.annotation.Nullable final String value) {
        this.groupName = value;
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final PayloadTypes value) {
        this.payload = value;
    }
    /**
     * Sets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Priority value) {
        this.priority = value;
    }
    /**
     * Sets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @param value Value to set for the targetHostName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetHostName(@javax.annotation.Nullable final String value) {
        this.targetHostName = value;
    }
    /**
     * Sets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @param value Value to set for the targetPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetPolicy(@javax.annotation.Nullable final TargetPolicyEndpoints value) {
        this.targetPolicy = value;
    }
}
