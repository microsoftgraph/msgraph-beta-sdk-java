package microsoft.graph.dataclassification.exactmatchdatastores.item.lookup;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the lookup method. */
public class LookupPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The key property */
    private String _key;
    /** The resultColumnNames property */
    private java.util.List<String> _resultColumnNames;
    /** The values property */
    private java.util.List<String> _values;
    /**
     * Instantiates a new lookupPostRequestBody and sets the default values.
     * @return a void
     */
    public LookupPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lookupPostRequestBody
     */
    @javax.annotation.Nonnull
    public static LookupPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupPostRequestBody();
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
        final LookupPostRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("key", (n) -> { currentObject.setKey(n.getStringValue()); });
            this.put("resultColumnNames", (n) -> { currentObject.setResultColumnNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the key property value. The key property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this._key;
    }
    /**
     * Gets the resultColumnNames property value. The resultColumnNames property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResultColumnNames() {
        return this._resultColumnNames;
    }
    /**
     * Gets the values property value. The values property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("key", this.getKey());
        writer.writeCollectionOfPrimitiveValues("resultColumnNames", this.getResultColumnNames());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
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
     * Sets the key property value. The key property
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final String value) {
        this._key = value;
    }
    /**
     * Sets the resultColumnNames property value. The resultColumnNames property
     * @param value Value to set for the resultColumnNames property.
     * @return a void
     */
    public void setResultColumnNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resultColumnNames = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this._values = value;
    }
}
