package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Deployment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Deployment} and sets the default values.
     */
    public Deployment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Deployment}
     */
    @jakarta.annotation.Nonnull
    public static Deployment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Deployment();
    }
    /**
     * Gets the audience property value. Specifies the audience to which content is deployed.
     * @return a {@link DeploymentAudience}
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience getAudience() {
        return this.backingStore.get("audience");
    }
    /**
     * Gets the content property value. Specifies what content to deploy. Cannot be changed. Returned by default.
     * @return a {@link DeployableContent}
     */
    @jakarta.annotation.Nullable
    public DeployableContent getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. The date and time the deployment was created. Returned by default. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the settings property value. Settings specified on the specific deployment governing how to deploy content. Returned by default.
     * @return a {@link DeploymentSettings}
     */
    @jakarta.annotation.Nullable
    public DeploymentSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the state property value. Execution status of the deployment. Returned by default.
     * @return a {@link DeploymentState}
     */
    @jakarta.annotation.Nullable
    public DeploymentState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAudience(@jakarta.annotation.Nullable final DeploymentAudience value) {
        this.backingStore.set("audience", value);
    }
    /**
     * Sets the content property value. Specifies what content to deploy. Cannot be changed. Returned by default.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final DeployableContent value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the deployment was created. Returned by default. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the deployment was last modified. Returned by default. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the settings property value. Settings specified on the specific deployment governing how to deploy content. Returned by default.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DeploymentSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the state property value. Execution status of the deployment. Returned by default.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final DeploymentState value) {
        this.backingStore.set("state", value);
    }
}
