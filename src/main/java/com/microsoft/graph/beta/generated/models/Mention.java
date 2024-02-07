package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Mention extends Entity implements Parsable {
    /**
     * Instantiates a new Mention and sets the default values.
     */
    public Mention() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Mention
     */
    @jakarta.annotation.Nonnull
    public static Mention createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Mention();
    }
    /**
     * Gets the application property value. The name of the application where the mention is created. Optional. Not used and defaulted as null for message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApplication() {
        return this.backingStore.get("application");
    }
    /**
     * Gets the clientReference property value. A unique identifier that represents a parent of the resource instance. Optional. Not used and defaulted as null for message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientReference() {
        return this.backingStore.get("clientReference");
    }
    /**
     * Gets the createdBy property value. The email information of the user who made the mention.
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time that the mention is created on the client.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deepLink property value. A deep web link to the context of the mention in the resource instance. Optional. Not used and defaulted as null for message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeepLink() {
        return this.backingStore.get("deepLink");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("application", (n) -> { this.setApplication(n.getStringValue()); });
        deserializerMap.put("clientReference", (n) -> { this.setClientReference(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deepLink", (n) -> { this.setDeepLink(n.getStringValue()); });
        deserializerMap.put("mentioned", (n) -> { this.setMentioned(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("mentionText", (n) -> { this.setMentionText(n.getStringValue()); });
        deserializerMap.put("serverCreatedDateTime", (n) -> { this.setServerCreatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mentioned property value. The mentioned property
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress getMentioned() {
        return this.backingStore.get("mentioned");
    }
    /**
     * Gets the mentionText property value. Optional. Not used and defaulted as null for message. To get the mentions in a message, see the bodyPreview property of the message instead.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMentionText() {
        return this.backingStore.get("mentionText");
    }
    /**
     * Gets the serverCreatedDateTime property value. The date and time that the mention is created on the server. Optional. Not used and defaulted as null for message.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getServerCreatedDateTime() {
        return this.backingStore.get("serverCreatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("application", this.getApplication());
        writer.writeStringValue("clientReference", this.getClientReference());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deepLink", this.getDeepLink());
        writer.writeObjectValue("mentioned", this.getMentioned());
        writer.writeStringValue("mentionText", this.getMentionText());
        writer.writeOffsetDateTimeValue("serverCreatedDateTime", this.getServerCreatedDateTime());
    }
    /**
     * Sets the application property value. The name of the application where the mention is created. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("application", value);
    }
    /**
     * Sets the clientReference property value. A unique identifier that represents a parent of the resource instance. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the clientReference property.
     */
    public void setClientReference(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientReference", value);
    }
    /**
     * Sets the createdBy property value. The email information of the user who made the mention.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time that the mention is created on the client.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deepLink property value. A deep web link to the context of the mention in the resource instance. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the deepLink property.
     */
    public void setDeepLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deepLink", value);
    }
    /**
     * Sets the mentioned property value. The mentioned property
     * @param value Value to set for the mentioned property.
     */
    public void setMentioned(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("mentioned", value);
    }
    /**
     * Sets the mentionText property value. Optional. Not used and defaulted as null for message. To get the mentions in a message, see the bodyPreview property of the message instead.
     * @param value Value to set for the mentionText property.
     */
    public void setMentionText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mentionText", value);
    }
    /**
     * Sets the serverCreatedDateTime property value. The date and time that the mention is created on the server. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the serverCreatedDateTime property.
     */
    public void setServerCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("serverCreatedDateTime", value);
    }
}
