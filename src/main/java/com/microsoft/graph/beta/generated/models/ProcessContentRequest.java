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
public class ProcessContentRequest implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ProcessContentRequest} and sets the default values.
     */
    public ProcessContentRequest() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessContentRequest}
     */
    @jakarta.annotation.Nonnull
    public static ProcessContentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessContentRequest();
    }
    /**
     * Gets the activityMetadata property value. The activityMetadata property
     * @return a {@link ActivityMetadata}
     */
    @jakarta.annotation.Nullable
    public ActivityMetadata getActivityMetadata() {
        return this.backingStore.get("activityMetadata");
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
     * Gets the contentEntries property value. The contentEntries property
     * @return a {@link java.util.List<ProcessContentMetadataBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProcessContentMetadataBase> getContentEntries() {
        return this.backingStore.get("contentEntries");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activityMetadata", (n) -> { this.setActivityMetadata(n.getObjectValue(ActivityMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("contentEntries", (n) -> { this.setContentEntries(n.getCollectionOfObjectValues(ProcessContentMetadataBase::createFromDiscriminatorValue)); });
        deserializerMap.put("integratedAppMetadata", (n) -> { this.setIntegratedAppMetadata(n.getObjectValue(IntegratedApplicationMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protectedAppMetadata", (n) -> { this.setProtectedAppMetadata(n.getObjectValue(ProtectedApplicationMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integratedAppMetadata property value. The integratedAppMetadata property
     * @return a {@link IntegratedApplicationMetadata}
     */
    @jakarta.annotation.Nullable
    public IntegratedApplicationMetadata getIntegratedAppMetadata() {
        return this.backingStore.get("integratedAppMetadata");
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
     * Gets the protectedAppMetadata property value. The protectedAppMetadata property
     * @return a {@link ProtectedApplicationMetadata}
     */
    @jakarta.annotation.Nullable
    public ProtectedApplicationMetadata getProtectedAppMetadata() {
        return this.backingStore.get("protectedAppMetadata");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("activityMetadata", this.getActivityMetadata());
        writer.writeCollectionOfObjectValues("contentEntries", this.getContentEntries());
        writer.writeObjectValue("integratedAppMetadata", this.getIntegratedAppMetadata());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("protectedAppMetadata", this.getProtectedAppMetadata());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityMetadata property value. The activityMetadata property
     * @param value Value to set for the activityMetadata property.
     */
    public void setActivityMetadata(@jakarta.annotation.Nullable final ActivityMetadata value) {
        this.backingStore.set("activityMetadata", value);
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
     * Sets the contentEntries property value. The contentEntries property
     * @param value Value to set for the contentEntries property.
     */
    public void setContentEntries(@jakarta.annotation.Nullable final java.util.List<ProcessContentMetadataBase> value) {
        this.backingStore.set("contentEntries", value);
    }
    /**
     * Sets the integratedAppMetadata property value. The integratedAppMetadata property
     * @param value Value to set for the integratedAppMetadata property.
     */
    public void setIntegratedAppMetadata(@jakarta.annotation.Nullable final IntegratedApplicationMetadata value) {
        this.backingStore.set("integratedAppMetadata", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the protectedAppMetadata property value. The protectedAppMetadata property
     * @param value Value to set for the protectedAppMetadata property.
     */
    public void setProtectedAppMetadata(@jakarta.annotation.Nullable final ProtectedApplicationMetadata value) {
        this.backingStore.set("protectedAppMetadata", value);
    }
}
