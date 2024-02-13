package com.microsoft.graph.beta.admin.windows.updates.deploymentaudiences.item.microsoftgraphwindowsupdatesupdateaudiencebyid;

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
public class UpdateAudienceByIdPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UpdateAudienceByIdPostRequestBody} and sets the default values.
     */
    public UpdateAudienceByIdPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateAudienceByIdPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UpdateAudienceByIdPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAudienceByIdPostRequestBody();
    }
    /**
     * Gets the addExclusions property value. The addExclusions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAddExclusions() {
        return this.backingStore.get("addExclusions");
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
     * Gets the addMembers property value. The addMembers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAddMembers() {
        return this.backingStore.get("addMembers");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("addExclusions", (n) -> { this.setAddExclusions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("addMembers", (n) -> { this.setAddMembers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("memberEntityType", (n) -> { this.setMemberEntityType(n.getStringValue()); });
        deserializerMap.put("removeExclusions", (n) -> { this.setRemoveExclusions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("removeMembers", (n) -> { this.setRemoveMembers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
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
     * Gets the removeExclusions property value. The removeExclusions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRemoveExclusions() {
        return this.backingStore.get("removeExclusions");
    }
    /**
     * Gets the removeMembers property value. The removeMembers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRemoveMembers() {
        return this.backingStore.get("removeMembers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("addExclusions", this.getAddExclusions());
        writer.writeCollectionOfPrimitiveValues("addMembers", this.getAddMembers());
        writer.writeStringValue("memberEntityType", this.getMemberEntityType());
        writer.writeCollectionOfPrimitiveValues("removeExclusions", this.getRemoveExclusions());
        writer.writeCollectionOfPrimitiveValues("removeMembers", this.getRemoveMembers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExclusions property value. The addExclusions property
     * @param value Value to set for the addExclusions property.
     */
    public void setAddExclusions(@jakarta.annotation.Nullable final java.util.List<String> value) {
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
    public void setAddMembers(@jakarta.annotation.Nullable final java.util.List<String> value) {
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
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     */
    public void setMemberEntityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberEntityType", value);
    }
    /**
     * Sets the removeExclusions property value. The removeExclusions property
     * @param value Value to set for the removeExclusions property.
     */
    public void setRemoveExclusions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("removeExclusions", value);
    }
    /**
     * Sets the removeMembers property value. The removeMembers property
     * @param value Value to set for the removeMembers property.
     */
    public void setRemoveMembers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("removeMembers", value);
    }
}
