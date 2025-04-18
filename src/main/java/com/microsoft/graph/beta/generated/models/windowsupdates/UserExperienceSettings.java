package com.microsoft.graph.beta.models.windowsupdates;

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
public class UserExperienceSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserExperienceSettings} and sets the default values.
     */
    public UserExperienceSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceSettings}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceSettings();
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
     * Gets the daysUntilForcedReboot property value. Specifies the number of days after an update is installed, during which the user of the device can control when the device restarts.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDaysUntilForcedReboot() {
        return this.backingStore.get("daysUntilForcedReboot");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("daysUntilForcedReboot", (n) -> { this.setDaysUntilForcedReboot(n.getIntegerValue()); });
        deserializerMap.put("isHotpatchEnabled", (n) -> { this.setIsHotpatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offerAsOptional", (n) -> { this.setOfferAsOptional(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHotpatchEnabled property value. Specifies whether the update is offered as a hotpatch. It can only be set to true on automatic policies that target monthly security updates.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHotpatchEnabled() {
        return this.backingStore.get("isHotpatchEnabled");
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
     * Gets the offerAsOptional property value. Specifies whether the update is offered as Optional rather than Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOfferAsOptional() {
        return this.backingStore.get("offerAsOptional");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("daysUntilForcedReboot", this.getDaysUntilForcedReboot());
        writer.writeBooleanValue("isHotpatchEnabled", this.getIsHotpatchEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("offerAsOptional", this.getOfferAsOptional());
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
     * Sets the daysUntilForcedReboot property value. Specifies the number of days after an update is installed, during which the user of the device can control when the device restarts.
     * @param value Value to set for the daysUntilForcedReboot property.
     */
    public void setDaysUntilForcedReboot(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("daysUntilForcedReboot", value);
    }
    /**
     * Sets the isHotpatchEnabled property value. Specifies whether the update is offered as a hotpatch. It can only be set to true on automatic policies that target monthly security updates.
     * @param value Value to set for the isHotpatchEnabled property.
     */
    public void setIsHotpatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHotpatchEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the offerAsOptional property value. Specifies whether the update is offered as Optional rather than Required.
     * @param value Value to set for the offerAsOptional property.
     */
    public void setOfferAsOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("offerAsOptional", value);
    }
}
