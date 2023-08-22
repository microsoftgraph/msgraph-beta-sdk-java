package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAuthenticatorAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * The app that the user has registered to use to approve push notifications. The possible values are: microsoftAuthenticator, outlookMobile, unknownFutureValue.
     */
    private MicrosoftAuthenticatorAuthenticationMethodClientAppName clientAppName;
    /**
     * The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In.
     */
    private Device device;
    /**
     * Tags containing app metadata.
     */
    private String deviceTag;
    /**
     * The name of the device on which this app is registered.
     */
    private String displayName;
    /**
     * Numerical version of this instance of the Authenticator app.
     */
    private String phoneAppVersion;
    /**
     * Instantiates a new microsoftAuthenticatorAuthenticationMethod and sets the default values.
     */
    public MicrosoftAuthenticatorAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftAuthenticatorAuthenticationMethod
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethod();
    }
    /**
     * Gets the clientAppName property value. The app that the user has registered to use to approve push notifications. The possible values are: microsoftAuthenticator, outlookMobile, unknownFutureValue.
     * @return a microsoftAuthenticatorAuthenticationMethodClientAppName
     */
    @jakarta.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMethodClientAppName getClientAppName() {
        return this.clientAppName;
    }
    /**
     * Gets the createdDateTime property value. The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @return a device
     */
    @jakarta.annotation.Nullable
    public Device getDevice() {
        return this.device;
    }
    /**
     * Gets the deviceTag property value. Tags containing app metadata.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceTag() {
        return this.deviceTag;
    }
    /**
     * Gets the displayName property value. The name of the device on which this app is registered.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientAppName", (n) -> { this.setClientAppName(n.getEnumValue(MicrosoftAuthenticatorAuthenticationMethodClientAppName.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("phoneAppVersion", (n) -> { this.setPhoneAppVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPhoneAppVersion() {
        return this.phoneAppVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("clientAppName", this.getClientAppName());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
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
        this.clientAppName = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Device value) {
        this.device = value;
    }
    /**
     * Sets the deviceTag property value. Tags containing app metadata.
     * @param value Value to set for the deviceTag property.
     */
    public void setDeviceTag(@jakarta.annotation.Nullable final String value) {
        this.deviceTag = value;
    }
    /**
     * Sets the displayName property value. The name of the device on which this app is registered.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @param value Value to set for the phoneAppVersion property.
     */
    public void setPhoneAppVersion(@jakarta.annotation.Nullable final String value) {
        this.phoneAppVersion = value;
    }
}
