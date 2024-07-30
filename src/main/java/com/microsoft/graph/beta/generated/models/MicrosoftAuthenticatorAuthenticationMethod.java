package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAuthenticatorAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftAuthenticatorAuthenticationMethod} and sets the default values.
     */
    public MicrosoftAuthenticatorAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftAuthenticatorAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethod();
    }
    /**
     * Gets the clientAppName property value. The app that the user has registered to use to approve push notifications. The possible values are: microsoftAuthenticator, outlookMobile, unknownFutureValue.
     * @return a {@link MicrosoftAuthenticatorAuthenticationMethodClientAppName}
     */
    @jakarta.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMethodClientAppName getClientAppName() {
        return this.backingStore.get("clientAppName");
    }
    /**
     * Gets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device isn't registered for passwordless Phone Sign-In.
     * @return a {@link Device}
     */
    @jakarta.annotation.Nullable
    public Device getDevice() {
        return this.backingStore.get("device");
    }
    /**
     * Gets the deviceTag property value. Tags containing app metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceTag() {
        return this.backingStore.get("deviceTag");
    }
    /**
     * Gets the displayName property value. The name of the device on which this app is registered.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientAppName", (n) -> { this.setClientAppName(n.getEnumValue(MicrosoftAuthenticatorAuthenticationMethodClientAppName::forValue)); });
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("phoneAppVersion", (n) -> { this.setPhoneAppVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneAppVersion() {
        return this.backingStore.get("phoneAppVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("clientAppName", this.getClientAppName());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("phoneAppVersion", this.getPhoneAppVersion());
    }
    /**
     * Sets the clientAppName property value. The app that the user has registered to use to approve push notifications. The possible values are: microsoftAuthenticator, outlookMobile, unknownFutureValue.
     * @param value Value to set for the clientAppName property.
     */
    public void setClientAppName(@jakarta.annotation.Nullable final MicrosoftAuthenticatorAuthenticationMethodClientAppName value) {
        this.backingStore.set("clientAppName", value);
    }
    /**
     * Sets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device isn't registered for passwordless Phone Sign-In.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Device value) {
        this.backingStore.set("device", value);
    }
    /**
     * Sets the deviceTag property value. Tags containing app metadata.
     * @param value Value to set for the deviceTag property.
     */
    public void setDeviceTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceTag", value);
    }
    /**
     * Sets the displayName property value. The name of the device on which this app is registered.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @param value Value to set for the phoneAppVersion property.
     */
    public void setPhoneAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneAppVersion", value);
    }
}
