package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics battery health os performance entity contains battery related information for all operating system versions in their organization. */
public class UserExperienceAnalyticsBatteryHealthOsPerformance extends Entity implements Parsable {
    /** Number of active devices for that os version. Valid values -2147483648 to 2147483647 */
    private Integer _activeDevices;
    /** The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647 */
    private Integer _averageBatteryAgeInDays;
    /** The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _averageEstimatedRuntimeInMinutes;
    /** The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647 */
    private Integer _averageMaxCapacityPercentage;
    /** Build number of the operating system. */
    private String _osBuildNumber;
    /** Version of the operating system. */
    private String _osVersion;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthOsPerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsBatteryHealthOsPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthOsPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthOsPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthOsPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that os version. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDevices() {
        return this._activeDevices;
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this._averageBatteryAgeInDays;
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this._averageEstimatedRuntimeInMinutes;
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647
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
        final UserExperienceAnalyticsBatteryHealthOsPerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDevices", (n) -> { currentObject.setActiveDevices(n.getIntegerValue()); });
            this.put("averageBatteryAgeInDays", (n) -> { currentObject.setAverageBatteryAgeInDays(n.getIntegerValue()); });
            this.put("averageEstimatedRuntimeInMinutes", (n) -> { currentObject.setAverageEstimatedRuntimeInMinutes(n.getIntegerValue()); });
            this.put("averageMaxCapacityPercentage", (n) -> { currentObject.setAverageMaxCapacityPercentage(n.getIntegerValue()); });
            this.put("osBuildNumber", (n) -> { currentObject.setOsBuildNumber(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the osBuildNumber property value. Build number of the operating system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this._osBuildNumber;
    }
    /**
     * Gets the osVersion property value. Version of the operating system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
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
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("osVersion", this.getOsVersion());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that os version. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDevices property.
     * @return a void
     */
    public void setActiveDevices(@javax.annotation.Nullable final Integer value) {
        this._activeDevices = value;
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     * @return a void
     */
    public void setAverageBatteryAgeInDays(@javax.annotation.Nullable final Integer value) {
        this._averageBatteryAgeInDays = value;
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     * @return a void
     */
    public void setAverageEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._averageEstimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     * @return a void
     */
    public void setAverageMaxCapacityPercentage(@javax.annotation.Nullable final Integer value) {
        this._averageMaxCapacityPercentage = value;
    }
    /**
     * Sets the osBuildNumber property value. Build number of the operating system.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this._osBuildNumber = value;
    }
    /**
     * Sets the osVersion property value. Version of the operating system.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
}
