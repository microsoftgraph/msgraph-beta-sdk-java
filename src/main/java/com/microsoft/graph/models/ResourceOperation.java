package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes the resourceOperation resource (entity) of the Microsoft Graph API (REST), which supports Intune workflows related to role-based access control (RBAC).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourceOperation extends Entity implements Parsable {
    /**
     * Instantiates a new ResourceOperation and sets the default values.
     */
    public ResourceOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceOperation
     */
    @jakarta.annotation.Nonnull
    public static ResourceOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceOperation();
    }
    /**
     * Gets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActionName() {
        return this.BackingStore.get("actionName");
    }
    /**
     * Gets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the enabledForScopeValidation property value. Determines whether the Permission is validated for Scopes defined per Role Assignment. This property is read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabledForScopeValidation() {
        return this.BackingStore.get("enabledForScopeValidation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabledForScopeValidation", (n) -> { this.setEnabledForScopeValidation(n.getBooleanValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Resource category to which this Operation belongs. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.BackingStore.get("resource");
    }
    /**
     * Gets the resourceName property value. Name of the Resource this operation is performed on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.BackingStore.get("resourceName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("resourceName", this.getResourceName());
    }
    /**
     * Sets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("actionName", value);
    }
    /**
     * Sets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the enabledForScopeValidation property value. Determines whether the Permission is validated for Scopes defined per Role Assignment. This property is read-only.
     * @param value Value to set for the enabledForScopeValidation property.
     */
    public void setEnabledForScopeValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enabledForScopeValidation", value);
    }
    /**
     * Sets the resource property value. Resource category to which this Operation belongs. This property is read-only.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resource", value);
    }
    /**
     * Sets the resourceName property value. Name of the Resource this operation is performed on.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceName", value);
    }
}
