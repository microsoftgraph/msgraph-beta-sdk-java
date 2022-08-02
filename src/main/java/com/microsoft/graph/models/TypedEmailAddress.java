package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TypedEmailAddress extends EmailAddress implements Parsable {
    /** To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work. */
    private String _otherLabel;
    /** The type of email address. Possible values are: unknown, work, personal, main, other. The default value is unknown, which means address has not been set as a specific type. */
    private EmailType _type;
    /**
     * Instantiates a new TypedEmailAddress and sets the default values.
     * @return a void
     */
    public TypedEmailAddress() {
        super();
        this.setOdataType("#microsoft.graph.typedEmailAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TypedEmailAddress
     */
    @javax.annotation.Nonnull
    public static TypedEmailAddress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TypedEmailAddress();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TypedEmailAddress currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("otherLabel", (n) -> { currentObject.setOtherLabel(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(EmailType.class)); });
        }};
    }
    /**
     * Gets the otherLabel property value. To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOtherLabel() {
        return this._otherLabel;
    }
    /**
     * Gets the type property value. The type of email address. Possible values are: unknown, work, personal, main, other. The default value is unknown, which means address has not been set as a specific type.
     * @return a emailType
     */
    @javax.annotation.Nullable
    public EmailType getType() {
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
        writer.writeStringValue("otherLabel", this.getOtherLabel());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the otherLabel property value. To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work.
     * @param value Value to set for the otherLabel property.
     * @return a void
     */
    public void setOtherLabel(@javax.annotation.Nullable final String value) {
        this._otherLabel = value;
    }
    /**
     * Sets the type property value. The type of email address. Possible values are: unknown, work, personal, main, other. The default value is unknown, which means address has not been set as a specific type.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final EmailType value) {
        this._type = value;
    }
}
