package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A connected source-control repository that delivers security content as code(the customer-facing shape of the internal Source Control resource). Tenant is resolvedfrom the caller token; there is no subscription, resource group, or workspace in the path.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentManagementRepository extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ContentManagementRepository} and sets the default values.
     */
    public ContentManagementRepository() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentManagementRepository}
     */
    @jakarta.annotation.Nonnull
    public static ContentManagementRepository createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentManagementRepository();
    }
    /**
     * Gets the contentTypes property value. Content kinds this repository is configured to deploy. The possible values are: customDetection, unknownFutureValue, defenderWorkbook. Use the Prefer: include-unknown-enum-members request header to get defenderWorkbook.
     * @return a {@link java.util.List<RepositoryContentType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RepositoryContentType> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the deploymentIdentity property value. Bring-your-own deployment identity used for deployment. Optional; when omitted the platform-managed identity path is used. Provide a service principal or a managed identity. Immutable after connecting.
     * @return a {@link DeploymentIdentity}
     */
    @jakarta.annotation.Nullable
    public DeploymentIdentity getDeploymentIdentity() {
        return this.backingStore.get("deploymentIdentity");
    }
    /**
     * Gets the deploymentScope property value. Optional Azure deployment scope, immutable after connecting the repository.
     * @return a {@link DeploymentScope}
     */
    @jakarta.annotation.Nullable
    public DeploymentScope getDeploymentScope() {
        return this.backingStore.get("deploymentScope");
    }
    /**
     * Gets the description property value. Optional description of the connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Human-readable name of the connection. Supports $filter (eq, ne) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfEnumValues(RepositoryContentType::forValue)); });
        deserializerMap.put("deploymentIdentity", (n) -> { this.setDeploymentIdentity(n.getObjectValue(DeploymentIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentScope", (n) -> { this.setDeploymentScope(n.getObjectValue(DeploymentScope::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastDeploymentInfo", (n) -> { this.setLastDeploymentInfo(n.getObjectValue(RepositoryDeploymentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("pullRequest", (n) -> { this.setPullRequest(n.getObjectValue(RepositoryPullRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("repoType", (n) -> { this.setRepoType(n.getEnumValue(RepositoryType::forValue)); });
        deserializerMap.put("servicePrincipal", (n) -> { this.setServicePrincipal(n.getObjectValue(RepositoryServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceLocation", (n) -> { this.setSourceLocation(n.getObjectValue(RepositorySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("systemData", (n) -> { this.setSystemData(n.getObjectValue(SystemData::createFromDiscriminatorValue)); });
        deserializerMap.put("workloadIdentityFederation", (n) -> { this.setWorkloadIdentityFederation(n.getObjectValue(RepositoryWorkloadIdentityFederation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastDeploymentInfo property value. Status of the most recent deployment from this repository. Read-only.
     * @return a {@link RepositoryDeploymentInfo}
     */
    @jakarta.annotation.Nullable
    public RepositoryDeploymentInfo getLastDeploymentInfo() {
        return this.backingStore.get("lastDeploymentInfo");
    }
    /**
     * Gets the pullRequest property value. The setup pull request opened for this connection, when applicable. Read-only.
     * @return a {@link RepositoryPullRequest}
     */
    @jakarta.annotation.Nullable
    public RepositoryPullRequest getPullRequest() {
        return this.backingStore.get("pullRequest");
    }
    /**
     * Gets the repoType property value. Source-control provider.
     * @return a {@link RepositoryType}
     */
    @jakarta.annotation.Nullable
    public RepositoryType getRepoType() {
        return this.backingStore.get("repoType");
    }
    /**
     * Gets the servicePrincipal property value. Service principal / managed identity used by the connection. Read-only.
     * @return a {@link RepositoryServicePrincipal}
     */
    @jakarta.annotation.Nullable
    public RepositoryServicePrincipal getServicePrincipal() {
        return this.backingStore.get("servicePrincipal");
    }
    /**
     * Gets the sourceLocation property value. Repository location settings.
     * @return a {@link RepositorySettings}
     */
    @jakarta.annotation.Nullable
    public RepositorySettings getSourceLocation() {
        return this.backingStore.get("sourceLocation");
    }
    /**
     * Gets the systemData property value. Creation and last modification provenance. Read-only.
     * @return a {@link SystemData}
     */
    @jakarta.annotation.Nullable
    public SystemData getSystemData() {
        return this.backingStore.get("systemData");
    }
    /**
     * Gets the workloadIdentityFederation property value. Workload identity federation details for the connection, when configured. Read-only.
     * @return a {@link RepositoryWorkloadIdentityFederation}
     */
    @jakarta.annotation.Nullable
    public RepositoryWorkloadIdentityFederation getWorkloadIdentityFederation() {
        return this.backingStore.get("workloadIdentityFederation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("deploymentIdentity", this.getDeploymentIdentity());
        writer.writeObjectValue("deploymentScope", this.getDeploymentScope());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("repoType", this.getRepoType());
        writer.writeObjectValue("sourceLocation", this.getSourceLocation());
    }
    /**
     * Sets the contentTypes property value. Content kinds this repository is configured to deploy. The possible values are: customDetection, unknownFutureValue, defenderWorkbook. Use the Prefer: include-unknown-enum-members request header to get defenderWorkbook.
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<RepositoryContentType> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the deploymentIdentity property value. Bring-your-own deployment identity used for deployment. Optional; when omitted the platform-managed identity path is used. Provide a service principal or a managed identity. Immutable after connecting.
     * @param value Value to set for the deploymentIdentity property.
     */
    public void setDeploymentIdentity(@jakarta.annotation.Nullable final DeploymentIdentity value) {
        this.backingStore.set("deploymentIdentity", value);
    }
    /**
     * Sets the deploymentScope property value. Optional Azure deployment scope, immutable after connecting the repository.
     * @param value Value to set for the deploymentScope property.
     */
    public void setDeploymentScope(@jakarta.annotation.Nullable final DeploymentScope value) {
        this.backingStore.set("deploymentScope", value);
    }
    /**
     * Sets the description property value. Optional description of the connection.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Human-readable name of the connection. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastDeploymentInfo property value. Status of the most recent deployment from this repository. Read-only.
     * @param value Value to set for the lastDeploymentInfo property.
     */
    public void setLastDeploymentInfo(@jakarta.annotation.Nullable final RepositoryDeploymentInfo value) {
        this.backingStore.set("lastDeploymentInfo", value);
    }
    /**
     * Sets the pullRequest property value. The setup pull request opened for this connection, when applicable. Read-only.
     * @param value Value to set for the pullRequest property.
     */
    public void setPullRequest(@jakarta.annotation.Nullable final RepositoryPullRequest value) {
        this.backingStore.set("pullRequest", value);
    }
    /**
     * Sets the repoType property value. Source-control provider.
     * @param value Value to set for the repoType property.
     */
    public void setRepoType(@jakarta.annotation.Nullable final RepositoryType value) {
        this.backingStore.set("repoType", value);
    }
    /**
     * Sets the servicePrincipal property value. Service principal / managed identity used by the connection. Read-only.
     * @param value Value to set for the servicePrincipal property.
     */
    public void setServicePrincipal(@jakarta.annotation.Nullable final RepositoryServicePrincipal value) {
        this.backingStore.set("servicePrincipal", value);
    }
    /**
     * Sets the sourceLocation property value. Repository location settings.
     * @param value Value to set for the sourceLocation property.
     */
    public void setSourceLocation(@jakarta.annotation.Nullable final RepositorySettings value) {
        this.backingStore.set("sourceLocation", value);
    }
    /**
     * Sets the systemData property value. Creation and last modification provenance. Read-only.
     * @param value Value to set for the systemData property.
     */
    public void setSystemData(@jakarta.annotation.Nullable final SystemData value) {
        this.backingStore.set("systemData", value);
    }
    /**
     * Sets the workloadIdentityFederation property value. Workload identity federation details for the connection, when configured. Read-only.
     * @param value Value to set for the workloadIdentityFederation property.
     */
    public void setWorkloadIdentityFederation(@jakarta.annotation.Nullable final RepositoryWorkloadIdentityFederation value) {
        this.backingStore.set("workloadIdentityFederation", value);
    }
}
