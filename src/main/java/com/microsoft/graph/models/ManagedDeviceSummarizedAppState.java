package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Event representing a user's devices with failed or pending apps. */
public class ManagedDeviceSummarizedAppState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** DeviceId of device represented by this object */
    private String _deviceId;
    /** runState for the object. Possible values are: unknown, success, fail, scriptError, pending, notApplicable. */
    private RunState _summarizedAppState;
    /**
     * Instantiates a new managedDeviceSummarizedAppState and sets the default values.
     * @return a void
     */
    public ManagedDeviceSummarizedAppState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceSummarizedAppState
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceSummarizedAppState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceSummarizedAppState();
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
     * Gets the deviceId property value. DeviceId of device represented by this object
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
        final ManagedDeviceSummarizedAppState currentObject = this;
        return new HashMap<>(2) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("summarizedAppState", (n) -> { currentObject.setSummarizedAppState(n.getEnumValue(RunState.class)); });
        }};
    }
    /**
     * Gets the summarizedAppState property value. runState for the object. Possible values are: unknown, success, fail, scriptError, pending, notApplicable.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getSummarizedAppState() {
        return this._summarizedAppState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeEnumValue("summarizedAppState", this.getSummarizedAppState());
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
     * Sets the deviceId property value. DeviceId of device represented by this object
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the summarizedAppState property value. runState for the object. Possible values are: unknown, success, fail, scriptError, pending, notApplicable.
     * @param value Value to set for the summarizedAppState property.
     * @return a void
     */
    public void setSummarizedAppState(@javax.annotation.Nullable final RunState value) {
        this._summarizedAppState = value;
    }
}
