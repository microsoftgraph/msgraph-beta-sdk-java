package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureRoleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new AzureRoleDefinition and sets the default values.
     */
    public AzureRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureRoleDefinition
     */
    @jakarta.annotation.Nonnull
    public static AzureRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureRoleDefinition();
    }
    /**
     * Gets the assignableScopes property value. Scopes at which the Azure role can be assigned. For more information about common patterns, see Understand Azure role definitions: AssignableScopes. Supports $filter (eq).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignableScopes() {
        return this.backingStore.get("assignableScopes");
    }
    /**
     * Gets the azureRoleDefinitionType property value. The azureRoleDefinitionType property
     * @return a AzureRoleDefinitionType
     */
    @jakarta.annotation.Nullable
    public AzureRoleDefinitionType getAzureRoleDefinitionType() {
        return this.backingStore.get("azureRoleDefinitionType");
    }
    /**
     * Gets the displayName property value. Name of the Azure role. Supports $filter (eq, contains).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. Identifier of an Azure role defined by Microsoft Azure. Alternate key. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignableScopes", (n) -> { this.setAssignableScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("azureRoleDefinitionType", (n) -> { this.setAzureRoleDefinitionType(n.getEnumValue(AzureRoleDefinitionType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("assignableScopes", this.getAssignableScopes());
        writer.writeEnumValue("azureRoleDefinitionType", this.getAzureRoleDefinitionType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
    }
    /**
     * Sets the assignableScopes property value. Scopes at which the Azure role can be assigned. For more information about common patterns, see Understand Azure role definitions: AssignableScopes. Supports $filter (eq).
     * @param value Value to set for the assignableScopes property.
     */
    public void setAssignableScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("assignableScopes", value);
    }
    /**
     * Sets the azureRoleDefinitionType property value. The azureRoleDefinitionType property
     * @param value Value to set for the azureRoleDefinitionType property.
     */
    public void setAzureRoleDefinitionType(@jakarta.annotation.Nullable final AzureRoleDefinitionType value) {
        this.backingStore.set("azureRoleDefinitionType", value);
    }
    /**
     * Sets the displayName property value. Name of the Azure role. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. Identifier of an Azure role defined by Microsoft Azure. Alternate key. Supports $filter (eq).
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
}
