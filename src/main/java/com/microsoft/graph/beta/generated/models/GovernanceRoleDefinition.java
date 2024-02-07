package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRoleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new GovernanceRoleDefinition and sets the default values.
     */
    public GovernanceRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceRoleDefinition
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleDefinition();
    }
    /**
     * Gets the displayName property value. The display name of the role definition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. The external id of the role definition.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("roleSetting", (n) -> { this.setRoleSetting(n.getObjectValue(GovernanceRoleSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Read-only. The associated resource for the role definition.
     * @return a GovernanceResource
     */
    @jakarta.annotation.Nullable
    public GovernanceResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the roleSetting property value. The associated role setting for the role definition.
     * @return a GovernanceRoleSetting
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleSetting getRoleSetting() {
        return this.backingStore.get("roleSetting");
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeObjectValue("roleSetting", this.getRoleSetting());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the displayName property value. The display name of the role definition.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. The external id of the role definition.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the resource property value. Read-only. The associated resource for the role definition.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final GovernanceResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the roleSetting property value. The associated role setting for the role definition.
     * @param value Value to set for the roleSetting property.
     */
    public void setRoleSetting(@jakarta.annotation.Nullable final GovernanceRoleSetting value) {
        this.backingStore.set("roleSetting", value);
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}
