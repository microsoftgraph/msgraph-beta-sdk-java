package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GcpRolePermissionsDefinitionAction extends GcpPermissionsDefinitionAction implements Parsable {
    /**
     * Instantiates a new {@link GcpRolePermissionsDefinitionAction} and sets the default values.
     */
    public GcpRolePermissionsDefinitionAction() {
        super();
        this.setOdataType("#microsoft.graph.gcpRolePermissionsDefinitionAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GcpRolePermissionsDefinitionAction}
     */
    @jakarta.annotation.Nonnull
    public static GcpRolePermissionsDefinitionAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GcpRolePermissionsDefinitionAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(PermissionsDefinitionGcpRole::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a {@link java.util.List<PermissionsDefinitionGcpRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionsDefinitionGcpRole> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<PermissionsDefinitionGcpRole> value) {
        this.backingStore.set("roles", value);
    }
}
