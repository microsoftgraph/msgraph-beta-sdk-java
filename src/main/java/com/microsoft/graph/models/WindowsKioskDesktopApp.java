package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base class for a type of apps
 */
public class WindowsKioskDesktopApp extends WindowsKioskAppBase implements Parsable {
    /**
     * Define the DesktopApplicationID of the app
     */
    private String desktopApplicationId;
    /**
     * Define the DesktopApplicationLinkPath of the app
     */
    private String desktopApplicationLinkPath;
    /**
     * Define the path of a desktop app
     */
    private String path;
    /**
     * Instantiates a new windowsKioskDesktopApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsKioskDesktopApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskDesktopApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskDesktopApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskDesktopApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskDesktopApp();
    }
    /**
     * Gets the desktopApplicationId property value. Define the DesktopApplicationID of the app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDesktopApplicationId() {
        return this.desktopApplicationId;
    }
    /**
     * Gets the desktopApplicationLinkPath property value. Define the DesktopApplicationLinkPath of the app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDesktopApplicationLinkPath() {
        return this.desktopApplicationLinkPath;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("desktopApplicationId", (n) -> { this.setDesktopApplicationId(n.getStringValue()); });
        deserializerMap.put("desktopApplicationLinkPath", (n) -> { this.setDesktopApplicationLinkPath(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the path property value. Define the path of a desktop app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setDesktopApplicationId(@jakarta.annotation.Nullable final String value) {
        this.desktopApplicationId = value;
    }
    /**
     * Sets the desktopApplicationLinkPath property value. Define the DesktopApplicationLinkPath of the app
     * @param value Value to set for the desktopApplicationLinkPath property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDesktopApplicationLinkPath(@jakarta.annotation.Nullable final String value) {
        this.desktopApplicationLinkPath = value;
    }
    /**
     * Sets the path property value. Define the path of a desktop app
     * @param value Value to set for the path property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
}
