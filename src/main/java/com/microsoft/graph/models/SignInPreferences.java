package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the credential preferences of the system are enabled.
     */
    private Boolean isSystemPreferredAuthenticationMethodEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The default second-factor method used by the user when signing in. If a user is enabled for system-preferred authentication, then this value is ignored except for a few scenarios where a user is authenticating via NPS extension or ADFS adapter. Possible values are push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, and unknownFutureValue
     */
    private UserDefaultAuthenticationMethodType userPreferredMethodForSecondaryAuthentication;
    /**
     * Instantiates a new signInPreferences and sets the default values.
     */
    public SignInPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signInPreferences
     */
    @jakarta.annotation.Nonnull
    public static SignInPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInPreferences();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isSystemPreferredAuthenticationMethodEnabled", (n) -> { this.setIsSystemPreferredAuthenticationMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userPreferredMethodForSecondaryAuthentication", (n) -> { this.setUserPreferredMethodForSecondaryAuthentication(n.getEnumValue(UserDefaultAuthenticationMethodType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether the credential preferences of the system are enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemPreferredAuthenticationMethodEnabled() {
        return this.isSystemPreferredAuthenticationMethodEnabled;
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
     * Gets the userPreferredMethodForSecondaryAuthentication property value. The default second-factor method used by the user when signing in. If a user is enabled for system-preferred authentication, then this value is ignored except for a few scenarios where a user is authenticating via NPS extension or ADFS adapter. Possible values are push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, and unknownFutureValue
     * @return a userDefaultAuthenticationMethodType
     */
    @jakarta.annotation.Nullable
    public UserDefaultAuthenticationMethodType getUserPreferredMethodForSecondaryAuthentication() {
        return this.userPreferredMethodForSecondaryAuthentication;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isSystemPreferredAuthenticationMethodEnabled", this.getIsSystemPreferredAuthenticationMethodEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("userPreferredMethodForSecondaryAuthentication", this.getUserPreferredMethodForSecondaryAuthentication());
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
     * Sets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether the credential preferences of the system are enabled.
     * @param value Value to set for the isSystemPreferredAuthenticationMethodEnabled property.
     */
    public void setIsSystemPreferredAuthenticationMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSystemPreferredAuthenticationMethodEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userPreferredMethodForSecondaryAuthentication property value. The default second-factor method used by the user when signing in. If a user is enabled for system-preferred authentication, then this value is ignored except for a few scenarios where a user is authenticating via NPS extension or ADFS adapter. Possible values are push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, and unknownFutureValue
     * @param value Value to set for the userPreferredMethodForSecondaryAuthentication property.
     */
    public void setUserPreferredMethodForSecondaryAuthentication(@jakarta.annotation.Nullable final UserDefaultAuthenticationMethodType value) {
        this.userPreferredMethodForSecondaryAuthentication = value;
    }
}
