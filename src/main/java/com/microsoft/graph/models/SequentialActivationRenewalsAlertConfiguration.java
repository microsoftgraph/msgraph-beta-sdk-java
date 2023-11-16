package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SequentialActivationRenewalsAlertConfiguration extends UnifiedRoleManagementAlertConfiguration implements Parsable {
    /**
     * Instantiates a new SequentialActivationRenewalsAlertConfiguration and sets the default values.
     */
    public SequentialActivationRenewalsAlertConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.sequentialActivationRenewalsAlertConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SequentialActivationRenewalsAlertConfiguration
     */
    @jakarta.annotation.Nonnull
    public static SequentialActivationRenewalsAlertConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SequentialActivationRenewalsAlertConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sequentialActivationCounterThreshold", (n) -> { this.setSequentialActivationCounterThreshold(n.getIntegerValue()); });
        deserializerMap.put("timeIntervalBetweenActivations", (n) -> { this.setTimeIntervalBetweenActivations(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sequentialActivationCounterThreshold property value. The minimum number of activations within the timeIntervalBetweenActivations period to trigger an alert.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequentialActivationCounterThreshold() {
        return this.BackingStore.get("sequentialActivationCounterThreshold");
    }
    /**
     * Gets the timeIntervalBetweenActivations property value. Time interval between activations to trigger an alert.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getTimeIntervalBetweenActivations() {
        return this.BackingStore.get("timeIntervalBetweenActivations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("sequentialActivationCounterThreshold", this.getSequentialActivationCounterThreshold());
        writer.writePeriodAndDurationValue("timeIntervalBetweenActivations", this.getTimeIntervalBetweenActivations());
    }
    /**
     * Sets the sequentialActivationCounterThreshold property value. The minimum number of activations within the timeIntervalBetweenActivations period to trigger an alert.
     * @param value Value to set for the sequentialActivationCounterThreshold property.
     */
    public void setSequentialActivationCounterThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("sequentialActivationCounterThreshold", value);
    }
    /**
     * Sets the timeIntervalBetweenActivations property value. Time interval between activations to trigger an alert.
     * @param value Value to set for the timeIntervalBetweenActivations property.
     */
    public void setTimeIntervalBetweenActivations(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("timeIntervalBetweenActivations", value);
    }
}
