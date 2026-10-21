package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A tenant-scoped Microsoft Security workbook containing a display name and arbitrary JSON content.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Workbook extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Workbook} and sets the default values.
     */
    public Workbook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Workbook}
     */
    @jakarta.annotation.Nonnull
    public static Workbook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workbook();
    }
    /**
     * Gets the content property value. The workbook&apos;s JSON document. Required when creating or replacing a workbook. Supply a JSON object, not a JSON-encoded string. Replaced as a whole on update. Omitted from collection responses by default; use $select to include it.
     * @return a {@link WorkbookContent}
     */
    @jakarta.annotation.Nullable
    public WorkbookContent getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdAtDateTime property value. The date and time when the workbook was created. Set by the service and preserved on update. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAtDateTime() {
        return this.backingStore.get("createdAtDateTime");
    }
    /**
     * Gets the createdByUpn property value. The user principal name recorded when the workbook was created. Set by the service and preserved on update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUpn() {
        return this.backingStore.get("createdByUpn");
    }
    /**
     * Gets the etag property value. The opaque concurrency token derived from the workbook&apos;s storage ETag. Set by the service. Read-only. For conditional updates, use the value returned in the HTTP ETag response header.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEtag() {
        return this.backingStore.get("etag");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(WorkbookContent::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAtDateTime", (n) -> { this.setCreatedAtDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdByUpn", (n) -> { this.setCreatedByUpn(n.getStringValue()); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("lastUpdatedByUpn", (n) -> { this.setLastUpdatedByUpn(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("updatedAtDateTime", (n) -> { this.setUpdatedAtDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedByUpn property value. The user principal name recorded for the most recent update. Set by the service. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdatedByUpn() {
        return this.backingStore.get("lastUpdatedByUpn");
    }
    /**
     * Gets the name property value. The display name of the workbook. Required when creating or replacing a workbook. Maximum length is 256 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the updatedAtDateTime property value. The date and time of the most recent update. Set by the service. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAtDateTime() {
        return this.backingStore.get("updatedAtDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the content property value. The workbook&apos;s JSON document. Required when creating or replacing a workbook. Supply a JSON object, not a JSON-encoded string. Replaced as a whole on update. Omitted from collection responses by default; use $select to include it.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final WorkbookContent value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdAtDateTime property value. The date and time when the workbook was created. Set by the service and preserved on update. Read-only.
     * @param value Value to set for the createdAtDateTime property.
     */
    public void setCreatedAtDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdAtDateTime", value);
    }
    /**
     * Sets the createdByUpn property value. The user principal name recorded when the workbook was created. Set by the service and preserved on update. Read-only.
     * @param value Value to set for the createdByUpn property.
     */
    public void setCreatedByUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByUpn", value);
    }
    /**
     * Sets the etag property value. The opaque concurrency token derived from the workbook&apos;s storage ETag. Set by the service. Read-only. For conditional updates, use the value returned in the HTTP ETag response header.
     * @param value Value to set for the etag property.
     */
    public void setEtag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("etag", value);
    }
    /**
     * Sets the lastUpdatedByUpn property value. The user principal name recorded for the most recent update. Set by the service. Read-only.
     * @param value Value to set for the lastUpdatedByUpn property.
     */
    public void setLastUpdatedByUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastUpdatedByUpn", value);
    }
    /**
     * Sets the name property value. The display name of the workbook. Required when creating or replacing a workbook. Maximum length is 256 characters.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the updatedAtDateTime property value. The date and time of the most recent update. Set by the service. Read-only.
     * @param value Value to set for the updatedAtDateTime property.
     */
    public void setUpdatedAtDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedAtDateTime", value);
    }
}
