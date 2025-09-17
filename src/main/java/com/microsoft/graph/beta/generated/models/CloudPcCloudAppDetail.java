package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcCloudAppDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcCloudAppDetail} and sets the default values.
     */
    public CloudPcCloudAppDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcCloudAppDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcCloudAppDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcCloudAppDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the commandLineArguments property value. Specifies the command-line arguments for the cloud app. These parameters are passed to the cloud app when it&apos;s launched. The maximum allowed length for this property is 2,048 characters. For example, -fullscreen -loop.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommandLineArguments() {
        return this.backingStore.get("commandLineArguments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("commandLineArguments", (n) -> { this.setCommandLineArguments(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("iconIndex", (n) -> { this.setIconIndex(n.getIntegerValue()); });
        deserializerMap.put("iconPath", (n) -> { this.setIconPath(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filePath property value. Specifies the path to the executable file for the application within the OS of the hosting Cloud PC. The value should be an absolute path to a Windows or Universal app. For example, C:/app.exe or shell:AppsFolder/appname!App. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the iconIndex property value. Specifies the index of the icon within the file specified by the iconPath property. For example, if iconPath is set to C:/Program Files/MyApp/myapp.ico and iconIndex is set to 0, the system uses the first icon in the myapp.ico file. The default value is 0.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIconIndex() {
        return this.backingStore.get("iconIndex");
    }
    /**
     * Gets the iconPath property value. Specifies the path to the icon file for the application within the OS of the hosting Cloud PC. When an admin updates the path of a cloud app, the value should be a rooted absolute path. For example, C:/Windows/system32/WindowsPowerShell/v1.0/powershell_ise.exe. If this property isn&apos;t defined, a default icon is used.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIconPath() {
        return this.backingStore.get("iconPath");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("commandLineArguments", this.getCommandLineArguments());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeIntegerValue("iconIndex", this.getIconIndex());
        writer.writeStringValue("iconPath", this.getIconPath());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the commandLineArguments property value. Specifies the command-line arguments for the cloud app. These parameters are passed to the cloud app when it&apos;s launched. The maximum allowed length for this property is 2,048 characters. For example, -fullscreen -loop.
     * @param value Value to set for the commandLineArguments property.
     */
    public void setCommandLineArguments(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commandLineArguments", value);
    }
    /**
     * Sets the filePath property value. Specifies the path to the executable file for the application within the OS of the hosting Cloud PC. The value should be an absolute path to a Windows or Universal app. For example, C:/app.exe or shell:AppsFolder/appname!App. Read-only.
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the iconIndex property value. Specifies the index of the icon within the file specified by the iconPath property. For example, if iconPath is set to C:/Program Files/MyApp/myapp.ico and iconIndex is set to 0, the system uses the first icon in the myapp.ico file. The default value is 0.
     * @param value Value to set for the iconIndex property.
     */
    public void setIconIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("iconIndex", value);
    }
    /**
     * Sets the iconPath property value. Specifies the path to the icon file for the application within the OS of the hosting Cloud PC. When an admin updates the path of a cloud app, the value should be a rooted absolute path. For example, C:/Windows/system32/WindowsPowerShell/v1.0/powershell_ise.exe. If this property isn&apos;t defined, a default icon is used.
     * @param value Value to set for the iconPath property.
     */
    public void setIconPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iconPath", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
