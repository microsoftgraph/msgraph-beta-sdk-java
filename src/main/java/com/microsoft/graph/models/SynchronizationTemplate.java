package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class SynchronizationTemplate extends Entity implements Parsable {
    /** Identifier of the application this template belongs to. */
    private String _applicationId;
    /** true if this template is recommended to be the default for the application. */
    private Boolean _default_escaped;
    /** Description of the template. */
    private String _description;
    /** true if this template should appear in the collection of templates available for the application instance (service principal). */
    private Boolean _discoverable;
    /** One of the well-known factory tags supported by the synchronization engine. The factoryTag tells the synchronization engine which implementation to use when processing jobs based on this template. */
    private String _factoryTag;
    /** Additional extension properties. Unless mentioned explicitly, metadata values should not be changed. */
    private java.util.List<MetadataEntry> _metadata;
    /** Default synchronization schema for the jobs based on this template. */
    private SynchronizationSchema _schema;
    /**
     * Instantiates a new synchronizationTemplate and sets the default values.
     * @return a void
     */
    public SynchronizationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationTemplate
     */
    @javax.annotation.Nonnull
    public static SynchronizationTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTemplate();
    }
    /**
     * Gets the applicationId property value. Identifier of the application this template belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this._applicationId;
    }
    /**
     * Gets the default property value. true if this template is recommended to be the default for the application.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefault() {
        return this._default_escaped;
    }
    /**
     * Gets the description property value. Description of the template.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the discoverable property value. true if this template should appear in the collection of templates available for the application instance (service principal).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiscoverable() {
        return this._discoverable;
    }
    /**
     * Gets the factoryTag property value. One of the well-known factory tags supported by the synchronization engine. The factoryTag tells the synchronization engine which implementation to use when processing jobs based on this template.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFactoryTag() {
        return this._factoryTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationId", (n) -> { currentObject.setApplicationId(n.getStringValue()); });
            this.put("default", (n) -> { currentObject.setDefault(n.getBooleanValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("discoverable", (n) -> { currentObject.setDiscoverable(n.getBooleanValue()); });
            this.put("factoryTag", (n) -> { currentObject.setFactoryTag(n.getStringValue()); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(MetadataEntry::createFromDiscriminatorValue)); });
            this.put("schema", (n) -> { currentObject.setSchema(n.getObjectValue(SynchronizationSchema::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @return a metadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<MetadataEntry> getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the schema property value. Default synchronization schema for the jobs based on this template.
     * @return a synchronizationSchema
     */
    @javax.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this._schema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeBooleanValue("default", this.getDefault());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("discoverable", this.getDiscoverable());
        writer.writeStringValue("factoryTag", this.getFactoryTag());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeObjectValue("schema", this.getSchema());
    }
    /**
     * Sets the applicationId property value. Identifier of the application this template belongs to.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this._applicationId = value;
    }
    /**
     * Sets the default property value. true if this template is recommended to be the default for the application.
     * @param value Value to set for the default property.
     * @return a void
     */
    public void setDefault(@javax.annotation.Nullable final Boolean value) {
        this._default_escaped = value;
    }
    /**
     * Sets the description property value. Description of the template.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the discoverable property value. true if this template should appear in the collection of templates available for the application instance (service principal).
     * @param value Value to set for the discoverable property.
     * @return a void
     */
    public void setDiscoverable(@javax.annotation.Nullable final Boolean value) {
        this._discoverable = value;
    }
    /**
     * Sets the factoryTag property value. One of the well-known factory tags supported by the synchronization engine. The factoryTag tells the synchronization engine which implementation to use when processing jobs based on this template.
     * @param value Value to set for the factoryTag property.
     * @return a void
     */
    public void setFactoryTag(@javax.annotation.Nullable final String value) {
        this._factoryTag = value;
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final java.util.List<MetadataEntry> value) {
        this._metadata = value;
    }
    /**
     * Sets the schema property value. Default synchronization schema for the jobs based on this template.
     * @param value Value to set for the schema property.
     * @return a void
     */
    public void setSchema(@javax.annotation.Nullable final SynchronizationSchema value) {
        this._schema = value;
    }
}
