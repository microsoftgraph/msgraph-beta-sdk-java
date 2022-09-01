package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KerberosSignOnSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials. */
    private String _kerberosServicePrincipalName;
    /** The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName. */
    private KerberosSignOnMappingAttributeType _kerberosSignOnMappingAttributeType;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new kerberosSignOnSettings and sets the default values.
     * @return a void
     */
    public KerberosSignOnSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.kerberosSignOnSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kerberosSignOnSettings
     */
    @javax.annotation.Nonnull
    public static KerberosSignOnSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KerberosSignOnSettings();
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
        final KerberosSignOnSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("kerberosServicePrincipalName", (n) -> { currentObject.setKerberosServicePrincipalName(n.getStringValue()); });
            this.put("kerberosSignOnMappingAttributeType", (n) -> { currentObject.setKerberosSignOnMappingAttributeType(n.getEnumValue(KerberosSignOnMappingAttributeType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the kerberosServicePrincipalName property value. The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKerberosServicePrincipalName() {
        return this._kerberosServicePrincipalName;
    }
    /**
     * Gets the kerberosSignOnMappingAttributeType property value. The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     * @return a kerberosSignOnMappingAttributeType
     */
    @javax.annotation.Nullable
    public KerberosSignOnMappingAttributeType getKerberosSignOnMappingAttributeType() {
        return this._kerberosSignOnMappingAttributeType;
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
        writer.writeStringValue("kerberosServicePrincipalName", this.getKerberosServicePrincipalName());
        writer.writeEnumValue("kerberosSignOnMappingAttributeType", this.getKerberosSignOnMappingAttributeType());
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
     * Sets the kerberosServicePrincipalName property value. The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     * @param value Value to set for the kerberosServicePrincipalName property.
     * @return a void
     */
    public void setKerberosServicePrincipalName(@javax.annotation.Nullable final String value) {
        this._kerberosServicePrincipalName = value;
    }
    /**
     * Sets the kerberosSignOnMappingAttributeType property value. The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     * @param value Value to set for the kerberosSignOnMappingAttributeType property.
     * @return a void
     */
    public void setKerberosSignOnMappingAttributeType(@javax.annotation.Nullable final KerberosSignOnMappingAttributeType value) {
        this._kerberosSignOnMappingAttributeType = value;
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
