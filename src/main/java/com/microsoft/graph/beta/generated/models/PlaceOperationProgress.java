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
public class PlaceOperationProgress implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlaceOperationProgress} and sets the default values.
     */
    public PlaceOperationProgress() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlaceOperationProgress}
     */
    @jakarta.annotation.Nonnull
    public static PlaceOperationProgress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlaceOperationProgress();
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
     * Gets the failedPlaceCount property value. The count of places failed to upsert.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedPlaceCount() {
        return this.backingStore.get("failedPlaceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("failedPlaceCount", (n) -> { this.setFailedPlaceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("succeededPlaceCount", (n) -> { this.setSucceededPlaceCount(n.getIntegerValue()); });
        deserializerMap.put("totalPlaceCount", (n) -> { this.setTotalPlaceCount(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the succeededPlaceCount property value. The count of places succeeded to upsert.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSucceededPlaceCount() {
        return this.backingStore.get("succeededPlaceCount");
    }
    /**
     * Gets the totalPlaceCount property value. The total count of places in the request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalPlaceCount() {
        return this.backingStore.get("totalPlaceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedPlaceCount", this.getFailedPlaceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("succeededPlaceCount", this.getSucceededPlaceCount());
        writer.writeIntegerValue("totalPlaceCount", this.getTotalPlaceCount());
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
     * Sets the failedPlaceCount property value. The count of places failed to upsert.
     * @param value Value to set for the failedPlaceCount property.
     */
    public void setFailedPlaceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedPlaceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the succeededPlaceCount property value. The count of places succeeded to upsert.
     * @param value Value to set for the succeededPlaceCount property.
     */
    public void setSucceededPlaceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("succeededPlaceCount", value);
    }
    /**
     * Sets the totalPlaceCount property value. The total count of places in the request.
     * @param value Value to set for the totalPlaceCount property.
     */
    public void setTotalPlaceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalPlaceCount", value);
    }
}
