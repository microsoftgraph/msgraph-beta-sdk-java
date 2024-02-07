package com.microsoft.graph.beta.devicemanagement.grouppolicyconfigurations.item.updatedefinitionvalues;

import com.microsoft.graph.beta.models.GroupPolicyDefinitionValue;
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
public class UpdateDefinitionValuesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdateDefinitionValuesPostRequestBody and sets the default values.
     */
    public UpdateDefinitionValuesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateDefinitionValuesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateDefinitionValuesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDefinitionValuesPostRequestBody();
    }
    /**
     * Gets the added property value. The added property
     * @return a java.util.List<GroupPolicyDefinitionValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getAdded() {
        return this.backingStore.get("added");
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
     * Gets the deletedIds property value. The deletedIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeletedIds() {
        return this.backingStore.get("deletedIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("added", (n) -> { this.setAdded(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedIds", (n) -> { this.setDeletedIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updated", (n) -> { this.setUpdated(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updated property value. The updated property
     * @return a java.util.List<GroupPolicyDefinitionValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getUpdated() {
        return this.backingStore.get("updated");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("added", this.getAdded());
        writer.writeCollectionOfPrimitiveValues("deletedIds", this.getDeletedIds());
        writer.writeCollectionOfObjectValues("updated", this.getUpdated());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the added property value. The added property
     * @param value Value to set for the added property.
     */
    public void setAdded(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.backingStore.set("added", value);
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
     * Sets the deletedIds property value. The deletedIds property
     * @param value Value to set for the deletedIds property.
     */
    public void setDeletedIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("deletedIds", value);
    }
    /**
     * Sets the updated property value. The updated property
     * @param value Value to set for the updated property.
     */
    public void setUpdated(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.backingStore.set("updated", value);
    }
}
