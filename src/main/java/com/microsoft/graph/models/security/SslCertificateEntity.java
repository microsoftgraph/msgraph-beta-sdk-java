package com.microsoft.graph.models.security;

import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SslCertificateEntity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address property
     */
    private PhysicalAddress address;
    /**
     * The alternateNames property
     */
    private java.util.List<String> alternateNames;
    /**
     * The commonName property
     */
    private String commonName;
    /**
     * The email property
     */
    private String email;
    /**
     * The givenName property
     */
    private String givenName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The organizationName property
     */
    private String organizationName;
    /**
     * The organizationUnitName property
     */
    private String organizationUnitName;
    /**
     * The serialNumber property
     */
    private String serialNumber;
    /**
     * The surname property
     */
    private String surname;
    /**
     * Instantiates a new sslCertificateEntity and sets the default values.
     */
    public SslCertificateEntity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sslCertificateEntity
     */
    @jakarta.annotation.Nonnull
    public static SslCertificateEntity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SslCertificateEntity();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. The address property
     * @return a physicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the alternateNames property value. The alternateNames property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternateNames() {
        return this.alternateNames;
    }
    /**
     * Gets the commonName property value. The commonName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCommonName() {
        return this.commonName;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("alternateNames", (n) -> { this.setAlternateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("commonName", (n) -> { this.setCommonName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("organizationUnitName", (n) -> { this.setOrganizationUnitName(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The givenName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the organizationName property value. The organizationName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Gets the organizationUnitName property value. The organizationUnitName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }
    /**
     * Gets the serialNumber property value. The serialNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeCollectionOfPrimitiveValues("alternateNames", this.getAlternateNames());
        writer.writeStringValue("commonName", this.getCommonName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeStringValue("organizationUnitName", this.getOrganizationUnitName());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the alternateNames property value. The alternateNames property
     * @param value Value to set for the alternateNames property.
     */
    public void setAlternateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alternateNames = value;
    }
    /**
     * Sets the commonName property value. The commonName property
     * @param value Value to set for the commonName property.
     */
    public void setCommonName(@jakarta.annotation.Nullable final String value) {
        this.commonName = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organizationName property value. The organizationName property
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the organizationUnitName property value. The organizationUnitName property
     * @param value Value to set for the organizationUnitName property.
     */
    public void setOrganizationUnitName(@jakarta.annotation.Nullable final String value) {
        this.organizationUnitName = value;
    }
    /**
     * Sets the serialNumber property value. The serialNumber property
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.surname = value;
    }
}
