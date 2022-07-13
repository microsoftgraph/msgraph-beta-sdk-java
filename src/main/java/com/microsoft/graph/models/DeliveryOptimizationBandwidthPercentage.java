package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationBandwidthPercentage extends DeliveryOptimizationBandwidth implements Parsable {
    /** Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100 */
    private Integer _maximumBackgroundBandwidthPercentage;
    /** Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100 */
    private Integer _maximumForegroundBandwidthPercentage;
    /**
     * Instantiates a new DeliveryOptimizationBandwidthPercentage and sets the default values.
     * @return a void
     */
    public DeliveryOptimizationBandwidthPercentage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationBandwidthPercentage
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationBandwidthPercentage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthPercentage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationBandwidthPercentage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("maximumBackgroundBandwidthPercentage", (n) -> { currentObject.setMaximumBackgroundBandwidthPercentage(n.getIntegerValue()); });
            this.put("maximumForegroundBandwidthPercentage", (n) -> { currentObject.setMaximumForegroundBandwidthPercentage(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumBackgroundBandwidthPercentage() {
        return this._maximumBackgroundBandwidthPercentage;
    }
    /**
     * Gets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumForegroundBandwidthPercentage() {
        return this._maximumForegroundBandwidthPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumBackgroundBandwidthPercentage", this.getMaximumBackgroundBandwidthPercentage());
        writer.writeIntegerValue("maximumForegroundBandwidthPercentage", this.getMaximumForegroundBandwidthPercentage());
    }
    /**
     * Sets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumBackgroundBandwidthPercentage property.
     * @return a void
     */
    public void setMaximumBackgroundBandwidthPercentage(@javax.annotation.Nullable final Integer value) {
        this._maximumBackgroundBandwidthPercentage = value;
    }
    /**
     * Sets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumForegroundBandwidthPercentage property.
     * @return a void
     */
    public void setMaximumForegroundBandwidthPercentage(@javax.annotation.Nullable final Integer value) {
        this._maximumForegroundBandwidthPercentage = value;
    }
}
