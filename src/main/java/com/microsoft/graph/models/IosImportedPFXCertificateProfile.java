package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosImportedPFXCertificateProfile extends IosCertificateProfile implements Parsable {
    /** PFX Import Options. */
    private IntendedPurpose _intendedPurpose;
    /** Certificate state for devices. This collection can contain a maximum of 2147483647 elements. */
    private java.util.List<ManagedDeviceCertificateState> _managedDeviceCertificateStates;
    /**
     * Instantiates a new IosImportedPFXCertificateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosImportedPFXCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.iosImportedPFXCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosImportedPFXCertificateProfile
     */
    @javax.annotation.Nonnull
    public static IosImportedPFXCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosImportedPFXCertificateProfile();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosImportedPFXCertificateProfile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("intendedPurpose", (n) -> { currentObject.setIntendedPurpose(n.getEnumValue(IntendedPurpose.class)); });
            this.put("managedDeviceCertificateStates", (n) -> { currentObject.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
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
}
