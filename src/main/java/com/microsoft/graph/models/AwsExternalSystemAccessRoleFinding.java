package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsExternalSystemAccessRoleFinding extends Finding implements Parsable {
    /**
     * Instantiates a new AwsExternalSystemAccessRoleFinding and sets the default values.
     */
    public AwsExternalSystemAccessRoleFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsExternalSystemAccessRoleFinding
     */
    @jakarta.annotation.Nonnull
    public static AwsExternalSystemAccessRoleFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsExternalSystemAccessRoleFinding();
    }
    /**
     * Gets the accessibleSystemIds property value. The accessibleSystemIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAccessibleSystemIds() {
        return this.BackingStore.get("accessibleSystemIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibleSystemIds", (n) -> { this.setAccessibleSystemIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(AwsRole::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.BackingStore.get("permissionsCreepIndex");
    }
    /**
     * Gets the role property value. The role property
     * @return a AwsRole
     */
    @jakarta.annotation.Nullable
    public AwsRole getRole() {
        return this.BackingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("accessibleSystemIds", this.getAccessibleSystemIds());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
        writer.writeObjectValue("role", this.getRole());
    }
    /**
     * Sets the accessibleSystemIds property value. The accessibleSystemIds property
     * @param value Value to set for the accessibleSystemIds property.
     */
    public void setAccessibleSystemIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("accessibleSystemIds", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.BackingStore.set("permissionsCreepIndex", value);
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final AwsRole value) {
        this.BackingStore.set("role", value);
    }
}
