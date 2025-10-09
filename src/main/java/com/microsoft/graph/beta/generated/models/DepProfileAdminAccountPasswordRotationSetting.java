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
/**
 * Settings for local admin account password automatic rotation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepProfileAdminAccountPasswordRotationSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DepProfileAdminAccountPasswordRotationSetting} and sets the default values.
     */
    public DepProfileAdminAccountPasswordRotationSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DepProfileAdminAccountPasswordRotationSetting}
     */
    @jakarta.annotation.Nonnull
    public static DepProfileAdminAccountPasswordRotationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepProfileAdminAccountPasswordRotationSetting();
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
     * Gets the autoRotationPeriodInDays property value. Indicates the number of days between 1-180 since the last rotation after which to rotate the local admin password.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAutoRotationPeriodInDays() {
        return this.backingStore.get("autoRotationPeriodInDays");
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
     * Gets the depProfileDelayAutoRotationSetting property value. Settings for delaying automatic password rotation upon retrieval.
     * @return a {@link DepProfileDelayAutoRotationSetting}
     */
    @jakarta.annotation.Nullable
    public DepProfileDelayAutoRotationSetting getDepProfileDelayAutoRotationSetting() {
        return this.backingStore.get("depProfileDelayAutoRotationSetting");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("autoRotationPeriodInDays", (n) -> { this.setAutoRotationPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("depProfileDelayAutoRotationSetting", (n) -> { this.setDepProfileDelayAutoRotationSetting(n.getObjectValue(DepProfileDelayAutoRotationSetting::createFromDiscriminatorValue)); });
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
        writer.writeIntegerValue("autoRotationPeriodInDays", this.getAutoRotationPeriodInDays());
        writer.writeObjectValue("depProfileDelayAutoRotationSetting", this.getDepProfileDelayAutoRotationSetting());
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
     * Sets the autoRotationPeriodInDays property value. Indicates the number of days between 1-180 since the last rotation after which to rotate the local admin password.
     * @param value Value to set for the autoRotationPeriodInDays property.
     */
    public void setAutoRotationPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("autoRotationPeriodInDays", value);
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
     * Sets the depProfileDelayAutoRotationSetting property value. Settings for delaying automatic password rotation upon retrieval.
     * @param value Value to set for the depProfileDelayAutoRotationSetting property.
     */
    public void setDepProfileDelayAutoRotationSetting(@jakarta.annotation.Nullable final DepProfileDelayAutoRotationSetting value) {
        this.backingStore.set("depProfileDelayAutoRotationSetting", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
