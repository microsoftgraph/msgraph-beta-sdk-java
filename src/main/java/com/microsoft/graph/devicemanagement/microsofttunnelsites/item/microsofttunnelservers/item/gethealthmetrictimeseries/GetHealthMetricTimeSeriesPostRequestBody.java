package com.microsoft.graph.devicemanagement.microsofttunnelsites.item.microsofttunnelservers.item.gethealthmetrictimeseries;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetHealthMetricTimeSeriesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The endDateTime property
     */
    private OffsetDateTime endDateTime;
    /**
     * The metricName property
     */
    private String metricName;
    /**
     * The startDateTime property
     */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new getHealthMetricTimeSeriesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetHealthMetricTimeSeriesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getHealthMetricTimeSeriesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetHealthMetricTimeSeriesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetHealthMetricTimeSeriesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metricName", (n) -> { this.setMetricName(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metricName property value. The metricName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("metricName", this.getMetricName());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the metricName property value. The metricName property
     * @param value Value to set for the metricName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetricName(@javax.annotation.Nullable final String value) {
        this.metricName = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}
