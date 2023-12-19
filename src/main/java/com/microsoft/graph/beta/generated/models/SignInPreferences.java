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
public class SignInPreferences implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SignInPreferences and sets the default values.
     */
    public SignInPreferences() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignInPreferences
     */
    @jakarta.annotation.Nonnull
    public static SignInPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInPreferences();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
        deserializerMap.put("userPreferredMethodForSecondaryAuthentication", (n) -> { this.setUserPreferredMethodForSecondaryAuthentication(n.getEnumValue(SignInPreferencesUserPreferredMethodForSecondaryAuthentication::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether the credential preferences of the system are enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemPreferredAuthenticationMethodEnabled() {
        return this.backingStore.get("isSystemPreferredAuthenticationMethodEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the userPreferredMethodForSecondaryAuthentication property value. The default second-factor method used by the user when signing in. If a user is enabled for system-preferred authentication, then this value is ignored except for a few scenarios where a user is authenticating via NPS extension or ADFS adapter. Possible values are push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, and unknownFutureValue
     * @return a SignInPreferencesUserPreferredMethodForSecondaryAuthentication
     */
    @jakarta.annotation.Nullable
    public SignInPreferencesUserPreferredMethodForSecondaryAuthentication getUserPreferredMethodForSecondaryAuthentication() {
        return this.backingStore.get("userPreferredMethodForSecondaryAuthentication");
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
     * Sets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether the credential preferences of the system are enabled.
     * @param value Value to set for the isSystemPreferredAuthenticationMethodEnabled property.
     */
    public void setIsSystemPreferredAuthenticationMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSystemPreferredAuthenticationMethodEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the userPreferredMethodForSecondaryAuthentication property value. The default second-factor method used by the user when signing in. If a user is enabled for system-preferred authentication, then this value is ignored except for a few scenarios where a user is authenticating via NPS extension or ADFS adapter. Possible values are push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, and unknownFutureValue
     * @param value Value to set for the userPreferredMethodForSecondaryAuthentication property.
     */
    public void setUserPreferredMethodForSecondaryAuthentication(@jakarta.annotation.Nullable final SignInPreferencesUserPreferredMethodForSecondaryAuthentication value) {
        this.backingStore.set("userPreferredMethodForSecondaryAuthentication", value);
    }
}
