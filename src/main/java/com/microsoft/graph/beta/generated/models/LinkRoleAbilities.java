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
public class LinkRoleAbilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LinkRoleAbilities} and sets the default values.
     */
    public LinkRoleAbilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkRoleAbilities}
     */
    @jakarta.annotation.Nonnull
    public static LinkRoleAbilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkRoleAbilities();
    }
    /**
     * Gets the addExistingExternalUsers property value. Indicates if the current user can add existing external user recipients to this sharing link.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAddExistingExternalUsers() {
        return this.backingStore.get("addExistingExternalUsers");
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
     * Gets the addNewExternalUsers property value. Indicates if the current user can add new external user recipients to this sharing link.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAddNewExternalUsers() {
        return this.backingStore.get("addNewExternalUsers");
    }
    /**
     * Gets the applyVariants property value. Indicates the status of the potential sharing link variants. If selected, it generates a separate sharing link from the sharing link that would otherwise be generated without the variant, yet with an identical role and scope.
     * @return a {@link SharingLinkVariants}
     */
    @jakarta.annotation.Nullable
    public SharingLinkVariants getApplyVariants() {
        return this.backingStore.get("applyVariants");
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
     * Gets the createLink property value. Indicates if links of this role can be created.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getCreateLink() {
        return this.backingStore.get("createLink");
    }
    /**
     * Gets the deleteLink property value. Indicates if links of this role can be deleted.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getDeleteLink() {
        return this.backingStore.get("deleteLink");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("addExistingExternalUsers", (n) -> { this.setAddExistingExternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("addNewExternalUsers", (n) -> { this.setAddNewExternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("applyVariants", (n) -> { this.setApplyVariants(n.getObjectValue(SharingLinkVariants::createFromDiscriminatorValue)); });
        deserializerMap.put("createLink", (n) -> { this.setCreateLink(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deleteLink", (n) -> { this.setDeleteLink(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("linkAllowsExternalUsers", (n) -> { this.setLinkAllowsExternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("linkExpiration", (n) -> { this.setLinkExpiration(n.getObjectValue(SharingLinkExpirationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("retrieveLink", (n) -> { this.setRetrieveLink(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("updateLink", (n) -> { this.setUpdateLink(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the linkAllowsExternalUsers property value. Indicates if this link can include external users.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getLinkAllowsExternalUsers() {
        return this.backingStore.get("linkAllowsExternalUsers");
    }
    /**
     * Gets the linkExpiration property value. Indicates if links must expire, meaning the link is no longer usable after a specified time. If link expiration is enabled, a default link expiration time is provided.
     * @return a {@link SharingLinkExpirationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingLinkExpirationStatus getLinkExpiration() {
        return this.backingStore.get("linkExpiration");
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
     * Gets the retrieveLink property value. Indicates if links of this role can be retrieved.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getRetrieveLink() {
        return this.backingStore.get("retrieveLink");
    }
    /**
     * Gets the updateLink property value. Indicates if links of this role can be updated.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getUpdateLink() {
        return this.backingStore.get("updateLink");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("addExistingExternalUsers", this.getAddExistingExternalUsers());
        writer.writeObjectValue("addNewExternalUsers", this.getAddNewExternalUsers());
        writer.writeObjectValue("applyVariants", this.getApplyVariants());
        writer.writeObjectValue("createLink", this.getCreateLink());
        writer.writeObjectValue("deleteLink", this.getDeleteLink());
        writer.writeObjectValue("linkAllowsExternalUsers", this.getLinkAllowsExternalUsers());
        writer.writeObjectValue("linkExpiration", this.getLinkExpiration());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("retrieveLink", this.getRetrieveLink());
        writer.writeObjectValue("updateLink", this.getUpdateLink());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExistingExternalUsers property value. Indicates if the current user can add existing external user recipients to this sharing link.
     * @param value Value to set for the addExistingExternalUsers property.
     */
    public void setAddExistingExternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("addExistingExternalUsers", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the addNewExternalUsers property value. Indicates if the current user can add new external user recipients to this sharing link.
     * @param value Value to set for the addNewExternalUsers property.
     */
    public void setAddNewExternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("addNewExternalUsers", value);
    }
    /**
     * Sets the applyVariants property value. Indicates the status of the potential sharing link variants. If selected, it generates a separate sharing link from the sharing link that would otherwise be generated without the variant, yet with an identical role and scope.
     * @param value Value to set for the applyVariants property.
     */
    public void setApplyVariants(@jakarta.annotation.Nullable final SharingLinkVariants value) {
        this.backingStore.set("applyVariants", value);
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
     * Sets the createLink property value. Indicates if links of this role can be created.
     * @param value Value to set for the createLink property.
     */
    public void setCreateLink(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("createLink", value);
    }
    /**
     * Sets the deleteLink property value. Indicates if links of this role can be deleted.
     * @param value Value to set for the deleteLink property.
     */
    public void setDeleteLink(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("deleteLink", value);
    }
    /**
     * Sets the linkAllowsExternalUsers property value. Indicates if this link can include external users.
     * @param value Value to set for the linkAllowsExternalUsers property.
     */
    public void setLinkAllowsExternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("linkAllowsExternalUsers", value);
    }
    /**
     * Sets the linkExpiration property value. Indicates if links must expire, meaning the link is no longer usable after a specified time. If link expiration is enabled, a default link expiration time is provided.
     * @param value Value to set for the linkExpiration property.
     */
    public void setLinkExpiration(@jakarta.annotation.Nullable final SharingLinkExpirationStatus value) {
        this.backingStore.set("linkExpiration", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the retrieveLink property value. Indicates if links of this role can be retrieved.
     * @param value Value to set for the retrieveLink property.
     */
    public void setRetrieveLink(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("retrieveLink", value);
    }
    /**
     * Sets the updateLink property value. Indicates if links of this role can be updated.
     * @param value Value to set for the updateLink property.
     */
    public void setUpdateLink(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("updateLink", value);
    }
}
