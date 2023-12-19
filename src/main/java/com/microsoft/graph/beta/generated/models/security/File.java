package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class File extends Entity implements Parsable {
    /**
     * Instantiates a new File and sets the default values.
     */
    public File() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a File
     */
    @jakarta.annotation.Nonnull
    public static File createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.ediscoveryFile": return new EdiscoveryFile();
            }
        }
        return new File();
    }
    /**
     * Gets the content property value. The content property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the dateTime property value. The dateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.backingStore.get("dateTime");
    }
    /**
     * Gets the extension property value. The extension property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExtension() {
        return this.backingStore.get("extension");
    }
    /**
     * Gets the extractedTextContent property value. The extractedTextContent property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getExtractedTextContent() {
        return this.backingStore.get("extractedTextContent");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("extension", (n) -> { this.setExtension(n.getStringValue()); });
        deserializerMap.put("extractedTextContent", (n) -> { this.setExtractedTextContent(n.getByteArrayValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("otherProperties", (n) -> { this.setOtherProperties(n.getObjectValue(StringValueDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(FileProcessingStatus::forValue)); });
        deserializerMap.put("senderOrAuthors", (n) -> { this.setSenderOrAuthors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("sourceType", (n) -> { this.setSourceType(n.getEnumValue(FileSourceType::forValue)); });
        deserializerMap.put("subjectTitle", (n) -> { this.setSubjectTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.backingStore.get("mediaType");
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the otherProperties property value. The otherProperties property
     * @return a StringValueDictionary
     */
    @jakarta.annotation.Nullable
    public StringValueDictionary getOtherProperties() {
        return this.backingStore.get("otherProperties");
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a FileProcessingStatus
     */
    @jakarta.annotation.Nullable
    public FileProcessingStatus getProcessingStatus() {
        return this.backingStore.get("processingStatus");
    }
    /**
     * Gets the senderOrAuthors property value. The senderOrAuthors property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSenderOrAuthors() {
        return this.backingStore.get("senderOrAuthors");
    }
    /**
     * Gets the size property value. The size property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the sourceType property value. The sourceType property
     * @return a FileSourceType
     */
    @jakarta.annotation.Nullable
    public FileSourceType getSourceType() {
        return this.backingStore.get("sourceType");
    }
    /**
     * Gets the subjectTitle property value. The subjectTitle property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubjectTitle() {
        return this.backingStore.get("subjectTitle");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeStringValue("extension", this.getExtension());
        writer.writeByteArrayValue("extractedTextContent", this.getExtractedTextContent());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("otherProperties", this.getOtherProperties());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeCollectionOfPrimitiveValues("senderOrAuthors", this.getSenderOrAuthors());
        writer.writeLongValue("size", this.getSize());
        writer.writeEnumValue("sourceType", this.getSourceType());
        writer.writeStringValue("subjectTitle", this.getSubjectTitle());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dateTime", value);
    }
    /**
     * Sets the extension property value. The extension property
     * @param value Value to set for the extension property.
     */
    public void setExtension(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extension", value);
    }
    /**
     * Sets the extractedTextContent property value. The extractedTextContent property
     * @param value Value to set for the extractedTextContent property.
     */
    public void setExtractedTextContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("extractedTextContent", value);
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaType", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the otherProperties property value. The otherProperties property
     * @param value Value to set for the otherProperties property.
     */
    public void setOtherProperties(@jakarta.annotation.Nullable final StringValueDictionary value) {
        this.backingStore.set("otherProperties", value);
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final FileProcessingStatus value) {
        this.backingStore.set("processingStatus", value);
    }
    /**
     * Sets the senderOrAuthors property value. The senderOrAuthors property
     * @param value Value to set for the senderOrAuthors property.
     */
    public void setSenderOrAuthors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("senderOrAuthors", value);
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the sourceType property value. The sourceType property
     * @param value Value to set for the sourceType property.
     */
    public void setSourceType(@jakarta.annotation.Nullable final FileSourceType value) {
        this.backingStore.set("sourceType", value);
    }
    /**
     * Sets the subjectTitle property value. The subjectTitle property
     * @param value Value to set for the subjectTitle property.
     */
    public void setSubjectTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectTitle", value);
    }
}
