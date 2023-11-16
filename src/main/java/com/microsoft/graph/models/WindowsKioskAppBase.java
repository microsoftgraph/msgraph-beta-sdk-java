package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base class for a type of apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskAppBase implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new WindowsKioskAppBase and sets the default values.
     */
    public WindowsKioskAppBase() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskAppBase
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskAppBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appType property value. The type of Windows kiosk app.
     * @return a WindowsKioskAppType
     */
    @jakarta.annotation.Nullable
    public WindowsKioskAppType getAppType() {
        return this.BackingStore.get("appType");
    }
    /**
     * Gets the autoLaunch property value. Allow the app to be auto-launched in multi-app kiosk mode
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoLaunch() {
        return this.BackingStore.get("autoLaunch");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appType", (n) -> { this.setAppType(n.getEnumValue(WindowsKioskAppType.class)); });
        deserializerMap.put("autoLaunch", (n) -> { this.setAutoLaunch(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startLayoutTileSize", (n) -> { this.setStartLayoutTileSize(n.getEnumValue(WindowsAppStartLayoutTileSize.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Represents the friendly name of an app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the startLayoutTileSize property value. The tile size of Windows app in the start layout.
     * @return a WindowsAppStartLayoutTileSize
     */
    @jakarta.annotation.Nullable
    public WindowsAppStartLayoutTileSize getStartLayoutTileSize() {
        return this.BackingStore.get("startLayoutTileSize");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appType", this.getAppType());
        writer.writeBooleanValue("autoLaunch", this.getAutoLaunch());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("startLayoutTileSize", this.getStartLayoutTileSize());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the appType property value. The type of Windows kiosk app.
     * @param value Value to set for the appType property.
     */
    public void setAppType(@jakarta.annotation.Nullable final WindowsKioskAppType value) {
        this.BackingStore.set("appType", value);
    }
    /**
     * Sets the autoLaunch property value. Allow the app to be auto-launched in multi-app kiosk mode
     * @param value Value to set for the autoLaunch property.
     */
    public void setAutoLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("autoLaunch", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the name property value. Represents the friendly name of an app
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the startLayoutTileSize property value. The tile size of Windows app in the start layout.
     * @param value Value to set for the startLayoutTileSize property.
     */
    public void setStartLayoutTileSize(@jakarta.annotation.Nullable final WindowsAppStartLayoutTileSize value) {
        this.BackingStore.set("startLayoutTileSize", value);
    }
}
