package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Derived Credential profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosDerivedCredentialAuthenticationConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link IosDerivedCredentialAuthenticationConfiguration} and sets the default values.
     */
    public IosDerivedCredentialAuthenticationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosDerivedCredentialAuthenticationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosDerivedCredentialAuthenticationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IosDerivedCredentialAuthenticationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDerivedCredentialAuthenticationConfiguration();
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a {@link DeviceManagementDerivedCredentialSettings}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.backingStore.get("derivedCredentialSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.backingStore.set("derivedCredentialSettings", value);
    }
}
