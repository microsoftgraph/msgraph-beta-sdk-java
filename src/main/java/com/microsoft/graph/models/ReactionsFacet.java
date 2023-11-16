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
public class ReactionsFacet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ReactionsFacet and sets the default values.
     */
    public ReactionsFacet() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReactionsFacet
     */
    @jakarta.annotation.Nonnull
    public static ReactionsFacet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReactionsFacet();
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
     * Gets the commentCount property value. Count of comments.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCommentCount() {
        return this.BackingStore.get("commentCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("commentCount", (n) -> { this.setCommentCount(n.getIntegerValue()); });
        deserializerMap.put("likeCount", (n) -> { this.setLikeCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("shareCount", (n) -> { this.setShareCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the likeCount property value. Count of likes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLikeCount() {
        return this.BackingStore.get("likeCount");
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
     * Gets the shareCount property value. Count of shares.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getShareCount() {
        return this.BackingStore.get("shareCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("commentCount", this.getCommentCount());
        writer.writeIntegerValue("likeCount", this.getLikeCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("shareCount", this.getShareCount());
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
     * Sets the commentCount property value. Count of comments.
     * @param value Value to set for the commentCount property.
     */
    public void setCommentCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("commentCount", value);
    }
    /**
     * Sets the likeCount property value. Count of likes.
     * @param value Value to set for the likeCount property.
     */
    public void setLikeCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("likeCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the shareCount property value. Count of shares.
     * @param value Value to set for the shareCount property.
     */
    public void setShareCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("shareCount", value);
    }
}
