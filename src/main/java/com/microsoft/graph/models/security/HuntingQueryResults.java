package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HuntingQueryResults implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The results property */
    private java.util.List<HuntingRowResult> _results;
    /** The schema property */
    private java.util.List<SinglePropertySchema> _schema;
    /**
     * Instantiates a new huntingQueryResults and sets the default values.
     * @return a void
     */
    public HuntingQueryResults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a huntingQueryResults
     */
    @javax.annotation.Nonnull
    public static HuntingQueryResults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HuntingQueryResults();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HuntingQueryResults currentObject = this;
        return new HashMap<>(2) {{
            this.put("results", (n) -> { currentObject.setResults(n.getCollectionOfObjectValues(HuntingRowResult::createFromDiscriminatorValue)); });
            this.put("schema", (n) -> { currentObject.setSchema(n.getCollectionOfObjectValues(SinglePropertySchema::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the results property value. The results property
     * @return a huntingRowResult
     */
    @javax.annotation.Nullable
    public java.util.List<HuntingRowResult> getResults() {
        return this._results;
    }
    /**
     * Gets the schema property value. The schema property
     * @return a singlePropertySchema
     */
    @javax.annotation.Nullable
    public java.util.List<SinglePropertySchema> getSchema() {
        return this._schema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeCollectionOfObjectValues("schema", this.getSchema());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the results property value. The results property
     * @param value Value to set for the results property.
     * @return a void
     */
    public void setResults(@javax.annotation.Nullable final java.util.List<HuntingRowResult> value) {
        this._results = value;
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     * @return a void
     */
    public void setSchema(@javax.annotation.Nullable final java.util.List<SinglePropertySchema> value) {
        this._schema = value;
    }
}
