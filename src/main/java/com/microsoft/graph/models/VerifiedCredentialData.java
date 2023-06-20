package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiedCredentialData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The authority ID for the issuer. */
    private String authority;
    /** Key-value pair of claims retrieved from the credential that the user presented, and the service verified. */
    private VerifiedCredentialClaims claims;
    /** The OdataType property */
    private String odataType;
    /** The list of credential types provided by the issuer. */
    private java.util.List<String> type;
    /**
     * Instantiates a new verifiedCredentialData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifiedCredentialData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiedCredentialData
     */
    @javax.annotation.Nonnull
    public static VerifiedCredentialData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedCredentialData();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authority property value. The authority ID for the issuer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthority() {
        return this.authority;
    }
    /**
     * Gets the claims property value. Key-value pair of claims retrieved from the credential that the user presented, and the service verified.
     * @return a verifiedCredentialClaims
     */
    @javax.annotation.Nullable
    public VerifiedCredentialClaims getClaims() {
        return this.claims;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("authority", (n) -> { this.setAuthority(n.getStringValue()); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getObjectValue(VerifiedCredentialClaims::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. The list of credential types provided by the issuer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authority", this.getAuthority());
        writer.writeObjectValue("claims", this.getClaims());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authority property value. The authority ID for the issuer.
     * @param value Value to set for the authority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthority(@javax.annotation.Nullable final String value) {
        this.authority = value;
    }
    /**
     * Sets the claims property value. Key-value pair of claims retrieved from the credential that the user presented, and the service verified.
     * @param value Value to set for the claims property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaims(@javax.annotation.Nullable final VerifiedCredentialClaims value) {
        this.claims = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. The list of credential types provided by the issuer.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final java.util.List<String> value) {
        this.type = value;
    }
}
