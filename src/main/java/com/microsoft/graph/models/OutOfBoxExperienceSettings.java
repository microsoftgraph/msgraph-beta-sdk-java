package com.microsoft.graph.models;

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
    private BackingStore BackingStore;
    /**
     * Instantiates a new OutOfBoxExperienceSettings and sets the default values.
     */
    public OutOfBoxExperienceSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OutOfBoxExperienceSettings
     */
    @jakarta.annotation.Nonnull
    public static OutOfBoxExperienceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutOfBoxExperienceSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the deviceUsageType property value. The deviceUsageType property
     * @return a WindowsDeviceUsageType
     */
    @jakarta.annotation.Nullable
    public WindowsDeviceUsageType getDeviceUsageType() {
        return this.BackingStore.get("deviceUsageType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("deviceUsageType", (n) -> { this.setDeviceUsageType(n.getEnumValue(WindowsDeviceUsageType.class)); });
        deserializerMap.put("hideEscapeLink", (n) -> { this.setHideEscapeLink(n.getBooleanValue()); });
        deserializerMap.put("hideEULA", (n) -> { this.setHideEULA(n.getBooleanValue()); });
        deserializerMap.put("hidePrivacySettings", (n) -> { this.setHidePrivacySettings(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skipKeyboardSelectionPage", (n) -> { this.setSkipKeyboardSelectionPage(n.getBooleanValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(WindowsUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideEscapeLink() {
        return this.BackingStore.get("hideEscapeLink");
    }
    /**
     * Gets the hideEULA property value. Show or hide EULA to user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideEULA() {
        return this.BackingStore.get("hideEULA");
    }
    /**
     * Gets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidePrivacySettings() {
        return this.BackingStore.get("hidePrivacySettings");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipKeyboardSelectionPage() {
        return this.BackingStore.get("skipKeyboardSelectionPage");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a WindowsUserType
     */
    @jakarta.annotation.Nullable
    public WindowsUserType getUserType() {
        return this.BackingStore.get("userType");
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
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the deviceUsageType property value. The deviceUsageType property
     * @param value Value to set for the deviceUsageType property.
     */
    public void setDeviceUsageType(@jakarta.annotation.Nullable final WindowsDeviceUsageType value) {
        this.BackingStore.set("deviceUsageType", value);
    }
    /**
     * Sets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @param value Value to set for the hideEscapeLink property.
     */
    public void setHideEscapeLink(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideEscapeLink", value);
    }
    /**
     * Sets the hideEULA property value. Show or hide EULA to user
     * @param value Value to set for the hideEULA property.
     */
    public void setHideEULA(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideEULA", value);
    }
    /**
     * Sets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @param value Value to set for the hidePrivacySettings property.
     */
    public void setHidePrivacySettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hidePrivacySettings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @param value Value to set for the skipKeyboardSelectionPage property.
     */
    public void setSkipKeyboardSelectionPage(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("skipKeyboardSelectionPage", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final WindowsUserType value) {
        this.BackingStore.set("userType", value);
    }
}
