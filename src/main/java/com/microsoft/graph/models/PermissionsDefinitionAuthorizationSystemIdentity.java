package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsDefinitionAuthorizationSystemIdentity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The externalId property
     */
    private String externalId;
    /**
     * The identityType property
     */
    private PermissionsDefinitionIdentityType identityType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The source property
     */
    private PermissionsDefinitionIdentitySource source;
    /**
     * Instantiates a new PermissionsDefinitionAuthorizationSystemIdentity and sets the default values.
     */
    public PermissionsDefinitionAuthorizationSystemIdentity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsDefinitionAuthorizationSystemIdentity
     */
    @jakarta.annotation.Nonnull
    public static PermissionsDefinitionAuthorizationSystemIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsDefinitionAuthorizationSystemIdentity();
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
     * Gets the externalId property value. The externalId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getEnumValue(PermissionsDefinitionIdentityType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(PermissionsDefinitionIdentitySource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityType property value. The identityType property
     * @return a PermissionsDefinitionIdentityType
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinitionIdentityType getIdentityType() {
        return this.identityType;
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
     * Gets the source property value. The source property
     * @return a PermissionsDefinitionIdentitySource
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinitionIdentitySource getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeEnumValue("identityType", this.getIdentityType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("source", this.getSource());
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
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the identityType property value. The identityType property
     * @param value Value to set for the identityType property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final PermissionsDefinitionIdentityType value) {
        this.identityType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final PermissionsDefinitionIdentitySource value) {
        this.source = value;
    }
}
