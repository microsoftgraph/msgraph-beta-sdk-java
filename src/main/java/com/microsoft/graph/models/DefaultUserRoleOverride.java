package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DefaultUserRoleOverride extends Entity implements Parsable {
    /**
     * The isDefault property
     */
    private Boolean isDefault;
    /**
     * The rolePermissions property
     */
    private java.util.List<UnifiedRolePermission> rolePermissions;
    /**
     * Instantiates a new defaultUserRoleOverride and sets the default values.
     */
    public DefaultUserRoleOverride() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a defaultUserRoleOverride
     */
    @jakarta.annotation.Nonnull
    public static DefaultUserRoleOverride createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultUserRoleOverride();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("rolePermissions", (n) -> { this.setRolePermissions(n.getCollectionOfObjectValues(UnifiedRolePermission::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the rolePermissions property value. The rolePermissions property
     * @return a unifiedRolePermission
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this.rolePermissions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeCollectionOfObjectValues("rolePermissions", this.getRolePermissions());
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the rolePermissions property value. The rolePermissions property
     * @param value Value to set for the rolePermissions property.
     */
    public void setRolePermissions(@jakarta.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this.rolePermissions = value;
    }
}
