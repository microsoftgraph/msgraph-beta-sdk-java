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
public class MicrosoftAuthenticatorFeatureSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MicrosoftAuthenticatorFeatureSettings} and sets the default values.
     */
    public MicrosoftAuthenticatorFeatureSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftAuthenticatorFeatureSettings}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorFeatureSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorFeatureSettings();
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
     * Gets the companionAppAllowedState property value. Determines whether users are able to approve push notifications on other Microsoft applications such as Outlook Mobile.
     * @return a {@link AuthenticationMethodFeatureConfiguration}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getCompanionAppAllowedState() {
        return this.backingStore.get("companionAppAllowedState");
    }
    /**
     * Gets the displayAppInformationRequiredState property value. Determines whether the user&apos;s Authenticator app shows them the client app they&apos;re signing into.
     * @return a {@link AuthenticationMethodFeatureConfiguration}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayAppInformationRequiredState() {
        return this.backingStore.get("displayAppInformationRequiredState");
    }
    /**
     * Gets the displayLocationInformationRequiredState property value. Determines whether the user&apos;s Authenticator app shows them the geographic location of where the authentication request originated from.
     * @return a {@link AuthenticationMethodFeatureConfiguration}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayLocationInformationRequiredState() {
        return this.backingStore.get("displayLocationInformationRequiredState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("companionAppAllowedState", (n) -> { this.setCompanionAppAllowedState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("displayAppInformationRequiredState", (n) -> { this.setDisplayAppInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("displayLocationInformationRequiredState", (n) -> { this.setDisplayLocationInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("numberMatchingRequiredState", (n) -> { this.setNumberMatchingRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the numberMatchingRequiredState property value. Specifies whether the user needs to enter a number in the Authenticator app from the login screen to complete their login. Value is ignored for phone sign-in notifications.
     * @return a {@link AuthenticationMethodFeatureConfiguration}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getNumberMatchingRequiredState() {
        return this.backingStore.get("numberMatchingRequiredState");
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
        writer.writeObjectValue("companionAppAllowedState", this.getCompanionAppAllowedState());
        writer.writeObjectValue("displayAppInformationRequiredState", this.getDisplayAppInformationRequiredState());
        writer.writeObjectValue("displayLocationInformationRequiredState", this.getDisplayLocationInformationRequiredState());
        writer.writeObjectValue("numberMatchingRequiredState", this.getNumberMatchingRequiredState());
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
     * Sets the companionAppAllowedState property value. Determines whether users are able to approve push notifications on other Microsoft applications such as Outlook Mobile.
     * @param value Value to set for the companionAppAllowedState property.
     */
    public void setCompanionAppAllowedState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.backingStore.set("companionAppAllowedState", value);
    }
    /**
     * Sets the displayAppInformationRequiredState property value. Determines whether the user&apos;s Authenticator app shows them the client app they&apos;re signing into.
     * @param value Value to set for the displayAppInformationRequiredState property.
     */
    public void setDisplayAppInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.backingStore.set("displayAppInformationRequiredState", value);
    }
    /**
     * Sets the displayLocationInformationRequiredState property value. Determines whether the user&apos;s Authenticator app shows them the geographic location of where the authentication request originated from.
     * @param value Value to set for the displayLocationInformationRequiredState property.
     */
    public void setDisplayLocationInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.backingStore.set("displayLocationInformationRequiredState", value);
    }
    /**
     * Sets the numberMatchingRequiredState property value. Specifies whether the user needs to enter a number in the Authenticator app from the login screen to complete their login. Value is ignored for phone sign-in notifications.
     * @param value Value to set for the numberMatchingRequiredState property.
     */
    public void setNumberMatchingRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.backingStore.set("numberMatchingRequiredState", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
