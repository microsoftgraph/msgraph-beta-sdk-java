package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.windowsupdates.Catalog;
import com.microsoft.graph.beta.models.windowsupdates.Deployment;
import com.microsoft.graph.beta.models.windowsupdates.DeploymentAudience;
import com.microsoft.graph.beta.models.windowsupdates.Product;
import com.microsoft.graph.beta.models.windowsupdates.ResourceConnection;
import com.microsoft.graph.beta.models.windowsupdates.UpdatableAsset;
import com.microsoft.graph.beta.models.windowsupdates.UpdatePolicy;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminWindowsUpdates extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AdminWindowsUpdates} and sets the default values.
     */
    public AdminWindowsUpdates() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminWindowsUpdates}
     */
    @jakarta.annotation.Nonnull
    public static AdminWindowsUpdates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminWindowsUpdates();
    }
    /**
     * Gets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @return a {@link Catalog}
     */
    @jakarta.annotation.Nullable
    public Catalog getCatalog() {
        return this.backingStore.get("catalog");
    }
    /**
     * Gets the deploymentAudiences property value. The set of updatableAsset resources to which a deployment can apply.
     * @return a {@link java.util.List<DeploymentAudience>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeploymentAudience> getDeploymentAudiences() {
        return this.backingStore.get("deploymentAudiences");
    }
    /**
     * Gets the deployments property value. Deployments created using the deployment service.
     * @return a {@link java.util.List<Deployment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Deployment> getDeployments() {
        return this.backingStore.get("deployments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(Catalog::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentAudiences", (n) -> { this.setDeploymentAudiences(n.getCollectionOfObjectValues(DeploymentAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("deployments", (n) -> { this.setDeployments(n.getCollectionOfObjectValues(Deployment::createFromDiscriminatorValue)); });
        deserializerMap.put("products", (n) -> { this.setProducts(n.getCollectionOfObjectValues(Product::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceConnections", (n) -> { this.setResourceConnections(n.getCollectionOfObjectValues(ResourceConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("updatableAssets", (n) -> { this.setUpdatableAssets(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("updatePolicies", (n) -> { this.setUpdatePolicies(n.getCollectionOfObjectValues(UpdatePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the products property value. A collection of Windows products.
     * @return a {@link java.util.List<Product>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Product> getProducts() {
        return this.backingStore.get("products");
    }
    /**
     * Gets the resourceConnections property value. Service connections to external resources such as analytics workspaces.
     * @return a {@link java.util.List<ResourceConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceConnection> getResourceConnections() {
        return this.backingStore.get("resourceConnections");
    }
    /**
     * Gets the updatableAssets property value. Assets registered with the deployment service that can receive updates.
     * @return a {@link java.util.List<UpdatableAsset>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getUpdatableAssets() {
        return this.backingStore.get("updatableAssets");
    }
    /**
     * Gets the updatePolicies property value. A collection of policies for approving the deployment of different content to an audience over time.
     * @return a {@link java.util.List<UpdatePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatePolicy> getUpdatePolicies() {
        return this.backingStore.get("updatePolicies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeCollectionOfObjectValues("deploymentAudiences", this.getDeploymentAudiences());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeCollectionOfObjectValues("products", this.getProducts());
        writer.writeCollectionOfObjectValues("resourceConnections", this.getResourceConnections());
        writer.writeCollectionOfObjectValues("updatableAssets", this.getUpdatableAssets());
        writer.writeCollectionOfObjectValues("updatePolicies", this.getUpdatePolicies());
    }
    /**
     * Sets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @param value Value to set for the catalog property.
     */
    public void setCatalog(@jakarta.annotation.Nullable final Catalog value) {
        this.backingStore.set("catalog", value);
    }
    /**
     * Sets the deploymentAudiences property value. The set of updatableAsset resources to which a deployment can apply.
     * @param value Value to set for the deploymentAudiences property.
     */
    public void setDeploymentAudiences(@jakarta.annotation.Nullable final java.util.List<DeploymentAudience> value) {
        this.backingStore.set("deploymentAudiences", value);
    }
    /**
     * Sets the deployments property value. Deployments created using the deployment service.
     * @param value Value to set for the deployments property.
     */
    public void setDeployments(@jakarta.annotation.Nullable final java.util.List<Deployment> value) {
        this.backingStore.set("deployments", value);
    }
    /**
     * Sets the products property value. A collection of Windows products.
     * @param value Value to set for the products property.
     */
    public void setProducts(@jakarta.annotation.Nullable final java.util.List<Product> value) {
        this.backingStore.set("products", value);
    }
    /**
     * Sets the resourceConnections property value. Service connections to external resources such as analytics workspaces.
     * @param value Value to set for the resourceConnections property.
     */
    public void setResourceConnections(@jakarta.annotation.Nullable final java.util.List<ResourceConnection> value) {
        this.backingStore.set("resourceConnections", value);
    }
    /**
     * Sets the updatableAssets property value. Assets registered with the deployment service that can receive updates.
     * @param value Value to set for the updatableAssets property.
     */
    public void setUpdatableAssets(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("updatableAssets", value);
    }
    /**
     * Sets the updatePolicies property value. A collection of policies for approving the deployment of different content to an audience over time.
     * @param value Value to set for the updatePolicies property.
     */
    public void setUpdatePolicies(@jakarta.annotation.Nullable final java.util.List<UpdatePolicy> value) {
        this.backingStore.set("updatePolicies", value);
    }
}
