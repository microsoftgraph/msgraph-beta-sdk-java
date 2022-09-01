package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationConditionsApplications implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The includeAllApplications property */
    private Boolean _includeAllApplications;
    /** The includeApplications property */
    private java.util.List<AuthenticationConditionApplication> _includeApplications;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new authenticationConditionsApplications and sets the default values.
     * @return a void
     */
    public AuthenticationConditionsApplications() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.authenticationConditionsApplications");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationConditionsApplications
     */
    @javax.annotation.Nonnull
    public static AuthenticationConditionsApplications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationConditionsApplications();
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
        final AuthenticationConditionsApplications currentObject = this;
        return new HashMap<>(3) {{
            this.put("includeAllApplications", (n) -> { currentObject.setIncludeAllApplications(n.getBooleanValue()); });
            this.put("includeApplications", (n) -> { currentObject.setIncludeApplications(n.getCollectionOfObjectValues(AuthenticationConditionApplication::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the includeAllApplications property value. The includeAllApplications property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeAllApplications() {
        return this._includeAllApplications;
    }
    /**
     * Gets the includeApplications property value. The includeApplications property
     * @return a authenticationConditionApplication
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationConditionApplication> getIncludeApplications() {
        return this._includeApplications;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("includeAllApplications", this.getIncludeAllApplications());
        writer.writeCollectionOfObjectValues("includeApplications", this.getIncludeApplications());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the includeAllApplications property value. The includeAllApplications property
     * @param value Value to set for the includeAllApplications property.
     * @return a void
     */
    public void setIncludeAllApplications(@javax.annotation.Nullable final Boolean value) {
        this._includeAllApplications = value;
    }
    /**
     * Sets the includeApplications property value. The includeApplications property
     * @param value Value to set for the includeApplications property.
     * @return a void
     */
    public void setIncludeApplications(@javax.annotation.Nullable final java.util.List<AuthenticationConditionApplication> value) {
        this._includeApplications = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
