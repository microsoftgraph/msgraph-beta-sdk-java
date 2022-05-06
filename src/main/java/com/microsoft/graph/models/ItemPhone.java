package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemPhone extends ItemFacet implements Parsable {
    /** Friendly name the user has assigned this phone number.  */
    private String _displayName;
    /** Phone number provided by the user.  */
    private String _number;
    /** The type of phone number within the object. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio.  */
    private PhoneType _type;
    /**
     * Instantiates a new itemPhone and sets the default values.
     * @return a void
     */
    public ItemPhone() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemPhone
     */
    @javax.annotation.Nonnull
    public static ItemPhone createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPhone();
    }
    /**
     * Gets the displayName property value. Friendly name the user has assigned this phone number.
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
        final ItemPhone currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(PhoneType.class)); });
        }};
    }
    /**
     * Gets the number property value. Phone number provided by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the type property value. The type of phone number within the object. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio.
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
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. Friendly name the user has assigned this phone number.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the number property value. Phone number provided by the user.
     * @param value Value to set for the number property.
     * @return a void
     */
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the type property value. The type of phone number within the object. Possible values are: home, business, mobile, other, assistant, homeFax, businessFax, otherFax, pager, radio.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final PhoneType value) {
        this._type = value;
    }
}
