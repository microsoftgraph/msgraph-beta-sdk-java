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
public class CloudPcStorageBlobDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcStorageBlobDetail} and sets the default values.
     */
    public CloudPcStorageBlobDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcStorageBlobDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcStorageBlobDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcStorageBlobDetail();
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
     * Gets the containerName property value. Indicates the name of the container. For example, mycontainer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContainerName() {
        return this.backingStore.get("containerName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("containerName", (n) -> { this.setContainerName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("storageAccountId", (n) -> { this.setStorageAccountId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The name of the file stored in the container. For example, myexportedvm.vhd.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
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
     * Gets the storageAccountId property value. Indicates the unique identifier for the Azure storage account. For example, /subscriptions/0231ef39-1113-4772-bffe-26e7d8a15c9e/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageAccountId() {
        return this.backingStore.get("storageAccountId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("containerName", this.getContainerName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("storageAccountId", this.getStorageAccountId());
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
     * Sets the containerName property value. Indicates the name of the container. For example, mycontainer.
     * @param value Value to set for the containerName property.
     */
    public void setContainerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("containerName", value);
    }
    /**
     * Sets the fileName property value. The name of the file stored in the container. For example, myexportedvm.vhd.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the storageAccountId property value. Indicates the unique identifier for the Azure storage account. For example, /subscriptions/0231ef39-1113-4772-bffe-26e7d8a15c9e/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount.
     * @param value Value to set for the storageAccountId property.
     */
    public void setStorageAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountId", value);
    }
}
