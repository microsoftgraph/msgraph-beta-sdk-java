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
public class DirectSharingAbilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DirectSharingAbilities} and sets the default values.
     */
    public DirectSharingAbilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectSharingAbilities}
     */
    @jakarta.annotation.Nonnull
    public static DirectSharingAbilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectSharingAbilities();
    }
    /**
     * Gets the addExistingExternalUsers property value. Indicates whether the current user can add existing guest recipients to this item using direct sharing.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAddExistingExternalUsers() {
        return this.backingStore.get("addExistingExternalUsers");
    }
    /**
     * Gets the addInternalUsers property value. Indicates whether the current user can add internal recipients to this item using direct sharing.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAddInternalUsers() {
        return this.backingStore.get("addInternalUsers");
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
     * Gets the addNewExternalUsers property value. Indicates whether the current user can add new guest recipients to this item using direct sharing.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAddNewExternalUsers() {
        return this.backingStore.get("addNewExternalUsers");
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
        deserializerMap.put("addExistingExternalUsers", (n) -> { this.setAddExistingExternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("addInternalUsers", (n) -> { this.setAddInternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("addNewExternalUsers", (n) -> { this.setAddNewExternalUsers(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("requestGrantAccess", (n) -> { this.setRequestGrantAccess(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the requestGrantAccess property value. Indicates whether the user querying this endpoint can request access for the user or on behalf of other users, after which, site admins, can approve or deny the creation of a potential sharing link.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getRequestGrantAccess() {
        return this.backingStore.get("requestGrantAccess");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("addExistingExternalUsers", this.getAddExistingExternalUsers());
        writer.writeObjectValue("addInternalUsers", this.getAddInternalUsers());
        writer.writeObjectValue("addNewExternalUsers", this.getAddNewExternalUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("requestGrantAccess", this.getRequestGrantAccess());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExistingExternalUsers property value. Indicates whether the current user can add existing guest recipients to this item using direct sharing.
     * @param value Value to set for the addExistingExternalUsers property.
     */
    public void setAddExistingExternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("addExistingExternalUsers", value);
    }
    /**
     * Sets the addInternalUsers property value. Indicates whether the current user can add internal recipients to this item using direct sharing.
     * @param value Value to set for the addInternalUsers property.
     */
    public void setAddInternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("addInternalUsers", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the addNewExternalUsers property value. Indicates whether the current user can add new guest recipients to this item using direct sharing.
     * @param value Value to set for the addNewExternalUsers property.
     */
    public void setAddNewExternalUsers(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("addNewExternalUsers", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the requestGrantAccess property value. Indicates whether the user querying this endpoint can request access for the user or on behalf of other users, after which, site admins, can approve or deny the creation of a potential sharing link.
     * @param value Value to set for the requestGrantAccess property.
     */
    public void setRequestGrantAccess(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("requestGrantAccess", value);
    }
}
