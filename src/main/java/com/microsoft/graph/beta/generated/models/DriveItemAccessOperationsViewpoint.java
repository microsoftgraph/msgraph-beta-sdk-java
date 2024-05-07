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
public class DriveItemAccessOperationsViewpoint implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DriveItemAccessOperationsViewpoint} and sets the default values.
     */
    public DriveItemAccessOperationsViewpoint() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveItemAccessOperationsViewpoint}
     */
    @jakarta.annotation.Nonnull
    public static DriveItemAccessOperationsViewpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItemAccessOperationsViewpoint();
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
     * Gets the canComment property value. Indicates whether the user can comment on this item.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanComment() {
        return this.backingStore.get("canComment");
    }
    /**
     * Gets the canCreateFile property value. Indicates whether the user can create files within this object. Returned only on folders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanCreateFile() {
        return this.backingStore.get("canCreateFile");
    }
    /**
     * Gets the canCreateFolder property value. Indicates whether the user can create folders within this object. Returned only on folders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanCreateFolder() {
        return this.backingStore.get("canCreateFolder");
    }
    /**
     * Gets the canDelete property value. Indicates whether the user can delete this item.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanDelete() {
        return this.backingStore.get("canDelete");
    }
    /**
     * Gets the canDownload property value. Indicates whether the user can download this item.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanDownload() {
        return this.backingStore.get("canDownload");
    }
    /**
     * Gets the canRead property value. Indicates whether the user can read this item.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanRead() {
        return this.backingStore.get("canRead");
    }
    /**
     * Gets the canUpdate property value. Indicates whether the user can update this item.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanUpdate() {
        return this.backingStore.get("canUpdate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("canComment", (n) -> { this.setCanComment(n.getBooleanValue()); });
        deserializerMap.put("canCreateFile", (n) -> { this.setCanCreateFile(n.getBooleanValue()); });
        deserializerMap.put("canCreateFolder", (n) -> { this.setCanCreateFolder(n.getBooleanValue()); });
        deserializerMap.put("canDelete", (n) -> { this.setCanDelete(n.getBooleanValue()); });
        deserializerMap.put("canDownload", (n) -> { this.setCanDownload(n.getBooleanValue()); });
        deserializerMap.put("canRead", (n) -> { this.setCanRead(n.getBooleanValue()); });
        deserializerMap.put("canUpdate", (n) -> { this.setCanUpdate(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("canComment", this.getCanComment());
        writer.writeBooleanValue("canCreateFile", this.getCanCreateFile());
        writer.writeBooleanValue("canCreateFolder", this.getCanCreateFolder());
        writer.writeBooleanValue("canDelete", this.getCanDelete());
        writer.writeBooleanValue("canDownload", this.getCanDownload());
        writer.writeBooleanValue("canRead", this.getCanRead());
        writer.writeBooleanValue("canUpdate", this.getCanUpdate());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the canComment property value. Indicates whether the user can comment on this item.
     * @param value Value to set for the canComment property.
     */
    public void setCanComment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canComment", value);
    }
    /**
     * Sets the canCreateFile property value. Indicates whether the user can create files within this object. Returned only on folders.
     * @param value Value to set for the canCreateFile property.
     */
    public void setCanCreateFile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canCreateFile", value);
    }
    /**
     * Sets the canCreateFolder property value. Indicates whether the user can create folders within this object. Returned only on folders.
     * @param value Value to set for the canCreateFolder property.
     */
    public void setCanCreateFolder(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canCreateFolder", value);
    }
    /**
     * Sets the canDelete property value. Indicates whether the user can delete this item.
     * @param value Value to set for the canDelete property.
     */
    public void setCanDelete(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canDelete", value);
    }
    /**
     * Sets the canDownload property value. Indicates whether the user can download this item.
     * @param value Value to set for the canDownload property.
     */
    public void setCanDownload(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canDownload", value);
    }
    /**
     * Sets the canRead property value. Indicates whether the user can read this item.
     * @param value Value to set for the canRead property.
     */
    public void setCanRead(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canRead", value);
    }
    /**
     * Sets the canUpdate property value. Indicates whether the user can update this item.
     * @param value Value to set for the canUpdate property.
     */
    public void setCanUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canUpdate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
