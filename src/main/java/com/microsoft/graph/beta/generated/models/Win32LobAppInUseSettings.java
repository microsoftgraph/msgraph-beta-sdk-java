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
 * Contains in-use deferral and prompt countdown settings for Required and Available Win32 app installation assignments. These settings apply only when the app&apos;s `installExperience.inUseBehavior` is `terminateWithUserInteraction`. They are not supported for Uninstall assignments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppInUseSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Win32LobAppInUseSettings} and sets the default values.
     */
    public Win32LobAppInUseSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32LobAppInUseSettings}
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppInUseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppInUseSettings();
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
     * Gets the countdownMinutes property value. Indicates the prompt countdown duration in minutes before installation is enforced. For Required assignments, the countdown starts after the final deferral and valid values are 1 to 240 (4 hours). Available assignments require a fixed value of 5.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCountdownMinutes() {
        return this.backingStore.get("countdownMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countdownMinutes", (n) -> { this.setCountdownMinutes(n.getIntegerValue()); });
        deserializerMap.put("minutesBetweenDeferrals", (n) -> { this.setMinutesBetweenDeferrals(n.getIntegerValue()); });
        deserializerMap.put("numberOfDeferrals", (n) -> { this.setNumberOfDeferrals(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minutesBetweenDeferrals property value. Indicates the duration in minutes between deferral attempts. For Required assignments, valid values are 1 to 1440 (24 hours). Available assignments require 1 as a fixed placeholder because deferrals are not supported.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinutesBetweenDeferrals() {
        return this.backingStore.get("minutesBetweenDeferrals");
    }
    /**
     * Gets the numberOfDeferrals property value. Indicates the maximum number of times the user can defer installation. For Required assignments, valid values are 0 to 5. Available assignments require 0.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfDeferrals() {
        return this.backingStore.get("numberOfDeferrals");
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
        writer.writeIntegerValue("countdownMinutes", this.getCountdownMinutes());
        writer.writeIntegerValue("minutesBetweenDeferrals", this.getMinutesBetweenDeferrals());
        writer.writeIntegerValue("numberOfDeferrals", this.getNumberOfDeferrals());
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
     * Sets the countdownMinutes property value. Indicates the prompt countdown duration in minutes before installation is enforced. For Required assignments, the countdown starts after the final deferral and valid values are 1 to 240 (4 hours). Available assignments require a fixed value of 5.
     * @param value Value to set for the countdownMinutes property.
     */
    public void setCountdownMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("countdownMinutes", value);
    }
    /**
     * Sets the minutesBetweenDeferrals property value. Indicates the duration in minutes between deferral attempts. For Required assignments, valid values are 1 to 1440 (24 hours). Available assignments require 1 as a fixed placeholder because deferrals are not supported.
     * @param value Value to set for the minutesBetweenDeferrals property.
     */
    public void setMinutesBetweenDeferrals(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minutesBetweenDeferrals", value);
    }
    /**
     * Sets the numberOfDeferrals property value. Indicates the maximum number of times the user can defer installation. For Required assignments, valid values are 0 to 5. Available assignments require 0.
     * @param value Value to set for the numberOfDeferrals property.
     */
    public void setNumberOfDeferrals(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfDeferrals", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
