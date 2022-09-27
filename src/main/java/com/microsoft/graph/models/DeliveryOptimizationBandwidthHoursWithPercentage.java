package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationBandwidthHoursWithPercentage extends DeliveryOptimizationBandwidth implements Parsable {
    /** Background download percentage hours. */
    private DeliveryOptimizationBandwidthBusinessHoursLimit _bandwidthBackgroundPercentageHours;
    /** Foreground download percentage hours. */
    private DeliveryOptimizationBandwidthBusinessHoursLimit _bandwidthForegroundPercentageHours;
    /**
     * Instantiates a new DeliveryOptimizationBandwidthHoursWithPercentage and sets the default values.
     * @return a void
     */
    public DeliveryOptimizationBandwidthHoursWithPercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthHoursWithPercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationBandwidthHoursWithPercentage
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationBandwidthHoursWithPercentage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthHoursWithPercentage();
    }
    /**
     * Gets the bandwidthBackgroundPercentageHours property value. Background download percentage hours.
     * @return a deliveryOptimizationBandwidthBusinessHoursLimit
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit getBandwidthBackgroundPercentageHours() {
        return this._bandwidthBackgroundPercentageHours;
    }
    /**
     * Gets the bandwidthForegroundPercentageHours property value. Foreground download percentage hours.
     * @return a deliveryOptimizationBandwidthBusinessHoursLimit
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit getBandwidthForegroundPercentageHours() {
        return this._bandwidthForegroundPercentageHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationBandwidthHoursWithPercentage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("bandwidthBackgroundPercentageHours", (n) -> { currentObject.setBandwidthBackgroundPercentageHours(n.getObjectValue(DeliveryOptimizationBandwidthBusinessHoursLimit::createFromDiscriminatorValue)); });
            this.put("bandwidthForegroundPercentageHours", (n) -> { currentObject.setBandwidthForegroundPercentageHours(n.getObjectValue(DeliveryOptimizationBandwidthBusinessHoursLimit::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("bandwidthBackgroundPercentageHours", this.getBandwidthBackgroundPercentageHours());
        writer.writeObjectValue("bandwidthForegroundPercentageHours", this.getBandwidthForegroundPercentageHours());
    }
    /**
     * Sets the bandwidthBackgroundPercentageHours property value. Background download percentage hours.
     * @param value Value to set for the bandwidthBackgroundPercentageHours property.
     * @return a void
     */
    public void setBandwidthBackgroundPercentageHours(@javax.annotation.Nullable final DeliveryOptimizationBandwidthBusinessHoursLimit value) {
        this._bandwidthBackgroundPercentageHours = value;
    }
    /**
     * Sets the bandwidthForegroundPercentageHours property value. Foreground download percentage hours.
     * @param value Value to set for the bandwidthForegroundPercentageHours property.
     * @return a void
     */
    public void setBandwidthForegroundPercentageHours(@javax.annotation.Nullable final DeliveryOptimizationBandwidthBusinessHoursLimit value) {
        this._bandwidthForegroundPercentageHours = value;
    }
}
