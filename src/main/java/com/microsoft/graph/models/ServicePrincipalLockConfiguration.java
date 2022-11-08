package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePrincipalLockConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The allProperties property */
    private Boolean _allProperties;
    /** The credentialsWithUsageSign property */
    private Boolean _credentialsWithUsageSign;
    /** The credentialsWithUsageVerify property */
    private Boolean _credentialsWithUsageVerify;
    /** The isEnabled property */
    private Boolean _isEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The tokenEncryptionKeyId property */
    private Boolean _tokenEncryptionKeyId;
    /**
     * Instantiates a new servicePrincipalLockConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalLockConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.servicePrincipalLockConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a servicePrincipalLockConfiguration
     */
    @javax.annotation.Nonnull
    public static ServicePrincipalLockConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalLockConfiguration();
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
     * Gets the allProperties property value. The allProperties property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllProperties() {
        return this._allProperties;
    }
    /**
     * Gets the credentialsWithUsageSign property value. The credentialsWithUsageSign property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCredentialsWithUsageSign() {
        return this._credentialsWithUsageSign;
    }
    /**
     * Gets the credentialsWithUsageVerify property value. The credentialsWithUsageVerify property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCredentialsWithUsageVerify() {
        return this._credentialsWithUsageVerify;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServicePrincipalLockConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("allProperties", (n) -> { currentObject.setAllProperties(n.getBooleanValue()); });
            this.put("credentialsWithUsageSign", (n) -> { currentObject.setCredentialsWithUsageSign(n.getBooleanValue()); });
            this.put("credentialsWithUsageVerify", (n) -> { currentObject.setCredentialsWithUsageVerify(n.getBooleanValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tokenEncryptionKeyId", (n) -> { currentObject.setTokenEncryptionKeyId(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
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
     * Gets the tokenEncryptionKeyId property value. The tokenEncryptionKeyId property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTokenEncryptionKeyId() {
        return this._tokenEncryptionKeyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allProperties", this.getAllProperties());
        writer.writeBooleanValue("credentialsWithUsageSign", this.getCredentialsWithUsageSign());
        writer.writeBooleanValue("credentialsWithUsageVerify", this.getCredentialsWithUsageVerify());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
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
     * Sets the allProperties property value. The allProperties property
     * @param value Value to set for the allProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllProperties(@javax.annotation.Nullable final Boolean value) {
        this._allProperties = value;
    }
    /**
     * Sets the credentialsWithUsageSign property value. The credentialsWithUsageSign property
     * @param value Value to set for the credentialsWithUsageSign property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentialsWithUsageSign(@javax.annotation.Nullable final Boolean value) {
        this._credentialsWithUsageSign = value;
    }
    /**
     * Sets the credentialsWithUsageVerify property value. The credentialsWithUsageVerify property
     * @param value Value to set for the credentialsWithUsageVerify property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentialsWithUsageVerify(@javax.annotation.Nullable final Boolean value) {
        this._credentialsWithUsageVerify = value;
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
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
     * Sets the tokenEncryptionKeyId property value. The tokenEncryptionKeyId property
     * @param value Value to set for the tokenEncryptionKeyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenEncryptionKeyId(@javax.annotation.Nullable final Boolean value) {
        this._tokenEncryptionKeyId = value;
    }
}
