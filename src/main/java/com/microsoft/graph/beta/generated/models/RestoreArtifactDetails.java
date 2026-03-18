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
public class RestoreArtifactDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RestoreArtifactDetails} and sets the default values.
     */
    public RestoreArtifactDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreArtifactDetails}
     */
    @jakarta.annotation.Nonnull
    public static RestoreArtifactDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreArtifactDetails();
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
     * Gets the failedCount property value. The failedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.backingStore.get("failedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restoredCount", (n) -> { this.setRestoredCount(n.getIntegerValue()); });
        deserializerMap.put("totalArtifactsCount", (n) -> { this.setTotalArtifactsCount(n.getIntegerValue()); });
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
     * Gets the restoredCount property value. The restoredCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRestoredCount() {
        return this.backingStore.get("restoredCount");
    }
    /**
     * Gets the totalArtifactsCount property value. The totalArtifactsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalArtifactsCount() {
        return this.backingStore.get("totalArtifactsCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("restoredCount", this.getRestoredCount());
        writer.writeIntegerValue("totalArtifactsCount", this.getTotalArtifactsCount());
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
     * Sets the failedCount property value. The failedCount property
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restoredCount property value. The restoredCount property
     * @param value Value to set for the restoredCount property.
     */
    public void setRestoredCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("restoredCount", value);
    }
    /**
     * Sets the totalArtifactsCount property value. The totalArtifactsCount property
     * @param value Value to set for the totalArtifactsCount property.
     */
    public void setTotalArtifactsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalArtifactsCount", value);
    }
}
