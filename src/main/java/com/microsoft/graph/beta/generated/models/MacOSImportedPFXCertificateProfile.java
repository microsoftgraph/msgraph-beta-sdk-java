package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS PFX Import certificate profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSImportedPFXCertificateProfile extends MacOSCertificateProfileBase implements Parsable {
    /**
     * Instantiates a new {@link MacOSImportedPFXCertificateProfile} and sets the default values.
     */
    public MacOSImportedPFXCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.macOSImportedPFXCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSImportedPFXCertificateProfile}
     */
    @jakarta.annotation.Nonnull
    public static MacOSImportedPFXCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSImportedPFXCertificateProfile();
    }
    /**
     * Gets the deploymentChannel property value. Indicates the deployment channel type used to deploy the configuration profile. Possible values are deviceChannel, userChannel. Possible values are: deviceChannel, userChannel, unknownFutureValue.
     * @return a {@link AppleDeploymentChannel}
     */
    @jakarta.annotation.Nullable
    public AppleDeploymentChannel getDeploymentChannel() {
        return this.backingStore.get("deploymentChannel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deploymentChannel", (n) -> { this.setDeploymentChannel(n.getEnumValue(AppleDeploymentChannel::forValue)); });
        deserializerMap.put("intendedPurpose", (n) -> { this.setIntendedPurpose(n.getEnumValue(IntendedPurpose::forValue)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deploymentChannel", this.getDeploymentChannel());
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
    }
    /**
     * Sets the deploymentChannel property value. Indicates the deployment channel type used to deploy the configuration profile. Possible values are deviceChannel, userChannel. Possible values are: deviceChannel, userChannel, unknownFutureValue.
     * @param value Value to set for the deploymentChannel property.
     */
    public void setDeploymentChannel(@jakarta.annotation.Nullable final AppleDeploymentChannel value) {
        this.backingStore.set("deploymentChannel", value);
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
}
