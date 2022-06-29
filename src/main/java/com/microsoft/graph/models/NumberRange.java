package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Number Range definition. */
public class NumberRange implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Lower number. */
    private Integer _lowerNumber;
    /** Upper number. */
    private Integer _upperNumber;
    /**
     * Instantiates a new numberRange and sets the default values.
     * @return a void
     */
    public NumberRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a numberRange
     */
    @javax.annotation.Nonnull
    public static NumberRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberRange();
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
        final NumberRange currentObject = this;
        return new HashMap<>(2) {{
            this.put("lowerNumber", (n) -> { currentObject.setLowerNumber(n.getIntegerValue()); });
            this.put("upperNumber", (n) -> { currentObject.setUpperNumber(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lowerNumber property value. Lower number.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLowerNumber() {
        return this._lowerNumber;
    }
    /**
     * Gets the upperNumber property value. Upper number.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUpperNumber() {
        return this._upperNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("lowerNumber", this.getLowerNumber());
        writer.writeIntegerValue("upperNumber", this.getUpperNumber());
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
     * Sets the lowerNumber property value. Lower number.
     * @param value Value to set for the lowerNumber property.
     * @return a void
     */
    public void setLowerNumber(@javax.annotation.Nullable final Integer value) {
        this._lowerNumber = value;
    }
    /**
     * Sets the upperNumber property value. Upper number.
     * @param value Value to set for the upperNumber property.
     * @return a void
     */
    public void setUpperNumber(@javax.annotation.Nullable final Integer value) {
        this._upperNumber = value;
    }
}
