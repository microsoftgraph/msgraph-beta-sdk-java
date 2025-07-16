package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OS X Trusted Root Certificate configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSTrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link MacOSTrustedRootCertificate} and sets the default values.
     */
    public MacOSTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.macOSTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSTrustedRootCertificate}
     */
    @jakarta.annotation.Nonnull
    public static MacOSTrustedRootCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertFileName() {
        return this.backingStore.get("certFileName");
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
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("deploymentChannel", (n) -> { this.setDeploymentChannel(n.getEnumValue(AppleDeploymentChannel::forValue)); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this.backingStore.get("trustedRootCertificate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certFileName", this.getCertFileName());
        writer.writeEnumValue("deploymentChannel", this.getDeploymentChannel());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     */
    public void setCertFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certFileName", value);
    }
    /**
     * Sets the deploymentChannel property value. Indicates the deployment channel type used to deploy the configuration profile. Possible values are deviceChannel, userChannel. Possible values are: deviceChannel, userChannel, unknownFutureValue.
     * @param value Value to set for the deploymentChannel property.
     */
    public void setDeploymentChannel(@jakarta.annotation.Nullable final AppleDeploymentChannel value) {
        this.backingStore.set("deploymentChannel", value);
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the trustedRootCertificate property.
     */
    public void setTrustedRootCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("trustedRootCertificate", value);
    }
}
