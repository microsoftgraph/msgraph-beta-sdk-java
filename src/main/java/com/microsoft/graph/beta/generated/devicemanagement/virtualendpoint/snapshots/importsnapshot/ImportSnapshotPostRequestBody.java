package com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.importsnapshot;

import com.microsoft.graph.beta.models.CloudPcSnapshotImportActionDetail;
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
public class ImportSnapshotPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ImportSnapshotPostRequestBody} and sets the default values.
     */
    public ImportSnapshotPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImportSnapshotPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ImportSnapshotPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportSnapshotPostRequestBody();
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
     * Gets the assignedUserId property value. The assignedUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedUserId() {
        return this.backingStore.get("assignedUserId");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("assignedUserId", (n) -> { this.setAssignedUserId(n.getStringValue()); });
        deserializerMap.put("sourceFiles", (n) -> { this.setSourceFiles(n.getCollectionOfObjectValues(CloudPcSnapshotImportActionDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceFiles property value. The sourceFiles property
     * @return a {@link java.util.List<CloudPcSnapshotImportActionDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSnapshotImportActionDetail> getSourceFiles() {
        return this.backingStore.get("sourceFiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedUserId", this.getAssignedUserId());
        writer.writeCollectionOfObjectValues("sourceFiles", this.getSourceFiles());
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
     * Sets the assignedUserId property value. The assignedUserId property
     * @param value Value to set for the assignedUserId property.
     */
    public void setAssignedUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedUserId", value);
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
     * Sets the sourceFiles property value. The sourceFiles property
     * @param value Value to set for the sourceFiles property.
     */
    public void setSourceFiles(@jakarta.annotation.Nullable final java.util.List<CloudPcSnapshotImportActionDetail> value) {
        this.backingStore.set("sourceFiles", value);
    }
}
