package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintDocument extends Entity implements Parsable {
    /**
     * The configuration property
     */
    private PrinterDocumentConfiguration configuration;
    /**
     * The document's content (MIME) type. Read-only.
     */
    private String contentType;
    /**
     * The document's name. Read-only.
     */
    private String displayName;
    /**
     * The downloadedDateTime property
     */
    private OffsetDateTime downloadedDateTime;
    /**
     * The document's size in bytes. Read-only.
     */
    private Long size;
    /**
     * The uploadedDateTime property
     */
    private OffsetDateTime uploadedDateTime;
    /**
     * Instantiates a new PrintDocument and sets the default values.
     */
    public PrintDocument() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintDocument
     */
    @jakarta.annotation.Nonnull
    public static PrintDocument createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintDocument();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a PrinterDocumentConfiguration
     */
    @jakarta.annotation.Nullable
    public PrinterDocumentConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the contentType property value. The document's content (MIME) type. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Gets the displayName property value. The document's name. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the downloadedDateTime property value. The downloadedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDownloadedDateTime() {
        return this.downloadedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the uploadedDateTime property value. The uploadedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadedDateTime() {
        return this.uploadedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConfiguration(@jakarta.annotation.Nullable final PrinterDocumentConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the contentType property value. The document's content (MIME) type. Read-only.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the displayName property value. The document's name. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the downloadedDateTime property value. The downloadedDateTime property
     * @param value Value to set for the downloadedDateTime property.
     */
    public void setDownloadedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.downloadedDateTime = value;
    }
    /**
     * Sets the size property value. The document's size in bytes. Read-only.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the uploadedDateTime property value. The uploadedDateTime property
     * @param value Value to set for the uploadedDateTime property.
     */
    public void setUploadedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.uploadedDateTime = value;
    }
}
