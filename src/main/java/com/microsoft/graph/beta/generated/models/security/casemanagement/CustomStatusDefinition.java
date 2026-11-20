package com.microsoft.graph.beta.models.security.casemanagement;

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
public class CustomStatusDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomStatusDefinition} and sets the default values.
     */
    public CustomStatusDefinition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomStatusDefinition}
     */
    @jakarta.annotation.Nonnull
    public static CustomStatusDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomStatusDefinition();
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
     * Gets the customStatusId property value. The immutable identifier of the custom status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomStatusId() {
        return this.backingStore.get("customStatusId");
    }
    /**
     * Gets the displayName property value. The human-readable label of the custom status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("customStatusId", (n) -> { this.setCustomStatusId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isFinal", (n) -> { this.setIsFinal(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFinal property value. true if this is a terminal status; a case in a final status can&apos;t transition to another status. Otherwise, false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFinal() {
        return this.backingStore.get("isFinal");
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
     * Gets the sortOrder property value. The display order of the custom status within its parent status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.backingStore.get("sortOrder");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customStatusId", this.getCustomStatusId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isFinal", this.getIsFinal());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("sortOrder", this.getSortOrder());
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
     * Sets the customStatusId property value. The immutable identifier of the custom status.
     * @param value Value to set for the customStatusId property.
     */
    public void setCustomStatusId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customStatusId", value);
    }
    /**
     * Sets the displayName property value. The human-readable label of the custom status.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isFinal property value. true if this is a terminal status; a case in a final status can&apos;t transition to another status. Otherwise, false.
     * @param value Value to set for the isFinal property.
     */
    public void setIsFinal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFinal", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sortOrder property value. The display order of the custom status within its parent status.
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sortOrder", value);
    }
}
