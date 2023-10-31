package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecycleBinItem extends BaseItem implements Parsable {
    /**
     * Date and time when the item was deleted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime deletedDateTime;
    /**
     * Relative URL of the list or folder that originally contained the item.
     */
    private String deletedFromLocation;
    /**
     * Size of the item in bytes.
     */
    private Long size;
    /**
     * Instantiates a new RecycleBinItem and sets the default values.
     */
    public RecycleBinItem() {
        super();
        this.setOdataType("#microsoft.graph.recycleBinItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecycleBinItem
     */
    @jakarta.annotation.Nonnull
    public static RecycleBinItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecycleBinItem();
    }
    /**
     * Gets the deletedDateTime property value. Date and time when the item was deleted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * Gets the deletedFromLocation property value. Relative URL of the list or folder that originally contained the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeletedFromLocation() {
        return this.deletedFromLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedFromLocation", (n) -> { this.setDeletedFromLocation(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. Size of the item in bytes.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeStringValue("deletedFromLocation", this.getDeletedFromLocation());
        writer.writeLongValue("size", this.getSize());
    }
    /**
     * Sets the deletedDateTime property value. Date and time when the item was deleted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deletedDateTime = value;
    }
    /**
     * Sets the deletedFromLocation property value. Relative URL of the list or folder that originally contained the item.
     * @param value Value to set for the deletedFromLocation property.
     */
    public void setDeletedFromLocation(@jakarta.annotation.Nullable final String value) {
        this.deletedFromLocation = value;
    }
    /**
     * Sets the size property value. Size of the item in bytes.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
}
