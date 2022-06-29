package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting value */
public class DeviceManagementConfigurationSettingValue implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Setting value template reference */
    private DeviceManagementConfigurationSettingValueTemplateReference _settingValueTemplateReference;
    /**
     * Instantiates a new deviceManagementConfigurationSettingValue and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingValue
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingValue();
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
        final DeviceManagementConfigurationSettingValue currentObject = this;
        return new HashMap<>(1) {{
            this.put("settingValueTemplateReference", (n) -> { currentObject.setSettingValueTemplateReference(n.getObjectValue(DeviceManagementConfigurationSettingValueTemplateReference::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settingValueTemplateReference property value. Setting value template reference
     * @return a deviceManagementConfigurationSettingValueTemplateReference
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingValueTemplateReference getSettingValueTemplateReference() {
        return this._settingValueTemplateReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("settingValueTemplateReference", this.getSettingValueTemplateReference());
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
     * Sets the settingValueTemplateReference property value. Setting value template reference
     * @param value Value to set for the settingValueTemplateReference property.
     * @return a void
     */
    public void setSettingValueTemplateReference(@javax.annotation.Nullable final DeviceManagementConfigurationSettingValueTemplateReference value) {
        this._settingValueTemplateReference = value;
    }
}
