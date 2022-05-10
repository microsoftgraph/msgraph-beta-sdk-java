package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleScopeTag extends Entity implements Parsable {
    /** The list of assignments for this Role Scope Tag. */
    private java.util.List<RoleScopeTagAutoAssignment> _assignments;
    /** Description of the Role Scope Tag. */
    private String _description;
    /** The display or friendly name of the Role Scope Tag. */
    private String _displayName;
    /** Description of the Role Scope Tag. This property is read-only. */
    private Boolean _isBuiltIn;
    /**
     * Instantiates a new roleScopeTag and sets the default values.
     * @return a void
     */
    public RoleScopeTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleScopeTag
     */
    @javax.annotation.Nonnull
    public static RoleScopeTag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleScopeTag();
    }
    /**
     * Gets the assignments property value. The list of assignments for this Role Scope Tag.
     * @return a roleScopeTagAutoAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTagAutoAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the description property value. Description of the Role Scope Tag.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display or friendly name of the Role Scope Tag.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoleScopeTag currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(RoleScopeTagAutoAssignment::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isBuiltIn", (n) -> { currentObject.setIsBuiltIn(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isBuiltIn property value. Description of the Role Scope Tag. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this._isBuiltIn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
    }
    /**
     * Sets the assignments property value. The list of assignments for this Role Scope Tag.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<RoleScopeTagAutoAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the description property value. Description of the Role Scope Tag.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display or friendly name of the Role Scope Tag.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isBuiltIn property value. Description of the Role Scope Tag. This property is read-only.
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this._isBuiltIn = value;
    }
}
