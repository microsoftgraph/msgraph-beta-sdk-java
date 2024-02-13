package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentApproval extends ComplianceChange implements Parsable {
    /**
     * Instantiates a new {@link ContentApproval} and sets the default values.
     */
    public ContentApproval() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.contentApproval");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentApproval}
     */
    @jakarta.annotation.Nonnull
    public static ContentApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentApproval();
    }
    /**
     * Gets the content property value. The content property
     * @return a {@link DeployableContent}
     */
    @jakarta.annotation.Nullable
    public DeployableContent getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the deployments property value. Deployments created as a result of applying the approval.
     * @return a {@link java.util.List<Deployment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Deployment> getDeployments() {
        return this.backingStore.get("deployments");
    }
    /**
     * Gets the deploymentSettings property value. Settings for governing how to deploy content.
     * @return a {@link DeploymentSettings}
     */
    @jakarta.annotation.Nullable
    public DeploymentSettings getDeploymentSettings() {
        return this.backingStore.get("deploymentSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(DeployableContent::createFromDiscriminatorValue)); });
        deserializerMap.put("deployments", (n) -> { this.setDeployments(n.getCollectionOfObjectValues(Deployment::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentSettings", (n) -> { this.setDeploymentSettings(n.getObjectValue(DeploymentSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeObjectValue("deploymentSettings", this.getDeploymentSettings());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final DeployableContent value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the deployments property value. Deployments created as a result of applying the approval.
     * @param value Value to set for the deployments property.
     */
    public void setDeployments(@jakarta.annotation.Nullable final java.util.List<Deployment> value) {
        this.backingStore.set("deployments", value);
    }
    /**
     * Sets the deploymentSettings property value. Settings for governing how to deploy content.
     * @param value Value to set for the deploymentSettings property.
     */
    public void setDeploymentSettings(@jakarta.annotation.Nullable final DeploymentSettings value) {
        this.backingStore.set("deploymentSettings", value);
    }
}
