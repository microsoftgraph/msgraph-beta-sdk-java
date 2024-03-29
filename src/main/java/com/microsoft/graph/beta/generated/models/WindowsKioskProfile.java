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
public class WindowsKioskProfile implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsKioskProfile} and sets the default values.
     */
    public WindowsKioskProfile() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsKioskProfile}
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskProfile();
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
     * Gets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @return a {@link WindowsKioskAppConfiguration}
     */
    @jakarta.annotation.Nullable
    public WindowsKioskAppConfiguration getAppConfiguration() {
        return this.backingStore.get("appConfiguration");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appConfiguration", (n) -> { this.setAppConfiguration(n.getObjectValue(WindowsKioskAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("profileId", (n) -> { this.setProfileId(n.getStringValue()); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        deserializerMap.put("userAccountsConfiguration", (n) -> { this.setUserAccountsConfiguration(n.getCollectionOfObjectValues(WindowsKioskUser::createFromDiscriminatorValue)); });
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
     * Gets the profileId property value. Key of the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileId() {
        return this.backingStore.get("profileId");
    }
    /**
     * Gets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.backingStore.get("profileName");
    }
    /**
     * Gets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @return a {@link java.util.List<WindowsKioskUser>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsKioskUser> getUserAccountsConfiguration() {
        return this.backingStore.get("userAccountsConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appConfiguration", this.getAppConfiguration());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("profileId", this.getProfileId());
        writer.writeStringValue("profileName", this.getProfileName());
        writer.writeCollectionOfObjectValues("userAccountsConfiguration", this.getUserAccountsConfiguration());
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
     * Sets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @param value Value to set for the appConfiguration property.
     */
    public void setAppConfiguration(@jakarta.annotation.Nullable final WindowsKioskAppConfiguration value) {
        this.backingStore.set("appConfiguration", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the profileId property value. Key of the entity.
     * @param value Value to set for the profileId property.
     */
    public void setProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileId", value);
    }
    /**
     * Sets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @param value Value to set for the profileName property.
     */
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileName", value);
    }
    /**
     * Sets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the userAccountsConfiguration property.
     */
    public void setUserAccountsConfiguration(@jakarta.annotation.Nullable final java.util.List<WindowsKioskUser> value) {
        this.backingStore.set("userAccountsConfiguration", value);
    }
}
