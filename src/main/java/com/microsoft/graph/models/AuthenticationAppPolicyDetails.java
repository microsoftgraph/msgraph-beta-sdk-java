package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationAppPolicyDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The adminConfiguration property */
    private AuthenticationAppAdminConfiguration _adminConfiguration;
    /** The authenticationEvaluation property */
    private AuthenticationAppEvaluation _authenticationEvaluation;
    /** The OdataType property */
    private String _odataType;
    /** The policyName property */
    private String _policyName;
    /** The status property */
    private AuthenticationAppPolicyStatus _status;
    /**
     * Instantiates a new authenticationAppPolicyDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationAppPolicyDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.authenticationAppPolicyDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationAppPolicyDetails
     */
    @javax.annotation.Nonnull
    public static AuthenticationAppPolicyDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAppPolicyDetails();
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
     * Gets the adminConfiguration property value. The adminConfiguration property
     * @return a authenticationAppAdminConfiguration
     */
    @javax.annotation.Nullable
    public AuthenticationAppAdminConfiguration getAdminConfiguration() {
        return this._adminConfiguration;
    }
    /**
     * Gets the authenticationEvaluation property value. The authenticationEvaluation property
     * @return a authenticationAppEvaluation
     */
    @javax.annotation.Nullable
    public AuthenticationAppEvaluation getAuthenticationEvaluation() {
        return this._authenticationEvaluation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationAppPolicyDetails currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("adminConfiguration", (n) -> { currentObject.setAdminConfiguration(n.getEnumValue(AuthenticationAppAdminConfiguration.class)); });
        deserializerMap.put("authenticationEvaluation", (n) -> { currentObject.setAuthenticationEvaluation(n.getEnumValue(AuthenticationAppEvaluation.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { currentObject.setPolicyName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AuthenticationAppPolicyStatus.class)); });
        return deserializerMap
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
     * Gets the policyName property value. The policyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this._policyName;
    }
    /**
     * Gets the status property value. The status property
     * @return a authenticationAppPolicyStatus
     */
    @javax.annotation.Nullable
    public AuthenticationAppPolicyStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("adminConfiguration", this.getAdminConfiguration());
        writer.writeEnumValue("authenticationEvaluation", this.getAuthenticationEvaluation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the adminConfiguration property value. The adminConfiguration property
     * @param value Value to set for the adminConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminConfiguration(@javax.annotation.Nullable final AuthenticationAppAdminConfiguration value) {
        this._adminConfiguration = value;
    }
    /**
     * Sets the authenticationEvaluation property value. The authenticationEvaluation property
     * @param value Value to set for the authenticationEvaluation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationEvaluation(@javax.annotation.Nullable final AuthenticationAppEvaluation value) {
        this._authenticationEvaluation = value;
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
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this._policyName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AuthenticationAppPolicyStatus value) {
        this._status = value;
    }
}
