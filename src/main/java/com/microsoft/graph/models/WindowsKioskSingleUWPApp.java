package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskSingleUWPApp extends WindowsKioskAppConfiguration implements Parsable {
    /** The uwpApp property */
    private WindowsKioskUWPApp uwpApp;
    /**
     * Instantiates a new WindowsKioskSingleUWPApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskSingleUWPApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskSingleUWPApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskSingleUWPApp
     */
    @javax.annotation.Nonnull
    public static WindowsKioskSingleUWPApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskSingleUWPApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uwpApp", (n) -> { this.setUwpApp(n.getObjectValue(WindowsKioskUWPApp::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the uwpApp property value. The uwpApp property
     * @return a windowsKioskUWPApp
     */
    @javax.annotation.Nullable
    public WindowsKioskUWPApp getUwpApp() {
        return this.uwpApp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("uwpApp", this.getUwpApp());
    }
    /**
     * Sets the uwpApp property value. The uwpApp property
     * @param value Value to set for the uwpApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUwpApp(@javax.annotation.Nullable final WindowsKioskUWPApp value) {
        this.uwpApp = value;
    }
}
