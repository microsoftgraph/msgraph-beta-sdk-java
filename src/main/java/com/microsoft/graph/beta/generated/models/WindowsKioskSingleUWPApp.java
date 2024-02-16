package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify the UWP app info for the kiosk configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskSingleUWPApp extends WindowsKioskAppConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WindowsKioskSingleUWPApp} and sets the default values.
     */
    public WindowsKioskSingleUWPApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskSingleUWPApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsKioskSingleUWPApp}
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskSingleUWPApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskSingleUWPApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uwpApp", (n) -> { this.setUwpApp(n.getObjectValue(WindowsKioskUWPApp::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the uwpApp property value. The uwpApp property
     * @return a {@link WindowsKioskUWPApp}
     */
    @jakarta.annotation.Nullable
    public WindowsKioskUWPApp getUwpApp() {
        return this.backingStore.get("uwpApp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("uwpApp", this.getUwpApp());
    }
    /**
     * Sets the uwpApp property value. The uwpApp property
     * @param value Value to set for the uwpApp property.
     */
    public void setUwpApp(@jakarta.annotation.Nullable final WindowsKioskUWPApp value) {
        this.backingStore.set("uwpApp", value);
    }
}
