package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerImportedPFXCertificateProfile extends AndroidDeviceOwnerCertificateProfileBase implements Parsable {
    /** Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue. */
    private AndroidDeviceOwnerCertificateAccessType _certificateAccessType;
    /** PFX Import Options. */
    private IntendedPurpose _intendedPurpose;
    /** Certificate state for devices. This collection can contain a maximum of 2147483647 elements. */
    private java.util.List<ManagedDeviceCertificateState> _managedDeviceCertificateStates;
    /** Certificate access information. This collection can contain a maximum of 50 elements. */
    private java.util.List<AndroidDeviceOwnerSilentCertificateAccess> _silentCertificateAccessDetails;
    /**
     * Instantiates a new AndroidDeviceOwnerImportedPFXCertificateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerImportedPFXCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerImportedPFXCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerImportedPFXCertificateProfile
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerImportedPFXCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerImportedPFXCertificateProfile();
    }
    /**
     * Gets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @return a androidDeviceOwnerCertificateAccessType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerCertificateAccessType getCertificateAccessType() {
        return this._certificateAccessType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerImportedPFXCertificateProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAccessType", (n) -> { currentObject.setCertificateAccessType(n.getEnumValue(AndroidDeviceOwnerCertificateAccessType.class)); });
        deserializerMap.put("intendedPurpose", (n) -> { currentObject.setIntendedPurpose(n.getEnumValue(IntendedPurpose.class)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { currentObject.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("silentCertificateAccessDetails", (n) -> { currentObject.setSilentCertificateAccessDetails(n.getCollectionOfObjectValues(AndroidDeviceOwnerSilentCertificateAccess::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intendedPurpose property value. PFX Import Options.
     * @return a intendedPurpose
     */
    @javax.annotation.Nullable
    public IntendedPurpose getIntendedPurpose() {
        return this._intendedPurpose;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a managedDeviceCertificateState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this._managedDeviceCertificateStates;
    }
    /**
     * Gets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @return a androidDeviceOwnerSilentCertificateAccess
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSilentCertificateAccess> getSilentCertificateAccessDetails() {
        return this._silentCertificateAccessDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateAccessType", this.getCertificateAccessType());
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeCollectionOfObjectValues("silentCertificateAccessDetails", this.getSilentCertificateAccessDetails());
    }
    /**
     * Sets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @param value Value to set for the certificateAccessType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateAccessType(@javax.annotation.Nullable final AndroidDeviceOwnerCertificateAccessType value) {
        this._certificateAccessType = value;
    }
    /**
     * Sets the intendedPurpose property value. PFX Import Options.
     * @param value Value to set for the intendedPurpose property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntendedPurpose(@javax.annotation.Nullable final IntendedPurpose value) {
        this._intendedPurpose = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this._managedDeviceCertificateStates = value;
    }
    /**
     * Sets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @param value Value to set for the silentCertificateAccessDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSilentCertificateAccessDetails(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerSilentCertificateAccess> value) {
        this._silentCertificateAccessDetails = value;
    }
}
