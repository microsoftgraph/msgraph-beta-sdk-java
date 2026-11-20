package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThirdPartyWorkItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ThirdPartyWorkItem} and sets the default values.
     */
    public ThirdPartyWorkItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ThirdPartyWorkItem}
     */
    @jakarta.annotation.Nonnull
    public static ThirdPartyWorkItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThirdPartyWorkItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("instance", (n) -> { this.setInstance(n.getStringValue()); });
        deserializerMap.put("lastSyncedOnDateTime", (n) -> { this.setLastSyncedOnDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ThirdPartyWorkItemMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getEnumValue(ThirdPartyWorkItemProvider::forValue)); });
        deserializerMap.put("syncedBy", (n) -> { this.setSyncedBy(n.getStringValue()); });
        deserializerMap.put("workItemType", (n) -> { this.setWorkItemType(n.getEnumValue(ThirdPartyWorkItemType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the instance property value. The instance property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstance() {
        return this.backingStore.get("instance");
    }
    /**
     * Gets the lastSyncedOnDateTime property value. The lastSyncedOnDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncedOnDateTime() {
        return this.backingStore.get("lastSyncedOnDateTime");
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link ThirdPartyWorkItemMetadata}
     */
    @jakarta.annotation.Nullable
    public ThirdPartyWorkItemMetadata getMetadata() {
        return this.backingStore.get("metadata");
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
     * Gets the provider property value. The provider property
     * @return a {@link ThirdPartyWorkItemProvider}
     */
    @jakarta.annotation.Nullable
    public ThirdPartyWorkItemProvider getProvider() {
        return this.backingStore.get("provider");
    }
    /**
     * Gets the syncedBy property value. The syncedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSyncedBy() {
        return this.backingStore.get("syncedBy");
    }
    /**
     * Gets the workItemType property value. The workItemType property
     * @return a {@link ThirdPartyWorkItemType}
     */
    @jakarta.annotation.Nullable
    public ThirdPartyWorkItemType getWorkItemType() {
        return this.backingStore.get("workItemType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("instance", this.getInstance());
        writer.writeOffsetDateTimeValue("lastSyncedOnDateTime", this.getLastSyncedOnDateTime());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("syncedBy", this.getSyncedBy());
        writer.writeEnumValue("workItemType", this.getWorkItemType());
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
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the instance property value. The instance property
     * @param value Value to set for the instance property.
     */
    public void setInstance(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instance", value);
    }
    /**
     * Sets the lastSyncedOnDateTime property value. The lastSyncedOnDateTime property
     * @param value Value to set for the lastSyncedOnDateTime property.
     */
    public void setLastSyncedOnDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncedOnDateTime", value);
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final ThirdPartyWorkItemMetadata value) {
        this.backingStore.set("metadata", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final ThirdPartyWorkItemProvider value) {
        this.backingStore.set("provider", value);
    }
    /**
     * Sets the syncedBy property value. The syncedBy property
     * @param value Value to set for the syncedBy property.
     */
    public void setSyncedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("syncedBy", value);
    }
    /**
     * Sets the workItemType property value. The workItemType property
     * @param value Value to set for the workItemType property.
     */
    public void setWorkItemType(@jakarta.annotation.Nullable final ThirdPartyWorkItemType value) {
        this.backingStore.set("workItemType", value);
    }
}
