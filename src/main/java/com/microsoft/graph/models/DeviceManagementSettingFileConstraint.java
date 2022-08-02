package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingFileConstraint extends DeviceManagementConstraint implements Parsable {
    /** Acceptable file extensions to upload for this setting */
    private java.util.List<String> _supportedExtensions;
    /**
     * Instantiates a new DeviceManagementSettingFileConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingFileConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingFileConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingFileConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingFileConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingFileConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingFileConstraint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("supportedExtensions", (n) -> { currentObject.setSupportedExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the supportedExtensions property value. Acceptable file extensions to upload for this setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedExtensions() {
        return this._supportedExtensions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("supportedExtensions", this.getSupportedExtensions());
    }
    /**
     * Sets the supportedExtensions property value. Acceptable file extensions to upload for this setting
     * @param value Value to set for the supportedExtensions property.
     * @return a void
     */
    public void setSupportedExtensions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedExtensions = value;
    }
}
