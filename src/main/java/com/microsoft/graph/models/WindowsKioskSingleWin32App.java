package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskSingleWin32App extends WindowsKioskAppConfiguration implements Parsable {
    /** The win32App property */
    private WindowsKioskWin32App _win32App;
    /**
     * Instantiates a new WindowsKioskSingleWin32App and sets the default values.
     * @return a void
     */
    public WindowsKioskSingleWin32App() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskSingleWin32App");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskSingleWin32App
     */
    @javax.annotation.Nonnull
    public static WindowsKioskSingleWin32App createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskSingleWin32App();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskSingleWin32App currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("win32App", (n) -> { currentObject.setWin32App(n.getObjectValue(WindowsKioskWin32App::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the win32App property value. The win32App property
     * @return a windowsKioskWin32App
     */
    @javax.annotation.Nullable
    public WindowsKioskWin32App getWin32App() {
        return this._win32App;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("win32App", this.getWin32App());
    }
    /**
     * Sets the win32App property value. The win32App property
     * @param value Value to set for the win32App property.
     * @return a void
     */
    public void setWin32App(@javax.annotation.Nullable final WindowsKioskWin32App value) {
        this._win32App = value;
    }
}
