package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskDesktopApp extends WindowsKioskAppBase implements Parsable {
    /** Define the DesktopApplicationID of the app */
    private String _desktopApplicationId;
    /** Define the DesktopApplicationLinkPath of the app */
    private String _desktopApplicationLinkPath;
    /** Define the path of a desktop app */
    private String _path;
    /**
     * Instantiates a new WindowsKioskDesktopApp and sets the default values.
     * @return a void
     */
    public WindowsKioskDesktopApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskDesktopApp
     */
    @javax.annotation.Nonnull
    public static WindowsKioskDesktopApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskDesktopApp();
    }
    /**
     * Gets the desktopApplicationId property value. Define the DesktopApplicationID of the app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesktopApplicationId() {
        return this._desktopApplicationId;
    }
    /**
     * Gets the desktopApplicationLinkPath property value. Define the DesktopApplicationLinkPath of the app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesktopApplicationLinkPath() {
        return this._desktopApplicationLinkPath;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskDesktopApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("desktopApplicationId", (n) -> { currentObject.setDesktopApplicationId(n.getStringValue()); });
            this.put("desktopApplicationLinkPath", (n) -> { currentObject.setDesktopApplicationLinkPath(n.getStringValue()); });
            this.put("path", (n) -> { currentObject.setPath(n.getStringValue()); });
        }};
    }
    /**
     * Gets the path property value. Define the path of a desktop app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this._path;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("desktopApplicationId", this.getDesktopApplicationId());
        writer.writeStringValue("desktopApplicationLinkPath", this.getDesktopApplicationLinkPath());
        writer.writeStringValue("path", this.getPath());
    }
    /**
     * Sets the desktopApplicationId property value. Define the DesktopApplicationID of the app
     * @param value Value to set for the desktopApplicationId property.
     * @return a void
     */
    public void setDesktopApplicationId(@javax.annotation.Nullable final String value) {
        this._desktopApplicationId = value;
    }
    /**
     * Sets the desktopApplicationLinkPath property value. Define the DesktopApplicationLinkPath of the app
     * @param value Value to set for the desktopApplicationLinkPath property.
     * @return a void
     */
    public void setDesktopApplicationLinkPath(@javax.annotation.Nullable final String value) {
        this._desktopApplicationLinkPath = value;
    }
    /**
     * Sets the path property value. Define the path of a desktop app
     * @param value Value to set for the path property.
     * @return a void
     */
    public void setPath(@javax.annotation.Nullable final String value) {
        this._path = value;
    }
}
