package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiActivitySubscription extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MultiActivitySubscription} and sets the default values.
     */
    public MultiActivitySubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiActivitySubscription}
     */
    @jakarta.annotation.Nonnull
    public static MultiActivitySubscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiActivitySubscription();
    }
    /**
     * Gets the activities property value. The activities property
     * @return a {@link SubscriptionActivities}
     */
    @jakarta.annotation.Nullable
    public SubscriptionActivities getActivities() {
        return this.backingStore.get("activities");
    }
    /**
     * Gets the callbackUrl property value. The callbackUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallbackUrl() {
        return this.backingStore.get("callbackUrl");
    }
    /**
     * Gets the chatInfo property value. The chatInfo property
     * @return a {@link ChatInfo}
     */
    @jakarta.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.backingStore.get("chatInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getObjectValue(SubscriptionActivities::createFromDiscriminatorValue)); });
        deserializerMap.put("callbackUrl", (n) -> { this.setCallbackUrl(n.getStringValue()); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingInfo", (n) -> { this.setMeetingInfo(n.getObjectValue(MeetingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingInfo property value. The meetingInfo property
     * @return a {@link MeetingInfo}
     */
    @jakarta.annotation.Nullable
    public MeetingInfo getMeetingInfo() {
        return this.backingStore.get("meetingInfo");
    }
    /**
     * Gets the userId property value. The userId property
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
        writer.writeObjectValue("activities", this.getActivities());
        writer.writeStringValue("callbackUrl", this.getCallbackUrl());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeObjectValue("meetingInfo", this.getMeetingInfo());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the activities property value. The activities property
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final SubscriptionActivities value) {
        this.backingStore.set("activities", value);
    }
    /**
     * Sets the callbackUrl property value. The callbackUrl property
     * @param value Value to set for the callbackUrl property.
     */
    public void setCallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callbackUrl", value);
    }
    /**
     * Sets the chatInfo property value. The chatInfo property
     * @param value Value to set for the chatInfo property.
     */
    public void setChatInfo(@jakarta.annotation.Nullable final ChatInfo value) {
        this.backingStore.set("chatInfo", value);
    }
    /**
     * Sets the meetingInfo property value. The meetingInfo property
     * @param value Value to set for the meetingInfo property.
     */
    public void setMeetingInfo(@jakarta.annotation.Nullable final MeetingInfo value) {
        this.backingStore.set("meetingInfo", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
