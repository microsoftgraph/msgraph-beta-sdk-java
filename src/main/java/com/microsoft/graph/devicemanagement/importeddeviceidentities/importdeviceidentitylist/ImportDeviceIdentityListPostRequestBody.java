package com.microsoft.graph.devicemanagement.importeddeviceidentities.importdeviceidentitylist;

import com.microsoft.graph.models.ImportedDeviceIdentity;
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
public class ImportDeviceIdentityListPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ImportDeviceIdentityListPostRequestBody and sets the default values.
     */
    public ImportDeviceIdentityListPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportDeviceIdentityListPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ImportDeviceIdentityListPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportDeviceIdentityListPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("importedDeviceIdentities", (n) -> { this.setImportedDeviceIdentities(n.getCollectionOfObjectValues(ImportedDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("overwriteImportedDeviceIdentities", (n) -> { this.setOverwriteImportedDeviceIdentities(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importedDeviceIdentities property value. The importedDeviceIdentities property
     * @return a java.util.List<ImportedDeviceIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedDeviceIdentity> getImportedDeviceIdentities() {
        return this.backingStore.get("importedDeviceIdentities");
    }
    /**
     * Gets the overwriteImportedDeviceIdentities property value. The overwriteImportedDeviceIdentities property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverwriteImportedDeviceIdentities() {
        return this.backingStore.get("overwriteImportedDeviceIdentities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("importedDeviceIdentities", this.getImportedDeviceIdentities());
        writer.writeBooleanValue("overwriteImportedDeviceIdentities", this.getOverwriteImportedDeviceIdentities());
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
     * Sets the importedDeviceIdentities property value. The importedDeviceIdentities property
     * @param value Value to set for the importedDeviceIdentities property.
     */
    public void setImportedDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedDeviceIdentity> value) {
        this.backingStore.set("importedDeviceIdentities", value);
    }
    /**
     * Sets the overwriteImportedDeviceIdentities property value. The overwriteImportedDeviceIdentities property
     * @param value Value to set for the overwriteImportedDeviceIdentities property.
     */
    public void setOverwriteImportedDeviceIdentities(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("overwriteImportedDeviceIdentities", value);
    }
}
