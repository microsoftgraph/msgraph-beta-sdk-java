package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fido2AuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link Fido2AuthenticationMethod} and sets the default values.
     */
    public Fido2AuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Fido2AuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static Fido2AuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethod();
    }
    /**
     * Gets the aaGuid property value. Authenticator Attestation GUID, an identifier that indicates the type (such as make and model) of the authenticator.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAaGuid() {
        return this.backingStore.get("aaGuid");
    }
    /**
     * Gets the attestationCertificates property value. The attestation certificate or certificates attached to this security key.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAttestationCertificates() {
        return this.backingStore.get("attestationCertificates");
    }
    /**
     * Gets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, notAttested, unknownFutureValue.
     * @return a {@link AttestationLevel}
     */
    @jakarta.annotation.Nullable
    public AttestationLevel getAttestationLevel() {
        return this.backingStore.get("attestationLevel");
    }
    /**
     * Gets the displayName property value. The display name of the key as given by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aaGuid", (n) -> { this.setAaGuid(n.getStringValue()); });
        deserializerMap.put("attestationCertificates", (n) -> { this.setAttestationCertificates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("attestationLevel", (n) -> { this.setAttestationLevel(n.getEnumValue(AttestationLevel::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("publicKeyCredential", (n) -> { this.setPublicKeyCredential(n.getObjectValue(WebauthnPublicKeyCredential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the publicKeyCredential property value. Contains the WebAuthn public key credential information being registered. Only used for write requests. This property isn&apos;t returned on read operations.
     * @return a {@link WebauthnPublicKeyCredential}
     */
    @jakarta.annotation.Nullable
    public WebauthnPublicKeyCredential getPublicKeyCredential() {
        return this.backingStore.get("publicKeyCredential");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aaGuid", this.getAaGuid());
        writer.writeCollectionOfPrimitiveValues("attestationCertificates", this.getAttestationCertificates());
        writer.writeEnumValue("attestationLevel", this.getAttestationLevel());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("model", this.getModel());
        writer.writeObjectValue("publicKeyCredential", this.getPublicKeyCredential());
    }
    /**
     * Sets the aaGuid property value. Authenticator Attestation GUID, an identifier that indicates the type (such as make and model) of the authenticator.
     * @param value Value to set for the aaGuid property.
     */
    public void setAaGuid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aaGuid", value);
    }
    /**
     * Sets the attestationCertificates property value. The attestation certificate or certificates attached to this security key.
     * @param value Value to set for the attestationCertificates property.
     */
    public void setAttestationCertificates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("attestationCertificates", value);
    }
    /**
     * Sets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, notAttested, unknownFutureValue.
     * @param value Value to set for the attestationLevel property.
     */
    public void setAttestationLevel(@jakarta.annotation.Nullable final AttestationLevel value) {
        this.backingStore.set("attestationLevel", value);
    }
    /**
     * Sets the displayName property value. The display name of the key as given by the user.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the publicKeyCredential property value. Contains the WebAuthn public key credential information being registered. Only used for write requests. This property isn&apos;t returned on read operations.
     * @param value Value to set for the publicKeyCredential property.
     */
    public void setPublicKeyCredential(@jakarta.annotation.Nullable final WebauthnPublicKeyCredential value) {
        this.backingStore.set("publicKeyCredential", value);
    }
}
