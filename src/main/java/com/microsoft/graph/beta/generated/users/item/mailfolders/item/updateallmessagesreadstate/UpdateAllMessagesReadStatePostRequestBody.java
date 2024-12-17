package com.microsoft.graph.beta.users.item.mailfolders.item.updateallmessagesreadstate;

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
public class UpdateAllMessagesReadStatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UpdateAllMessagesReadStatePostRequestBody} and sets the default values.
     */
    public UpdateAllMessagesReadStatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateAllMessagesReadStatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UpdateAllMessagesReadStatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAllMessagesReadStatePostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("isRead", (n) -> { this.setIsRead(n.getBooleanValue()); });
        deserializerMap.put("suppressReadReceipts", (n) -> { this.setSuppressReadReceipts(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRead property value. The isRead property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRead() {
        return this.backingStore.get("isRead");
    }
    /**
     * Gets the suppressReadReceipts property value. The suppressReadReceipts property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSuppressReadReceipts() {
        return this.backingStore.get("suppressReadReceipts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRead", this.getIsRead());
        writer.writeBooleanValue("suppressReadReceipts", this.getSuppressReadReceipts());
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
     * Sets the isRead property value. The isRead property
     * @param value Value to set for the isRead property.
     */
    public void setIsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRead", value);
    }
    /**
     * Sets the suppressReadReceipts property value. The suppressReadReceipts property
     * @param value Value to set for the suppressReadReceipts property.
     */
    public void setSuppressReadReceipts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("suppressReadReceipts", value);
    }
}
