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
    /**
     * Instantiates a new TypedEmailAddress and sets the default values.
     * @return a void
     */
    public TypedEmailAddress() {
        super();
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("otherLabel", this.getOtherLabel());
    }
    /**
     * Sets the otherLabel property value. To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work.
     * @param value Value to set for the otherLabel property.
     * @return a void
     */
    public void setOtherLabel(@javax.annotation.Nullable final String value) {
        this._otherLabel = value;
    }
}
