package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the dataClassificationService singleton. */
public class ExactMatchDataStoreBase extends Entity implements Parsable {
    /** The columns property */
    private java.util.List<ExactDataMatchStoreColumn> _columns;
    /** The dataLastUpdatedDateTime property */
    private OffsetDateTime _dataLastUpdatedDateTime;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /**
     * Instantiates a new exactMatchDataStoreBase and sets the default values.
     * @return a void
     */
    public ExactMatchDataStoreBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchDataStoreBase
     */
    @javax.annotation.Nonnull
    public static ExactMatchDataStoreBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.exactMatchDataStore": return new ExactMatchDataStore();
            }
        }
        return new ExactMatchDataStoreBase();
    }
    /**
     * Gets the columns property value. The columns property
     * @return a exactDataMatchStoreColumn
     */
    @javax.annotation.Nullable
    public java.util.List<ExactDataMatchStoreColumn> getColumns() {
        return this._columns;
    }
    /**
     * Gets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDataLastUpdatedDateTime() {
        return this._dataLastUpdatedDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final ExactMatchDataStoreBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("columns", (n) -> { currentObject.setColumns(n.getCollectionOfObjectValues(ExactDataMatchStoreColumn::createFromDiscriminatorValue)); });
            this.put("dataLastUpdatedDateTime", (n) -> { currentObject.setDataLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeOffsetDateTimeValue("dataLastUpdatedDateTime", this.getDataLastUpdatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the columns property value. The columns property
     * @param value Value to set for the columns property.
     * @return a void
     */
    public void setColumns(@javax.annotation.Nullable final java.util.List<ExactDataMatchStoreColumn> value) {
        this._columns = value;
    }
    /**
     * Sets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @param value Value to set for the dataLastUpdatedDateTime property.
     * @return a void
     */
    public void setDataLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dataLastUpdatedDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}
