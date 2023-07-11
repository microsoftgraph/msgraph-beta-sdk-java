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
public class ConfigManagerCollection extends Entity implements Parsable {
    /**
     * The collection identifier in SCCM.
     */
    private String collectionIdentifier;
    /**
     * The created date.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The DisplayName.
     */
    private String displayName;
    /**
     * The Hierarchy Identifier.
     */
    private String hierarchyIdentifier;
    /**
     * The HierarchyName.
     */
    private String hierarchyName;
    /**
     * The last modified date.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Instantiates a new configManagerCollection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigManagerCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configManagerCollection
     */
    @javax.annotation.Nonnull
    public static ConfigManagerCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigManagerCollection();
    }
    /**
     * Gets the collectionIdentifier property value. The collection identifier in SCCM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCollectionIdentifier() {
        return this.collectionIdentifier;
    }
    /**
     * Gets the createdDateTime property value. The created date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The DisplayName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHierarchyIdentifier() {
        return this.hierarchyIdentifier;
    }
    /**
     * Gets the hierarchyName property value. The HierarchyName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHierarchyName() {
        return this.hierarchyName;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollectionIdentifier(@javax.annotation.Nullable final String value) {
        this.collectionIdentifier = value;
    }
    /**
     * Sets the createdDateTime property value. The created date.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The DisplayName.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the hierarchyIdentifier property value. The Hierarchy Identifier.
     * @param value Value to set for the hierarchyIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHierarchyIdentifier(@javax.annotation.Nullable final String value) {
        this.hierarchyIdentifier = value;
    }
    /**
     * Sets the hierarchyName property value. The HierarchyName.
     * @param value Value to set for the hierarchyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHierarchyName(@javax.annotation.Nullable final String value) {
        this.hierarchyName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
}
