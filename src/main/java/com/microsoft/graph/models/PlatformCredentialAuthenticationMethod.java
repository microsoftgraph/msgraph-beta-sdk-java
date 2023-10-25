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
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The device property
     */
    private Device device;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The keyStrength property
     */
    private AuthenticationMethodKeyStrength keyStrength;
    /**
     * The platform property
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
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the device property value. The device property
     * @return a Device
     */
    @jakarta.annotation.Nullable
    public Device getDevice() {
        return this.device;
    }
    /**
     * Gets the displayName property value. The displayName property
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
     * Gets the keyStrength property value. The keyStrength property
     * @return a AuthenticationMethodKeyStrength
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodKeyStrength getKeyStrength() {
        return this.keyStrength;
    }
    /**
     * Gets the platform property value. The platform property
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
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the device property value. The device property
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Device value) {
        this.device = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the keyStrength property value. The keyStrength property
     * @param value Value to set for the keyStrength property.
     */
    public void setKeyStrength(@jakarta.annotation.Nullable final AuthenticationMethodKeyStrength value) {
        this.keyStrength = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final AuthenticationMethodPlatform value) {
        this.platform = value;
    }
}
