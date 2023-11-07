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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskUWPApp extends WindowsKioskAppBase implements Parsable {
    /**
     * This references an Intune App that will be target to the same assignments as Kiosk configuration
     */
    private String appId;
    /**
     * This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     */
    private String appUserModelId;
    /**
     * This references an contained App from an Intune App
     */
    private String containedAppId;
    /**
     * Instantiates a new WindowsKioskUWPApp and sets the default values.
     */
    public WindowsKioskUWPApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskUWPApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskUWPApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskUWPApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskUWPApp();
    }
    /**
     * Gets the appId property value. This references an Intune App that will be target to the same assignments as Kiosk configuration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the appUserModelId property value. This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppUserModelId() {
        return this.appUserModelId;
    }
    /**
     * Gets the containedAppId property value. This references an contained App from an Intune App
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContainedAppId() {
        return this.containedAppId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appUserModelId", (n) -> { this.setAppUserModelId(n.getStringValue()); });
        deserializerMap.put("containedAppId", (n) -> { this.setContainedAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("appUserModelId", this.getAppUserModelId());
        writer.writeStringValue("containedAppId", this.getContainedAppId());
    }
    /**
     * Sets the appId property value. This references an Intune App that will be target to the same assignments as Kiosk configuration
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the appUserModelId property value. This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     * @param value Value to set for the appUserModelId property.
     */
    public void setAppUserModelId(@jakarta.annotation.Nullable final String value) {
        this.appUserModelId = value;
    }
    /**
     * Sets the containedAppId property value. This references an contained App from an Intune App
     * @param value Value to set for the containedAppId property.
     */
    public void setContainedAppId(@jakarta.annotation.Nullable final String value) {
        this.containedAppId = value;
    }
}
