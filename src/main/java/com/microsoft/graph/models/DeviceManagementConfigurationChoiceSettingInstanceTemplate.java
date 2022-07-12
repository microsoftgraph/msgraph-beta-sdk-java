package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /** Choice Setting Value Template */
    private DeviceManagementConfigurationChoiceSettingValueTemplate _choiceSettingValueTemplate;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationChoiceSettingInstanceTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingInstanceTemplate();
    }
    /**
     * Gets the choiceSettingValueTemplate property value. Choice Setting Value Template
     * @return a deviceManagementConfigurationChoiceSettingValueTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueTemplate getChoiceSettingValueTemplate() {
        return this._choiceSettingValueTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingInstanceTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("choiceSettingValueTemplate", (n) -> { currentObject.setChoiceSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("choiceSettingValueTemplate", this.getChoiceSettingValueTemplate());
    }
    /**
     * Sets the choiceSettingValueTemplate property value. Choice Setting Value Template
     * @param value Value to set for the choiceSettingValueTemplate property.
     * @return a void
     */
    public void setChoiceSettingValueTemplate(@javax.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueTemplate value) {
        this._choiceSettingValueTemplate = value;
    }
}
