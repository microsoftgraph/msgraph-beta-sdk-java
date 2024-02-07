package com.microsoft.graph.beta.admin.windows.updates.deploymentaudiences.item.microsoftgraphwindowsupdatesupdateaudience;

import com.microsoft.graph.beta.models.windowsupdates.UpdatableAsset;
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
public class UpdateAudiencePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdateAudiencePostRequestBody and sets the default values.
     */
    public UpdateAudiencePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateAudiencePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateAudiencePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAudiencePostRequestBody();
    }
    /**
     * Gets the addExclusions property value. The addExclusions property
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getAddExclusions() {
        return this.backingStore.get("addExclusions");
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
     * Gets the addMembers property value. The addMembers property
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getAddMembers() {
        return this.backingStore.get("addMembers");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addExclusions", (n) -> { this.setAddExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("addMembers", (n) -> { this.setAddMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("removeExclusions", (n) -> { this.setRemoveExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("removeMembers", (n) -> { this.setRemoveMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the removeExclusions property value. The removeExclusions property
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getRemoveExclusions() {
        return this.backingStore.get("removeExclusions");
    }
    /**
     * Gets the removeMembers property value. The removeMembers property
     * @return a java.util.List<UpdatableAsset>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getRemoveMembers() {
        return this.backingStore.get("removeMembers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addExclusions", this.getAddExclusions());
        writer.writeCollectionOfObjectValues("addMembers", this.getAddMembers());
        writer.writeCollectionOfObjectValues("removeExclusions", this.getRemoveExclusions());
        writer.writeCollectionOfObjectValues("removeMembers", this.getRemoveMembers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExclusions property value. The addExclusions property
     * @param value Value to set for the addExclusions property.
     */
    public void setAddExclusions(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("addExclusions", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the addMembers property value. The addMembers property
     * @param value Value to set for the addMembers property.
     */
    public void setAddMembers(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("addMembers", value);
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
     * Sets the removeExclusions property value. The removeExclusions property
     * @param value Value to set for the removeExclusions property.
     */
    public void setRemoveExclusions(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("removeExclusions", value);
    }
    /**
     * Sets the removeMembers property value. The removeMembers property
     * @param value Value to set for the removeMembers property.
     */
    public void setRemoveMembers(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("removeMembers", value);
    }
}
