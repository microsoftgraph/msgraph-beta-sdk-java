package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingCollectionDefinition extends DeviceManagementConfigurationChoiceSettingDefinition implements Parsable {
    /** Maximum number of choices in the collection. Valid values 1 to 100 */
    private Integer _maximumCount;
    /** Minimum number of choices in the collection. Valid values 1 to 100 */
    private Integer _minimumCount;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingCollectionDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationChoiceSettingCollectionDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingCollectionDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingCollectionDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingCollectionDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingCollectionDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("maximumCount", (n) -> { currentObject.setMaximumCount(n.getIntegerValue()); });
            this.put("minimumCount", (n) -> { currentObject.setMinimumCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the maximumCount property value. Maximum number of choices in the collection. Valid values 1 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumCount() {
        return this._maximumCount;
    }
    /**
     * Gets the minimumCount property value. Minimum number of choices in the collection. Valid values 1 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumCount() {
        return this._minimumCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumCount", this.getMaximumCount());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
    }
    /**
     * Sets the maximumCount property value. Maximum number of choices in the collection. Valid values 1 to 100
     * @param value Value to set for the maximumCount property.
     * @return a void
     */
    public void setMaximumCount(@javax.annotation.Nullable final Integer value) {
        this._maximumCount = value;
    }
    /**
     * Sets the minimumCount property value. Minimum number of choices in the collection. Valid values 1 to 100
     * @param value Value to set for the minimumCount property.
     * @return a void
     */
    public void setMinimumCount(@javax.annotation.Nullable final Integer value) {
        this._minimumCount = value;
    }
}
