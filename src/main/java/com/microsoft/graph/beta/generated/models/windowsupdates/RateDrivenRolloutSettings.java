package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateDrivenRolloutSettings extends GradualRolloutSettings implements Parsable {
    /**
     * Instantiates a new {@link RateDrivenRolloutSettings} and sets the default values.
     */
    public RateDrivenRolloutSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.rateDrivenRolloutSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateDrivenRolloutSettings}
     */
    @jakarta.annotation.Nonnull
    public static RateDrivenRolloutSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateDrivenRolloutSettings();
    }
    /**
     * Gets the devicesPerOffer property value. Specifies the number of devices that are offered at the same time. When not set, all devices in the deployment are offered content at the same time.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesPerOffer() {
        return this.backingStore.get("devicesPerOffer");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("devicesPerOffer", (n) -> { this.setDevicesPerOffer(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("devicesPerOffer", this.getDevicesPerOffer());
    }
    /**
     * Sets the devicesPerOffer property value. Specifies the number of devices that are offered at the same time. When not set, all devices in the deployment are offered content at the same time.
     * @param value Value to set for the devicesPerOffer property.
     */
    public void setDevicesPerOffer(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("devicesPerOffer", value);
    }
}
