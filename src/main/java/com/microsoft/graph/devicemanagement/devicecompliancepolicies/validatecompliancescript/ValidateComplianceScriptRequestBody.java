package microsoft.graph.devicemanagement.devicecompliancepolicies.validatecompliancescript;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceCompliancePolicyScript;
/** Provides operations to call the validateComplianceScript method. */
public class ValidateComplianceScriptRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceCompliancePolicyScript property */
    private DeviceCompliancePolicyScript _deviceCompliancePolicyScript;
    /**
     * Instantiates a new validateComplianceScriptRequestBody and sets the default values.
     * @return a void
     */
    public ValidateComplianceScriptRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateComplianceScriptRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateComplianceScriptRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateComplianceScriptRequestBody();
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
     * Gets the deviceCompliancePolicyScript property value. The deviceCompliancePolicyScript property
     * @return a deviceCompliancePolicyScript
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyScript getDeviceCompliancePolicyScript() {
        return this._deviceCompliancePolicyScript;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ValidateComplianceScriptRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("deviceCompliancePolicyScript", (n) -> { currentObject.setDeviceCompliancePolicyScript(n.getObjectValue(DeviceCompliancePolicyScript::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceCompliancePolicyScript", this.getDeviceCompliancePolicyScript());
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
     * Sets the deviceCompliancePolicyScript property value. The deviceCompliancePolicyScript property
     * @param value Value to set for the deviceCompliancePolicyScript property.
     * @return a void
     */
    public void setDeviceCompliancePolicyScript(@javax.annotation.Nullable final DeviceCompliancePolicyScript value) {
        this._deviceCompliancePolicyScript = value;
    }
}
