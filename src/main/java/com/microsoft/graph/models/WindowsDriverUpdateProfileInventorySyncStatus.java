package com.microsoft.graph.models;

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
/**
 * A complex type to store the status of a driver and firmware profile inventory sync. The status includes the last successful sync date time and the state of the last sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDriverUpdateProfileInventorySyncStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new WindowsDriverUpdateProfileInventorySyncStatus and sets the default values.
     */
    public WindowsDriverUpdateProfileInventorySyncStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDriverUpdateProfileInventorySyncStatus
     */
    @jakarta.annotation.Nonnull
    public static WindowsDriverUpdateProfileInventorySyncStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateProfileInventorySyncStatus();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @return a WindowsDriverUpdateProfileInventorySyncState
     */
    @jakarta.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncState getDriverInventorySyncState() {
        return this.backingStore.get("driverInventorySyncState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("driverInventorySyncState", (n) -> { this.setDriverInventorySyncState(n.getEnumValue(WindowsDriverUpdateProfileInventorySyncState.class)); });
        deserializerMap.put("lastSuccessfulSyncDateTime", (n) -> { this.setLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this.backingStore.get("lastSuccessfulSyncDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeEnumValue("driverInventorySyncState", this.getDriverInventorySyncState());
        writer.writeOffsetDateTimeValue("lastSuccessfulSyncDateTime", this.getLastSuccessfulSyncDateTime());
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
     * Sets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @param value Value to set for the driverInventorySyncState property.
     */
    public void setDriverInventorySyncState(@jakarta.annotation.Nullable final WindowsDriverUpdateProfileInventorySyncState value) {
        this.backingStore.set("driverInventorySyncState", value);
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     */
    public void setLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
