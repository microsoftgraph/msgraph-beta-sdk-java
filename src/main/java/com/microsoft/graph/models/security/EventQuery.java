package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventQuery implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The query property */
    private String _query;
    /** The queryType property */
    private QueryType _queryType;
    /**
     * Instantiates a new eventQuery and sets the default values.
     * @return a void
     */
    public EventQuery() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.eventQuery");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventQuery
     */
    @javax.annotation.Nonnull
    public static EventQuery createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventQuery();
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
        final EventQuery currentObject = this;
        return new HashMap<>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("query", (n) -> { currentObject.setQuery(n.getStringValue()); });
            this.put("queryType", (n) -> { currentObject.setQueryType(n.getEnumValue(QueryType.class)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the query property value. The query property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this._query;
    }
    /**
     * Gets the queryType property value. The queryType property
     * @return a queryType
     */
    @javax.annotation.Nullable
    public QueryType getQueryType() {
        return this._queryType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("query", this.getQuery());
        writer.writeEnumValue("queryType", this.getQueryType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     * @return a void
     */
    public void setQuery(@javax.annotation.Nullable final String value) {
        this._query = value;
    }
    /**
     * Sets the queryType property value. The queryType property
     * @param value Value to set for the queryType property.
     * @return a void
     */
    public void setQueryType(@javax.annotation.Nullable final QueryType value) {
        this._queryType = value;
    }
}
