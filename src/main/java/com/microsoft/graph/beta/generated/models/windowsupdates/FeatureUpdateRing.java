package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeatureUpdateRing extends Ring implements Parsable {
    /**
     * Instantiates a new {@link FeatureUpdateRing} and sets the default values.
     */
    public FeatureUpdateRing() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.featureUpdateRing");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeatureUpdateRing}
     */
    @jakarta.annotation.Nonnull
    public static FeatureUpdateRing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureUpdateRing();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isOfferOptional", (n) -> { this.setIsOfferOptional(n.getBooleanValue()); });
        deserializerMap.put("offerDurationInDays", (n) -> { this.setOfferDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("offerIntervalInDays", (n) -> { this.setOfferIntervalInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isOfferOptional property value. Indicates whether the feature update is offered to end users as optional rather than required. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOfferOptional() {
        return this.backingStore.get("isOfferOptional");
    }
    /**
     * Gets the offerDurationInDays property value. The total length of the gradual-rollout window, in days, from when the update is first offered to when the rollout completes. The minimum is 1. Only used when offerIntervalInDays is 1 or greater; ignored when offerIntervalInDays is 0. Default is 1.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOfferDurationInDays() {
        return this.backingStore.get("offerDurationInDays");
    }
    /**
     * Gets the offerIntervalInDays property value. How often, in days, a new subset of devices is offered the update. Accepted range is 0 to 30. Set to 0 to offer the update to all devices at once. When the value is 1 or greater, the rollout advances one subset at each interval until every device has been offered the update. Must be less than or equal to offerDurationInDays. Default is 0.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOfferIntervalInDays() {
        return this.backingStore.get("offerIntervalInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isOfferOptional", this.getIsOfferOptional());
        writer.writeIntegerValue("offerDurationInDays", this.getOfferDurationInDays());
        writer.writeIntegerValue("offerIntervalInDays", this.getOfferIntervalInDays());
    }
    /**
     * Sets the isOfferOptional property value. Indicates whether the feature update is offered to end users as optional rather than required. Default is false.
     * @param value Value to set for the isOfferOptional property.
     */
    public void setIsOfferOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOfferOptional", value);
    }
    /**
     * Sets the offerDurationInDays property value. The total length of the gradual-rollout window, in days, from when the update is first offered to when the rollout completes. The minimum is 1. Only used when offerIntervalInDays is 1 or greater; ignored when offerIntervalInDays is 0. Default is 1.
     * @param value Value to set for the offerDurationInDays property.
     */
    public void setOfferDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offerDurationInDays", value);
    }
    /**
     * Sets the offerIntervalInDays property value. How often, in days, a new subset of devices is offered the update. Accepted range is 0 to 30. Set to 0 to offer the update to all devices at once. When the value is 1 or greater, the rollout advances one subset at each interval until every device has been offered the update. Must be less than or equal to offerDurationInDays. Default is 0.
     * @param value Value to set for the offerIntervalInDays property.
     */
    public void setOfferIntervalInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offerIntervalInDays", value);
    }
}
