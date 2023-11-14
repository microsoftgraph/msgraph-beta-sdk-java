package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlatformCredentialAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * The date and time that this Platform Credential Key was registered.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The registered device on which this Platform Credential resides. Supports $expand. When you get a user's Platform Credential registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/platformCredentialAuthenticationMethod/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     */
    private Device device;
    /**
     * The name of the device on which Platform Credential is registered.
     */
    private String displayName;
    /**
     * Key strength of this Platform Credential key. Possible values are: normal, weak, unknown.
     */
    private AuthenticationMethodKeyStrength keyStrength;
    /**
     * Platform on which this Platform Credential key is present. Possible values are: unknown, windows, macOS,iOS, android, linux.
     */
    private AuthenticationMethodPlatform platform;
    /**
     * Instantiates a new PlatformCredentialAuthenticationMethod and sets the default values.
     */
    public PlatformCredentialAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.platformCredentialAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlatformCredentialAuthenticationMethod
     */
    @jakarta.annotation.Nonnull
    public static PlatformCredentialAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlatformCredentialAuthenticationMethod();
    }
    /**
     * Gets the createdDateTime property value. The date and time that this Platform Credential Key was registered.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the device property value. The registered device on which this Platform Credential resides. Supports $expand. When you get a user's Platform Credential registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/platformCredentialAuthenticationMethod/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     * @return a Device
     */
    @jakarta.annotation.Nullable
    public Device getDevice() {
        return this.device;
    }
    /**
     * Gets the displayName property value. The name of the device on which Platform Credential is registered.
     * @return a String
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("keyStrength", (n) -> { this.setKeyStrength(n.getEnumValue(AuthenticationMethodKeyStrength.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(AuthenticationMethodPlatform.class)); });
        return deserializerMap;
    }
    /**
     * Gets the keyStrength property value. Key strength of this Platform Credential key. Possible values are: normal, weak, unknown.
     * @return a AuthenticationMethodKeyStrength
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodKeyStrength getKeyStrength() {
        return this.keyStrength;
    }
    /**
     * Gets the platform property value. Platform on which this Platform Credential key is present. Possible values are: unknown, windows, macOS,iOS, android, linux.
     * @return a AuthenticationMethodPlatform
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodPlatform getPlatform() {
        return this.platform;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("keyStrength", this.getKeyStrength());
        writer.writeEnumValue("platform", this.getPlatform());
    }
    /**
     * Sets the createdDateTime property value. The date and time that this Platform Credential Key was registered.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the device property value. The registered device on which this Platform Credential resides. Supports $expand. When you get a user's Platform Credential registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/platformCredentialAuthenticationMethod/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Device value) {
        this.device = value;
    }
    /**
     * Sets the displayName property value. The name of the device on which Platform Credential is registered.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the keyStrength property value. Key strength of this Platform Credential key. Possible values are: normal, weak, unknown.
     * @param value Value to set for the keyStrength property.
     */
    public void setKeyStrength(@jakarta.annotation.Nullable final AuthenticationMethodKeyStrength value) {
        this.keyStrength = value;
    }
    /**
     * Sets the platform property value. Platform on which this Platform Credential key is present. Possible values are: unknown, windows, macOS,iOS, android, linux.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final AuthenticationMethodPlatform value) {
        this.platform = value;
    }
}
