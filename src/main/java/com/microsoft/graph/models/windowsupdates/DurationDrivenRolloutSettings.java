package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DurationDrivenRolloutSettings extends GradualRolloutSettings implements Parsable {
    /**
     * The target duration of the rollout. Given durationBetweenOffers and durationUntilDeploymentEnd, the system will automatically calculate how many devices are in each offering.
     */
    private Period durationUntilDeploymentEnd;
    /**
     * Instantiates a new durationDrivenRolloutSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DurationDrivenRolloutSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.durationDrivenRolloutSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a durationDrivenRolloutSettings
     */
    @javax.annotation.Nonnull
    public static DurationDrivenRolloutSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DurationDrivenRolloutSettings();
    }
    /**
     * Gets the durationUntilDeploymentEnd property value. The target duration of the rollout. Given durationBetweenOffers and durationUntilDeploymentEnd, the system will automatically calculate how many devices are in each offering.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDurationUntilDeploymentEnd() {
        return this.durationUntilDeploymentEnd;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("durationUntilDeploymentEnd", (n) -> { this.setDurationUntilDeploymentEnd(n.getPeriodValue()); });
        return deserializerMap;
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
        writer.writePeriodValue("durationUntilDeploymentEnd", this.getDurationUntilDeploymentEnd());
    }
    /**
     * Sets the durationUntilDeploymentEnd property value. The target duration of the rollout. Given durationBetweenOffers and durationUntilDeploymentEnd, the system will automatically calculate how many devices are in each offering.
     * @param value Value to set for the durationUntilDeploymentEnd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationUntilDeploymentEnd(@javax.annotation.Nullable final Period value) {
        this.durationUntilDeploymentEnd = value;
    }
}
