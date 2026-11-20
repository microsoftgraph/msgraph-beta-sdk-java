package com.microsoft.graph.beta.models.identitygovernance;

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
public class LifecyclePolicyScopeProcessing implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LifecyclePolicyScopeProcessing} and sets the default values.
     */
    public LifecyclePolicyScopeProcessing() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicyScopeProcessing}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicyScopeProcessing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicyScopeProcessing();
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
     * Gets the currentStartedDateTime property value. The date and time when the current scope-processing operation started.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCurrentStartedDateTime() {
        return this.backingStore.get("currentStartedDateTime");
    }
    /**
     * Gets the currentStatus property value. The currentStatus property
     * @return a {@link LifecyclePolicyScopeProcessingStatus}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyScopeProcessingStatus getCurrentStatus() {
        return this.backingStore.get("currentStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("currentStartedDateTime", (n) -> { this.setCurrentStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentStatus", (n) -> { this.setCurrentStatus(n.getEnumValue(LifecyclePolicyScopeProcessingStatus::forValue)); });
        deserializerMap.put("lastSuccessfulProcessingDateTime", (n) -> { this.setLastSuccessfulProcessingDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("latestAttempt", (n) -> { this.setLatestAttempt(n.getObjectValue(LifecyclePolicyScopeProcessingAttempt::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSuccessfulProcessingDateTime property value. The date and time when scope processing last completed successfully.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulProcessingDateTime() {
        return this.backingStore.get("lastSuccessfulProcessingDateTime");
    }
    /**
     * Gets the latestAttempt property value. The latest retained scope-processing attempt.
     * @return a {@link LifecyclePolicyScopeProcessingAttempt}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyScopeProcessingAttempt getLatestAttempt() {
        return this.backingStore.get("latestAttempt");
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
        writer.writeOffsetDateTimeValue("currentStartedDateTime", this.getCurrentStartedDateTime());
        writer.writeEnumValue("currentStatus", this.getCurrentStatus());
        writer.writeOffsetDateTimeValue("lastSuccessfulProcessingDateTime", this.getLastSuccessfulProcessingDateTime());
        writer.writeObjectValue("latestAttempt", this.getLatestAttempt());
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
     * Sets the currentStartedDateTime property value. The date and time when the current scope-processing operation started.
     * @param value Value to set for the currentStartedDateTime property.
     */
    public void setCurrentStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("currentStartedDateTime", value);
    }
    /**
     * Sets the currentStatus property value. The currentStatus property
     * @param value Value to set for the currentStatus property.
     */
    public void setCurrentStatus(@jakarta.annotation.Nullable final LifecyclePolicyScopeProcessingStatus value) {
        this.backingStore.set("currentStatus", value);
    }
    /**
     * Sets the lastSuccessfulProcessingDateTime property value. The date and time when scope processing last completed successfully.
     * @param value Value to set for the lastSuccessfulProcessingDateTime property.
     */
    public void setLastSuccessfulProcessingDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSuccessfulProcessingDateTime", value);
    }
    /**
     * Sets the latestAttempt property value. The latest retained scope-processing attempt.
     * @param value Value to set for the latestAttempt property.
     */
    public void setLatestAttempt(@jakarta.annotation.Nullable final LifecyclePolicyScopeProcessingAttempt value) {
        this.backingStore.set("latestAttempt", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
