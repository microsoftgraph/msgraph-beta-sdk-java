package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class DefaultUserRoleOverride extends Entity implements Parsable {
    /** The isDefault property */
    private Boolean _isDefault;
    /** The rolePermissions property */
    private java.util.List<UnifiedRolePermission> _rolePermissions;
    /**
     * Instantiates a new defaultUserRoleOverride and sets the default values.
     * @return a void
     */
    public DefaultUserRoleOverride() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a defaultUserRoleOverride
     */
    @javax.annotation.Nonnull
    public static DefaultUserRoleOverride createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultUserRoleOverride();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DefaultUserRoleOverride currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("rolePermissions", (n) -> { currentObject.setRolePermissions(n.getCollectionOfObjectValues(UnifiedRolePermission::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the rolePermissions property value. The rolePermissions property
     * @return a unifiedRolePermission
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this._rolePermissions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeCollectionOfObjectValues("rolePermissions", this.getRolePermissions());
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the rolePermissions property value. The rolePermissions property
     * @param value Value to set for the rolePermissions property.
     * @return a void
     */
    public void setRolePermissions(@javax.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this._rolePermissions = value;
    }
}
