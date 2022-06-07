package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of governanceResource entities. */
public class GovernanceRoleDefinition extends Entity implements Parsable {
    /** The display name of the role definition. */
    private String _displayName;
    /** The external id of the role definition. */
    private String _externalId;
    /** Read-only. The associated resource for the role definition. */
    private GovernanceResource _resource;
    /** Required. The id of the resource associated with the role definition. */
    private String _resourceId;
    /** The associated role setting for the role definition. */
    private GovernanceRoleSetting _roleSetting;
    /** The templateId property */
    private String _templateId;
    /**
     * Instantiates a new governanceRoleDefinition and sets the default values.
     * @return a void
     */
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
        return this._displayName;
    }
    /**
     * Gets the externalId property value. The external id of the role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceRoleDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
            this.put("roleSetting", (n) -> { currentObject.setRoleSetting(n.getObjectValue(GovernanceRoleSetting::createFromDiscriminatorValue)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the resource property value. Read-only. The associated resource for the role definition.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the roleSetting property value. The associated role setting for the role definition.
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nullable
    public GovernanceRoleSetting getRoleSetting() {
        return this._roleSetting;
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalId property value. The external id of the role definition.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the resource property value. Read-only. The associated resource for the role definition.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final GovernanceResource value) {
        this._resource = value;
    }
    /**
     * Sets the resourceId property value. Required. The id of the resource associated with the role definition.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the roleSetting property value. The associated role setting for the role definition.
     * @param value Value to set for the roleSetting property.
     * @return a void
     */
    public void setRoleSetting(@javax.annotation.Nullable final GovernanceRoleSetting value) {
        this._roleSetting = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
}
