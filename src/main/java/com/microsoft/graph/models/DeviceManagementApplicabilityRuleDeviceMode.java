package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementApplicabilityRuleDeviceMode implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Windows 10 Device Mode type. */
    private Windows10DeviceModeType _deviceMode;
    /** Name for object. */
    private String _name;
    /** Supported Applicability rule types for Device Configuration */
    private DeviceManagementApplicabilityRuleType _ruleType;
    /**
     * Instantiates a new deviceManagementApplicabilityRuleDeviceMode and sets the default values.
     * @return a void
     */
    public DeviceManagementApplicabilityRuleDeviceMode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementApplicabilityRuleDeviceMode
     */
    @javax.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleDeviceMode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleDeviceMode();
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
     * Gets the deviceMode property value. Windows 10 Device Mode type.
     * @return a windows10DeviceModeType
     */
    @javax.annotation.Nullable
    public Windows10DeviceModeType getDeviceMode() {
        return this._deviceMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementApplicabilityRuleDeviceMode currentObject = this;
        return new HashMap<>(3) {{
            this.put("deviceMode", (n) -> { currentObject.setDeviceMode(n.getEnumValue(Windows10DeviceModeType.class)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType.class)); });
        }};
    }
    /**
     * Gets the name property value. Name for object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @return a deviceManagementApplicabilityRuleType
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleType getRuleType() {
        return this._ruleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceMode", this.getDeviceMode());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("ruleType", this.getRuleType());
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
     * Sets the deviceMode property value. Windows 10 Device Mode type.
     * @param value Value to set for the deviceMode property.
     * @return a void
     */
    public void setDeviceMode(@javax.annotation.Nullable final Windows10DeviceModeType value) {
        this._deviceMode = value;
    }
    /**
     * Sets the name property value. Name for object.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    public void setRuleType(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this._ruleType = value;
    }
}
