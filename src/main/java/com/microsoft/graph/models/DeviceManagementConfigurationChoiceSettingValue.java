package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingValue extends DeviceManagementConfigurationSettingValue implements Parsable {
    /** Child settings. */
    private java.util.List<DeviceManagementConfigurationSettingInstance> _children;
    /** Choice setting value: an OptionDefinition ItemId. */
    private String _value;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingValue and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationChoiceSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingValue
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValue();
    }
    /**
     * Gets the children property value. Child settings.
     * @return a deviceManagementConfigurationSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstance> getChildren() {
        return this._children;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingValue currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the value property value. Choice setting value: an OptionDefinition ItemId.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the children property value. Child settings.
     * @param value Value to set for the children property.
     * @return a void
     */
    public void setChildren(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstance> value) {
        this._children = value;
    }
    /**
     * Sets the value property value. Choice setting value: an OptionDefinition ItemId.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
