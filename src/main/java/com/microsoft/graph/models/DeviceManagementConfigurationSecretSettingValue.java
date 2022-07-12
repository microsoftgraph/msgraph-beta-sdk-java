package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSecretSettingValue extends DeviceManagementConfigurationSimpleSettingValue implements Parsable {
    /** Value of the secret setting. */
    private String _value;
    /** type tracking the encryption state of a secret setting value */
    private DeviceManagementConfigurationSecretSettingValueState _valueState;
    /**
     * Instantiates a new DeviceManagementConfigurationSecretSettingValue and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSecretSettingValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSecretSettingValue
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSecretSettingValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSecretSettingValue();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSecretSettingValue currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
            this.put("valueState", (n) -> { currentObject.setValueState(n.getEnumValue(DeviceManagementConfigurationSecretSettingValueState.class)); });
        }};
    }
    /**
     * Gets the value property value. Value of the secret setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Gets the valueState property value. type tracking the encryption state of a secret setting value
     * @return a deviceManagementConfigurationSecretSettingValueState
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSecretSettingValueState getValueState() {
        return this._valueState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("value", this.getValue());
        writer.writeEnumValue("valueState", this.getValueState());
    }
    /**
     * Sets the value property value. Value of the secret setting.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
    /**
     * Sets the valueState property value. type tracking the encryption state of a secret setting value
     * @param value Value to set for the valueState property.
     * @return a void
     */
    public void setValueState(@javax.annotation.Nullable final DeviceManagementConfigurationSecretSettingValueState value) {
        this._valueState = value;
    }
}
