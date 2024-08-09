package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DocumentProcessingJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DocumentProcessingJob} and sets the default values.
     */
    public DocumentProcessingJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DocumentProcessingJob}
     */
    @jakarta.annotation.Nonnull
    public static DocumentProcessingJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentProcessingJob();
    }
    /**
     * Gets the createdDateTime property value. Date and time of item creation. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("jobType", (n) -> { this.setJobType(n.getEnumValue(DocumentProcessingJobType::forValue)); });
        deserializerMap.put("listItemUniqueId", (n) -> { this.setListItemUniqueId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DocumentProcessingJobStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jobType property value. The document processing job type. The possible values are: file, folder
     * @return a {@link DocumentProcessingJobType}
     */
    @jakarta.annotation.Nullable
    public DocumentProcessingJobType getJobType() {
        return this.backingStore.get("jobType");
    }
    /**
     * Gets the listItemUniqueId property value. The listItemUniqueId of the file, or folder to process. Use GET driveItem resource operation and read  sharepointIds property to get listItemUniqueId.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListItemUniqueId() {
        return this.backingStore.get("listItemUniqueId");
    }
    /**
     * Gets the status property value. The document processing Job status. The possible values are: inProgress, completed, failed, unknownFutureValue.
     * @return a {@link DocumentProcessingJobStatus}
     */
    @jakarta.annotation.Nullable
    public DocumentProcessingJobStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("jobType", this.getJobType());
        writer.writeStringValue("listItemUniqueId", this.getListItemUniqueId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the jobType property value. The document processing job type. The possible values are: file, folder
     * @param value Value to set for the jobType property.
     */
    public void setJobType(@jakarta.annotation.Nullable final DocumentProcessingJobType value) {
        this.backingStore.set("jobType", value);
    }
    /**
     * Sets the listItemUniqueId property value. The listItemUniqueId of the file, or folder to process. Use GET driveItem resource operation and read  sharepointIds property to get listItemUniqueId.
     * @param value Value to set for the listItemUniqueId property.
     */
    public void setListItemUniqueId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("listItemUniqueId", value);
    }
    /**
     * Sets the status property value. The document processing Job status. The possible values are: inProgress, completed, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DocumentProcessingJobStatus value) {
        this.backingStore.set("status", value);
    }
}
