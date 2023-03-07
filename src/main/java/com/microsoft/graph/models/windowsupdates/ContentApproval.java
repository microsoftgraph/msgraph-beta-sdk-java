package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentApproval extends ComplianceChange implements Parsable {
    /** The content property */
    private DeployableContent content;
    /** Deployments created as a result of applying the approval. */
    private java.util.List<Deployment> deployments;
    /** Settings for governing how to deploy content. */
    private DeploymentSettings deploymentSettings;
    /**
     * Instantiates a new ContentApproval and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContentApproval() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.contentApproval");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentApproval
     */
    @javax.annotation.Nonnull
    public static ContentApproval createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentApproval();
    }
    /**
     * Gets the content property value. The content property
     * @return a deployableContent
     */
    @javax.annotation.Nullable
    public DeployableContent getContent() {
        return this.content;
    }
    /**
     * Gets the deployments property value. Deployments created as a result of applying the approval.
     * @return a deployment
     */
    @javax.annotation.Nullable
    public java.util.List<Deployment> getDeployments() {
        return this.deployments;
    }
    /**
     * Gets the deploymentSettings property value. Settings for governing how to deploy content.
     * @return a deploymentSettings
     */
    @javax.annotation.Nullable
    public DeploymentSettings getDeploymentSettings() {
        return this.deploymentSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeObjectValue("deploymentSettings", this.getDeploymentSettings());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final DeployableContent value) {
        this.content = value;
    }
    /**
     * Sets the deployments property value. Deployments created as a result of applying the approval.
     * @param value Value to set for the deployments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployments(@javax.annotation.Nullable final java.util.List<Deployment> value) {
        this.deployments = value;
    }
    /**
     * Sets the deploymentSettings property value. Settings for governing how to deploy content.
     * @param value Value to set for the deploymentSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentSettings(@javax.annotation.Nullable final DeploymentSettings value) {
        this.deploymentSettings = value;
    }
}
