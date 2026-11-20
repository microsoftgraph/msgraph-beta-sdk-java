package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendationRelation extends Relation implements Parsable {
    /**
     * Instantiates a new {@link RecommendationRelation} and sets the default values.
     */
    public RecommendationRelation() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.recommendationRelation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecommendationRelation}
     */
    @jakarta.annotation.Nonnull
    public static RecommendationRelation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendationRelation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recommendationType", (n) -> { this.setRecommendationType(n.getStringValue()); });
        deserializerMap.put("resourceGroupName", (n) -> { this.setResourceGroupName(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recommendationType property value. The recommendation type associated with the linked recommendation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendationType() {
        return this.backingStore.get("recommendationType");
    }
    /**
     * Gets the resourceGroupName property value. The Azure resource group name for the related recommendation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroupName() {
        return this.backingStore.get("resourceGroupName");
    }
    /**
     * Gets the subscriptionId property value. The Azure subscription identifier for the related recommendation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recommendationType", this.getRecommendationType());
        writer.writeStringValue("resourceGroupName", this.getResourceGroupName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
    }
    /**
     * Sets the recommendationType property value. The recommendation type associated with the linked recommendation.
     * @param value Value to set for the recommendationType property.
     */
    public void setRecommendationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendationType", value);
    }
    /**
     * Sets the resourceGroupName property value. The Azure resource group name for the related recommendation.
     * @param value Value to set for the resourceGroupName property.
     */
    public void setResourceGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroupName", value);
    }
    /**
     * Sets the subscriptionId property value. The Azure subscription identifier for the related recommendation.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
}
