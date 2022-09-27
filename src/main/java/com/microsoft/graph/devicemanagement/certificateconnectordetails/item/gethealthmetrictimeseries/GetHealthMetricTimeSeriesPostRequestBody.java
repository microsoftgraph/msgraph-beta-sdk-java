package com.microsoft.graph.devicemanagement.certificateconnectordetails.item.gethealthmetrictimeseries;

import com.microsoft.graph.models.TimeSeriesParameter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getHealthMetricTimeSeries method. */
public class GetHealthMetricTimeSeriesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The timeSeries property */
    private TimeSeriesParameter _timeSeries;
    /**
     * Instantiates a new getHealthMetricTimeSeriesPostRequestBody and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetHealthMetricTimeSeriesPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("timeSeries", (n) -> { currentObject.setTimeSeries(n.getObjectValue(TimeSeriesParameter::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the timeSeries property value. The timeSeries property
     * @return a timeSeriesParameter
     */
    @javax.annotation.Nullable
    public TimeSeriesParameter getTimeSeries() {
        return this._timeSeries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("timeSeries", this.getTimeSeries());
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
     * Sets the timeSeries property value. The timeSeries property
     * @param value Value to set for the timeSeries property.
     * @return a void
     */
    public void setTimeSeries(@javax.annotation.Nullable final TimeSeriesParameter value) {
        this._timeSeries = value;
    }
}
