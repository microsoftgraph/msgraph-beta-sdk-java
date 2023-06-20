package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Mention extends Entity implements Parsable {
    /** The name of the application where the mention is created. Optional. Not used and defaulted as null for message. */
    private String application;
    /** A unique identifier that represents a parent of the resource instance. Optional. Not used and defaulted as null for message. */
    private String clientReference;
    /** The email information of the user who made the mention. */
    private EmailAddress createdBy;
    /** The date and time that the mention is created on the client. */
    private OffsetDateTime createdDateTime;
    /** A deep web link to the context of the mention in the resource instance. Optional. Not used and defaulted as null for message. */
    private String deepLink;
    /** The mentioned property */
    private EmailAddress mentioned;
    /** Optional. Not used and defaulted as null for message. To get the mentions in a message, see the bodyPreview property of the message instead. */
    private String mentionText;
    /** The date and time that the mention is created on the server. Optional. Not used and defaulted as null for message. */
    private OffsetDateTime serverCreatedDateTime;
    /**
     * Instantiates a new mention and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Mention() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mention
     */
    @javax.annotation.Nonnull
    public static Mention createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Mention();
    }
    /**
     * Gets the application property value. The name of the application where the mention is created. Optional. Not used and defaulted as null for message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplication() {
        return this.application;
    }
    /**
     * Gets the clientReference property value. A unique identifier that represents a parent of the resource instance. Optional. Not used and defaulted as null for message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientReference() {
        return this.clientReference;
    }
    /**
     * Gets the createdBy property value. The email information of the user who made the mention.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public EmailAddress getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time that the mention is created on the client.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deepLink property value. A deep web link to the context of the mention in the resource instance. Optional. Not used and defaulted as null for message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeepLink() {
        return this.deepLink;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public EmailAddress getMentioned() {
        return this.mentioned;
    }
    /**
     * Gets the mentionText property value. Optional. Not used and defaulted as null for message. To get the mentions in a message, see the bodyPreview property of the message instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMentionText() {
        return this.mentionText;
    }
    /**
     * Gets the serverCreatedDateTime property value. The date and time that the mention is created on the server. Optional. Not used and defaulted as null for message.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getServerCreatedDateTime() {
        return this.serverCreatedDateTime;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplication(@javax.annotation.Nullable final String value) {
        this.application = value;
    }
    /**
     * Sets the clientReference property value. A unique identifier that represents a parent of the resource instance. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the clientReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientReference(@javax.annotation.Nullable final String value) {
        this.clientReference = value;
    }
    /**
     * Sets the createdBy property value. The email information of the user who made the mention.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final EmailAddress value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time that the mention is created on the client.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deepLink property value. A deep web link to the context of the mention in the resource instance. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the deepLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeepLink(@javax.annotation.Nullable final String value) {
        this.deepLink = value;
    }
    /**
     * Sets the mentioned property value. The mentioned property
     * @param value Value to set for the mentioned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMentioned(@javax.annotation.Nullable final EmailAddress value) {
        this.mentioned = value;
    }
    /**
     * Sets the mentionText property value. Optional. Not used and defaulted as null for message. To get the mentions in a message, see the bodyPreview property of the message instead.
     * @param value Value to set for the mentionText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMentionText(@javax.annotation.Nullable final String value) {
        this.mentionText = value;
    }
    /**
     * Sets the serverCreatedDateTime property value. The date and time that the mention is created on the server. Optional. Not used and defaulted as null for message.
     * @param value Value to set for the serverCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.serverCreatedDateTime = value;
    }
}
