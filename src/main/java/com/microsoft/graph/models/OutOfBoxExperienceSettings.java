package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Out of box experience setting
 */
public class OutOfBoxExperienceSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The deviceUsageType property */
    private WindowsDeviceUsageType deviceUsageType;
    /** If set to true, then the user can't start over with different account, on company sign-in */
    private Boolean hideEscapeLink;
    /** Show or hide EULA to user */
    private Boolean hideEULA;
    /** Show or hide privacy settings to user */
    private Boolean hidePrivacySettings;
    /** The OdataType property */
    private String odataType;
    /** If set, then skip the keyboard selection page if Language and Region are set */
    private Boolean skipKeyboardSelectionPage;
    /** The userType property */
    private WindowsUserType userType;
    /**
     * Instantiates a new outOfBoxExperienceSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutOfBoxExperienceSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outOfBoxExperienceSettings
     */
    @javax.annotation.Nonnull
    public static OutOfBoxExperienceSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutOfBoxExperienceSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceUsageType property value. The deviceUsageType property
     * @return a windowsDeviceUsageType
     */
    @javax.annotation.Nullable
    public WindowsDeviceUsageType getDeviceUsageType() {
        return this.deviceUsageType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideEscapeLink() {
        return this.hideEscapeLink;
    }
    /**
     * Gets the hideEULA property value. Show or hide EULA to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideEULA() {
        return this.hideEULA;
    }
    /**
     * Gets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidePrivacySettings() {
        return this.hidePrivacySettings;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipKeyboardSelectionPage() {
        return this.skipKeyboardSelectionPage;
    }
    /**
     * Gets the userType property value. The userType property
     * @return a windowsUserType
     */
    @javax.annotation.Nullable
    public WindowsUserType getUserType() {
        return this.userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceUsageType property value. The deviceUsageType property
     * @param value Value to set for the deviceUsageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceUsageType(@javax.annotation.Nullable final WindowsDeviceUsageType value) {
        this.deviceUsageType = value;
    }
    /**
     * Sets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @param value Value to set for the hideEscapeLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideEscapeLink(@javax.annotation.Nullable final Boolean value) {
        this.hideEscapeLink = value;
    }
    /**
     * Sets the hideEULA property value. Show or hide EULA to user
     * @param value Value to set for the hideEULA property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideEULA(@javax.annotation.Nullable final Boolean value) {
        this.hideEULA = value;
    }
    /**
     * Sets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @param value Value to set for the hidePrivacySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidePrivacySettings(@javax.annotation.Nullable final Boolean value) {
        this.hidePrivacySettings = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @param value Value to set for the skipKeyboardSelectionPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkipKeyboardSelectionPage(@javax.annotation.Nullable final Boolean value) {
        this.skipKeyboardSelectionPage = value;
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final WindowsUserType value) {
        this.userType = value;
    }
}
