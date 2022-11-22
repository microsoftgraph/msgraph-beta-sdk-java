package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class PrintDocument extends Entity implements Parsable {
    /** The configuration property */
    private PrinterDocumentConfiguration _configuration;
    /** The document's content (MIME) type. Read-only. */
    private String _contentType;
    /** The document's name. Read-only. */
    private String _displayName;
    /** The downloadedDateTime property */
    private OffsetDateTime _downloadedDateTime;
    /** The document's size in bytes. Read-only. */
    private Long _size;
    /** The uploadedDateTime property */
    private OffsetDateTime _uploadedDateTime;
    /**
     * Instantiates a new printDocument and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintDocument() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printDocument
     */
    @javax.annotation.Nonnull
    public static PrintDocument createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintDocument();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a printerDocumentConfiguration
     */
    @javax.annotation.Nullable
    public PrinterDocumentConfiguration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the contentType property value. The document's content (MIME) type. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * Gets the displayName property value. The document's name. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the downloadedDateTime property value. The downloadedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDownloadedDateTime() {
        return this._downloadedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(PrinterDocumentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("downloadedDateTime", (n) -> { this.setDownloadedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("uploadedDateTime", (n) -> { this.setUploadedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. The document's size in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Gets the uploadedDateTime property value. The uploadedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUploadedDateTime() {
        return this._uploadedDateTime;
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
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("downloadedDateTime", this.getDownloadedDateTime());
        writer.writeLongValue("size", this.getSize());
        writer.writeOffsetDateTimeValue("uploadedDateTime", this.getUploadedDateTime());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final PrinterDocumentConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the contentType property value. The document's content (MIME) type. Read-only.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the displayName property value. The document's name. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the downloadedDateTime property value. The downloadedDateTime property
     * @param value Value to set for the downloadedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDownloadedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._downloadedDateTime = value;
    }
    /**
     * Sets the size property value. The document's size in bytes. Read-only.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
    /**
     * Sets the uploadedDateTime property value. The uploadedDateTime property
     * @param value Value to set for the uploadedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUploadedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._uploadedDateTime = value;
    }
}
