package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The string containing the reason for why the rule passed or not. Read-only. Not nullable. */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /** The string containing the name of the password validation rule that the action was validated against. Read-only. Not nullable. */
    private String _ruleName;
    /** Whether the password passed or failed the validation rule. Read-only. Not nullable. */
    private Boolean _validationPassed;
    /**
     * Instantiates a new validationResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ValidationResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.validationResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validationResult
     */
    @javax.annotation.Nonnull
    public static ValidationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidationResult();
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
        final ValidationResult currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleName", (n) -> { currentObject.setRuleName(n.getStringValue()); });
        deserializerMap.put("validationPassed", (n) -> { currentObject.setValidationPassed(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the message property value. The string containing the reason for why the rule passed or not. Read-only. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the ruleName property value. The string containing the name of the password validation rule that the action was validated against. Read-only. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleName() {
        return this._ruleName;
    }
    /**
     * Gets the validationPassed property value. Whether the password passed or failed the validation rule. Read-only. Not nullable.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getValidationPassed() {
        return this._validationPassed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeBooleanValue("validationPassed", this.getValidationPassed());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the message property value. The string containing the reason for why the rule passed or not. Read-only. Not nullable.
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the ruleName property value. The string containing the name of the password validation rule that the action was validated against. Read-only. Not nullable.
     * @param value Value to set for the ruleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleName(@javax.annotation.Nullable final String value) {
        this._ruleName = value;
    }
    /**
     * Sets the validationPassed property value. Whether the password passed or failed the validation rule. Read-only. Not nullable.
     * @param value Value to set for the validationPassed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidationPassed(@javax.annotation.Nullable final Boolean value) {
        this._validationPassed = value;
    }
}
