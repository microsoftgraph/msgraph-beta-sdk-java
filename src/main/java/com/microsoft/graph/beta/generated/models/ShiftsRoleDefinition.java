package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShiftsRoleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ShiftsRoleDefinition} and sets the default values.
     */
    public ShiftsRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShiftsRoleDefinition}
     */
    @jakarta.annotation.Nonnull
    public static ShiftsRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShiftsRoleDefinition();
    }
    /**
     * Gets the description property value. The description of the role.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the role.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("shiftsRolePermissions", (n) -> { this.setShiftsRolePermissions(n.getCollectionOfObjectValues(ShiftsRolePermission::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shiftsRolePermissions property value. The collection of role permissions within the role.
     * @return a {@link java.util.List<ShiftsRolePermission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShiftsRolePermission> getShiftsRolePermissions() {
        return this.backingStore.get("shiftsRolePermissions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("shiftsRolePermissions", this.getShiftsRolePermissions());
    }
    /**
     * Sets the description property value. The description of the role.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the role.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the shiftsRolePermissions property value. The collection of role permissions within the role.
     * @param value Value to set for the shiftsRolePermissions property.
     */
    public void setShiftsRolePermissions(@jakarta.annotation.Nullable final java.util.List<ShiftsRolePermission> value) {
        this.backingStore.set("shiftsRolePermissions", value);
    }
}
