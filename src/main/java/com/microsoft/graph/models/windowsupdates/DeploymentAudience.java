package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeploymentAudience extends Entity implements Parsable {
    /**
     * Instantiates a new DeploymentAudience and sets the default values.
     */
    public DeploymentAudience() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeploymentAudience
     */
    @jakarta.annotation.Nonnull
    public static DeploymentAudience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentAudience();
    }
    /**
     * Gets the applicableContent property value. Content eligible to deploy to devices in the audience. Not nullable. Read-only.
     * @return a java.util.List<ApplicableContent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableContent> getApplicableContent() {
        return this.backingStore.get("applicableContent");
    }
    /**
     * Gets the exclusions property value. Specifies the assets to exclude from the audience.
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getExclusions() {
        return this.backingStore.get("exclusions");
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
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getMembers() {
        return this.backingStore.get("members");
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
        this.backingStore.set("applicableContent", value);
    }
    /**
     * Sets the exclusions property value. Specifies the assets to exclude from the audience.
     * @param value Value to set for the exclusions property.
     */
    public void setExclusions(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("exclusions", value);
    }
    /**
     * Sets the members property value. Specifies the assets to include in the audience.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("members", value);
    }
}
