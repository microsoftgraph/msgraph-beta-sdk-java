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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkManagedDeviceActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new BulkManagedDeviceActionResult and sets the default values.
     */
    public BulkManagedDeviceActionResult() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BulkManagedDeviceActionResult
     */
    @jakarta.annotation.Nonnull
    public static BulkManagedDeviceActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkManagedDeviceActionResult();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the failedDeviceIds property value. Failed devices
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedDeviceIds() {
        return this.BackingStore.get("failedDeviceIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("failedDeviceIds", (n) -> { this.setFailedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notFoundDeviceIds", (n) -> { this.setNotFoundDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notSupportedDeviceIds", (n) -> { this.setNotSupportedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulDeviceIds", (n) -> { this.setSuccessfulDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notFoundDeviceIds property value. Not found devices
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotFoundDeviceIds() {
        return this.BackingStore.get("notFoundDeviceIds");
    }
    /**
     * Gets the notSupportedDeviceIds property value. Not supported devices
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotSupportedDeviceIds() {
        return this.BackingStore.get("notSupportedDeviceIds");
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
     * Gets the successfulDeviceIds property value. Successful devices
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuccessfulDeviceIds() {
        return this.BackingStore.get("successfulDeviceIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDeviceIds", this.getFailedDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDeviceIds", this.getNotFoundDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notSupportedDeviceIds", this.getNotSupportedDeviceIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("successfulDeviceIds", this.getSuccessfulDeviceIds());
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
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the failedDeviceIds property value. Failed devices
     * @param value Value to set for the failedDeviceIds property.
     */
    public void setFailedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("failedDeviceIds", value);
    }
    /**
     * Sets the notFoundDeviceIds property value. Not found devices
     * @param value Value to set for the notFoundDeviceIds property.
     */
    public void setNotFoundDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("notFoundDeviceIds", value);
    }
    /**
     * Sets the notSupportedDeviceIds property value. Not supported devices
     * @param value Value to set for the notSupportedDeviceIds property.
     */
    public void setNotSupportedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("notSupportedDeviceIds", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the successfulDeviceIds property value. Successful devices
     * @param value Value to set for the successfulDeviceIds property.
     */
    public void setSuccessfulDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("successfulDeviceIds", value);
    }
}
