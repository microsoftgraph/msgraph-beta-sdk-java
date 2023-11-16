package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsAuthorizationSystem extends AuthorizationSystem implements Parsable {
    /**
     * Instantiates a new AwsAuthorizationSystem and sets the default values.
     */
    public AwsAuthorizationSystem() {
        super();
        this.setOdataType("#microsoft.graph.awsAuthorizationSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsAuthorizationSystem
     */
    @jakarta.annotation.Nonnull
    public static AwsAuthorizationSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsAuthorizationSystem();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a java.util.List<AwsAuthorizationSystemTypeAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsAuthorizationSystemTypeAction> getActions() {
        return this.BackingStore.get("actions");
    }
    /**
     * Gets the associatedIdentities property value. The associatedIdentities property
     * @return a AwsAssociatedIdentities
     */
    @jakarta.annotation.Nullable
    public AwsAssociatedIdentities getAssociatedIdentities() {
        return this.BackingStore.get("associatedIdentities");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the policies property value. The policies property
     * @return a java.util.List<AwsPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsPolicy> getPolicies() {
        return this.BackingStore.get("policies");
    }
    /**
     * Gets the resources property value. The resources property
     * @return a java.util.List<AwsAuthorizationSystemResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsAuthorizationSystemResource> getResources() {
        return this.BackingStore.get("resources");
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
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("services", this.getServices());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AwsAuthorizationSystemTypeAction> value) {
        this.BackingStore.set("actions", value);
    }
    /**
     * Sets the associatedIdentities property value. The associatedIdentities property
     * @param value Value to set for the associatedIdentities property.
     */
    public void setAssociatedIdentities(@jakarta.annotation.Nullable final AwsAssociatedIdentities value) {
        this.BackingStore.set("associatedIdentities", value);
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<AwsPolicy> value) {
        this.BackingStore.set("policies", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AwsAuthorizationSystemResource> value) {
        this.BackingStore.set("resources", value);
    }
    /**
     * Sets the services property value. The services property
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeService> value) {
        this.BackingStore.set("services", value);
    }
}
