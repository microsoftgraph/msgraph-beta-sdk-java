package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A ConfigManager defined collection of devices or users.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigManagerCollection extends Entity implements Parsable {
    /**
     * Instantiates a new ConfigManagerCollection and sets the default values.
     */
    public ConfigManagerCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigManagerCollection
     */
    @jakarta.annotation.Nonnull
    public static ConfigManagerCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigManagerCollection();
    }
    /**
     * Gets the collectionIdentifier property value. The collection identifier in SCCM.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCollectionIdentifier() {
        return this.backingStore.get("collectionIdentifier");
    }
    /**
     * Gets the createdDateTime property value. The created date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The DisplayName.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("collectionIdentifier", (n) -> { this.setCollectionIdentifier(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hierarchyIdentifier", (n) -> { this.setHierarchyIdentifier(n.getStringValue()); });
        deserializerMap.put("hierarchyName", (n) -> { this.setHierarchyName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hierarchyIdentifier property value. The Hierarchy Identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHierarchyIdentifier() {
        return this.backingStore.get("hierarchyIdentifier");
    }
    /**
     * Gets the hierarchyName property value. The HierarchyName.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHierarchyName() {
        return this.backingStore.get("hierarchyName");
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("collectionIdentifier", this.getCollectionIdentifier());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("hierarchyIdentifier", this.getHierarchyIdentifier());
        writer.writeStringValue("hierarchyName", this.getHierarchyName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the collectionIdentifier property value. The collection identifier in SCCM.
     * @param value Value to set for the collectionIdentifier property.
     */
    public void setCollectionIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("collectionIdentifier", value);
    }
    /**
     * Sets the createdDateTime property value. The created date.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The DisplayName.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the hierarchyIdentifier property value. The Hierarchy Identifier.
     * @param value Value to set for the hierarchyIdentifier property.
     */
    public void setHierarchyIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hierarchyIdentifier", value);
    }
    /**
     * Sets the hierarchyName property value. The HierarchyName.
     * @param value Value to set for the hierarchyName property.
     */
    public void setHierarchyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hierarchyName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
}
