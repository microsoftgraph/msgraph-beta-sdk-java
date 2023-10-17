package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsDefinition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authorizationSystemInfo property
     */
    private PermissionsDefinitionAuthorizationSystem authorizationSystemInfo;
    /**
     * The identityInfo property
     */
    private PermissionsDefinitionAuthorizationSystemIdentity identityInfo;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new PermissionsDefinition and sets the default values.
     */
    public PermissionsDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsDefinition
     */
    @jakarta.annotation.Nonnull
    public static PermissionsDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsPermissionsDefinition": return new AwsPermissionsDefinition();
                case "#microsoft.graph.singleResourceAzurePermissionsDefinition": return new SingleResourceAzurePermissionsDefinition();
                case "#microsoft.graph.singleResourceGcpPermissionsDefinition": return new SingleResourceGcpPermissionsDefinition();
            }
        }
        return new PermissionsDefinition();
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
     * Gets the authorizationSystemInfo property value. The authorizationSystemInfo property
     * @return a PermissionsDefinitionAuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinitionAuthorizationSystem getAuthorizationSystemInfo() {
        return this.authorizationSystemInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("authorizationSystemInfo", (n) -> { this.setAuthorizationSystemInfo(n.getObjectValue(PermissionsDefinitionAuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("identityInfo", (n) -> { this.setIdentityInfo(n.getObjectValue(PermissionsDefinitionAuthorizationSystemIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityInfo property value. The identityInfo property
     * @return a PermissionsDefinitionAuthorizationSystemIdentity
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinitionAuthorizationSystemIdentity getIdentityInfo() {
        return this.identityInfo;
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
        writer.writeObjectValue("authorizationSystemInfo", this.getAuthorizationSystemInfo());
        writer.writeObjectValue("identityInfo", this.getIdentityInfo());
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
     * Sets the authorizationSystemInfo property value. The authorizationSystemInfo property
     * @param value Value to set for the authorizationSystemInfo property.
     */
    public void setAuthorizationSystemInfo(@jakarta.annotation.Nullable final PermissionsDefinitionAuthorizationSystem value) {
        this.authorizationSystemInfo = value;
    }
    /**
     * Sets the identityInfo property value. The identityInfo property
     * @param value Value to set for the identityInfo property.
     */
    public void setIdentityInfo(@jakarta.annotation.Nullable final PermissionsDefinitionAuthorizationSystemIdentity value) {
        this.identityInfo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
