package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Parameter passed to GetHealthMetricTimeSeries when requesting snapshot time series. */
public class TimeSeriesParameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** End time of the series being requested. Optional; if not specified, current time is used. */
    private OffsetDateTime _endDateTime;
    /** The name of the metric for which a time series is requested. */
    private String _metricName;
    /** Start time of the series being requested. */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new timeSeriesParameter and sets the default values.
     * @return a void
     */
    public TimeSeriesParameter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeSeriesParameter
     */
    @javax.annotation.Nonnull
    public static TimeSeriesParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeSeriesParameter();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the endDateTime property value. End time of the series being requested. Optional; if not specified, current time is used.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeSeriesParameter currentObject = this;
        return new HashMap<>(3) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("metricName", (n) -> { currentObject.setMetricName(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the metricName property value. The name of the metric for which a time series is requested.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetricName() {
        return this._metricName;
    }
    /**
     * Gets the startDateTime property value. Start time of the series being requested.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("metricName", this.getMetricName());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the endDateTime property value. End time of the series being requested. Optional; if not specified, current time is used.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the metricName property value. The name of the metric for which a time series is requested.
     * @param value Value to set for the metricName property.
     * @return a void
     */
    public void setMetricName(@javax.annotation.Nullable final String value) {
        this._metricName = value;
    }
    /**
     * Sets the startDateTime property value. Start time of the series being requested.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
