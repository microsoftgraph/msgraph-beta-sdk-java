package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureAuthorizationSystem extends AuthorizationSystem implements Parsable {
    /**
     * Instantiates a new AzureAuthorizationSystem and sets the default values.
     */
    public AzureAuthorizationSystem() {
        super();
        this.setOdataType("#microsoft.graph.azureAuthorizationSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureAuthorizationSystem
     */
    @jakarta.annotation.Nonnull
    public static AzureAuthorizationSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureAuthorizationSystem();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a java.util.List<AzureAuthorizationSystemTypeAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureAuthorizationSystemTypeAction> getActions() {
        return this.BackingStore.get("actions");
    }
    /**
     * Gets the associatedIdentities property value. The associatedIdentities property
     * @return a AzureAssociatedIdentities
     */
    @jakarta.annotation.Nullable
    public AzureAssociatedIdentities getAssociatedIdentities() {
        return this.BackingStore.get("associatedIdentities");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AzureAuthorizationSystemTypeAction::createFromDiscriminatorValue)); });
        deserializerMap.put("associatedIdentities", (n) -> { this.setAssociatedIdentities(n.getObjectValue(AzureAssociatedIdentities::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AzureAuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(AzureRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(AuthorizationSystemTypeService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. The resources property
     * @return a java.util.List<AzureAuthorizationSystemResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureAuthorizationSystemResource> getResources() {
        return this.BackingStore.get("resources");
    }
    /**
     * Gets the roleDefinitions property value. The roleDefinitions property
     * @return a java.util.List<AzureRoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureRoleDefinition> getRoleDefinitions() {
        return this.BackingStore.get("roleDefinitions");
    }
    /**
     * Gets the services property value. The services property
     * @return a java.util.List<AuthorizationSystemTypeService>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemTypeService> getServices() {
        return this.BackingStore.get("services");
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
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("services", this.getServices());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AzureAuthorizationSystemTypeAction> value) {
        this.BackingStore.set("actions", value);
    }
    /**
     * Sets the associatedIdentities property value. The associatedIdentities property
     * @param value Value to set for the associatedIdentities property.
     */
    public void setAssociatedIdentities(@jakarta.annotation.Nullable final AzureAssociatedIdentities value) {
        this.BackingStore.set("associatedIdentities", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AzureAuthorizationSystemResource> value) {
        this.BackingStore.set("resources", value);
    }
    /**
     * Sets the roleDefinitions property value. The roleDefinitions property
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<AzureRoleDefinition> value) {
        this.BackingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the services property value. The services property
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeService> value) {
        this.BackingStore.set("services", value);
    }
}
