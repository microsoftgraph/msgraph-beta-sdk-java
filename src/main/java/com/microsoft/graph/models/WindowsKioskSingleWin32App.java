package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify the single app configuration for the kiosk win32 configuration
 */
public class WindowsKioskSingleWin32App extends WindowsKioskAppConfiguration implements Parsable {
    /**
     * The win32App property
     */
    private WindowsKioskWin32App win32App;
    /**
     * Instantiates a new windowsKioskSingleWin32App and sets the default values.
     */
    public WindowsKioskSingleWin32App() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskSingleWin32App");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskSingleWin32App
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskSingleWin32App createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskSingleWin32App();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("win32App", (n) -> { this.setWin32App(n.getObjectValue(WindowsKioskWin32App::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the win32App property value. The win32App property
     * @return a windowsKioskWin32App
     */
    @jakarta.annotation.Nullable
    public WindowsKioskWin32App getWin32App() {
        return this.win32App;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("win32App", this.getWin32App());
    }
    /**
     * Sets the win32App property value. The win32App property
     * @param value Value to set for the win32App property.
     */
    public void setWin32App(@jakarta.annotation.Nullable final WindowsKioskWin32App value) {
        this.win32App = value;
    }
}
