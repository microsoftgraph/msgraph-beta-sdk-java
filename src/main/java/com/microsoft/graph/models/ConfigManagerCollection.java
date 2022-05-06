package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConfigManagerCollection extends Entity implements Parsable {
    /** The collection identifier in SCCM.  */
    private String _collectionIdentifier;
    /** The created date.  */
    private OffsetDateTime _createdDateTime;
    /** The DisplayName.  */
    private String _displayName;
    /** The Hierarchy Identifier.  */
    private String _hierarchyIdentifier;
    /** The HierarchyName.  */
    private String _hierarchyName;
    /** The last modified date.  */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new configManagerCollection and sets the default values.
     * @return a void
     */
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
        return this._collectionIdentifier;
    }
    /**
     * Gets the createdDateTime property value. The created date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The DisplayName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigManagerCollection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("collectionIdentifier", (n) -> { currentObject.setCollectionIdentifier(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("hierarchyIdentifier", (n) -> { currentObject.setHierarchyIdentifier(n.getStringValue()); });
            this.put("hierarchyName", (n) -> { currentObject.setHierarchyName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the hierarchyIdentifier property value. The Hierarchy Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHierarchyIdentifier() {
        return this._hierarchyIdentifier;
    }
    /**
     * Gets the hierarchyName property value. The HierarchyName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHierarchyName() {
        return this._hierarchyName;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setCollectionIdentifier(@javax.annotation.Nullable final String value) {
        this._collectionIdentifier = value;
    }
    /**
     * Sets the createdDateTime property value. The created date.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The DisplayName.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the hierarchyIdentifier property value. The Hierarchy Identifier.
     * @param value Value to set for the hierarchyIdentifier property.
     * @return a void
     */
    public void setHierarchyIdentifier(@javax.annotation.Nullable final String value) {
        this._hierarchyIdentifier = value;
    }
    /**
     * Sets the hierarchyName property value. The HierarchyName.
     * @param value Value to set for the hierarchyName property.
     * @return a void
     */
    public void setHierarchyName(@javax.annotation.Nullable final String value) {
        this._hierarchyName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
