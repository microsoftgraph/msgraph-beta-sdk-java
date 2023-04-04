package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallTranscript extends Entity implements Parsable {
    /** A field that represents the content of the transcript. Read-only. */
    private byte[] content;
    /** Date and time at which the transcript was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime createdDateTime;
    /** The metadataContent property */
    private byte[] metadataContent;
    /**
     * Instantiates a new callTranscript and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallTranscript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callTranscript
     */
    @javax.annotation.Nonnull
    public static CallTranscript createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallTranscript();
    }
    /**
     * Gets the content property value. A field that represents the content of the transcript. Read-only.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the createdDateTime property value. Date and time at which the transcript was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metadataContent", (n) -> { this.setMetadataContent(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadataContent property value. The metadataContent property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getMetadataContent() {
        return this.metadataContent;
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
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeByteArrayValue("metadataContent", this.getMetadataContent());
    }
    /**
     * Sets the content property value. A field that represents the content of the transcript. Read-only.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time at which the transcript was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the metadataContent property value. The metadataContent property
     * @param value Value to set for the metadataContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadataContent(@javax.annotation.Nullable final byte[] value) {
        this.metadataContent = value;
    }
}
