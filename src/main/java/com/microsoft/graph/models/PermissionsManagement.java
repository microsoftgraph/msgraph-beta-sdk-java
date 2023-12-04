package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsManagement extends Entity implements Parsable {
    /**
     * Instantiates a new PermissionsManagement and sets the default values.
     */
    public PermissionsManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsManagement
     */
    @jakarta.annotation.Nonnull
    public static PermissionsManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsManagement();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("permissionsRequestChanges", (n) -> { this.setPermissionsRequestChanges(n.getCollectionOfObjectValues(PermissionsRequestChange::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduledPermissionsRequests", (n) -> { this.setScheduledPermissionsRequests(n.getCollectionOfObjectValues(ScheduledPermissionsRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionsRequestChanges property value. Represents a change event of the scheduledPermissionsRequest entity.
     * @return a java.util.List<PermissionsRequestChange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionsRequestChange> getPermissionsRequestChanges() {
        return this.backingStore.get("permissionsRequestChanges");
    }
    /**
     * Gets the scheduledPermissionsRequests property value. Represents a permissions request that Permissions Management uses to manage permissions for an identity on resources in the authorization system. This request can be granted, rejected or canceled by identities in Permissions Management.
     * @return a java.util.List<ScheduledPermissionsRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScheduledPermissionsRequest> getScheduledPermissionsRequests() {
        return this.backingStore.get("scheduledPermissionsRequests");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("permissionsRequestChanges", this.getPermissionsRequestChanges());
        writer.writeCollectionOfObjectValues("scheduledPermissionsRequests", this.getScheduledPermissionsRequests());
    }
    /**
     * Sets the permissionsRequestChanges property value. Represents a change event of the scheduledPermissionsRequest entity.
     * @param value Value to set for the permissionsRequestChanges property.
     */
    public void setPermissionsRequestChanges(@jakarta.annotation.Nullable final java.util.List<PermissionsRequestChange> value) {
        this.backingStore.set("permissionsRequestChanges", value);
    }
    /**
     * Sets the scheduledPermissionsRequests property value. Represents a permissions request that Permissions Management uses to manage permissions for an identity on resources in the authorization system. This request can be granted, rejected or canceled by identities in Permissions Management.
     * @param value Value to set for the scheduledPermissionsRequests property.
     */
    public void setScheduledPermissionsRequests(@jakarta.annotation.Nullable final java.util.List<ScheduledPermissionsRequest> value) {
        this.backingStore.set("scheduledPermissionsRequests", value);
    }
}
