package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateCatalogItem extends Entity implements Parsable {
    /**
     * The display name for the catalog item.
     */
    private String displayName;
    /**
     * The last supported date for a catalog item
     */
    private OffsetDateTime endOfSupportDate;
    /**
     * The date the catalog item was released
     */
    private OffsetDateTime releaseDateTime;
    /**
     * Instantiates a new WindowsUpdateCatalogItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsUpdateCatalogItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateCatalogItem
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateCatalogItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsFeatureUpdateCatalogItem": return new WindowsFeatureUpdateCatalogItem();
                case "#microsoft.graph.windowsQualityUpdateCatalogItem": return new WindowsQualityUpdateCatalogItem();
            }
        }
        return new WindowsUpdateCatalogItem();
    }
    /**
     * Gets the displayName property value. The display name for the catalog item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endOfSupportDate property value. The last supported date for a catalog item
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndOfSupportDate() {
        return this.endOfSupportDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endOfSupportDate", (n) -> { this.setEndOfSupportDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the releaseDateTime property value. The date the catalog item was released
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.releaseDateTime;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endOfSupportDate", this.getEndOfSupportDate());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
    }
    /**
     * Sets the displayName property value. The display name for the catalog item.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endOfSupportDate property value. The last supported date for a catalog item
     * @param value Value to set for the endOfSupportDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndOfSupportDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endOfSupportDate = value;
    }
    /**
     * Sets the releaseDateTime property value. The date the catalog item was released
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.releaseDateTime = value;
    }
}
