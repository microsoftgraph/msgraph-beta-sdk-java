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
 * Out of box experience setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutOfBoxExperienceSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OutOfBoxExperienceSettings} and sets the default values.
     */
    public OutOfBoxExperienceSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutOfBoxExperienceSettings}
     */
    @jakarta.annotation.Nonnull
    public static OutOfBoxExperienceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutOfBoxExperienceSettings();
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
     * Gets the deviceUsageType property value. The deviceUsageType property
     * @return a {@link WindowsDeviceUsageType}
     */
    @jakarta.annotation.Nullable
    public WindowsDeviceUsageType getDeviceUsageType() {
        return this.backingStore.get("deviceUsageType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("deviceUsageType", (n) -> { this.setDeviceUsageType(n.getEnumValue(WindowsDeviceUsageType::forValue)); });
        deserializerMap.put("hideEscapeLink", (n) -> { this.setHideEscapeLink(n.getBooleanValue()); });
        deserializerMap.put("hideEULA", (n) -> { this.setHideEULA(n.getBooleanValue()); });
        deserializerMap.put("hidePrivacySettings", (n) -> { this.setHidePrivacySettings(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skipKeyboardSelectionPage", (n) -> { this.setSkipKeyboardSelectionPage(n.getBooleanValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(WindowsUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHideEscapeLink() {
        return this.backingStore.get("hideEscapeLink");
    }
    /**
     * Gets the hideEULA property value. Show or hide EULA to user
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHideEULA() {
        return this.backingStore.get("hideEULA");
    }
    /**
     * Gets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHidePrivacySettings() {
        return this.backingStore.get("hidePrivacySettings");
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
     * Gets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipKeyboardSelectionPage() {
        return this.backingStore.get("skipKeyboardSelectionPage");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link WindowsUserType}
     */
    @jakarta.annotation.Nullable
    public WindowsUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceUsageType", this.getDeviceUsageType());
        writer.writeBooleanValue("hideEscapeLink", this.getHideEscapeLink());
        writer.writeBooleanValue("hideEULA", this.getHideEULA());
        writer.writeBooleanValue("hidePrivacySettings", this.getHidePrivacySettings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("skipKeyboardSelectionPage", this.getSkipKeyboardSelectionPage());
        writer.writeEnumValue("userType", this.getUserType());
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
     * Sets the deviceUsageType property value. The deviceUsageType property
     * @param value Value to set for the deviceUsageType property.
     */
    public void setDeviceUsageType(@jakarta.annotation.Nullable final WindowsDeviceUsageType value) {
        this.backingStore.set("deviceUsageType", value);
    }
    /**
     * Sets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @param value Value to set for the hideEscapeLink property.
     */
    public void setHideEscapeLink(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideEscapeLink", value);
    }
    /**
     * Sets the hideEULA property value. Show or hide EULA to user
     * @param value Value to set for the hideEULA property.
     */
    public void setHideEULA(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideEULA", value);
    }
    /**
     * Sets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @param value Value to set for the hidePrivacySettings property.
     */
    public void setHidePrivacySettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hidePrivacySettings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @param value Value to set for the skipKeyboardSelectionPage property.
     */
    public void setSkipKeyboardSelectionPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("skipKeyboardSelectionPage", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final WindowsUserType value) {
        this.backingStore.set("userType", value);
    }
}
