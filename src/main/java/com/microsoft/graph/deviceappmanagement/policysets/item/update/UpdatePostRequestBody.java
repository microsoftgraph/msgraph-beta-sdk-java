package com.microsoft.graph.deviceappmanagement.policysets.item.update;

import com.microsoft.graph.models.PolicySetAssignment;
import com.microsoft.graph.models.PolicySetItem;
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
public class UpdatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdatePostRequestBody and sets the default values.
     */
    public UpdatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePostRequestBody();
    }
    /**
     * Gets the addedPolicySetItems property value. The addedPolicySetItems property
     * @return a java.util.List<PolicySetItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetItem> getAddedPolicySetItems() {
        return this.backingStore.get("addedPolicySetItems");
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
     * Gets the assignments property value. The assignments property
     * @return a java.util.List<PolicySetAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetAssignment> getAssignments() {
        return this.backingStore.get("assignments");
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
     * Gets the deletedPolicySetItems property value. The deletedPolicySetItems property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeletedPolicySetItems() {
        return this.backingStore.get("deletedPolicySetItems");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addedPolicySetItems", (n) -> { this.setAddedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(PolicySetAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedPolicySetItems", (n) -> { this.setDeletedPolicySetItems(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updatedPolicySetItems", (n) -> { this.setUpdatedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updatedPolicySetItems property value. The updatedPolicySetItems property
     * @return a java.util.List<PolicySetItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetItem> getUpdatedPolicySetItems() {
        return this.backingStore.get("updatedPolicySetItems");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addedPolicySetItems", this.getAddedPolicySetItems());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfPrimitiveValues("deletedPolicySetItems", this.getDeletedPolicySetItems());
        writer.writeCollectionOfObjectValues("updatedPolicySetItems", this.getUpdatedPolicySetItems());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addedPolicySetItems property value. The addedPolicySetItems property
     * @param value Value to set for the addedPolicySetItems property.
     */
    public void setAddedPolicySetItems(@jakarta.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this.backingStore.set("addedPolicySetItems", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this.backingStore.set("assignments", value);
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
     * Sets the deletedPolicySetItems property value. The deletedPolicySetItems property
     * @param value Value to set for the deletedPolicySetItems property.
     */
    public void setDeletedPolicySetItems(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("deletedPolicySetItems", value);
    }
    /**
     * Sets the updatedPolicySetItems property value. The updatedPolicySetItems property
     * @param value Value to set for the updatedPolicySetItems property.
     */
    public void setUpdatedPolicySetItems(@jakarta.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this.backingStore.set("updatedPolicySetItems", value);
    }
}
