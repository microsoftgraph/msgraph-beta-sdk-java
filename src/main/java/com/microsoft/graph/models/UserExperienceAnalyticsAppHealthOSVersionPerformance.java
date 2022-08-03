package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAppHealthOSVersionPerformance extends Entity implements Parsable {
    /** The number of active devices for the OS version. Valid values -2147483648 to 2147483647 */
    private Integer _activeDeviceCount;
    /** The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _meanTimeToFailureInMinutes;
    /** The OS build number installed on the device. */
    private String _osBuildNumber;
    /** The OS version installed on the device. */
    private String _osVersion;
    /** The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _osVersionAppHealthScore;
    /** The overall app health status of the OS version. */
    private String _osVersionAppHealthStatus;
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthOSVersionPerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthOSVersionPerformance() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthOSVersionPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthOSVersionPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthOSVersionPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The number of active devices for the OS version. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this._activeDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthOSVersionPerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDeviceCount", (n) -> { currentObject.setActiveDeviceCount(n.getIntegerValue()); });
            this.put("meanTimeToFailureInMinutes", (n) -> { currentObject.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
            this.put("osBuildNumber", (n) -> { currentObject.setOsBuildNumber(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("osVersionAppHealthScore", (n) -> { currentObject.setOsVersionAppHealthScore(n.getDoubleValue()); });
            this.put("osVersionAppHealthStatus", (n) -> { currentObject.setOsVersionAppHealthStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this._meanTimeToFailureInMinutes;
    }
    /**
     * Gets the osBuildNumber property value. The OS build number installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this._osBuildNumber;
    }
    /**
     * Gets the osVersion property value. The OS version installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the osVersionAppHealthScore property value. The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getOsVersionAppHealthScore() {
        return this._osVersionAppHealthScore;
    }
    /**
     * Gets the osVersionAppHealthStatus property value. The overall app health status of the OS version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersionAppHealthStatus() {
        return this._osVersionAppHealthStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeDoubleValue("osVersionAppHealthScore", this.getOsVersionAppHealthScore());
        writer.writeStringValue("osVersionAppHealthStatus", this.getOsVersionAppHealthStatus());
    }
    /**
     * Sets the activeDeviceCount property value. The number of active devices for the OS version. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     * @return a void
     */
    public void setActiveDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._activeDeviceCount = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this._meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the osBuildNumber property value. The OS build number installed on the device.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this._osBuildNumber = value;
    }
    /**
     * Sets the osVersion property value. The OS version installed on the device.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the osVersionAppHealthScore property value. The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the osVersionAppHealthScore property.
     * @return a void
     */
    public void setOsVersionAppHealthScore(@javax.annotation.Nullable final Double value) {
        this._osVersionAppHealthScore = value;
    }
    /**
     * Sets the osVersionAppHealthStatus property value. The overall app health status of the OS version.
     * @param value Value to set for the osVersionAppHealthStatus property.
     * @return a void
     */
    public void setOsVersionAppHealthStatus(@javax.annotation.Nullable final String value) {
        this._osVersionAppHealthStatus = value;
    }
}
