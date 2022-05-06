package microsoft.graph.devicemanagement.userexperienceanalyticsdevicescope.triggerdevicescopeaction;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceScopeAction;
/** Provides operations to call the triggerDeviceScopeAction method.  */
public class TriggerDeviceScopeActionRequestBody implements AdditionalDataHolder, Parsable {
    /** The actionName property  */
    private DeviceScopeAction _actionName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The deviceScopeId property  */
    private String _deviceScopeId;
    /**
     * Instantiates a new triggerDeviceScopeActionRequestBody and sets the default values.
     * @return a void
     */
    public TriggerDeviceScopeActionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggerDeviceScopeActionRequestBody
     */
    @javax.annotation.Nonnull
    public static TriggerDeviceScopeActionRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerDeviceScopeActionRequestBody();
    }
    /**
     * Gets the actionName property value. The actionName property
     * @return a deviceScopeAction
     */
    @javax.annotation.Nullable
    public DeviceScopeAction getActionName() {
        return this._actionName;
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
     * Gets the deviceScopeId property value. The deviceScopeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceScopeId() {
        return this._deviceScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TriggerDeviceScopeActionRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("actionName", (n) -> { currentObject.setActionName(n.getObjectValue(DeviceScopeAction::createFromDiscriminatorValue)); });
            this.put("deviceScopeId", (n) -> { currentObject.setDeviceScopeId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actionName", this.getActionName());
        writer.writeStringValue("deviceScopeId", this.getDeviceScopeId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. The actionName property
     * @param value Value to set for the actionName property.
     * @return a void
     */
    public void setActionName(@javax.annotation.Nullable final DeviceScopeAction value) {
        this._actionName = value;
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
     * Sets the deviceScopeId property value. The deviceScopeId property
     * @param value Value to set for the deviceScopeId property.
     * @return a void
     */
    public void setDeviceScopeId(@javax.annotation.Nullable final String value) {
        this._deviceScopeId = value;
    }
}
