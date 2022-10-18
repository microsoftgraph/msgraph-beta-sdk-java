package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationConfigurationValidation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The errors property */
    private java.util.List<GenericError> _errors;
    /** The OdataType property */
    private String _odataType;
    /** The warnings property */
    private java.util.List<GenericError> _warnings;
    /**
     * Instantiates a new authenticationConfigurationValidation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationConfigurationValidation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.authenticationConfigurationValidation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationConfigurationValidation
     */
    @javax.annotation.Nonnull
    public static AuthenticationConfigurationValidation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationConfigurationValidation();
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
     * Gets the errors property value. The errors property
     * @return a genericError
     */
    @javax.annotation.Nullable
    public java.util.List<GenericError> getErrors() {
        return this._errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationConfigurationValidation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("errors", (n) -> { currentObject.setErrors(n.getCollectionOfObjectValues(GenericError::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("warnings", (n) -> { currentObject.setWarnings(n.getCollectionOfObjectValues(GenericError::createFromDiscriminatorValue)); });
        }};
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
     * Gets the warnings property value. The warnings property
     * @return a genericError
     */
    @javax.annotation.Nullable
    public java.util.List<GenericError> getWarnings() {
        return this._warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<GenericError> value) {
        this._errors = value;
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
     * Sets the warnings property value. The warnings property
     * @param value Value to set for the warnings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWarnings(@javax.annotation.Nullable final java.util.List<GenericError> value) {
        this._warnings = value;
    }
}
