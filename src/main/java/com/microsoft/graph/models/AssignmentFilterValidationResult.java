package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents result of Validation API. */
public class AssignmentFilterValidationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicator to valid or invalid rule. */
    private Boolean _isValidRule;
    /**
     * Instantiates a new assignmentFilterValidationResult and sets the default values.
     * @return a void
     */
    public AssignmentFilterValidationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterValidationResult
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterValidationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterValidationResult();
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
        final AssignmentFilterValidationResult currentObject = this;
        return new HashMap<>(1) {{
            this.put("isValidRule", (n) -> { currentObject.setIsValidRule(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isValidRule property value. Indicator to valid or invalid rule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValidRule() {
        return this._isValidRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isValidRule", this.getIsValidRule());
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
     * Sets the isValidRule property value. Indicator to valid or invalid rule.
     * @param value Value to set for the isValidRule property.
     * @return a void
     */
    public void setIsValidRule(@javax.annotation.Nullable final Boolean value) {
        this._isValidRule = value;
    }
}
