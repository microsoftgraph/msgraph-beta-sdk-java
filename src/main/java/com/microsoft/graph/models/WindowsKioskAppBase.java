package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The base class for a type of apps */
public class WindowsKioskAppBase implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of Windows kiosk app. */
    private WindowsKioskAppType _appType;
    /** Allow the app to be auto-launched in multi-app kiosk mode */
    private Boolean _autoLaunch;
    /** Represents the friendly name of an app */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The tile size of Windows app in the start layout. */
    private WindowsAppStartLayoutTileSize _startLayoutTileSize;
    /**
     * Instantiates a new windowsKioskAppBase and sets the default values.
     * @return a void
     */
    public WindowsKioskAppBase() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsKioskAppBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskAppBase
     */
    @javax.annotation.Nonnull
    public static WindowsKioskAppBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsKioskDesktopApp": return new WindowsKioskDesktopApp();
                case "#microsoft.graph.windowsKioskUWPApp": return new WindowsKioskUWPApp();
                case "#microsoft.graph.windowsKioskWin32App": return new WindowsKioskWin32App();
            }
        }
        return new WindowsKioskAppBase();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appType property value. The type of Windows kiosk app.
     * @return a windowsKioskAppType
     */
    @javax.annotation.Nullable
    public WindowsKioskAppType getAppType() {
        return this._appType;
    }
    /**
     * Gets the autoLaunch property value. Allow the app to be auto-launched in multi-app kiosk mode
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoLaunch() {
        return this._autoLaunch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskAppBase currentObject = this;
        return new HashMap<>(5) {{
            this.put("appType", (n) -> { currentObject.setAppType(n.getEnumValue(WindowsKioskAppType.class)); });
            this.put("autoLaunch", (n) -> { currentObject.setAutoLaunch(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("startLayoutTileSize", (n) -> { currentObject.setStartLayoutTileSize(n.getEnumValue(WindowsAppStartLayoutTileSize.class)); });
        }};
    }
    /**
     * Gets the name property value. Represents the friendly name of an app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the startLayoutTileSize property value. The tile size of Windows app in the start layout.
     * @return a windowsAppStartLayoutTileSize
     */
    @javax.annotation.Nullable
    public WindowsAppStartLayoutTileSize getStartLayoutTileSize() {
        return this._startLayoutTileSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appType", this.getAppType());
        writer.writeBooleanValue("autoLaunch", this.getAutoLaunch());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("startLayoutTileSize", this.getStartLayoutTileSize());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appType property value. The type of Windows kiosk app.
     * @param value Value to set for the appType property.
     * @return a void
     */
    public void setAppType(@javax.annotation.Nullable final WindowsKioskAppType value) {
        this._appType = value;
    }
    /**
     * Sets the autoLaunch property value. Allow the app to be auto-launched in multi-app kiosk mode
     * @param value Value to set for the autoLaunch property.
     * @return a void
     */
    public void setAutoLaunch(@javax.annotation.Nullable final Boolean value) {
        this._autoLaunch = value;
    }
    /**
     * Sets the name property value. Represents the friendly name of an app
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the startLayoutTileSize property value. The tile size of Windows app in the start layout.
     * @param value Value to set for the startLayoutTileSize property.
     * @return a void
     */
    public void setStartLayoutTileSize(@javax.annotation.Nullable final WindowsAppStartLayoutTileSize value) {
        this._startLayoutTileSize = value;
    }
}
