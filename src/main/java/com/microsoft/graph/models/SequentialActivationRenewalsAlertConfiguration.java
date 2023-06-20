package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SequentialActivationRenewalsAlertConfiguration extends UnifiedRoleManagementAlertConfiguration implements Parsable {
    /** The sequentialActivationCounterThreshold property */
    private Integer sequentialActivationCounterThreshold;
    /** The timeIntervalBetweenActivations property */
    private Period timeIntervalBetweenActivations;
    /**
     * Instantiates a new SequentialActivationRenewalsAlertConfiguration and sets the default values.
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
     * @return a SequentialActivationRenewalsAlertConfiguration
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
        deserializerMap.put("timeIntervalBetweenActivations", (n) -> { this.setTimeIntervalBetweenActivations(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sequentialActivationCounterThreshold property value. The sequentialActivationCounterThreshold property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSequentialActivationCounterThreshold() {
        return this.sequentialActivationCounterThreshold;
    }
    /**
     * Gets the timeIntervalBetweenActivations property value. The timeIntervalBetweenActivations property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeIntervalBetweenActivations() {
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
        writer.writePeriodValue("timeIntervalBetweenActivations", this.getTimeIntervalBetweenActivations());
    }
    /**
     * Sets the sequentialActivationCounterThreshold property value. The sequentialActivationCounterThreshold property
     * @param value Value to set for the sequentialActivationCounterThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequentialActivationCounterThreshold(@javax.annotation.Nullable final Integer value) {
        this.sequentialActivationCounterThreshold = value;
    }
    /**
     * Sets the timeIntervalBetweenActivations property value. The timeIntervalBetweenActivations property
     * @param value Value to set for the timeIntervalBetweenActivations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeIntervalBetweenActivations(@javax.annotation.Nullable final Period value) {
        this.timeIntervalBetweenActivations = value;
    }
}
