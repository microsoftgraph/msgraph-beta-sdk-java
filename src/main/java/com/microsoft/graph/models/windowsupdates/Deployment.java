package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Deployment extends Entity implements Parsable {
    /**
     * Specifies the audience to which content is deployed.
     */
    private DeploymentAudience audience;
    /**
     * Specifies what content to deploy. Cannot be changed. Returned by default.
     */
    private DeployableContent content;
    /**
     * The date and time the deployment was created. Returned by default. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time the deployment was last modified. Returned by default. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Settings specified on the specific deployment governing how to deploy content. Returned by default.
     */
    private DeploymentSettings settings;
    /**
     * Execution status of the deployment. Returned by default.
     */
    private DeploymentState state;
    /**
     * Instantiates a new deployment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Deployment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deployment
     */
    @javax.annotation.Nonnull
    public static Deployment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Deployment();
    }
    /**
     * Gets the audience property value. Specifies the audience to which content is deployed.
     * @return a deploymentAudience
     */
    @javax.annotation.Nullable
    public DeploymentAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the content property value. Specifies what content to deploy. Cannot be changed. Returned by default.
     * @return a deployableContent
     */
    @javax.annotation.Nullable
    public DeployableContent getContent() {
        return this.content;
    }
    /**
     * Gets the createdDateTime property value. The date and time the deployment was created. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getObjectValue(DeploymentAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(DeployableContent::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DeploymentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getObjectValue(DeploymentState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the deployment was last modified. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the settings property value. Settings specified on the specific deployment governing how to deploy content. Returned by default.
     * @return a deploymentSettings
     */
    @javax.annotation.Nullable
    public DeploymentSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the state property value. Execution status of the deployment. Returned by default.
     * @return a deploymentState
     */
    @javax.annotation.Nullable
    public DeploymentState getState() {
        return this.state;
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
        writer.writeObjectValue("audience", this.getAudience());
        writer.writeObjectValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("state", this.getState());
    }
    /**
     * Sets the audience property value. Specifies the audience to which content is deployed.
     * @param value Value to set for the audience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudience(@javax.annotation.Nullable final DeploymentAudience value) {
        this.audience = value;
    }
    /**
     * Sets the content property value. Specifies what content to deploy. Cannot be changed. Returned by default.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final DeployableContent value) {
        this.content = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the deployment was created. Returned by default. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the deployment was last modified. Returned by default. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the settings property value. Settings specified on the specific deployment governing how to deploy content. Returned by default.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final DeploymentSettings value) {
        this.settings = value;
    }
    /**
     * Sets the state property value. Execution status of the deployment. Returned by default.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final DeploymentState value) {
        this.state = value;
    }
}
