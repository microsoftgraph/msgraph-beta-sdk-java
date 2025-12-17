package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Device Owner PFX Import certificate profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerImportedPFXCertificateProfile extends AndroidDeviceOwnerCertificateProfileBase implements Parsable {
    /**
     * Instantiates a new {@link AndroidDeviceOwnerImportedPFXCertificateProfile} and sets the default values.
     */
    public AndroidDeviceOwnerImportedPFXCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerImportedPFXCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidDeviceOwnerImportedPFXCertificateProfile}
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerImportedPFXCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerImportedPFXCertificateProfile();
    }
    /**
     * Gets the certificateAccessType property value. Certificate access type. The possible values are: userApproval, specificApps, unknownFutureValue.
     * @return a {@link AndroidDeviceOwnerCertificateAccessType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerCertificateAccessType getCertificateAccessType() {
        return this.backingStore.get("certificateAccessType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAccessType", (n) -> { this.setCertificateAccessType(n.getEnumValue(AndroidDeviceOwnerCertificateAccessType::forValue)); });
        deserializerMap.put("intendedPurpose", (n) -> { this.setIntendedPurpose(n.getEnumValue(IntendedPurpose::forValue)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("silentCertificateAccessDetails", (n) -> { this.setSilentCertificateAccessDetails(n.getCollectionOfObjectValues(AndroidDeviceOwnerSilentCertificateAccess::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intendedPurpose property value. PFX Import Options.
     * @return a {@link IntendedPurpose}
     */
    @jakarta.annotation.Nullable
    public IntendedPurpose getIntendedPurpose() {
        return this.backingStore.get("intendedPurpose");
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a {@link java.util.List<ManagedDeviceCertificateState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.backingStore.get("managedDeviceCertificateStates");
    }
    /**
     * Gets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerSilentCertificateAccess>}
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
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeCollectionOfObjectValues("silentCertificateAccessDetails", this.getSilentCertificateAccessDetails());
    }
    /**
     * Sets the certificateAccessType property value. Certificate access type. The possible values are: userApproval, specificApps, unknownFutureValue.
     * @param value Value to set for the certificateAccessType property.
     */
    public void setCertificateAccessType(@jakarta.annotation.Nullable final AndroidDeviceOwnerCertificateAccessType value) {
        this.backingStore.set("certificateAccessType", value);
    }
    /**
     * Sets the intendedPurpose property value. PFX Import Options.
     * @param value Value to set for the intendedPurpose property.
     */
    public void setIntendedPurpose(@jakarta.annotation.Nullable final IntendedPurpose value) {
        this.backingStore.set("intendedPurpose", value);
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     */
    public void setManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.backingStore.set("managedDeviceCertificateStates", value);
    }
    /**
     * Sets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @param value Value to set for the silentCertificateAccessDetails property.
     */
    public void setSilentCertificateAccessDetails(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerSilentCertificateAccess> value) {
        this.backingStore.set("silentCertificateAccessDetails", value);
    }
}
