package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class File extends Entity implements Parsable {
    /**
     * The content property
     */
    private byte[] content;
    /**
     * The dateTime property
     */
    private OffsetDateTime dateTime;
    /**
     * The extension property
     */
    private String extension;
    /**
     * The extractedTextContent property
     */
    private byte[] extractedTextContent;
    /**
     * The mediaType property
     */
    private String mediaType;
    /**
     * The name property
     */
    private String name;
    /**
     * The otherProperties property
     */
    private StringValueDictionary otherProperties;
    /**
     * The processingStatus property
     */
    private FileProcessingStatus processingStatus;
    /**
     * The senderOrAuthors property
     */
    private java.util.List<String> senderOrAuthors;
    /**
     * The size property
     */
    private Long size;
    /**
     * The sourceType property
     */
    private EnumSet<SourceType> sourceType;
    /**
     * The subjectTitle property
     */
    private String subjectTitle;
    /**
     * Instantiates a new file and sets the default values.
     */
    public File() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a file
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
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the dateTime property value. The dateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }
    /**
     * Gets the extension property value. The extension property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExtension() {
        return this.extension;
    }
    /**
     * Gets the extractedTextContent property value. The extractedTextContent property
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getExtractedTextContent() {
        return this.extractedTextContent;
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
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(FileProcessingStatus.class)); });
        deserializerMap.put("senderOrAuthors", (n) -> { this.setSenderOrAuthors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("sourceType", (n) -> { this.setSourceType(n.getEnumSetValue(SourceType.class)); });
        deserializerMap.put("subjectTitle", (n) -> { this.setSubjectTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the otherProperties property value. The otherProperties property
     * @return a stringValueDictionary
     */
    @jakarta.annotation.Nullable
    public StringValueDictionary getOtherProperties() {
        return this.otherProperties;
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a fileProcessingStatus
     */
    @jakarta.annotation.Nullable
    public FileProcessingStatus getProcessingStatus() {
        return this.processingStatus;
    }
    /**
     * Gets the senderOrAuthors property value. The senderOrAuthors property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSenderOrAuthors() {
        return this.senderOrAuthors;
    }
    /**
     * Gets the size property value. The size property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the sourceType property value. The sourceType property
     * @return a sourceType
     */
    @jakarta.annotation.Nullable
    public SourceType getSourceType() {
        return this.sourceType;
    }
    /**
     * Gets the subjectTitle property value. The subjectTitle property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectTitle() {
        return this.subjectTitle;
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
        writer.writeEnumSetValue("sourceType", this.getSourceType());
        writer.writeStringValue("subjectTitle", this.getSubjectTitle());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateTime = value;
    }
    /**
     * Sets the extension property value. The extension property
     * @param value Value to set for the extension property.
     */
    public void setExtension(@jakarta.annotation.Nullable final String value) {
        this.extension = value;
    }
    /**
     * Sets the extractedTextContent property value. The extractedTextContent property
     * @param value Value to set for the extractedTextContent property.
     */
    public void setExtractedTextContent(@jakarta.annotation.Nullable final byte[] value) {
        this.extractedTextContent = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.mediaType = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the otherProperties property value. The otherProperties property
     * @param value Value to set for the otherProperties property.
     */
    public void setOtherProperties(@jakarta.annotation.Nullable final StringValueDictionary value) {
        this.otherProperties = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final FileProcessingStatus value) {
        this.processingStatus = value;
    }
    /**
     * Sets the senderOrAuthors property value. The senderOrAuthors property
     * @param value Value to set for the senderOrAuthors property.
     */
    public void setSenderOrAuthors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.senderOrAuthors = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the sourceType property value. The sourceType property
     * @param value Value to set for the sourceType property.
     */
    public void setSourceType(@jakarta.annotation.Nullable final SourceType value) {
        this.sourceType = value;
    }
    /**
     * Sets the subjectTitle property value. The subjectTitle property
     * @param value Value to set for the subjectTitle property.
     */
    public void setSubjectTitle(@jakarta.annotation.Nullable final String value) {
        this.subjectTitle = value;
    }
}
