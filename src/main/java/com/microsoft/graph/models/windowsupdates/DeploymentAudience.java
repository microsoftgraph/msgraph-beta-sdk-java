package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeploymentAudience extends Entity implements Parsable {
    /**
     * Content eligible to deploy to devices in the audience. Not nullable. Read-only.
     */
    private java.util.List<ApplicableContent> applicableContent;
    /**
     * Specifies the assets to exclude from the audience.
     */
    private java.util.List<UpdatableAsset> exclusions;
    /**
     * Specifies the assets to include in the audience.
     */
    private java.util.List<UpdatableAsset> members;
    /**
     * Instantiates a new deploymentAudience and sets the default values.
     */
    public DeploymentAudience() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentAudience
     */
    @jakarta.annotation.Nonnull
    public static DeploymentAudience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentAudience();
    }
    /**
     * Gets the applicableContent property value. Content eligible to deploy to devices in the audience. Not nullable. Read-only.
     * @return a applicableContent
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableContent> getApplicableContent() {
        return this.applicableContent;
    }
    /**
     * Gets the exclusions property value. Specifies the assets to exclude from the audience.
     * @return a updatableAsset
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getExclusions() {
        return this.exclusions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableContent", (n) -> { this.setApplicableContent(n.getCollectionOfObjectValues(ApplicableContent::createFromDiscriminatorValue)); });
        deserializerMap.put("exclusions", (n) -> { this.setExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Specifies the assets to include in the audience.
     * @return a updatableAsset
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getMembers() {
        return this.members;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicableContent", this.getApplicableContent());
        writer.writeCollectionOfObjectValues("exclusions", this.getExclusions());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the applicableContent property value. Content eligible to deploy to devices in the audience. Not nullable. Read-only.
     * @param value Value to set for the applicableContent property.
     */
    public void setApplicableContent(@jakarta.annotation.Nullable final java.util.List<ApplicableContent> value) {
        this.applicableContent = value;
    }
    /**
     * Sets the exclusions property value. Specifies the assets to exclude from the audience.
     * @param value Value to set for the exclusions property.
     */
    public void setExclusions(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.exclusions = value;
    }
    /**
     * Sets the members property value. Specifies the assets to include in the audience.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.members = value;
    }
}
