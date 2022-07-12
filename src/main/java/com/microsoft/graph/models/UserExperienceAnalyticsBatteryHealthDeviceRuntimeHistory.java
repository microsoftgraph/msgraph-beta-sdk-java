package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory extends Entity implements Parsable {
    /** The unique identifier of the device, Intune DeviceID or SCCM device id. */
    private String _deviceId;
    /** The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _estimatedRuntimeInMinutes;
    /** The datetime for the instance of runtime history. */
    private String _runtimeDateTime;
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory();
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEstimatedRuntimeInMinutes() {
        return this._estimatedRuntimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("estimatedRuntimeInMinutes", (n) -> { currentObject.setEstimatedRuntimeInMinutes(n.getIntegerValue()); });
            this.put("runtimeDateTime", (n) -> { currentObject.setRuntimeDateTime(n.getStringValue()); });
        }};
    }
    /**
     * Gets the runtimeDateTime property value. The datetime for the instance of runtime history.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuntimeDateTime() {
        return this._runtimeDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("estimatedRuntimeInMinutes", this.getEstimatedRuntimeInMinutes());
        writer.writeStringValue("runtimeDateTime", this.getRuntimeDateTime());
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the estimatedRuntimeInMinutes property.
     * @return a void
     */
    public void setEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._estimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the runtimeDateTime property value. The datetime for the instance of runtime history.
     * @param value Value to set for the runtimeDateTime property.
     * @return a void
     */
    public void setRuntimeDateTime(@javax.annotation.Nullable final String value) {
        this._runtimeDateTime = value;
    }
}
