package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesAgentGroup extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OnPremisesAgentGroup} and sets the default values.
     */
    public OnPremisesAgentGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesAgentGroup}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesAgentGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAgentGroup();
    }
    /**
     * Gets the agents property value. List of onPremisesAgent that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @return a {@link java.util.List<OnPremisesAgent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesAgent> getAgents() {
        return this.backingStore.get("agents");
    }
    /**
     * Gets the displayName property value. Display name of the onPremisesAgentGroup.
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
        deserializerMap.put("agents", (n) -> { this.setAgents(n.getCollectionOfObjectValues(OnPremisesAgent::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("publishedResources", (n) -> { this.setPublishedResources(n.getCollectionOfObjectValues(PublishedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("publishingType", (n) -> { this.setPublishingType(n.getEnumValue(OnPremisesPublishingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if the onPremisesAgentGroup is the default agent group. Only a single agent group can be the default onPremisesAgentGroup and is set by the system.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the publishedResources property value. List of publishedResource that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @return a {@link java.util.List<PublishedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PublishedResource> getPublishedResources() {
        return this.backingStore.get("publishedResources");
    }
    /**
     * Gets the publishingType property value. The publishingType property
     * @return a {@link OnPremisesPublishingType}
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingType getPublishingType() {
        return this.backingStore.get("publishingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agents", this.getAgents());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeCollectionOfObjectValues("publishedResources", this.getPublishedResources());
        writer.writeEnumValue("publishingType", this.getPublishingType());
    }
    /**
     * Sets the agents property value. List of onPremisesAgent that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @param value Value to set for the agents property.
     */
    public void setAgents(@jakarta.annotation.Nullable final java.util.List<OnPremisesAgent> value) {
        this.backingStore.set("agents", value);
    }
    /**
     * Sets the displayName property value. Display name of the onPremisesAgentGroup.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isDefault property value. Indicates if the onPremisesAgentGroup is the default agent group. Only a single agent group can be the default onPremisesAgentGroup and is set by the system.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the publishedResources property value. List of publishedResource that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @param value Value to set for the publishedResources property.
     */
    public void setPublishedResources(@jakarta.annotation.Nullable final java.util.List<PublishedResource> value) {
        this.backingStore.set("publishedResources", value);
    }
    /**
     * Sets the publishingType property value. The publishingType property
     * @param value Value to set for the publishingType property.
     */
    public void setPublishingType(@jakarta.annotation.Nullable final OnPremisesPublishingType value) {
        this.backingStore.set("publishingType", value);
    }
}
