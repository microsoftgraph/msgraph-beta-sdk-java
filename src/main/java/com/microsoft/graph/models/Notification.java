package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Notification extends Entity implements Parsable {
    /** Sets how long (in seconds) this notification content will stay in each platform's notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification will stay in the user's Windows Action Center.  */
    private Integer _displayTimeToLive;
    /** Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.  */
    private OffsetDateTime _expirationDateTime;
    /** The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.  */
    private String _groupName;
    /** The payload property  */
    private PayloadTypes _payload;
    /** Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.  */
    private Priority _priority;
    /** Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.  */
    private String _targetHostName;
    /** Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.  */
    private TargetPolicyEndpoints _targetPolicy;
    /**
     * Instantiates a new notification and sets the default values.
     * @return a void
     */
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
        return this._displayTimeToLive;
    }
    /**
     * Gets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Notification currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayTimeToLive", (n) -> { currentObject.setDisplayTimeToLive(n.getIntegerValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("groupName", (n) -> { currentObject.setGroupName(n.getStringValue()); });
            this.put("payload", (n) -> { currentObject.setPayload(n.getObjectValue(PayloadTypes::createFromDiscriminatorValue)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getEnumValue(Priority.class)); });
            this.put("targetHostName", (n) -> { currentObject.setTargetHostName(n.getStringValue()); });
            this.put("targetPolicy", (n) -> { currentObject.setTargetPolicy(n.getObjectValue(TargetPolicyEndpoints::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupName() {
        return this._groupName;
    }
    /**
     * Gets the payload property value. The payload property
     * @return a payloadTypes
     */
    @javax.annotation.Nullable
    public PayloadTypes getPayload() {
        return this._payload;
    }
    /**
     * Gets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @return a priority
     */
    @javax.annotation.Nullable
    public Priority getPriority() {
        return this._priority;
    }
    /**
     * Gets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetHostName() {
        return this._targetHostName;
    }
    /**
     * Gets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @return a targetPolicyEndpoints
     */
    @javax.annotation.Nullable
    public TargetPolicyEndpoints getTargetPolicy() {
        return this._targetPolicy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDisplayTimeToLive(@javax.annotation.Nullable final Integer value) {
        this._displayTimeToLive = value;
    }
    /**
     * Sets the expirationDateTime property value. Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the groupName property value. The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     * @param value Value to set for the groupName property.
     * @return a void
     */
    public void setGroupName(@javax.annotation.Nullable final String value) {
        this._groupName = value;
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     * @return a void
     */
    public void setPayload(@javax.annotation.Nullable final PayloadTypes value) {
        this._payload = value;
    }
    /**
     * Sets the priority property value. Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Priority value) {
        this._priority = value;
    }
    /**
     * Sets the targetHostName property value. Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     * @param value Value to set for the targetHostName property.
     * @return a void
     */
    public void setTargetHostName(@javax.annotation.Nullable final String value) {
        this._targetHostName = value;
    }
    /**
     * Sets the targetPolicy property value. Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     * @param value Value to set for the targetPolicy property.
     * @return a void
     */
    public void setTargetPolicy(@javax.annotation.Nullable final TargetPolicyEndpoints value) {
        this._targetPolicy = value;
    }
}
