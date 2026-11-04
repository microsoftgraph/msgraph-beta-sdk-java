package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyApproval extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyApproval} and sets the default values.
     */
    public PolicyApproval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyApproval}
     */
    @jakarta.annotation.Nonnull
    public static PolicyApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyApproval();
    }
    /**
     * Gets the approvedBy property value. The approvedBy property
     * @return a {@link ApprovedBy}
     */
    @jakarta.annotation.Nullable
    public ApprovedBy getApprovedBy() {
        return this.backingStore.get("approvedBy");
    }
    /**
     * Gets the catalogEntry property value. The content that you can approve for deployment. Read-only.
     * @return a {@link CatalogEntry}
     */
    @jakarta.annotation.Nullable
    public CatalogEntry getCatalogEntry() {
        return this.backingStore.get("catalogEntry");
    }
    /**
     * Gets the catalogEntryId property value. The catalog entry ID to approve.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogEntryId() {
        return this.backingStore.get("catalogEntryId");
    }
    /**
     * Gets the createdDateTime property value. The date and time the policy approval is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
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
        deserializerMap.put("approvedBy", (n) -> { this.setApprovedBy(n.getEnumValue(ApprovedBy::forValue)); });
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogEntryId", (n) -> { this.setCatalogEntryId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ApprovalStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the policy approval was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the startDateTime property value. The date and time when the approved content can start being offered. If omitted when the approval is created, the service uses the current time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link ApprovalStatus}
     */
    @jakarta.annotation.Nullable
    public ApprovalStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("approvedBy", this.getApprovedBy());
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
        writer.writeStringValue("catalogEntryId", this.getCatalogEntryId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the approvedBy property value. The approvedBy property
     * @param value Value to set for the approvedBy property.
     */
    public void setApprovedBy(@jakarta.annotation.Nullable final ApprovedBy value) {
        this.backingStore.set("approvedBy", value);
    }
    /**
     * Sets the catalogEntry property value. The content that you can approve for deployment. Read-only.
     * @param value Value to set for the catalogEntry property.
     */
    public void setCatalogEntry(@jakarta.annotation.Nullable final CatalogEntry value) {
        this.backingStore.set("catalogEntry", value);
    }
    /**
     * Sets the catalogEntryId property value. The catalog entry ID to approve.
     * @param value Value to set for the catalogEntryId property.
     */
    public void setCatalogEntryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogEntryId", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the policy approval is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the policy approval was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the approved content can start being offered. If omitted when the approval is created, the service uses the current time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ApprovalStatus value) {
        this.backingStore.set("status", value);
    }
}
