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
public class TeamworkFeaturesConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TeamworkFeaturesConfiguration} and sets the default values.
     */
    public TeamworkFeaturesConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkFeaturesConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkFeaturesConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkFeaturesConfiguration();
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
     * Gets the emailToSendLogsAndFeedback property value. Email address to send logs and feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailToSendLogsAndFeedback() {
        return this.backingStore.get("emailToSendLogsAndFeedback");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("emailToSendLogsAndFeedback", (n) -> { this.setEmailToSendLogsAndFeedback(n.getStringValue()); });
        deserializerMap.put("isAutoScreenShareEnabled", (n) -> { this.setIsAutoScreenShareEnabled(n.getBooleanValue()); });
        deserializerMap.put("isBluetoothBeaconingEnabled", (n) -> { this.setIsBluetoothBeaconingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isHideMeetingNamesEnabled", (n) -> { this.setIsHideMeetingNamesEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSendLogsAndFeedbackEnabled", (n) -> { this.setIsSendLogsAndFeedbackEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAutoScreenShareEnabled property value. True if auto screen shared is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutoScreenShareEnabled() {
        return this.backingStore.get("isAutoScreenShareEnabled");
    }
    /**
     * Gets the isBluetoothBeaconingEnabled property value. True if Bluetooth beaconing is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBluetoothBeaconingEnabled() {
        return this.backingStore.get("isBluetoothBeaconingEnabled");
    }
    /**
     * Gets the isHideMeetingNamesEnabled property value. True if hiding meeting names is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHideMeetingNamesEnabled() {
        return this.backingStore.get("isHideMeetingNamesEnabled");
    }
    /**
     * Gets the isSendLogsAndFeedbackEnabled property value. True if sending logs and feedback is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSendLogsAndFeedbackEnabled() {
        return this.backingStore.get("isSendLogsAndFeedbackEnabled");
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
        writer.writeStringValue("emailToSendLogsAndFeedback", this.getEmailToSendLogsAndFeedback());
        writer.writeBooleanValue("isAutoScreenShareEnabled", this.getIsAutoScreenShareEnabled());
        writer.writeBooleanValue("isBluetoothBeaconingEnabled", this.getIsBluetoothBeaconingEnabled());
        writer.writeBooleanValue("isHideMeetingNamesEnabled", this.getIsHideMeetingNamesEnabled());
        writer.writeBooleanValue("isSendLogsAndFeedbackEnabled", this.getIsSendLogsAndFeedbackEnabled());
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
     * Sets the emailToSendLogsAndFeedback property value. Email address to send logs and feedback.
     * @param value Value to set for the emailToSendLogsAndFeedback property.
     */
    public void setEmailToSendLogsAndFeedback(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailToSendLogsAndFeedback", value);
    }
    /**
     * Sets the isAutoScreenShareEnabled property value. True if auto screen shared is enabled.
     * @param value Value to set for the isAutoScreenShareEnabled property.
     */
    public void setIsAutoScreenShareEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAutoScreenShareEnabled", value);
    }
    /**
     * Sets the isBluetoothBeaconingEnabled property value. True if Bluetooth beaconing is enabled.
     * @param value Value to set for the isBluetoothBeaconingEnabled property.
     */
    public void setIsBluetoothBeaconingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBluetoothBeaconingEnabled", value);
    }
    /**
     * Sets the isHideMeetingNamesEnabled property value. True if hiding meeting names is enabled.
     * @param value Value to set for the isHideMeetingNamesEnabled property.
     */
    public void setIsHideMeetingNamesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHideMeetingNamesEnabled", value);
    }
    /**
     * Sets the isSendLogsAndFeedbackEnabled property value. True if sending logs and feedback is enabled.
     * @param value Value to set for the isSendLogsAndFeedbackEnabled property.
     */
    public void setIsSendLogsAndFeedbackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSendLogsAndFeedbackEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
