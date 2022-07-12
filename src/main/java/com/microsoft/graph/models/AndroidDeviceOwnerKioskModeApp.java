package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerKioskModeApp extends AndroidDeviceOwnerKioskModeFolderItem implements Parsable {
    /** Class name of application */
    private String _className;
    /** Package name of application */
    private String _package_escaped;
    /**
     * Instantiates a new AndroidDeviceOwnerKioskModeApp and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerKioskModeApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerKioskModeApp
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeApp();
    }
    /**
     * Gets the className property value. Class name of application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassName() {
        return this._className;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerKioskModeApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("className", (n) -> { currentObject.setClassName(n.getStringValue()); });
            this.put("package", (n) -> { currentObject.setPackage(n.getStringValue()); });
        }};
    }
    /**
     * Gets the package property value. Package name of application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackage() {
        return this._package_escaped;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("className", this.getClassName());
        writer.writeStringValue("package", this.getPackage());
    }
    /**
     * Sets the className property value. Class name of application
     * @param value Value to set for the className property.
     * @return a void
     */
    public void setClassName(@javax.annotation.Nullable final String value) {
        this._className = value;
    }
    /**
     * Sets the package property value. Package name of application
     * @param value Value to set for the package property.
     * @return a void
     */
    public void setPackage(@javax.annotation.Nullable final String value) {
        this._package_escaped = value;
    }
}
