package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DurationDrivenRolloutSettings extends GradualRolloutSettings implements Parsable {
    /**
     * Instantiates a new DurationDrivenRolloutSettings and sets the default values.
     */
    public DurationDrivenRolloutSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.durationDrivenRolloutSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DurationDrivenRolloutSettings
     */
    @jakarta.annotation.Nonnull
    public static DurationDrivenRolloutSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DurationDrivenRolloutSettings();
    }
    /**
     * Gets the durationUntilDeploymentEnd property value. The target duration of the rollout. Given durationBetweenOffers and durationUntilDeploymentEnd, the system will automatically calculate how many devices are in each offering.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDurationUntilDeploymentEnd() {
        return this.BackingStore.get("durationUntilDeploymentEnd");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("durationUntilDeploymentEnd", (n) -> { this.setDurationUntilDeploymentEnd(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("durationUntilDeploymentEnd", this.getDurationUntilDeploymentEnd());
    }
    /**
     * Sets the durationUntilDeploymentEnd property value. The target duration of the rollout. Given durationBetweenOffers and durationUntilDeploymentEnd, the system will automatically calculate how many devices are in each offering.
     * @param value Value to set for the durationUntilDeploymentEnd property.
     */
    public void setDurationUntilDeploymentEnd(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("durationUntilDeploymentEnd", value);
    }
}
