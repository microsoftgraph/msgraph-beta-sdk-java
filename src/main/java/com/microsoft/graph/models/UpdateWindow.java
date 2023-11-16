package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateWindow implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new UpdateWindow and sets the default values.
     */
    public UpdateWindow() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateWindow
     */
    @jakarta.annotation.Nonnull
    public static UpdateWindow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindow();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("updateWindowEndTime", (n) -> { this.setUpdateWindowEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("updateWindowStartTime", (n) -> { this.setUpdateWindowStartTime(n.getLocalTimeValue()); });
        return deserializerMap;
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
     * Gets the updateWindowEndTime property value. End of a time window during which agents can receive updates
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpdateWindowEndTime() {
        return this.backingStore.get("updateWindowEndTime");
    }
    /**
     * Gets the updateWindowStartTime property value. Start of a time window during which agents can receive updates
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpdateWindowStartTime() {
        return this.backingStore.get("updateWindowStartTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("updateWindowEndTime", this.getUpdateWindowEndTime());
        writer.writeLocalTimeValue("updateWindowStartTime", this.getUpdateWindowStartTime());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the updateWindowEndTime property value. End of a time window during which agents can receive updates
     * @param value Value to set for the updateWindowEndTime property.
     */
    public void setUpdateWindowEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("updateWindowEndTime", value);
    }
    /**
     * Sets the updateWindowStartTime property value. Start of a time window during which agents can receive updates
     * @param value Value to set for the updateWindowStartTime property.
     */
    public void setUpdateWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("updateWindowStartTime", value);
    }
}
