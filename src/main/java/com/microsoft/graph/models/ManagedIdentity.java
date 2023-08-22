package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedIdentity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ARM resource ID of the Azure resource associated with the managed identity used for sign in.
     */
    private String associatedResourceId;
    /**
     * The unique ID of the federated token.
     */
    private String federatedTokenId;
    /**
     * The issuer of the federated token.
     */
    private String federatedTokenIssuer;
    /**
     * The possible values are: none, userAssigned, systemAssigned, unknownFutureValue.
     */
    private MsiType msiType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new managedIdentity and sets the default values.
     */
    public ManagedIdentity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedIdentity
     */
    @jakarta.annotation.Nonnull
    public static ManagedIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedIdentity();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the associatedResourceId property value. The ARM resource ID of the Azure resource associated with the managed identity used for sign in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }
    /**
     * Gets the federatedTokenId property value. The unique ID of the federated token.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFederatedTokenId() {
        return this.federatedTokenId;
    }
    /**
     * Gets the federatedTokenIssuer property value. The issuer of the federated token.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFederatedTokenIssuer() {
        return this.federatedTokenIssuer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("associatedResourceId", (n) -> { this.setAssociatedResourceId(n.getStringValue()); });
        deserializerMap.put("federatedTokenId", (n) -> { this.setFederatedTokenId(n.getStringValue()); });
        deserializerMap.put("federatedTokenIssuer", (n) -> { this.setFederatedTokenIssuer(n.getStringValue()); });
        deserializerMap.put("msiType", (n) -> { this.setMsiType(n.getEnumValue(MsiType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the msiType property value. The possible values are: none, userAssigned, systemAssigned, unknownFutureValue.
     * @return a msiType
     */
    @jakarta.annotation.Nullable
    public MsiType getMsiType() {
        return this.msiType;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
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
        writer.writeStringValue("associatedResourceId", this.getAssociatedResourceId());
        writer.writeStringValue("federatedTokenId", this.getFederatedTokenId());
        writer.writeStringValue("federatedTokenIssuer", this.getFederatedTokenIssuer());
        writer.writeEnumValue("msiType", this.getMsiType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the associatedResourceId property value. The ARM resource ID of the Azure resource associated with the managed identity used for sign in.
     * @param value Value to set for the associatedResourceId property.
     */
    public void setAssociatedResourceId(@jakarta.annotation.Nullable final String value) {
        this.associatedResourceId = value;
    }
    /**
     * Sets the federatedTokenId property value. The unique ID of the federated token.
     * @param value Value to set for the federatedTokenId property.
     */
    public void setFederatedTokenId(@jakarta.annotation.Nullable final String value) {
        this.federatedTokenId = value;
    }
    /**
     * Sets the federatedTokenIssuer property value. The issuer of the federated token.
     * @param value Value to set for the federatedTokenIssuer property.
     */
    public void setFederatedTokenIssuer(@jakarta.annotation.Nullable final String value) {
        this.federatedTokenIssuer = value;
    }
    /**
     * Sets the msiType property value. The possible values are: none, userAssigned, systemAssigned, unknownFutureValue.
     * @param value Value to set for the msiType property.
     */
    public void setMsiType(@jakarta.annotation.Nullable final MsiType value) {
        this.msiType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
