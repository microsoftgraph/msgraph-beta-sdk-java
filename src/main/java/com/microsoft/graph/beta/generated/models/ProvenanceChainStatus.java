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
public class ProvenanceChainStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ProvenanceChainStatus} and sets the default values.
     */
    public ProvenanceChainStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvenanceChainStatus}
     */
    @jakarta.annotation.Nonnull
    public static ProvenanceChainStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvenanceChainStatus();
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
     * Gets the breakDetectedAtDateTime property value. The date and time when the service detected that the chain of trust was broken.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBreakDetectedAtDateTime() {
        return this.backingStore.get("breakDetectedAtDateTime");
    }
    /**
     * Gets the breakReason property value. The breakReason property
     * @return a {@link ChainBreakReason}
     */
    @jakarta.annotation.Nullable
    public ChainBreakReason getBreakReason() {
        return this.backingStore.get("breakReason");
    }
    /**
     * Gets the breakSource property value. The breakSource property
     * @return a {@link ChainBreakSource}
     */
    @jakarta.annotation.Nullable
    public ChainBreakSource getBreakSource() {
        return this.backingStore.get("breakSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("breakDetectedAtDateTime", (n) -> { this.setBreakDetectedAtDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("breakReason", (n) -> { this.setBreakReason(n.getEnumValue(ChainBreakReason::forValue)); });
        deserializerMap.put("breakSource", (n) -> { this.setBreakSource(n.getEnumValue(ChainBreakSource::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ChainState::forValue)); });
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
     * Gets the state property value. The state property
     * @return a {@link ChainState}
     */
    @jakarta.annotation.Nullable
    public ChainState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("breakDetectedAtDateTime", this.getBreakDetectedAtDateTime());
        writer.writeEnumValue("breakReason", this.getBreakReason());
        writer.writeEnumValue("breakSource", this.getBreakSource());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the breakDetectedAtDateTime property value. The date and time when the service detected that the chain of trust was broken.
     * @param value Value to set for the breakDetectedAtDateTime property.
     */
    public void setBreakDetectedAtDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("breakDetectedAtDateTime", value);
    }
    /**
     * Sets the breakReason property value. The breakReason property
     * @param value Value to set for the breakReason property.
     */
    public void setBreakReason(@jakarta.annotation.Nullable final ChainBreakReason value) {
        this.backingStore.set("breakReason", value);
    }
    /**
     * Sets the breakSource property value. The breakSource property
     * @param value Value to set for the breakSource property.
     */
    public void setBreakSource(@jakarta.annotation.Nullable final ChainBreakSource value) {
        this.backingStore.set("breakSource", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ChainState value) {
        this.backingStore.set("state", value);
    }
}
