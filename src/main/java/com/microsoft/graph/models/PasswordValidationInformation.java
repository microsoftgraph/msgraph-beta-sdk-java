package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordValidationInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether the password is valid based on the calculation of the results in the validationResults property. Not nullable. Read-only. */
    private Boolean _isValid;
    /** The list of password validation rules and whether the password passed those rules. Not nullable. Read-only. */
    private java.util.List<ValidationResult> _validationResults;
    /**
     * Instantiates a new PasswordValidationInformation and sets the default values.
     * @return a void
     */
    public PasswordValidationInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PasswordValidationInformation
     */
    @javax.annotation.Nonnull
    public static PasswordValidationInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordValidationInformation();
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
        final PasswordValidationInformation currentObject = this;
        return new HashMap<>(2) {{
            this.put("isValid", (n) -> { currentObject.setIsValid(n.getBooleanValue()); });
            this.put("validationResults", (n) -> { currentObject.setValidationResults(n.getCollectionOfObjectValues(ValidationResult::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isValid property value. Specifies whether the password is valid based on the calculation of the results in the validationResults property. Not nullable. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValid() {
        return this._isValid;
    }
    /**
     * Gets the validationResults property value. The list of password validation rules and whether the password passed those rules. Not nullable. Read-only.
     * @return a validationResult
     */
    @javax.annotation.Nullable
    public java.util.List<ValidationResult> getValidationResults() {
        return this._validationResults;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isValid", this.getIsValid());
        writer.writeCollectionOfObjectValues("validationResults", this.getValidationResults());
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
     * Sets the isValid property value. Specifies whether the password is valid based on the calculation of the results in the validationResults property. Not nullable. Read-only.
     * @param value Value to set for the isValid property.
     * @return a void
     */
    public void setIsValid(@javax.annotation.Nullable final Boolean value) {
        this._isValid = value;
    }
    /**
     * Sets the validationResults property value. The list of password validation rules and whether the password passed those rules. Not nullable. Read-only.
     * @param value Value to set for the validationResults property.
     * @return a void
     */
    public void setValidationResults(@javax.annotation.Nullable final java.util.List<ValidationResult> value) {
        this._validationResults = value;
    }
}
