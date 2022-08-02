package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementCollectionSettingDefinition extends DeviceManagementSettingDefinition implements Parsable {
    /** The Setting Definition ID that describes what each element of the collection looks like */
    private String _elementDefinitionId;
    /**
     * Instantiates a new DeviceManagementCollectionSettingDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementCollectionSettingDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementCollectionSettingDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementCollectionSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementCollectionSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCollectionSettingDefinition();
    }
    /**
     * Gets the elementDefinitionId property value. The Setting Definition ID that describes what each element of the collection looks like
     * @return a string
     */
    @javax.annotation.Nullable
    public String getElementDefinitionId() {
        return this._elementDefinitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementCollectionSettingDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("elementDefinitionId", (n) -> { currentObject.setElementDefinitionId(n.getStringValue()); });
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
        writer.writeStringValue("elementDefinitionId", this.getElementDefinitionId());
    }
    /**
     * Sets the elementDefinitionId property value. The Setting Definition ID that describes what each element of the collection looks like
     * @param value Value to set for the elementDefinitionId property.
     * @return a void
     */
    public void setElementDefinitionId(@javax.annotation.Nullable final String value) {
        this._elementDefinitionId = value;
    }
}
