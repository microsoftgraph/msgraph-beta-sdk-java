package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationMultiTextBox extends GroupPolicyPresentation implements Parsable {
    /** An unsigned integer that specifies the maximum number of text characters. Default value is 1023. */
    private Long _maxLength;
    /** An unsigned integer that specifies the maximum number of strings. Default value is 0. */
    private Long _maxStrings;
    /** Requirement to enter a value in the text box. Default value is false. */
    private Boolean _required;
    /**
     * Instantiates a new GroupPolicyPresentationMultiTextBox and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentationMultiTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationMultiTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationMultiTextBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationMultiTextBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationMultiTextBox();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationMultiTextBox currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("maxLength", (n) -> { currentObject.setMaxLength(n.getLongValue()); });
            this.put("maxStrings", (n) -> { currentObject.setMaxStrings(n.getLongValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxLength() {
        return this._maxLength;
    }
    /**
     * Gets the maxStrings property value. An unsigned integer that specifies the maximum number of strings. Default value is 0.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxStrings() {
        return this._maxStrings;
    }
    /**
     * Gets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("maxLength", this.getMaxLength());
        writer.writeLongValue("maxStrings", this.getMaxStrings());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @param value Value to set for the maxLength property.
     * @return a void
     */
    public void setMaxLength(@javax.annotation.Nullable final Long value) {
        this._maxLength = value;
    }
    /**
     * Sets the maxStrings property value. An unsigned integer that specifies the maximum number of strings. Default value is 0.
     * @param value Value to set for the maxStrings property.
     * @return a void
     */
    public void setMaxStrings(@javax.annotation.Nullable final Long value) {
        this._maxStrings = value;
    }
    /**
     * Sets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
}
