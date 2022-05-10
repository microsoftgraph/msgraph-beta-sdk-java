package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Phone implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The phone number. */
    private String _number;
    /** The type of phone number. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio. */
    private PhoneType _type;
    /**
     * Instantiates a new phone and sets the default values.
     * @return a void
     */
    public Phone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a phone
     */
    @javax.annotation.Nonnull
    public static Phone createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Phone();
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
        final Phone currentObject = this;
        return new HashMap<>(2) {{
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(PhoneType.class)); });
        }};
    }
    /**
     * Gets the number property value. The phone number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the type property value. The type of phone number. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio.
     * @return a phoneType
     */
    @javax.annotation.Nullable
    public PhoneType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("number", this.getNumber());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the number property value. The phone number.
     * @param value Value to set for the number property.
     * @return a void
     */
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the type property value. The type of phone number. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final PhoneType value) {
        this._type = value;
    }
}
