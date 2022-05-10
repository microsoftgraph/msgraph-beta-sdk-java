package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkHardwareHealth implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The system health details for a teamworkDevice. */
    private TeamworkPeripheralHealth _computeHealth;
    /** The health details about the HDMI ingest of a device. */
    private TeamworkPeripheralHealth _hdmiIngestHealth;
    /**
     * Instantiates a new teamworkHardwareHealth and sets the default values.
     * @return a void
     */
    public TeamworkHardwareHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkHardwareHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkHardwareHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareHealth();
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
     * Gets the computeHealth property value. The system health details for a teamworkDevice.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getComputeHealth() {
        return this._computeHealth;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkHardwareHealth currentObject = this;
        return new HashMap<>(2) {{
            this.put("computeHealth", (n) -> { currentObject.setComputeHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
            this.put("hdmiIngestHealth", (n) -> { currentObject.setHdmiIngestHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hdmiIngestHealth property value. The health details about the HDMI ingest of a device.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getHdmiIngestHealth() {
        return this._hdmiIngestHealth;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("computeHealth", this.getComputeHealth());
        writer.writeObjectValue("hdmiIngestHealth", this.getHdmiIngestHealth());
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
     * Sets the computeHealth property value. The system health details for a teamworkDevice.
     * @param value Value to set for the computeHealth property.
     * @return a void
     */
    public void setComputeHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this._computeHealth = value;
    }
    /**
     * Sets the hdmiIngestHealth property value. The health details about the HDMI ingest of a device.
     * @param value Value to set for the hdmiIngestHealth property.
     * @return a void
     */
    public void setHdmiIngestHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this._hdmiIngestHealth = value;
    }
}
