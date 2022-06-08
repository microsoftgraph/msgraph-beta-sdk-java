package microsoft.graph.devicemanagement.microsofttunnelsites.item.microsofttunnelservers.item.gethealthmetrics;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getHealthMetrics method. */
public class GetHealthMetricsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The metricNames property */
    private java.util.List<String> _metricNames;
    /**
     * Instantiates a new getHealthMetricsPostRequestBody and sets the default values.
     * @return a void
     */
    public GetHealthMetricsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getHealthMetricsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetHealthMetricsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetHealthMetricsPostRequestBody();
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
        final GetHealthMetricsPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("metricNames", (n) -> { currentObject.setMetricNames(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the metricNames property value. The metricNames property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMetricNames() {
        return this._metricNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("metricNames", this.getMetricNames());
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
     * Sets the metricNames property value. The metricNames property
     * @param value Value to set for the metricNames property.
     * @return a void
     */
    public void setMetricNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._metricNames = value;
    }
}
