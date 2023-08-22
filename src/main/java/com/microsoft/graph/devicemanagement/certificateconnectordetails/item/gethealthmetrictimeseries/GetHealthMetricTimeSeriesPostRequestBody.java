package com.microsoft.graph.devicemanagement.certificateconnectordetails.item.gethealthmetrictimeseries;

import com.microsoft.graph.models.TimeSeriesParameter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetHealthMetricTimeSeriesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The timeSeries property
     */
    private TimeSeriesParameter timeSeries;
    /**
     * Instantiates a new getHealthMetricTimeSeriesPostRequestBody and sets the default values.
     */
    public GetHealthMetricTimeSeriesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getHealthMetricTimeSeriesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetHealthMetricTimeSeriesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetHealthMetricTimeSeriesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("timeSeries", (n) -> { this.setTimeSeries(n.getObjectValue(TimeSeriesParameter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the timeSeries property value. The timeSeries property
     * @return a timeSeriesParameter
     */
    @jakarta.annotation.Nullable
    public TimeSeriesParameter getTimeSeries() {
        return this.timeSeries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("timeSeries", this.getTimeSeries());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the timeSeries property value. The timeSeries property
     * @param value Value to set for the timeSeries property.
     */
    public void setTimeSeries(@jakarta.annotation.Nullable final TimeSeriesParameter value) {
        this.timeSeries = value;
    }
}
