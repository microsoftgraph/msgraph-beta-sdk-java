package com.microsoft.graph.models;

import com.microsoft.graph.models.windowsupdates.Catalog;
import com.microsoft.graph.models.windowsupdates.Deployment;
import com.microsoft.graph.models.windowsupdates.DeploymentAudience;
import com.microsoft.graph.models.windowsupdates.ResourceConnection;
import com.microsoft.graph.models.windowsupdates.UpdatableAsset;
import com.microsoft.graph.models.windowsupdates.UpdatePolicy;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdminWindowsUpdates extends Entity implements Parsable {
    /**
     * Catalog of content that can be approved for deployment by the deployment service. Read-only.
     */
    private Catalog catalog;
    /**
     * The set of updatableAsset resources to which a deployment can apply.
     */
    private java.util.List<DeploymentAudience> deploymentAudiences;
    /**
     * Deployments created using the deployment service.
     */
    private java.util.List<Deployment> deployments;
    /**
     * Service connections to external resources such as analytics workspaces.
     */
    private java.util.List<ResourceConnection> resourceConnections;
    /**
     * Assets registered with the deployment service that can receive updates.
     */
    private java.util.List<UpdatableAsset> updatableAssets;
    /**
     * A collection of policies for approving the deployment of different content to an audience over time.
     */
    private java.util.List<UpdatePolicy> updatePolicies;
    /**
     * Instantiates a new adminWindowsUpdates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminWindowsUpdates() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminWindowsUpdates
     */
    @javax.annotation.Nonnull
    public static AdminWindowsUpdates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminWindowsUpdates();
    }
    /**
     * Gets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @return a catalog
     */
    @javax.annotation.Nullable
    public Catalog getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the deploymentAudiences property value. The set of updatableAsset resources to which a deployment can apply.
     * @return a deploymentAudience
     */
    @javax.annotation.Nullable
    public java.util.List<DeploymentAudience> getDeploymentAudiences() {
        return this.deploymentAudiences;
    }
    /**
     * Gets the deployments property value. Deployments created using the deployment service.
     * @return a deployment
     */
    @javax.annotation.Nullable
    public java.util.List<Deployment> getDeployments() {
        return this.deployments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(Catalog::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentAudiences", (n) -> { this.setDeploymentAudiences(n.getCollectionOfObjectValues(DeploymentAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("deployments", (n) -> { this.setDeployments(n.getCollectionOfObjectValues(Deployment::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceConnections", (n) -> { this.setResourceConnections(n.getCollectionOfObjectValues(ResourceConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("updatableAssets", (n) -> { this.setUpdatableAssets(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("updatePolicies", (n) -> { this.setUpdatePolicies(n.getCollectionOfObjectValues(UpdatePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceConnections property value. Service connections to external resources such as analytics workspaces.
     * @return a resourceConnection
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceConnection> getResourceConnections() {
        return this.resourceConnections;
    }
    /**
     * Gets the updatableAssets property value. Assets registered with the deployment service that can receive updates.
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getUpdatableAssets() {
        return this.updatableAssets;
    }
    /**
     * Gets the updatePolicies property value. A collection of policies for approving the deployment of different content to an audience over time.
     * @return a updatePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatePolicy> getUpdatePolicies() {
        return this.updatePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeCollectionOfObjectValues("deploymentAudiences", this.getDeploymentAudiences());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeCollectionOfObjectValues("resourceConnections", this.getResourceConnections());
        writer.writeCollectionOfObjectValues("updatableAssets", this.getUpdatableAssets());
        writer.writeCollectionOfObjectValues("updatePolicies", this.getUpdatePolicies());
    }
    /**
     * Sets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalog(@javax.annotation.Nullable final Catalog value) {
        this.catalog = value;
    }
    /**
     * Sets the deploymentAudiences property value. The set of updatableAsset resources to which a deployment can apply.
     * @param value Value to set for the deploymentAudiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentAudiences(@javax.annotation.Nullable final java.util.List<DeploymentAudience> value) {
        this.deploymentAudiences = value;
    }
    /**
     * Sets the deployments property value. Deployments created using the deployment service.
     * @param value Value to set for the deployments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployments(@javax.annotation.Nullable final java.util.List<Deployment> value) {
        this.deployments = value;
    }
    /**
     * Sets the resourceConnections property value. Service connections to external resources such as analytics workspaces.
     * @param value Value to set for the resourceConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceConnections(@javax.annotation.Nullable final java.util.List<ResourceConnection> value) {
        this.resourceConnections = value;
    }
    /**
     * Sets the updatableAssets property value. Assets registered with the deployment service that can receive updates.
     * @param value Value to set for the updatableAssets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatableAssets(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.updatableAssets = value;
    }
    /**
     * Sets the updatePolicies property value. A collection of policies for approving the deployment of different content to an audience over time.
     * @param value Value to set for the updatePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatePolicies(@javax.annotation.Nullable final java.util.List<UpdatePolicy> value) {
        this.updatePolicies = value;
    }
}
