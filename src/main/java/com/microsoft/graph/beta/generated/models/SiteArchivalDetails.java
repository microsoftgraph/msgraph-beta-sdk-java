package com.microsoft.graph.beta.models;

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
public class SiteArchivalDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SiteArchivalDetails} and sets the default values.
     */
    public SiteArchivalDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteArchivalDetails}
     */
    @jakarta.annotation.Nonnull
    public static SiteArchivalDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteArchivalDetails();
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
     * Gets the archivedBy property value. The archivedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getArchivedBy() {
        return this.backingStore.get("archivedBy");
    }
    /**
     * Gets the archivedDateTime property value. The archivedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getArchivedDateTime() {
        return this.backingStore.get("archivedDateTime");
    }
    /**
     * Gets the archiveStatus property value. Represents the current archive status of the site collection. Returned only on $select.
     * @return a {@link SiteArchiveStatus}
     */
    @jakarta.annotation.Nullable
    public SiteArchiveStatus getArchiveStatus() {
        return this.backingStore.get("archiveStatus");
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
        deserializerMap.put("archivedBy", (n) -> { this.setArchivedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("archivedDateTime", (n) -> { this.setArchivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("archiveStatus", (n) -> { this.setArchiveStatus(n.getEnumValue(SiteArchiveStatus::forValue)); });
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
        writer.writeObjectValue("archivedBy", this.getArchivedBy());
        writer.writeOffsetDateTimeValue("archivedDateTime", this.getArchivedDateTime());
        writer.writeEnumValue("archiveStatus", this.getArchiveStatus());
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
     * Sets the archivedBy property value. The archivedBy property
     * @param value Value to set for the archivedBy property.
     */
    public void setArchivedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("archivedBy", value);
    }
    /**
     * Sets the archivedDateTime property value. The archivedDateTime property
     * @param value Value to set for the archivedDateTime property.
     */
    public void setArchivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("archivedDateTime", value);
    }
    /**
     * Sets the archiveStatus property value. Represents the current archive status of the site collection. Returned only on $select.
     * @param value Value to set for the archiveStatus property.
     */
    public void setArchiveStatus(@jakarta.annotation.Nullable final SiteArchiveStatus value) {
        this.backingStore.set("archiveStatus", value);
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
}
