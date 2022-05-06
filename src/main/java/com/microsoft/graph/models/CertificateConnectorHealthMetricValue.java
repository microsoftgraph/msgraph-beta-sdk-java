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
/** Metric snapshot value returned in response to a GetHealthMetricTimeSeries request.  */
public class CertificateConnectorHealthMetricValue implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Timestamp for this metric data-point.  */
    private OffsetDateTime _dateTime;
    /** Count of failed requests/operations.  */
    private Long _failureCount;
    /** Count of successful requests/operations.  */
    private Long _successCount;
    /**
     * Instantiates a new certificateConnectorHealthMetricValue and sets the default values.
     * @return a void
     */
    public CertificateConnectorHealthMetricValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateConnectorHealthMetricValue
     */
    @javax.annotation.Nonnull
    public static CertificateConnectorHealthMetricValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorHealthMetricValue();
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
     * Gets the dateTime property value. Timestamp for this metric data-point.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this._dateTime;
    }
    /**
     * Gets the failureCount property value. Count of failed requests/operations.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFailureCount() {
        return this._failureCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CertificateConnectorHealthMetricValue currentObject = this;
        return new HashMap<>(3) {{
            this.put("dateTime", (n) -> { currentObject.setDateTime(n.getOffsetDateTimeValue()); });
            this.put("failureCount", (n) -> { currentObject.setFailureCount(n.getLongValue()); });
            this.put("successCount", (n) -> { currentObject.setSuccessCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the successCount property value. Count of successful requests/operations.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessCount() {
        return this._successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeLongValue("failureCount", this.getFailureCount());
        writer.writeLongValue("successCount", this.getSuccessCount());
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
     * Sets the dateTime property value. Timestamp for this metric data-point.
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    public void setDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dateTime = value;
    }
    /**
     * Sets the failureCount property value. Count of failed requests/operations.
     * @param value Value to set for the failureCount property.
     * @return a void
     */
    public void setFailureCount(@javax.annotation.Nullable final Long value) {
        this._failureCount = value;
    }
    /**
     * Sets the successCount property value. Count of successful requests/operations.
     * @param value Value to set for the successCount property.
     * @return a void
     */
    public void setSuccessCount(@javax.annotation.Nullable final Long value) {
        this._successCount = value;
    }
}
