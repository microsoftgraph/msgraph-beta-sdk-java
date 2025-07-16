package com.microsoft.graph.beta.models;

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
public class LinkScopeAbilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LinkScopeAbilities} and sets the default values.
     */
    public LinkScopeAbilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkScopeAbilities}
     */
    @jakarta.annotation.Nonnull
    public static LinkScopeAbilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkScopeAbilities();
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
     * Gets the blockDownloadLinkAbilities property value. The blockDownload link abilities.
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getBlockDownloadLinkAbilities() {
        return this.backingStore.get("blockDownloadLinkAbilities");
    }
    /**
     * Gets the editLinkAbilities property value. The editLinkAbilities property
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getEditLinkAbilities() {
        return this.backingStore.get("editLinkAbilities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("blockDownloadLinkAbilities", (n) -> { this.setBlockDownloadLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("editLinkAbilities", (n) -> { this.setEditLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("manageListLinkAbilities", (n) -> { this.setManageListLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("readLinkAbilities", (n) -> { this.setReadLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewLinkAbilities", (n) -> { this.setReviewLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("submitOnlyLinkAbilities", (n) -> { this.setSubmitOnlyLinkAbilities(n.getObjectValue(LinkRoleAbilities::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the manageListLinkAbilities property value. The manageList link abilities.
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getManageListLinkAbilities() {
        return this.backingStore.get("manageListLinkAbilities");
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
     * Gets the readLinkAbilities property value. The readLinkAbilities property
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getReadLinkAbilities() {
        return this.backingStore.get("readLinkAbilities");
    }
    /**
     * Gets the reviewLinkAbilities property value. The review link abilities.
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getReviewLinkAbilities() {
        return this.backingStore.get("reviewLinkAbilities");
    }
    /**
     * Gets the submitOnlyLinkAbilities property value. The submitOnly link abilities.
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkRoleAbilities getSubmitOnlyLinkAbilities() {
        return this.backingStore.get("submitOnlyLinkAbilities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("blockDownloadLinkAbilities", this.getBlockDownloadLinkAbilities());
        writer.writeObjectValue("editLinkAbilities", this.getEditLinkAbilities());
        writer.writeObjectValue("manageListLinkAbilities", this.getManageListLinkAbilities());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("readLinkAbilities", this.getReadLinkAbilities());
        writer.writeObjectValue("reviewLinkAbilities", this.getReviewLinkAbilities());
        writer.writeObjectValue("submitOnlyLinkAbilities", this.getSubmitOnlyLinkAbilities());
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
     * Sets the blockDownloadLinkAbilities property value. The blockDownload link abilities.
     * @param value Value to set for the blockDownloadLinkAbilities property.
     */
    public void setBlockDownloadLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("blockDownloadLinkAbilities", value);
    }
    /**
     * Sets the editLinkAbilities property value. The editLinkAbilities property
     * @param value Value to set for the editLinkAbilities property.
     */
    public void setEditLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("editLinkAbilities", value);
    }
    /**
     * Sets the manageListLinkAbilities property value. The manageList link abilities.
     * @param value Value to set for the manageListLinkAbilities property.
     */
    public void setManageListLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("manageListLinkAbilities", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the readLinkAbilities property value. The readLinkAbilities property
     * @param value Value to set for the readLinkAbilities property.
     */
    public void setReadLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("readLinkAbilities", value);
    }
    /**
     * Sets the reviewLinkAbilities property value. The review link abilities.
     * @param value Value to set for the reviewLinkAbilities property.
     */
    public void setReviewLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("reviewLinkAbilities", value);
    }
    /**
     * Sets the submitOnlyLinkAbilities property value. The submitOnly link abilities.
     * @param value Value to set for the submitOnlyLinkAbilities property.
     */
    public void setSubmitOnlyLinkAbilities(@jakarta.annotation.Nullable final LinkRoleAbilities value) {
        this.backingStore.set("submitOnlyLinkAbilities", value);
    }
}
