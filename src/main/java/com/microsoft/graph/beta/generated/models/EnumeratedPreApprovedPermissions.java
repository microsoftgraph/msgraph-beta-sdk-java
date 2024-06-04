package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnumeratedPreApprovedPermissions extends PreApprovedPermissions implements Parsable {
    /**
     * Instantiates a new {@link EnumeratedPreApprovedPermissions} and sets the default values.
     */
    public EnumeratedPreApprovedPermissions() {
        super();
        this.setOdataType("#microsoft.graph.enumeratedPreApprovedPermissions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnumeratedPreApprovedPermissions}
     */
    @jakarta.annotation.Nonnull
    public static EnumeratedPreApprovedPermissions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnumeratedPreApprovedPermissions();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("permissionIds", (n) -> { this.setPermissionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceApplicationId", (n) -> { this.setResourceApplicationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the permissionIds property value. The list of id values for the specific resource-specific application permissions to match with. See the resourceSpecificApplicationPermissions property of the servicePrincipal object for the list of permissions.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissionIds() {
        return this.backingStore.get("permissionIds");
    }
    /**
     * Gets the resourceApplicationId property value. The appId of the resource application (the API). Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceApplicationId() {
        return this.backingStore.get("resourceApplicationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("permissionIds", this.getPermissionIds());
        writer.writeStringValue("resourceApplicationId", this.getResourceApplicationId());
    }
    /**
     * Sets the permissionIds property value. The list of id values for the specific resource-specific application permissions to match with. See the resourceSpecificApplicationPermissions property of the servicePrincipal object for the list of permissions.
     * @param value Value to set for the permissionIds property.
     */
    public void setPermissionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissionIds", value);
    }
    /**
     * Sets the resourceApplicationId property value. The appId of the resource application (the API). Required.
     * @param value Value to set for the resourceApplicationId property.
     */
    public void setResourceApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceApplicationId", value);
    }
}
