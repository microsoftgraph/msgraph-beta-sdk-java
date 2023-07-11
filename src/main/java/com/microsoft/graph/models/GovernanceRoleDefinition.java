package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceRoleDefinition extends Entity implements Parsable {
    /**
     * The display name of the role definition.
     */
    private String displayName;
    /**
     * The external id of the role definition.
     */
    private String externalId;
    /**
     * Read-only. The associated resource for the role definition.
     */
    private GovernanceResource resource;
    /**
     * Required. The id of the resource associated with the role definition.
     */
    private String resourceId;
    /**
     * The associated role setting for the role definition.
     */
    private GovernanceRoleSetting roleSetting;
    /**
     * The templateId property
     */
    private String templateId;
    /**
     * Instantiates a new governanceRoleDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nonnull
    public static GovernanceRoleDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleDefinition();
    }
    /**
     * Gets the displayName property value. The display name of the role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. The external id of the role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getResource() {
        return this.resource;
    }
    /**
     * Gets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the roleSetting property value. The associated role setting for the role definition.
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nullable
    public GovernanceRoleSetting getRoleSetting() {
        return this.roleSetting;
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. The external id of the role definition.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the resource property value. Read-only. The associated resource for the role definition.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final GovernanceResource value) {
        this.resource = value;
    }
    /**
     * Sets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the roleSetting property value. The associated role setting for the role definition.
     * @param value Value to set for the roleSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleSetting(@javax.annotation.Nullable final GovernanceRoleSetting value) {
        this.roleSetting = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
}
