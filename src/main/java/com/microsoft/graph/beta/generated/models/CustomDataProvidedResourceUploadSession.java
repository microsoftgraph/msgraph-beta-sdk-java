package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomDataProvidedResourceUploadSession extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomDataProvidedResourceUploadSession} and sets the default values.
     */
    public CustomDataProvidedResourceUploadSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomDataProvidedResourceUploadSession}
     */
    @jakarta.annotation.Nonnull
    public static CustomDataProvidedResourceUploadSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomDataProvidedResourceUploadSession();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the data property value. The data property
     * @return a {@link CustomExtensionData}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionData getData() {
        return this.backingStore.get("data");
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(CustomExtensionData::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(CustomDataProvidedResourceFile::createFromDiscriminatorValue)); });
        deserializerMap.put("isUploadDone", (n) -> { this.setIsUploadDone(n.getBooleanValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("stats", (n) -> { this.setStats(n.getObjectValue(CustomDataProvidedResourceUploadStats::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CustomDataProvidedResourceUploadStatus::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The files property
     * @return a {@link java.util.List<CustomDataProvidedResourceFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomDataProvidedResourceFile> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the isUploadDone property value. The isUploadDone property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUploadDone() {
        return this.backingStore.get("isUploadDone");
    }
    /**
     * Gets the source property value. The source property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the stats property value. The stats property
     * @return a {@link CustomDataProvidedResourceUploadStats}
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadStats getStats() {
        return this.backingStore.get("stats");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CustomDataProvidedResourceUploadStatus}
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("data", this.getData());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeBooleanValue("isUploadDone", this.getIsUploadDone());
        writer.writeStringValue("source", this.getSource());
        writer.writeObjectValue("stats", this.getStats());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final CustomExtensionData value) {
        this.backingStore.set("data", value);
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the files property value. The files property
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<CustomDataProvidedResourceFile> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the isUploadDone property value. The isUploadDone property
     * @param value Value to set for the isUploadDone property.
     */
    public void setIsUploadDone(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUploadDone", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the stats property value. The stats property
     * @param value Value to set for the stats property.
     */
    public void setStats(@jakarta.annotation.Nullable final CustomDataProvidedResourceUploadStats value) {
        this.backingStore.set("stats", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CustomDataProvidedResourceUploadStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}
