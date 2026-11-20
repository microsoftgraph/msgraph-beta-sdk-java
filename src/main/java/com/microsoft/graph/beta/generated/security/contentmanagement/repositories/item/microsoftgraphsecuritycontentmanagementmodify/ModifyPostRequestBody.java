package com.microsoft.graph.beta.security.contentmanagement.repositories.item.microsoftgraphsecuritycontentmanagementmodify;

import com.microsoft.graph.beta.models.security.contentmanagement.DeploymentIdentity;
import com.microsoft.graph.beta.models.security.contentmanagement.DeploymentScope;
import com.microsoft.graph.beta.models.security.contentmanagement.RepositoryAccessCredential;
import com.microsoft.graph.beta.models.security.contentmanagement.RepositoryContentType;
import com.microsoft.graph.beta.models.security.contentmanagement.RepositorySettings;
import com.microsoft.graph.beta.models.security.contentmanagement.RepositoryType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ModifyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ModifyPostRequestBody} and sets the default values.
     */
    public ModifyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ModifyPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ModifyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ModifyPostRequestBody();
    }
    /**
     * Gets the accessCredential property value. The accessCredential property
     * @return a {@link RepositoryAccessCredential}
     */
    @jakarta.annotation.Nullable
    public RepositoryAccessCredential getAccessCredential() {
        return this.backingStore.get("accessCredential");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the contentTypes property value. The contentTypes property
     * @return a {@link java.util.List<RepositoryContentType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RepositoryContentType> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the deploymentIdentity property value. The deploymentIdentity property
     * @return a {@link DeploymentIdentity}
     */
    @jakarta.annotation.Nullable
    public DeploymentIdentity getDeploymentIdentity() {
        return this.backingStore.get("deploymentIdentity");
    }
    /**
     * Gets the deploymentScope property value. The deploymentScope property
     * @return a {@link DeploymentScope}
     */
    @jakarta.annotation.Nullable
    public DeploymentScope getDeploymentScope() {
        return this.backingStore.get("deploymentScope");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("accessCredential", (n) -> { this.setAccessCredential(n.getObjectValue(RepositoryAccessCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfEnumValues(RepositoryContentType::forValue)); });
        deserializerMap.put("deploymentIdentity", (n) -> { this.setDeploymentIdentity(n.getObjectValue(DeploymentIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentScope", (n) -> { this.setDeploymentScope(n.getObjectValue(DeploymentScope::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("repoType", (n) -> { this.setRepoType(n.getEnumValue(RepositoryType::forValue)); });
        deserializerMap.put("sourceLocation", (n) -> { this.setSourceLocation(n.getObjectValue(RepositorySettings::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the sourceLocation property value. The sourceLocation property
     * @return a {@link RepositorySettings}
     */
    @jakarta.annotation.Nullable
    public RepositorySettings getSourceLocation() {
        return this.backingStore.get("sourceLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessCredential", this.getAccessCredential());
        writer.writeCollectionOfEnumValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("deploymentIdentity", this.getDeploymentIdentity());
        writer.writeObjectValue("deploymentScope", this.getDeploymentScope());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("repoType", this.getRepoType());
        writer.writeObjectValue("sourceLocation", this.getSourceLocation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessCredential property value. The accessCredential property
     * @param value Value to set for the accessCredential property.
     */
    public void setAccessCredential(@jakarta.annotation.Nullable final RepositoryAccessCredential value) {
        this.backingStore.set("accessCredential", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the contentTypes property value. The contentTypes property
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<RepositoryContentType> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the deploymentIdentity property value. The deploymentIdentity property
     * @param value Value to set for the deploymentIdentity property.
     */
    public void setDeploymentIdentity(@jakarta.annotation.Nullable final DeploymentIdentity value) {
        this.backingStore.set("deploymentIdentity", value);
    }
    /**
     * Sets the deploymentScope property value. The deploymentScope property
     * @param value Value to set for the deploymentScope property.
     */
    public void setDeploymentScope(@jakarta.annotation.Nullable final DeploymentScope value) {
        this.backingStore.set("deploymentScope", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the repoType property value. Source-control provider.
     * @param value Value to set for the repoType property.
     */
    public void setRepoType(@jakarta.annotation.Nullable final RepositoryType value) {
        this.backingStore.set("repoType", value);
    }
    /**
     * Sets the sourceLocation property value. The sourceLocation property
     * @param value Value to set for the sourceLocation property.
     */
    public void setSourceLocation(@jakarta.annotation.Nullable final RepositorySettings value) {
        this.backingStore.set("sourceLocation", value);
    }
}
