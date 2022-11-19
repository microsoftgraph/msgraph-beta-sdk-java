package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskWin32App extends WindowsKioskAppBase implements Parsable {
    /** This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode */
    private String _classicAppPath;
    /** Edge kiosk (url) for Edge kiosk mode */
    private String _edgeKiosk;
    /** Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440 */
    private Integer _edgeKioskIdleTimeoutMinutes;
    /** Edge kiosk type */
    private WindowsEdgeKioskType _edgeKioskType;
    /** Edge first run flag for Edge kiosk mode */
    private Boolean _edgeNoFirstRun;
    /**
     * Instantiates a new WindowsKioskWin32App and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskWin32App() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskWin32App");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskWin32App
     */
    @javax.annotation.Nonnull
    public static WindowsKioskWin32App createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskWin32App();
    }
    /**
     * Gets the classicAppPath property value. This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassicAppPath() {
        return this._classicAppPath;
    }
    /**
     * Gets the edgeKiosk property value. Edge kiosk (url) for Edge kiosk mode
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeKiosk() {
        return this._edgeKiosk;
    }
    /**
     * Gets the edgeKioskIdleTimeoutMinutes property value. Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEdgeKioskIdleTimeoutMinutes() {
        return this._edgeKioskIdleTimeoutMinutes;
    }
    /**
     * Gets the edgeKioskType property value. Edge kiosk type
     * @return a windowsEdgeKioskType
     */
    @javax.annotation.Nullable
    public WindowsEdgeKioskType getEdgeKioskType() {
        return this._edgeKioskType;
    }
    /**
     * Gets the edgeNoFirstRun property value. Edge first run flag for Edge kiosk mode
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeNoFirstRun() {
        return this._edgeNoFirstRun;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskWin32App currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classicAppPath", (n) -> { currentObject.setClassicAppPath(n.getStringValue()); });
        deserializerMap.put("edgeKiosk", (n) -> { currentObject.setEdgeKiosk(n.getStringValue()); });
        deserializerMap.put("edgeKioskIdleTimeoutMinutes", (n) -> { currentObject.setEdgeKioskIdleTimeoutMinutes(n.getIntegerValue()); });
        deserializerMap.put("edgeKioskType", (n) -> { currentObject.setEdgeKioskType(n.getEnumValue(WindowsEdgeKioskType.class)); });
        deserializerMap.put("edgeNoFirstRun", (n) -> { currentObject.setEdgeNoFirstRun(n.getBooleanValue()); });
        return deserializerMap;
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
        writer.writeStringValue("classicAppPath", this.getClassicAppPath());
        writer.writeStringValue("edgeKiosk", this.getEdgeKiosk());
        writer.writeIntegerValue("edgeKioskIdleTimeoutMinutes", this.getEdgeKioskIdleTimeoutMinutes());
        writer.writeEnumValue("edgeKioskType", this.getEdgeKioskType());
        writer.writeBooleanValue("edgeNoFirstRun", this.getEdgeNoFirstRun());
    }
    /**
     * Sets the classicAppPath property value. This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode
     * @param value Value to set for the classicAppPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassicAppPath(@javax.annotation.Nullable final String value) {
        this._classicAppPath = value;
    }
    /**
     * Sets the edgeKiosk property value. Edge kiosk (url) for Edge kiosk mode
     * @param value Value to set for the edgeKiosk property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKiosk(@javax.annotation.Nullable final String value) {
        this._edgeKiosk = value;
    }
    /**
     * Sets the edgeKioskIdleTimeoutMinutes property value. Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440
     * @param value Value to set for the edgeKioskIdleTimeoutMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKioskIdleTimeoutMinutes(@javax.annotation.Nullable final Integer value) {
        this._edgeKioskIdleTimeoutMinutes = value;
    }
    /**
     * Sets the edgeKioskType property value. Edge kiosk type
     * @param value Value to set for the edgeKioskType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKioskType(@javax.annotation.Nullable final WindowsEdgeKioskType value) {
        this._edgeKioskType = value;
    }
    /**
     * Sets the edgeNoFirstRun property value. Edge first run flag for Edge kiosk mode
     * @param value Value to set for the edgeNoFirstRun property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeNoFirstRun(@javax.annotation.Nullable final Boolean value) {
        this._edgeNoFirstRun = value;
    }
}
