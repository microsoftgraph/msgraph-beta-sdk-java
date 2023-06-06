package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * License summary of a given app in a token.
 */
public class VppTokenLicenseSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The Apple Id associated with the given Apple Volume Purchase Program Token. */
    private String appleId;
    /** The number of VPP licenses available. */
    private Integer availableLicenseCount;
    /** The OdataType property */
    private String odataType;
    /** The organization associated with the Apple Volume Purchase Program Token. */
    private String organizationName;
    /** The number of VPP licenses in use. */
    private Integer usedLicenseCount;
    /** Identifier of the VPP token. */
    private String vppTokenId;
    /**
     * Instantiates a new vppTokenLicenseSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VppTokenLicenseSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppTokenLicenseSummary
     */
    @javax.annotation.Nonnull
    public static VppTokenLicenseSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppTokenLicenseSummary();
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
     * Gets the appleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleId() {
        return this.appleId;
    }
    /**
     * Gets the availableLicenseCount property value. The number of VPP licenses available.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAvailableLicenseCount() {
        return this.availableLicenseCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("appleId", (n) -> { this.setAppleId(n.getStringValue()); });
        deserializerMap.put("availableLicenseCount", (n) -> { this.setAvailableLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("vppTokenId", (n) -> { this.setVppTokenId(n.getStringValue()); });
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
     * Gets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.usedLicenseCount;
    }
    /**
     * Gets the vppTokenId property value. Identifier of the VPP token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenId() {
        return this.vppTokenId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeIntegerValue("availableLicenseCount", this.getAvailableLicenseCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeStringValue("vppTokenId", this.getVppTokenId());
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
     * Sets the appleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the appleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleId(@javax.annotation.Nullable final String value) {
        this.appleId = value;
    }
    /**
     * Sets the availableLicenseCount property value. The number of VPP licenses available.
     * @param value Value to set for the availableLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableLicenseCount(@javax.annotation.Nullable final Integer value) {
        this.availableLicenseCount = value;
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
     * Sets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token.
     * @param value Value to set for the organizationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationName(@javax.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this.usedLicenseCount = value;
    }
    /**
     * Sets the vppTokenId property value. Identifier of the VPP token.
     * @param value Value to set for the vppTokenId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVppTokenId(@javax.annotation.Nullable final String value) {
        this.vppTokenId = value;
    }
}
