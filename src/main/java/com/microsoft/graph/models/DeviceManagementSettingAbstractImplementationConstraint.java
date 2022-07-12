package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingAbstractImplementationConstraint extends DeviceManagementConstraint implements Parsable {
    /** List of value which means not configured for the setting */
    private java.util.List<String> _allowedAbstractImplementationDefinitionIds;
    /**
     * Instantiates a new DeviceManagementSettingAbstractImplementationConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingAbstractImplementationConstraint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingAbstractImplementationConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingAbstractImplementationConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingAbstractImplementationConstraint();
    }
    /**
     * Gets the allowedAbstractImplementationDefinitionIds property value. List of value which means not configured for the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedAbstractImplementationDefinitionIds() {
        return this._allowedAbstractImplementationDefinitionIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingAbstractImplementationConstraint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedAbstractImplementationDefinitionIds", (n) -> { currentObject.setAllowedAbstractImplementationDefinitionIds(n.getCollectionOfPrimitiveValues(String.class)); });
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
        writer.writeCollectionOfPrimitiveValues("allowedAbstractImplementationDefinitionIds", this.getAllowedAbstractImplementationDefinitionIds());
    }
    /**
     * Sets the allowedAbstractImplementationDefinitionIds property value. List of value which means not configured for the setting
     * @param value Value to set for the allowedAbstractImplementationDefinitionIds property.
     * @return a void
     */
    public void setAllowedAbstractImplementationDefinitionIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedAbstractImplementationDefinitionIds = value;
    }
}
