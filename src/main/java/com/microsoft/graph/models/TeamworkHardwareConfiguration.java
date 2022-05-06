package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkHardwareConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The compute property  */
    private TeamworkPeripheral _compute;
    /** The hdmiIngest property  */
    private TeamworkPeripheral _hdmiIngest;
    /** The CPU model on the device.  */
    private String _processorModel;
    /**
     * Instantiates a new teamworkHardwareConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkHardwareConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkHardwareConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkHardwareConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareConfiguration();
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
     * Gets the compute property value. The compute property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getCompute() {
        return this._compute;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkHardwareConfiguration currentObject = this;
        return new HashMap<>(3) {{
            this.put("compute", (n) -> { currentObject.setCompute(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("hdmiIngest", (n) -> { currentObject.setHdmiIngest(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("processorModel", (n) -> { currentObject.setProcessorModel(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hdmiIngest property value. The hdmiIngest property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getHdmiIngest() {
        return this._hdmiIngest;
    }
    /**
     * Gets the processorModel property value. The CPU model on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessorModel() {
        return this._processorModel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compute", this.getCompute());
        writer.writeObjectValue("hdmiIngest", this.getHdmiIngest());
        writer.writeStringValue("processorModel", this.getProcessorModel());
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
     * Sets the compute property value. The compute property
     * @param value Value to set for the compute property.
     * @return a void
     */
    public void setCompute(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._compute = value;
    }
    /**
     * Sets the hdmiIngest property value. The hdmiIngest property
     * @param value Value to set for the hdmiIngest property.
     * @return a void
     */
    public void setHdmiIngest(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._hdmiIngest = value;
    }
    /**
     * Sets the processorModel property value. The CPU model on the device.
     * @param value Value to set for the processorModel property.
     * @return a void
     */
    public void setProcessorModel(@javax.annotation.Nullable final String value) {
        this._processorModel = value;
    }
}
