package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The length property */
    private Integer _length;
    /** The OdataType property */
    private String _odataType;
    /** The offset property */
    private Integer _offset;
    /**
     * Instantiates a new matchLocation and sets the default values.
     * @return a void
     */
    public MatchLocation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.matchLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a matchLocation
     */
    @javax.annotation.Nonnull
    public static MatchLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MatchLocation();
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
        final MatchLocation currentObject = this;
        return new HashMap<>(3) {{
            this.put("length", (n) -> { currentObject.setLength(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("offset", (n) -> { currentObject.setOffset(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the length property value. The length property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLength() {
        return this._length;
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
     * Gets the offset property value. The offset property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffset() {
        return this._offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("length", this.getLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offset", this.getOffset());
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
     * Sets the length property value. The length property
     * @param value Value to set for the length property.
     * @return a void
     */
    public void setLength(@javax.annotation.Nullable final Integer value) {
        this._length = value;
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
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     * @return a void
     */
    public void setOffset(@javax.annotation.Nullable final Integer value) {
        this._offset = value;
    }
}
