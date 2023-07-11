package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
public class IosCertificateProfile extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new iosCertificateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.iosCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosCertificateProfile
     */
    @javax.annotation.Nonnull
    public static IosCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosCertificateProfileBase": return new IosCertificateProfileBase();
                case "#microsoft.graph.iosImportedPFXCertificateProfile": return new IosImportedPFXCertificateProfile();
                case "#microsoft.graph.iosPkcsCertificateProfile": return new IosPkcsCertificateProfile();
                case "#microsoft.graph.iosScepCertificateProfile": return new IosScepCertificateProfile();
            }
        }
        return new IosCertificateProfile();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
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
    }
}
