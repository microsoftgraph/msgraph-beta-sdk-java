package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBatteryHealthModelPerformance extends Entity implements Parsable {
    /** Number of active devices for that model. Valid values -2147483648 to 2147483647 */
    private Integer _activeDevices;
    /** The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647 */
    private Integer _averageBatteryAgeInDays;
    /** The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _averageEstimatedRuntimeInMinutes;
    /** The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647 */
    private Integer _averageMaxCapacityPercentage;
    /** Name of the device manufacturer. */
    private String _manufacturer;
    /** The model name of the device. */
    private String _model;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthModelPerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsBatteryHealthModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthModelPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthModelPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthModelPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that model. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDevices() {
        return this._activeDevices;
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this._averageBatteryAgeInDays;
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this._averageEstimatedRuntimeInMinutes;
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageMaxCapacityPercentage() {
        return this._averageMaxCapacityPercentage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsBatteryHealthModelPerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDevices", (n) -> { currentObject.setActiveDevices(n.getIntegerValue()); });
            this.put("averageBatteryAgeInDays", (n) -> { currentObject.setAverageBatteryAgeInDays(n.getIntegerValue()); });
            this.put("averageEstimatedRuntimeInMinutes", (n) -> { currentObject.setAverageEstimatedRuntimeInMinutes(n.getIntegerValue()); });
            this.put("averageMaxCapacityPercentage", (n) -> { currentObject.setAverageMaxCapacityPercentage(n.getIntegerValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        }};
    }
    /**
     * Gets the manufacturer property value. Name of the device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeIntegerValue("averageBatteryAgeInDays", this.getAverageBatteryAgeInDays());
        writer.writeIntegerValue("averageEstimatedRuntimeInMinutes", this.getAverageEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("averageMaxCapacityPercentage", this.getAverageMaxCapacityPercentage());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that model. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDevices property.
     * @return a void
     */
    public void setActiveDevices(@javax.annotation.Nullable final Integer value) {
        this._activeDevices = value;
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     * @return a void
     */
    public void setAverageBatteryAgeInDays(@javax.annotation.Nullable final Integer value) {
        this._averageBatteryAgeInDays = value;
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     * @return a void
     */
    public void setAverageEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._averageEstimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     * @return a void
     */
    public void setAverageMaxCapacityPercentage(@javax.annotation.Nullable final Integer value) {
        this._averageMaxCapacityPercentage = value;
    }
    /**
     * Sets the manufacturer property value. Name of the device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The model name of the device.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
}
