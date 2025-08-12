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
     * Gets the commandLineArguments property value. The commandLineArguments property
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
     * Gets the filePath property value. The filePath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the iconIndex property value. The iconIndex property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIconIndex() {
        return this.backingStore.get("iconIndex");
    }
    /**
     * Gets the iconPath property value. The iconPath property
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
     * Sets the commandLineArguments property value. The commandLineArguments property
     * @param value Value to set for the commandLineArguments property.
     */
    public void setCommandLineArguments(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commandLineArguments", value);
    }
    /**
     * Sets the filePath property value. The filePath property
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the iconIndex property value. The iconIndex property
     * @param value Value to set for the iconIndex property.
     */
    public void setIconIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("iconIndex", value);
    }
    /**
     * Sets the iconPath property value. The iconPath property
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
