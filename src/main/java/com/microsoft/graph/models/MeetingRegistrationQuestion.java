package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistrationQuestion extends Entity implements Parsable {
    /** Answer input type of the custom registration question. */
    private AnswerInputType _answerInputType;
    /** Answer options when answerInputType is radioButton. */
    private java.util.List<String> _answerOptions;
    /** Display name of the custom registration question. */
    private String _displayName;
    /** Indicates whether the question is required. Default value is false. */
    private Boolean _isRequired;
    /**
     * Instantiates a new meetingRegistrationQuestion and sets the default values.
     * @return a void
     */
    public MeetingRegistrationQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingRegistrationQuestion
     */
    @javax.annotation.Nonnull
    public static MeetingRegistrationQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrationQuestion();
    }
    /**
     * Gets the answerInputType property value. Answer input type of the custom registration question.
     * @return a answerInputType
     */
    @javax.annotation.Nullable
    public AnswerInputType getAnswerInputType() {
        return this._answerInputType;
    }
    /**
     * Gets the answerOptions property value. Answer options when answerInputType is radioButton.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAnswerOptions() {
        return this._answerOptions;
    }
    /**
     * Gets the displayName property value. Display name of the custom registration question.
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
        final MeetingRegistrationQuestion currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("answerInputType", (n) -> { currentObject.setAnswerInputType(n.getEnumValue(AnswerInputType.class)); });
            this.put("answerOptions", (n) -> { currentObject.setAnswerOptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isRequired property value. Indicates whether the question is required. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this._isRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeCollectionOfPrimitiveValues("answerOptions", this.getAnswerOptions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
    }
    /**
     * Sets the answerInputType property value. Answer input type of the custom registration question.
     * @param value Value to set for the answerInputType property.
     * @return a void
     */
    public void setAnswerInputType(@javax.annotation.Nullable final AnswerInputType value) {
        this._answerInputType = value;
    }
    /**
     * Sets the answerOptions property value. Answer options when answerInputType is radioButton.
     * @param value Value to set for the answerOptions property.
     * @return a void
     */
    public void setAnswerOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._answerOptions = value;
    }
    /**
     * Sets the displayName property value. Display name of the custom registration question.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isRequired property value. Indicates whether the question is required. Default value is false.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
}
