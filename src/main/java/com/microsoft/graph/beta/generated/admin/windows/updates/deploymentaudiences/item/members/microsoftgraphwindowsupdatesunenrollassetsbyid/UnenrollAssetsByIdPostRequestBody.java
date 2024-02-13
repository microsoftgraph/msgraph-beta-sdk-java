package com.microsoft.graph.beta.admin.windows.updates.deploymentaudiences.item.members.microsoftgraphwindowsupdatesunenrollassetsbyid;

import com.microsoft.graph.beta.models.windowsupdates.UpdateCategory;
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
public class UnenrollAssetsByIdPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UnenrollAssetsByIdPostRequestBody} and sets the default values.
     */
    public UnenrollAssetsByIdPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnenrollAssetsByIdPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UnenrollAssetsByIdPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnenrollAssetsByIdPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("ids", (n) -> { this.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("memberEntityType", (n) -> { this.setMemberEntityType(n.getStringValue()); });
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(UpdateCategory::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ids property value. The ids property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIds() {
        return this.backingStore.get("ids");
    }
    /**
     * Gets the memberEntityType property value. The memberEntityType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMemberEntityType() {
        return this.backingStore.get("memberEntityType");
    }
    /**
     * Gets the updateCategory property value. The updateCategory property
     * @return a {@link UpdateCategory}
     */
    @jakarta.annotation.Nullable
    public UpdateCategory getUpdateCategory() {
        return this.backingStore.get("updateCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ids", this.getIds());
        writer.writeStringValue("memberEntityType", this.getMemberEntityType());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
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
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     */
    public void setIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ids", value);
    }
    /**
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     */
    public void setMemberEntityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberEntityType", value);
    }
    /**
     * Sets the updateCategory property value. The updateCategory property
     * @param value Value to set for the updateCategory property.
     */
    public void setUpdateCategory(@jakarta.annotation.Nullable final UpdateCategory value) {
        this.backingStore.set("updateCategory", value);
    }
}
