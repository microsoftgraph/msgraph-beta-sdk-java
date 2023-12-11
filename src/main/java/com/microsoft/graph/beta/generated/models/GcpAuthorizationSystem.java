package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GcpAuthorizationSystem extends AuthorizationSystem implements Parsable {
    /**
     * Instantiates a new GcpAuthorizationSystem and sets the default values.
     */
    public GcpAuthorizationSystem() {
        super();
        this.setOdataType("#microsoft.graph.gcpAuthorizationSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GcpAuthorizationSystem
     */
    @jakarta.annotation.Nonnull
    public static GcpAuthorizationSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GcpAuthorizationSystem();
    }
    /**
     * Gets the actions property value. List of actions for service in authorization system.
     * @return a java.util.List<GcpAuthorizationSystemTypeAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GcpAuthorizationSystemTypeAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the associatedIdentities property value. Identities in the authorization system.
     * @return a GcpAssociatedIdentities
     */
    @jakarta.annotation.Nullable
    public GcpAssociatedIdentities getAssociatedIdentities() {
        return this.backingStore.get("associatedIdentities");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(GcpAuthorizationSystemTypeAction::createFromDiscriminatorValue)); });
        deserializerMap.put("associatedIdentities", (n) -> { this.setAssociatedIdentities(n.getObjectValue(GcpAssociatedIdentities::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(GcpAuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(GcpRole::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(AuthorizationSystemTypeService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. Resources associated with the authorization system type.
     * @return a java.util.List<GcpAuthorizationSystemResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GcpAuthorizationSystemResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the roles property value. Roles associated with the authorization system type.
     * @return a java.util.List<GcpRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GcpRole> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Gets the services property value. Services associated with the authorization system type.
     * @return a java.util.List<AuthorizationSystemTypeService>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemTypeService> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeObjectValue("associatedIdentities", this.getAssociatedIdentities());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
        writer.writeCollectionOfObjectValues("services", this.getServices());
    }
    /**
     * Sets the actions property value. List of actions for service in authorization system.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<GcpAuthorizationSystemTypeAction> value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the associatedIdentities property value. Identities in the authorization system.
     * @param value Value to set for the associatedIdentities property.
     */
    public void setAssociatedIdentities(@jakarta.annotation.Nullable final GcpAssociatedIdentities value) {
        this.backingStore.set("associatedIdentities", value);
    }
    /**
     * Sets the resources property value. Resources associated with the authorization system type.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<GcpAuthorizationSystemResource> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the roles property value. Roles associated with the authorization system type.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<GcpRole> value) {
        this.backingStore.set("roles", value);
    }
    /**
     * Sets the services property value. Services associated with the authorization system type.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeService> value) {
        this.backingStore.set("services", value);
    }
}
