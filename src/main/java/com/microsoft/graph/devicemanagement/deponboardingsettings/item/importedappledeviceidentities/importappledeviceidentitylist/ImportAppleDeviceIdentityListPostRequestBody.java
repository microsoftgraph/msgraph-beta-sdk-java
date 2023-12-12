package com.microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.importappledeviceidentitylist;

import com.microsoft.graph.models.ImportedAppleDeviceIdentity;
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
public class ImportAppleDeviceIdentityListPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ImportAppleDeviceIdentityListPostRequestBody and sets the default values.
     */
    public ImportAppleDeviceIdentityListPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportAppleDeviceIdentityListPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ImportAppleDeviceIdentityListPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportAppleDeviceIdentityListPostRequestBody();
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
        deserializerMap.put("importedAppleDeviceIdentities", (n) -> { this.setImportedAppleDeviceIdentities(n.getCollectionOfObjectValues(ImportedAppleDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("overwriteImportedDeviceIdentities", (n) -> { this.setOverwriteImportedDeviceIdentities(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importedAppleDeviceIdentities property value. The importedAppleDeviceIdentities property
     * @return a java.util.List<ImportedAppleDeviceIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this.backingStore.get("importedAppleDeviceIdentities");
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
        writer.writeCollectionOfObjectValues("importedAppleDeviceIdentities", this.getImportedAppleDeviceIdentities());
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
     * Sets the importedAppleDeviceIdentities property value. The importedAppleDeviceIdentities property
     * @param value Value to set for the importedAppleDeviceIdentities property.
     */
    public void setImportedAppleDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this.backingStore.set("importedAppleDeviceIdentities", value);
    }
    /**
     * Sets the overwriteImportedDeviceIdentities property value. The overwriteImportedDeviceIdentities property
     * @param value Value to set for the overwriteImportedDeviceIdentities property.
     */
    public void setOverwriteImportedDeviceIdentities(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("overwriteImportedDeviceIdentities", value);
    }
}
