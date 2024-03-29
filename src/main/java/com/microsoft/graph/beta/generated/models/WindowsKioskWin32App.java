package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * KioskModeApp v4 for Win32 app support
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskWin32App extends WindowsKioskAppBase implements Parsable {
    /**
     * Instantiates a new {@link WindowsKioskWin32App} and sets the default values.
     */
    public WindowsKioskWin32App() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskWin32App");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsKioskWin32App}
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskWin32App createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskWin32App();
    }
    /**
     * Gets the classicAppPath property value. This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassicAppPath() {
        return this.backingStore.get("classicAppPath");
    }
    /**
     * Gets the edgeKiosk property value. Edge kiosk (url) for Edge kiosk mode
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEdgeKiosk() {
        return this.backingStore.get("edgeKiosk");
    }
    /**
     * Gets the edgeKioskIdleTimeoutMinutes property value. Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEdgeKioskIdleTimeoutMinutes() {
        return this.backingStore.get("edgeKioskIdleTimeoutMinutes");
    }
    /**
     * Gets the edgeKioskType property value. Edge kiosk type
     * @return a {@link WindowsEdgeKioskType}
     */
    @jakarta.annotation.Nullable
    public WindowsEdgeKioskType getEdgeKioskType() {
        return this.backingStore.get("edgeKioskType");
    }
    /**
     * Gets the edgeNoFirstRun property value. Edge first run flag for Edge kiosk mode
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeNoFirstRun() {
        return this.backingStore.get("edgeNoFirstRun");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classicAppPath", (n) -> { this.setClassicAppPath(n.getStringValue()); });
        deserializerMap.put("edgeKiosk", (n) -> { this.setEdgeKiosk(n.getStringValue()); });
        deserializerMap.put("edgeKioskIdleTimeoutMinutes", (n) -> { this.setEdgeKioskIdleTimeoutMinutes(n.getIntegerValue()); });
        deserializerMap.put("edgeKioskType", (n) -> { this.setEdgeKioskType(n.getEnumValue(WindowsEdgeKioskType::forValue)); });
        deserializerMap.put("edgeNoFirstRun", (n) -> { this.setEdgeNoFirstRun(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("classicAppPath", this.getClassicAppPath());
        writer.writeStringValue("edgeKiosk", this.getEdgeKiosk());
        writer.writeIntegerValue("edgeKioskIdleTimeoutMinutes", this.getEdgeKioskIdleTimeoutMinutes());
        writer.writeEnumValue("edgeKioskType", this.getEdgeKioskType());
        writer.writeBooleanValue("edgeNoFirstRun", this.getEdgeNoFirstRun());
    }
    /**
     * Sets the classicAppPath property value. This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode
     * @param value Value to set for the classicAppPath property.
     */
    public void setClassicAppPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classicAppPath", value);
    }
    /**
     * Sets the edgeKiosk property value. Edge kiosk (url) for Edge kiosk mode
     * @param value Value to set for the edgeKiosk property.
     */
    public void setEdgeKiosk(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("edgeKiosk", value);
    }
    /**
     * Sets the edgeKioskIdleTimeoutMinutes property value. Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440
     * @param value Value to set for the edgeKioskIdleTimeoutMinutes property.
     */
    public void setEdgeKioskIdleTimeoutMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("edgeKioskIdleTimeoutMinutes", value);
    }
    /**
     * Sets the edgeKioskType property value. Edge kiosk type
     * @param value Value to set for the edgeKioskType property.
     */
    public void setEdgeKioskType(@jakarta.annotation.Nullable final WindowsEdgeKioskType value) {
        this.backingStore.set("edgeKioskType", value);
    }
    /**
     * Sets the edgeNoFirstRun property value. Edge first run flag for Edge kiosk mode
     * @param value Value to set for the edgeNoFirstRun property.
     */
    public void setEdgeNoFirstRun(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeNoFirstRun", value);
    }
}
