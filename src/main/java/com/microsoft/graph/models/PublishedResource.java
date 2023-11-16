package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublishedResource extends Entity implements Parsable {
    /**
     * Instantiates a new PublishedResource and sets the default values.
     */
    public PublishedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PublishedResource
     */
    @jakarta.annotation.Nonnull
    public static PublishedResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublishedResource();
    }
    /**
     * Gets the agentGroups property value. List of onPremisesAgentGroups that a publishedResource is assigned to. Read-only. Nullable.
     * @return a java.util.List<OnPremisesAgentGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this.BackingStore.get("agentGroups");
    }
    /**
     * Gets the displayName property value. Display Name of the publishedResource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentGroups", (n) -> { this.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("publishingType", (n) -> { this.setPublishingType(n.getEnumValue(OnPremisesPublishingType.class)); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the publishingType property value. The publishingType property
     * @return a OnPremisesPublishingType
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingType getPublishingType() {
        return this.BackingStore.get("publishingType");
    }
    /**
     * Gets the resourceName property value. Name of the publishedResource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.BackingStore.get("resourceName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("publishingType", this.getPublishingType());
        writer.writeStringValue("resourceName", this.getResourceName());
    }
    /**
     * Sets the agentGroups property value. List of onPremisesAgentGroups that a publishedResource is assigned to. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     */
    public void setAgentGroups(@jakarta.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this.BackingStore.set("agentGroups", value);
    }
    /**
     * Sets the displayName property value. Display Name of the publishedResource.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the publishingType property value. The publishingType property
     * @param value Value to set for the publishingType property.
     */
    public void setPublishingType(@jakarta.annotation.Nullable final OnPremisesPublishingType value) {
        this.BackingStore.set("publishingType", value);
    }
    /**
     * Sets the resourceName property value. Name of the publishedResource.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceName", value);
    }
}
