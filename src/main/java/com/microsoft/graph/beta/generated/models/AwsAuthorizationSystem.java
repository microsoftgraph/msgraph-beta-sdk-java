package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsAuthorizationSystem extends AuthorizationSystem implements Parsable {
    /**
     * Instantiates a new {@link AwsAuthorizationSystem} and sets the default values.
     */
    public AwsAuthorizationSystem() {
        super();
        this.setOdataType("#microsoft.graph.awsAuthorizationSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwsAuthorizationSystem}
     */
    @jakarta.annotation.Nonnull
    public static AwsAuthorizationSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsAuthorizationSystem();
    }
    /**
     * Gets the actions property value. List of actions for service in authorization system.
     * @return a {@link java.util.List<AwsAuthorizationSystemTypeAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsAuthorizationSystemTypeAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the associatedIdentities property value. Identities in the authorization system.
     * @return a {@link AwsAssociatedIdentities}
     */
    @jakarta.annotation.Nullable
    public AwsAssociatedIdentities getAssociatedIdentities() {
        return this.backingStore.get("associatedIdentities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AwsAuthorizationSystemTypeAction::createFromDiscriminatorValue)); });
        deserializerMap.put("associatedIdentities", (n) -> { this.setAssociatedIdentities(n.getObjectValue(AwsAssociatedIdentities::createFromDiscriminatorValue)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(AwsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AwsAuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(AuthorizationSystemTypeService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policies property value. Policies associated with the AWS authorization system type.
     * @return a {@link java.util.List<AwsPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsPolicy> getPolicies() {
        return this.backingStore.get("policies");
    }
    /**
     * Gets the resources property value. Resources associated with the authorization system type.
     * @return a {@link java.util.List<AwsAuthorizationSystemResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsAuthorizationSystemResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the services property value. Services associated with the authorization system type.
     * @return a {@link java.util.List<AuthorizationSystemTypeService>}
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
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("services", this.getServices());
    }
    /**
     * Sets the actions property value. List of actions for service in authorization system.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AwsAuthorizationSystemTypeAction> value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the associatedIdentities property value. Identities in the authorization system.
     * @param value Value to set for the associatedIdentities property.
     */
    public void setAssociatedIdentities(@jakarta.annotation.Nullable final AwsAssociatedIdentities value) {
        this.backingStore.set("associatedIdentities", value);
    }
    /**
     * Sets the policies property value. Policies associated with the AWS authorization system type.
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<AwsPolicy> value) {
        this.backingStore.set("policies", value);
    }
    /**
     * Sets the resources property value. Resources associated with the authorization system type.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AwsAuthorizationSystemResource> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the services property value. Services associated with the authorization system type.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeService> value) {
        this.backingStore.set("services", value);
    }
}
