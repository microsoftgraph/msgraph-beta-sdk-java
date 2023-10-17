package com.microsoft.graph.models;

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
     * PFX Import Options.
     */
    private IntendedPurpose intendedPurpose;
    /**
     * Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     */
    private java.util.List<ManagedDeviceCertificateState> managedDeviceCertificateStates;
    /**
     * Instantiates a new MacOSImportedPFXCertificateProfile and sets the default values.
     */
    public MacOSImportedPFXCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.macOSImportedPFXCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSImportedPFXCertificateProfile
     */
    @jakarta.annotation.Nonnull
    public static MacOSImportedPFXCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSImportedPFXCertificateProfile();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intendedPurpose", (n) -> { this.setIntendedPurpose(n.getEnumValue(IntendedPurpose.class)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intendedPurpose property value. PFX Import Options.
     * @return a IntendedPurpose
     */
    @jakarta.annotation.Nullable
    public IntendedPurpose getIntendedPurpose() {
        return this.intendedPurpose;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a java.util.List<ManagedDeviceCertificateState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.managedDeviceCertificateStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
    }
    /**
     * Sets the intendedPurpose property value. PFX Import Options.
     * @param value Value to set for the intendedPurpose property.
     */
    public void setIntendedPurpose(@jakarta.annotation.Nullable final IntendedPurpose value) {
        this.intendedPurpose = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     */
    public void setManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.managedDeviceCertificateStates = value;
    }
}
