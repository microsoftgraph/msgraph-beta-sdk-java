package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KerberosSignOnSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     */
    private String kerberosServicePrincipalName;
    /**
     * The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     */
    private KerberosSignOnMappingAttributeType kerberosSignOnMappingAttributeType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new KerberosSignOnSettings and sets the default values.
     */
    public KerberosSignOnSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KerberosSignOnSettings
     */
    @jakarta.annotation.Nonnull
    public static KerberosSignOnSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KerberosSignOnSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("kerberosServicePrincipalName", (n) -> { this.setKerberosServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("kerberosSignOnMappingAttributeType", (n) -> { this.setKerberosSignOnMappingAttributeType(n.getEnumValue(KerberosSignOnMappingAttributeType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kerberosServicePrincipalName property value. The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKerberosServicePrincipalName() {
        return this.kerberosServicePrincipalName;
    }
    /**
     * Gets the kerberosSignOnMappingAttributeType property value. The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     * @return a KerberosSignOnMappingAttributeType
     */
    @jakarta.annotation.Nullable
    public KerberosSignOnMappingAttributeType getKerberosSignOnMappingAttributeType() {
        return this.kerberosSignOnMappingAttributeType;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("kerberosServicePrincipalName", this.getKerberosServicePrincipalName());
        writer.writeEnumValue("kerberosSignOnMappingAttributeType", this.getKerberosSignOnMappingAttributeType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the kerberosServicePrincipalName property value. The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     * @param value Value to set for the kerberosServicePrincipalName property.
     */
    public void setKerberosServicePrincipalName(@jakarta.annotation.Nullable final String value) {
        this.kerberosServicePrincipalName = value;
    }
    /**
     * Sets the kerberosSignOnMappingAttributeType property value. The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     * @param value Value to set for the kerberosSignOnMappingAttributeType property.
     */
    public void setKerberosSignOnMappingAttributeType(@jakarta.annotation.Nullable final KerberosSignOnMappingAttributeType value) {
        this.kerberosSignOnMappingAttributeType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
