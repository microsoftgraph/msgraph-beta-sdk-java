package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Class in Exchange. */
public class DeviceManagementExchangeDeviceClass implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the device class which will be impacted by this rule. */
    private String _name;
    /** Criteria which defines the type of device this access rule will apply to */
    private DeviceManagementExchangeAccessRuleType _type;
    /**
     * Instantiates a new deviceManagementExchangeDeviceClass and sets the default values.
     * @return a void
     */
    public DeviceManagementExchangeDeviceClass() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementExchangeDeviceClass
     */
    @javax.annotation.Nonnull
    public static DeviceManagementExchangeDeviceClass createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeDeviceClass();
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
        final DeviceManagementExchangeDeviceClass currentObject = this;
        return new HashMap<>(2) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(DeviceManagementExchangeAccessRuleType.class)); });
        }};
    }
    /**
     * Gets the name property value. Name of the device class which will be impacted by this rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the type property value. Criteria which defines the type of device this access rule will apply to
     * @return a deviceManagementExchangeAccessRuleType
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessRuleType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the name property value. Name of the device class which will be impacted by this rule.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the type property value. Criteria which defines the type of device this access rule will apply to
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final DeviceManagementExchangeAccessRuleType value) {
        this._type = value;
    }
}
