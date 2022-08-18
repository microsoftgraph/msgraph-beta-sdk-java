package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics metric history. */
public class UserExperienceAnalyticsMetricHistory extends Entity implements Parsable {
    /** The user experience analytics device id. */
    private String _deviceId;
    /** The user experience analytics metric date time. */
    private OffsetDateTime _metricDateTime;
    /** The user experience analytics metric type. */
    private String _metricType;
    /**
     * Instantiates a new userExperienceAnalyticsMetricHistory and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsMetricHistory() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsMetricHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsMetricHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsMetricHistory();
    }
    /**
     * Gets the deviceId property value. The user experience analytics device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsMetricHistory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("metricDateTime", (n) -> { currentObject.setMetricDateTime(n.getOffsetDateTimeValue()); });
            this.put("metricType", (n) -> { currentObject.setMetricType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the metricDateTime property value. The user experience analytics metric date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMetricDateTime() {
        return this._metricDateTime;
    }
    /**
     * Gets the metricType property value. The user experience analytics metric type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetricType() {
        return this._metricType;
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
        writer.writeOffsetDateTimeValue("metricDateTime", this.getMetricDateTime());
        writer.writeStringValue("metricType", this.getMetricType());
    }
    /**
     * Sets the deviceId property value. The user experience analytics device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the metricDateTime property value. The user experience analytics metric date time.
     * @param value Value to set for the metricDateTime property.
     * @return a void
     */
    public void setMetricDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._metricDateTime = value;
    }
    /**
     * Sets the metricType property value. The user experience analytics metric type.
     * @param value Value to set for the metricType property.
     * @return a void
     */
    public void setMetricType(@javax.annotation.Nullable final String value) {
        this._metricType = value;
    }
}
