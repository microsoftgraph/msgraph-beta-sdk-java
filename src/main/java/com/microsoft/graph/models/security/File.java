package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.security.EdiscoveryFile;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class File extends Entity implements Parsable {
    /** The content property */
    private byte[] _content;
    /** The dateTime property */
    private OffsetDateTime _dateTime;
    /** The extension property */
    private String _extension;
    /** The extractedTextContent property */
    private byte[] _extractedTextContent;
    /** The mediaType property */
    private String _mediaType;
    /** The name property */
    private String _name;
    /** The otherProperties property */
    private StringValueDictionary _otherProperties;
    /** The processingStatus property */
    private FileProcessingStatus _processingStatus;
    /** The senderOrAuthors property */
    private java.util.List<String> _senderOrAuthors;
    /** The size property */
    private Long _size;
    /** The sourceType property */
    private SourceType _sourceType;
    /** The subjectTitle property */
    private String _subjectTitle;
    /**
     * Instantiates a new file and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public File() {
        super();
        this.setOdataType("#microsoft.graph.security.file");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a file
     */
    @javax.annotation.Nonnull
    public static File createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the dateTime property value. The dateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this._dateTime;
    }
    /**
     * Gets the extension property value. The extension property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtension() {
        return this._extension;
    }
    /**
     * Gets the extractedTextContent property value. The extractedTextContent property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getExtractedTextContent() {
        return this._extractedTextContent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final File currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
        deserializerMap.put("dateTime", (n) -> { currentObject.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("extension", (n) -> { currentObject.setExtension(n.getStringValue()); });
        deserializerMap.put("extractedTextContent", (n) -> { currentObject.setExtractedTextContent(n.getByteArrayValue()); });
        deserializerMap.put("mediaType", (n) -> { currentObject.setMediaType(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("otherProperties", (n) -> { currentObject.setOtherProperties(n.getObjectValue(StringValueDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("processingStatus", (n) -> { currentObject.setProcessingStatus(n.getEnumValue(FileProcessingStatus.class)); });
        deserializerMap.put("senderOrAuthors", (n) -> { currentObject.setSenderOrAuthors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
        deserializerMap.put("sourceType", (n) -> { currentObject.setSourceType(n.getEnumValue(SourceType.class)); });
        deserializerMap.put("subjectTitle", (n) -> { currentObject.setSubjectTitle(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the otherProperties property value. The otherProperties property
     * @return a stringValueDictionary
     */
    @javax.annotation.Nullable
    public StringValueDictionary getOtherProperties() {
        return this._otherProperties;
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a fileProcessingStatus
     */
    @javax.annotation.Nullable
    public FileProcessingStatus getProcessingStatus() {
        return this._processingStatus;
    }
    /**
     * Gets the senderOrAuthors property value. The senderOrAuthors property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSenderOrAuthors() {
        return this._senderOrAuthors;
    }
    /**
     * Gets the size property value. The size property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Gets the sourceType property value. The sourceType property
     * @return a sourceType
     */
    @javax.annotation.Nullable
    public SourceType getSourceType() {
        return this._sourceType;
    }
    /**
     * Gets the subjectTitle property value. The subjectTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectTitle() {
        return this._subjectTitle;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dateTime = value;
    }
    /**
     * Sets the extension property value. The extension property
     * @param value Value to set for the extension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtension(@javax.annotation.Nullable final String value) {
        this._extension = value;
    }
    /**
     * Sets the extractedTextContent property value. The extractedTextContent property
     * @param value Value to set for the extractedTextContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtractedTextContent(@javax.annotation.Nullable final byte[] value) {
        this._extractedTextContent = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this._mediaType = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the otherProperties property value. The otherProperties property
     * @param value Value to set for the otherProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtherProperties(@javax.annotation.Nullable final StringValueDictionary value) {
        this._otherProperties = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingStatus(@javax.annotation.Nullable final FileProcessingStatus value) {
        this._processingStatus = value;
    }
    /**
     * Sets the senderOrAuthors property value. The senderOrAuthors property
     * @param value Value to set for the senderOrAuthors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderOrAuthors(@javax.annotation.Nullable final java.util.List<String> value) {
        this._senderOrAuthors = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
    /**
     * Sets the sourceType property value. The sourceType property
     * @param value Value to set for the sourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceType(@javax.annotation.Nullable final SourceType value) {
        this._sourceType = value;
    }
    /**
     * Sets the subjectTitle property value. The subjectTitle property
     * @param value Value to set for the subjectTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectTitle(@javax.annotation.Nullable final String value) {
        this._subjectTitle = value;
    }
}
