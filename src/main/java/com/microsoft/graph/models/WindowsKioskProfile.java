package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskProfile implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The app base class used to identify the application info for the kiosk configuration */
    private WindowsKioskAppConfiguration _appConfiguration;
    /** The OdataType property */
    private String _odataType;
    /** Key of the entity. */
    private String _profileId;
    /** This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned. */
    private String _profileName;
    /** The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements. */
    private java.util.List<WindowsKioskUser> _userAccountsConfiguration;
    /**
     * Instantiates a new windowsKioskProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskProfile() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsKioskProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskProfile
     */
    @javax.annotation.Nonnull
    public static WindowsKioskProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskProfile();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @return a windowsKioskAppConfiguration
     */
    @javax.annotation.Nullable
    public WindowsKioskAppConfiguration getAppConfiguration() {
        return this._appConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("appConfiguration", (n) -> { currentObject.setAppConfiguration(n.getObjectValue(WindowsKioskAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("profileId", (n) -> { currentObject.setProfileId(n.getStringValue()); });
        deserializerMap.put("profileName", (n) -> { currentObject.setProfileName(n.getStringValue()); });
        deserializerMap.put("userAccountsConfiguration", (n) -> { currentObject.setUserAccountsConfiguration(n.getCollectionOfObjectValues(WindowsKioskUser::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the profileId property value. Key of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileId() {
        return this._profileId;
    }
    /**
     * Gets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this._profileName;
    }
    /**
     * Gets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @return a windowsKioskUser
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsKioskUser> getUserAccountsConfiguration() {
        return this._userAccountsConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appConfiguration property value. The app base class used to identify the application info for the kiosk configuration
     * @param value Value to set for the appConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppConfiguration(@javax.annotation.Nullable final WindowsKioskAppConfiguration value) {
        this._appConfiguration = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the profileId property value. Key of the entity.
     * @param value Value to set for the profileId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileId(@javax.annotation.Nullable final String value) {
        this._profileId = value;
    }
    /**
     * Sets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @param value Value to set for the profileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this._profileName = value;
    }
    /**
     * Sets the userAccountsConfiguration property value. The user accounts that will be locked to this kiosk configuration. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the userAccountsConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccountsConfiguration(@javax.annotation.Nullable final java.util.List<WindowsKioskUser> value) {
        this._userAccountsConfiguration = value;
    }
}
