package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationTask extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationTask} and sets the default values.
     */
    public SharePointMigrationTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationTask}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationTask();
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("finishedDateTime", (n) -> { this.setFinishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getObjectValue(SharePointMigrationTaskParameters::createFromDiscriminatorValue)); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SharePointMigrationTaskStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishedDateTime property value. Date and time when the sharePointMigrationTask ended, if available. The task might complete successfully or fail, but it ends at that time. Read-only. Only on OneDrive and SharePoint. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFinishedDateTime() {
        return this.backingStore.get("finishedDateTime");
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time when the sharePointMigrationTask was last updated or processed, if available. Use this property to find tasks that stopped processing for a long time. Read-only. Optional. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the parameters property value. The parameters property
     * @return a {@link SharePointMigrationTaskParameters}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTaskParameters getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Gets the startedDateTime property value. Date and time when the sharePointMigrationTask started, if available. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.backingStore.get("startedDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link SharePointMigrationTaskStatus}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTaskStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("finishedDateTime", this.getFinishedDateTime());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("parameters", this.getParameters());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the finishedDateTime property value. Date and time when the sharePointMigrationTask ended, if available. The task might complete successfully or fail, but it ends at that time. Read-only. Only on OneDrive and SharePoint. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the finishedDateTime property.
     */
    public void setFinishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("finishedDateTime", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time when the sharePointMigrationTask was last updated or processed, if available. Use this property to find tasks that stopped processing for a long time. Read-only. Optional. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the parameters property value. The parameters property
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final SharePointMigrationTaskParameters value) {
        this.backingStore.set("parameters", value);
    }
    /**
     * Sets the startedDateTime property value. Date and time when the sharePointMigrationTask started, if available. Read-only. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startedDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SharePointMigrationTaskStatus value) {
        this.backingStore.set("status", value);
    }
}
