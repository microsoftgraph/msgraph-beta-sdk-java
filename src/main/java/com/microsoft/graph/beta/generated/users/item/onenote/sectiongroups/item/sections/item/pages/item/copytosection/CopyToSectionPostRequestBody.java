package com.microsoft.graph.beta.users.item.onenote.sectiongroups.item.sections.item.pages.item.copytosection;

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
public class CopyToSectionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CopyToSectionPostRequestBody} and sets the default values.
     */
    public CopyToSectionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopyToSectionPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CopyToSectionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToSectionPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("siteCollectionId", (n) -> { this.setSiteCollectionId(n.getStringValue()); });
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the siteCollectionId property value. The siteCollectionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteCollectionId() {
        return this.backingStore.get("siteCollectionId");
    }
    /**
     * Gets the siteId property value. The siteId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteId() {
        return this.backingStore.get("siteId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("siteCollectionId", this.getSiteCollectionId());
        writer.writeStringValue("siteId", this.getSiteId());
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
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the siteCollectionId property value. The siteCollectionId property
     * @param value Value to set for the siteCollectionId property.
     */
    public void setSiteCollectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteCollectionId", value);
    }
    /**
     * Sets the siteId property value. The siteId property
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteId", value);
    }
}
