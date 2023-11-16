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
 * A complex type to represent the result of bulk driver action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkDriverActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new BulkDriverActionResult and sets the default values.
     */
    public BulkDriverActionResult() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BulkDriverActionResult
     */
    @jakarta.annotation.Nonnull
    public static BulkDriverActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkDriverActionResult();
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
     * Gets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedDriverIds() {
        return this.BackingStore.get("failedDriverIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("failedDriverIds", (n) -> { this.setFailedDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notFoundDriverIds", (n) -> { this.setNotFoundDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulDriverIds", (n) -> { this.setSuccessfulDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotFoundDriverIds() {
        return this.BackingStore.get("notFoundDriverIds");
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
     * Gets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuccessfulDriverIds() {
        return this.BackingStore.get("successfulDriverIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDriverIds", this.getFailedDriverIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDriverIds", this.getNotFoundDriverIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("successfulDriverIds", this.getSuccessfulDriverIds());
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
     * Sets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @param value Value to set for the failedDriverIds property.
     */
    public void setFailedDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("failedDriverIds", value);
    }
    /**
     * Sets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @param value Value to set for the notFoundDriverIds property.
     */
    public void setNotFoundDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("notFoundDriverIds", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @param value Value to set for the successfulDriverIds property.
     */
    public void setSuccessfulDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("successfulDriverIds", value);
    }
}
