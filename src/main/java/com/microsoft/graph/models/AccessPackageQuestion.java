package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageQuestion implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** ID of the question. */
    private String _id;
    /** Specifies whether the requestor is allowed to edit answers to questions. */
    private Boolean _isAnswerEditable;
    /** Whether the requestor is required to supply an answer or not. */
    private Boolean _isRequired;
    /** Relative position of this question when displaying a list of questions to the requestor. */
    private Integer _sequence;
    /** The text of the question to show to the requestor. */
    private AccessPackageLocalizedContent _text;
    /**
     * Instantiates a new accessPackageQuestion and sets the default values.
     * @return a void
     */
    public AccessPackageQuestion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nonnull
    public static AccessPackageQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageQuestion();
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
        final AccessPackageQuestion currentObject = this;
        return new HashMap<>(5) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("isAnswerEditable", (n) -> { currentObject.setIsAnswerEditable(n.getBooleanValue()); });
            this.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
            this.put("sequence", (n) -> { currentObject.setSequence(n.getIntegerValue()); });
            this.put("text", (n) -> { currentObject.setText(n.getObjectValue(AccessPackageLocalizedContent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the id property value. ID of the question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAnswerEditable() {
        return this._isAnswerEditable;
    }
    /**
     * Gets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this._isRequired;
    }
    /**
     * Gets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSequence() {
        return this._sequence;
    }
    /**
     * Gets the text property value. The text of the question to show to the requestor.
     * @return a accessPackageLocalizedContent
     */
    @javax.annotation.Nullable
    public AccessPackageLocalizedContent getText() {
        return this._text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isAnswerEditable", this.getIsAnswerEditable());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeObjectValue("text", this.getText());
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
     * Sets the id property value. ID of the question.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions.
     * @param value Value to set for the isAnswerEditable property.
     * @return a void
     */
    public void setIsAnswerEditable(@javax.annotation.Nullable final Boolean value) {
        this._isAnswerEditable = value;
    }
    /**
     * Sets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @param value Value to set for the sequence property.
     * @return a void
     */
    public void setSequence(@javax.annotation.Nullable final Integer value) {
        this._sequence = value;
    }
    /**
     * Sets the text property value. The text of the question to show to the requestor.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final AccessPackageLocalizedContent value) {
        this._text = value;
    }
}
