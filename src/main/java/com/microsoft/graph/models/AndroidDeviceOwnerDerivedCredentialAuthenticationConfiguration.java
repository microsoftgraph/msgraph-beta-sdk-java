package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android COBO Derived Credential profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration and sets the default values.
     */
    public AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerDerivedCredentialAuthenticationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration();
    }
    /**
     * Gets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @return a AndroidDeviceOwnerCertificateAccessType
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerCertificateAccessType getCertificateAccessType() {
        return this.backingStore.get("certificateAccessType");
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a DeviceManagementDerivedCredentialSettings
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.backingStore.get("derivedCredentialSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAccessType", (n) -> { this.setCertificateAccessType(n.getEnumValue(AndroidDeviceOwnerCertificateAccessType.class)); });
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("silentCertificateAccessDetails", (n) -> { this.setSilentCertificateAccessDetails(n.getCollectionOfObjectValues(AndroidDeviceOwnerSilentCertificateAccess::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @return a java.util.List<AndroidDeviceOwnerSilentCertificateAccess>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSilentCertificateAccess> getSilentCertificateAccessDetails() {
        return this.backingStore.get("silentCertificateAccessDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateAccessType", this.getCertificateAccessType());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeCollectionOfObjectValues("silentCertificateAccessDetails", this.getSilentCertificateAccessDetails());
    }
    /**
     * Sets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @param value Value to set for the certificateAccessType property.
     */
    public void setCertificateAccessType(@jakarta.annotation.Nullable final AndroidDeviceOwnerCertificateAccessType value) {
        this.backingStore.set("certificateAccessType", value);
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.backingStore.set("derivedCredentialSettings", value);
    }
    /**
     * Sets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @param value Value to set for the silentCertificateAccessDetails property.
     */
    public void setSilentCertificateAccessDetails(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerSilentCertificateAccess> value) {
        this.backingStore.set("silentCertificateAccessDetails", value);
    }
}
