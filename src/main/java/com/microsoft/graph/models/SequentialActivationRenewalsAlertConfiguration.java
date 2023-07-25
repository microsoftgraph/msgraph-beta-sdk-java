package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SequentialActivationRenewalsAlertConfiguration extends UnifiedRoleManagementAlertConfiguration implements Parsable {
    /**
     * The minimum number of activations within the timeIntervalBetweenActivations period to trigger an alert.
     */
    private Integer sequentialActivationCounterThreshold;
    /**
     * Time interval between activations to trigger an alert.
     */
    private PeriodAndDuration timeIntervalBetweenActivations;
    /**
     * Instantiates a new sequentialActivationRenewalsAlertConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SequentialActivationRenewalsAlertConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.sequentialActivationRenewalsAlertConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sequentialActivationRenewalsAlertConfiguration
     */
    @javax.annotation.Nonnull
    public static SequentialActivationRenewalsAlertConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SequentialActivationRenewalsAlertConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sequentialActivationCounterThreshold", (n) -> { this.setSequentialActivationCounterThreshold(n.getIntegerValue()); });
        deserializerMap.put("timeIntervalBetweenActivations", (n) -> { this.setTimeIntervalBetweenActivations(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sequentialActivationCounterThreshold property value. The minimum number of activations within the timeIntervalBetweenActivations period to trigger an alert.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSequentialActivationCounterThreshold() {
        return this.sequentialActivationCounterThreshold;
    }
    /**
     * Gets the timeIntervalBetweenActivations property value. Time interval between activations to trigger an alert.
     * @return a PeriodAndDuration
     */
    @javax.annotation.Nullable
    public PeriodAndDuration getTimeIntervalBetweenActivations() {
        return this.timeIntervalBetweenActivations;
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
        writer.writeIntegerValue("sequentialActivationCounterThreshold", this.getSequentialActivationCounterThreshold());
        writer.writePeriodAndDurationValue("timeIntervalBetweenActivations", this.getTimeIntervalBetweenActivations());
    }
    /**
     * Sets the sequentialActivationCounterThreshold property value. The minimum number of activations within the timeIntervalBetweenActivations period to trigger an alert.
     * @param value Value to set for the sequentialActivationCounterThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequentialActivationCounterThreshold(@javax.annotation.Nullable final Integer value) {
        this.sequentialActivationCounterThreshold = value;
    }
    /**
     * Sets the timeIntervalBetweenActivations property value. Time interval between activations to trigger an alert.
     * @param value Value to set for the timeIntervalBetweenActivations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeIntervalBetweenActivations(@javax.annotation.Nullable final PeriodAndDuration value) {
        this.timeIntervalBetweenActivations = value;
    }
}
