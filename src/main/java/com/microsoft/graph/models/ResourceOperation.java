package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceOperation extends Entity implements Parsable {
    /** Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible. */
    private String _actionName;
    /** Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal. */
    private String _description;
    /** Determines whether the Permission is validated for Scopes defined per Role Assignment. This property is read-only. */
    private Boolean _enabledForScopeValidation;
    /** Resource category to which this Operation belongs. This property is read-only. */
    private String _resource;
    /** Name of the Resource this operation is performed on. */
    private String _resourceName;
    /**
     * Instantiates a new ResourceOperation and sets the default values.
     * @return a void
     */
    public ResourceOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceOperation
     */
    @javax.annotation.Nonnull
    public static ResourceOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceOperation();
    }
    /**
     * Gets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this._actionName;
    }
    /**
     * Gets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the enabledForScopeValidation property value. Determines whether the Permission is validated for Scopes defined per Role Assignment. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabledForScopeValidation() {
        return this._enabledForScopeValidation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResourceOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionName", (n) -> { currentObject.setActionName(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("enabledForScopeValidation", (n) -> { currentObject.setEnabledForScopeValidation(n.getBooleanValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getStringValue()); });
            this.put("resourceName", (n) -> { currentObject.setResourceName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the resource property value. Resource category to which this Operation belongs. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceName property value. Name of the Resource this operation is performed on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this._resourceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("enabledForScopeValidation", this.getEnabledForScopeValidation());
        writer.writeStringValue("resource", this.getResource());
        writer.writeStringValue("resourceName", this.getResourceName());
    }
    /**
     * Sets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    public void setActionName(@javax.annotation.Nullable final String value) {
        this._actionName = value;
    }
    /**
     * Sets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the enabledForScopeValidation property value. Determines whether the Permission is validated for Scopes defined per Role Assignment. This property is read-only.
     * @param value Value to set for the enabledForScopeValidation property.
     * @return a void
     */
    public void setEnabledForScopeValidation(@javax.annotation.Nullable final Boolean value) {
        this._enabledForScopeValidation = value;
    }
    /**
     * Sets the resource property value. Resource category to which this Operation belongs. This property is read-only.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final String value) {
        this._resource = value;
    }
    /**
     * Sets the resourceName property value. Name of the Resource this operation is performed on.
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this._resourceName = value;
    }
}
