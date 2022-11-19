package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskUWPApp extends WindowsKioskAppBase implements Parsable {
    /** This references an Intune App that will be target to the same assignments as Kiosk configuration */
    private String _appId;
    /** This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode */
    private String _appUserModelId;
    /** This references an contained App from an Intune App */
    private String _containedAppId;
    /**
     * Instantiates a new WindowsKioskUWPApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskUWPApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskUWPApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskUWPApp
     */
    @javax.annotation.Nonnull
    public static WindowsKioskUWPApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskUWPApp();
    }
    /**
     * Gets the appId property value. This references an Intune App that will be target to the same assignments as Kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the appUserModelId property value. This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUserModelId() {
        return this._appUserModelId;
    }
    /**
     * Gets the containedAppId property value. This references an contained App from an Intune App
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainedAppId() {
        return this._containedAppId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskUWPApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
        deserializerMap.put("appUserModelId", (n) -> { currentObject.setAppUserModelId(n.getStringValue()); });
        deserializerMap.put("containedAppId", (n) -> { currentObject.setContainedAppId(n.getStringValue()); });
        return deserializerMap
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("appUserModelId", this.getAppUserModelId());
        writer.writeStringValue("containedAppId", this.getContainedAppId());
    }
    /**
     * Sets the appId property value. This references an Intune App that will be target to the same assignments as Kiosk configuration
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the appUserModelId property value. This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     * @param value Value to set for the appUserModelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUserModelId(@javax.annotation.Nullable final String value) {
        this._appUserModelId = value;
    }
    /**
     * Sets the containedAppId property value. This references an contained App from an Intune App
     * @param value Value to set for the containedAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainedAppId(@javax.annotation.Nullable final String value) {
        this._containedAppId = value;
    }
}
