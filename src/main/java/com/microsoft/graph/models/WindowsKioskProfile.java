package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskProfile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The app base class used to identify the application info for the kiosk configuration
     */
    private WindowsKioskAppConfiguration appConfiguration;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Key of the entity.
     */
    private String profileId;
    /**
     * This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     */
    private String profileName;
    /**
     * The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     */
    private java.util.List<WindowsKioskUser> userAccountsConfiguration;
    /**
     * Instantiates a new windowsKioskProfile and sets the default values.
     */
    public WindowsKioskProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskProfile
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskProfile();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @return a windowsKioskAppConfiguration
     */
    @jakarta.annotation.Nullable
    public WindowsKioskAppConfiguration getAppConfiguration() {
        return this.appConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the profileId property value. Key of the entity.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProfileId() {
        return this.profileId;
    }
    /**
     * Gets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.profileName;
    }
    /**
     * Gets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @return a windowsKioskUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsKioskUser> getUserAccountsConfiguration() {
        return this.userAccountsConfiguration;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @param value Value to set for the appConfiguration property.
     */
    public void setAppConfiguration(@jakarta.annotation.Nullable final WindowsKioskAppConfiguration value) {
        this.appConfiguration = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the profileId property value. Key of the entity.
     * @param value Value to set for the profileId property.
     */
    public void setProfileId(@jakarta.annotation.Nullable final String value) {
        this.profileId = value;
    }
    /**
     * Sets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @param value Value to set for the profileName property.
     */
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.profileName = value;
    }
    /**
     * Sets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the userAccountsConfiguration property.
     */
    public void setUserAccountsConfiguration(@jakarta.annotation.Nullable final java.util.List<WindowsKioskUser> value) {
        this.userAccountsConfiguration = value;
    }
}
