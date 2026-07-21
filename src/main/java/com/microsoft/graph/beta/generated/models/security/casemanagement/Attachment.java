package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Attachment extends CaseManagementEntity implements Parsable {
    /**
     * Instantiates a new {@link Attachment} and sets the default values.
     */
    public Attachment() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.attachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Attachment}
     */
    @jakarta.annotation.Nonnull
    public static Attachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Attachment();
    }
    /**
     * Gets the content property value. The binary content stream for the attachment.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the description property value. The description of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fileExtension", (n) -> { this.setFileExtension(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getObjectValue(AttachmentOrigin::createFromDiscriminatorValue)); });
        deserializerMap.put("scanResult", (n) -> { this.setScanResult(n.getEnumValue(AttachmentScanResult::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileExtension property value. The file extension of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileExtension() {
        return this.backingStore.get("fileExtension");
    }
    /**
     * Gets the fileSize property value. The size of the attachment in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.backingStore.get("fileSize");
    }
    /**
     * Gets the origin property value. The origin reference for the attachment.
     * @return a {@link AttachmentOrigin}
     */
    @jakarta.annotation.Nullable
    public AttachmentOrigin getOrigin() {
        return this.backingStore.get("origin");
    }
    /**
     * Gets the scanResult property value. The scanResult property
     * @return a {@link AttachmentScanResult}
     */
    @jakarta.annotation.Nullable
    public AttachmentScanResult getScanResult() {
        return this.backingStore.get("scanResult");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("fileExtension", this.getFileExtension());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeObjectValue("origin", this.getOrigin());
        writer.writeEnumValue("scanResult", this.getScanResult());
    }
    /**
     * Sets the content property value. The binary content stream for the attachment.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the description property value. The description of the attachment.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the attachment.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the fileExtension property value. The file extension of the attachment.
     * @param value Value to set for the fileExtension property.
     */
    public void setFileExtension(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileExtension", value);
    }
    /**
     * Sets the fileSize property value. The size of the attachment in bytes.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the origin property value. The origin reference for the attachment.
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final AttachmentOrigin value) {
        this.backingStore.set("origin", value);
    }
    /**
     * Sets the scanResult property value. The scanResult property
     * @param value Value to set for the scanResult property.
     */
    public void setScanResult(@jakarta.annotation.Nullable final AttachmentScanResult value) {
        this.backingStore.set("scanResult", value);
    }
}
