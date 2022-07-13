package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationSchema extends Entity implements Parsable {
    /** Contains the collection of directories and all of their objects. */
    private java.util.List<DirectoryDefinition> _directories;
    /** A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate. */
    private java.util.List<SynchronizationRule> _synchronizationRules;
    /** The version of the schema, updated automatically with every schema change. */
    private String _version;
    /**
     * Instantiates a new synchronizationSchema and sets the default values.
     * @return a void
     */
    public SynchronizationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationSchema
     */
    @javax.annotation.Nonnull
    public static SynchronizationSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationSchema();
    }
    /**
     * Gets the directories property value. Contains the collection of directories and all of their objects.
     * @return a directoryDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryDefinition> getDirectories() {
        return this._directories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationSchema currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("directories", (n) -> { currentObject.setDirectories(n.getCollectionOfObjectValues(DirectoryDefinition::createFromDiscriminatorValue)); });
            this.put("synchronizationRules", (n) -> { currentObject.setSynchronizationRules(n.getCollectionOfObjectValues(SynchronizationRule::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the synchronizationRules property value. A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate.
     * @return a synchronizationRule
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationRule> getSynchronizationRules() {
        return this._synchronizationRules;
    }
    /**
     * Gets the version property value. The version of the schema, updated automatically with every schema change.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("directories", this.getDirectories());
        writer.writeCollectionOfObjectValues("synchronizationRules", this.getSynchronizationRules());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the directories property value. Contains the collection of directories and all of their objects.
     * @param value Value to set for the directories property.
     * @return a void
     */
    public void setDirectories(@javax.annotation.Nullable final java.util.List<DirectoryDefinition> value) {
        this._directories = value;
    }
    /**
     * Sets the synchronizationRules property value. A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate.
     * @param value Value to set for the synchronizationRules property.
     * @return a void
     */
    public void setSynchronizationRules(@javax.annotation.Nullable final java.util.List<SynchronizationRule> value) {
        this._synchronizationRules = value;
    }
    /**
     * Sets the version property value. The version of the schema, updated automatically with every schema change.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
