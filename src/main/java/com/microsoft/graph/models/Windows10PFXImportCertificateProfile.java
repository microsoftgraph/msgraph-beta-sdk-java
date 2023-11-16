package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Deprecated
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10PFXImportCertificateProfile extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10PFXImportCertificateProfile and sets the default values.
     */
    public Windows10PFXImportCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.windows10PFXImportCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10PFXImportCertificateProfile
     */
    @jakarta.annotation.Nonnull
    public static Windows10PFXImportCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10PFXImportCertificateProfile();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keyStorageProvider", (n) -> { this.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
        return deserializerMap;
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a KeyStorageProviderOption
     */
    @jakarta.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this.BackingStore.get("keyStorageProvider");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     */
    public void setKeyStorageProvider(@jakarta.annotation.Nullable final KeyStorageProviderOption value) {
        this.BackingStore.set("keyStorageProvider", value);
    }
}
