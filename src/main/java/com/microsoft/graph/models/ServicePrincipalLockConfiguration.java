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
    /** Enables locking all sensitive properties. The sensitive properties are keyCredentials, passwordCredentials, and tokenEncryptionKeyId. */
    private Boolean _allProperties;
    /** Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Sign. */
    private Boolean _credentialsWithUsageSign;
    /** Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Verify. This locks OAuth service principals. */
    private Boolean _credentialsWithUsageVerify;
    /** Enables or disables service principal lock configuration. To allow the sensitive properties to be updated, update this property to false to disable the lock on the service principal. */
    private Boolean _isEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Locks the tokenEncryptionKeyId property for modification on the service principal. */
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
     * Gets the allProperties property value. Enables locking all sensitive properties. The sensitive properties are keyCredentials, passwordCredentials, and tokenEncryptionKeyId.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllProperties() {
        return this._allProperties;
    }
    /**
     * Gets the credentialsWithUsageSign property value. Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Sign.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCredentialsWithUsageSign() {
        return this._credentialsWithUsageSign;
    }
    /**
     * Gets the credentialsWithUsageVerify property value. Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Verify. This locks OAuth service principals.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("allProperties", (n) -> { currentObject.setAllProperties(n.getBooleanValue()); });
        deserializerMap.put("credentialsWithUsageSign", (n) -> { currentObject.setCredentialsWithUsageSign(n.getBooleanValue()); });
        deserializerMap.put("credentialsWithUsageVerify", (n) -> { currentObject.setCredentialsWithUsageVerify(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("tokenEncryptionKeyId", (n) -> { currentObject.setTokenEncryptionKeyId(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the isEnabled property value. Enables or disables service principal lock configuration. To allow the sensitive properties to be updated, update this property to false to disable the lock on the service principal.
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
     * Gets the tokenEncryptionKeyId property value. Locks the tokenEncryptionKeyId property for modification on the service principal.
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
     * Sets the allProperties property value. Enables locking all sensitive properties. The sensitive properties are keyCredentials, passwordCredentials, and tokenEncryptionKeyId.
     * @param value Value to set for the allProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllProperties(@javax.annotation.Nullable final Boolean value) {
        this._allProperties = value;
    }
    /**
     * Sets the credentialsWithUsageSign property value. Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Sign.
     * @param value Value to set for the credentialsWithUsageSign property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentialsWithUsageSign(@javax.annotation.Nullable final Boolean value) {
        this._credentialsWithUsageSign = value;
    }
    /**
     * Sets the credentialsWithUsageVerify property value. Locks the keyCredentials and passwordCredentials properties for modification where credential usage type is Verify. This locks OAuth service principals.
     * @param value Value to set for the credentialsWithUsageVerify property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentialsWithUsageVerify(@javax.annotation.Nullable final Boolean value) {
        this._credentialsWithUsageVerify = value;
    }
    /**
     * Sets the isEnabled property value. Enables or disables service principal lock configuration. To allow the sensitive properties to be updated, update this property to false to disable the lock on the service principal.
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
     * Sets the tokenEncryptionKeyId property value. Locks the tokenEncryptionKeyId property for modification on the service principal.
     * @param value Value to set for the tokenEncryptionKeyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenEncryptionKeyId(@javax.annotation.Nullable final Boolean value) {
        this._tokenEncryptionKeyId = value;
    }
}
