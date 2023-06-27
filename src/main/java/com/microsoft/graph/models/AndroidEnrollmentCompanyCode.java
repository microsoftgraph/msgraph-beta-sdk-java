package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class to hold specialty enrollment data used for enrolling via Google's Android Management API, such as Token, Url, and QR code content
 */
public class AndroidEnrollmentCompanyCode implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Enrollment Token used by the User to enroll their device.
     */
    private String enrollmentToken;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * String used to generate a QR code for the token.
     */
    private String qrCodeContent;
    /**
     * Generated QR code for the token.
     */
    private MimeContent qrCodeImage;
    /**
     * Instantiates a new androidEnrollmentCompanyCode and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidEnrollmentCompanyCode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidEnrollmentCompanyCode
     */
    @javax.annotation.Nonnull
    public static AndroidEnrollmentCompanyCode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidEnrollmentCompanyCode();
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
     * Gets the enrollmentToken property value. Enrollment Token used by the User to enroll their device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentToken() {
        return this.enrollmentToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("enrollmentToken", (n) -> { this.setEnrollmentToken(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("qrCodeContent", (n) -> { this.setQrCodeContent(n.getStringValue()); });
        deserializerMap.put("qrCodeImage", (n) -> { this.setQrCodeImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
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
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQrCodeContent() {
        return this.qrCodeContent;
    }
    /**
     * Gets the qrCodeImage property value. Generated QR code for the token.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this.qrCodeImage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("enrollmentToken", this.getEnrollmentToken());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qrCodeContent", this.getQrCodeContent());
        writer.writeObjectValue("qrCodeImage", this.getQrCodeImage());
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
     * Sets the enrollmentToken property value. Enrollment Token used by the User to enroll their device.
     * @param value Value to set for the enrollmentToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentToken(@javax.annotation.Nullable final String value) {
        this.enrollmentToken = value;
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
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQrCodeContent(@javax.annotation.Nullable final String value) {
        this.qrCodeContent = value;
    }
    /**
     * Sets the qrCodeImage property value. Generated QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQrCodeImage(@javax.annotation.Nullable final MimeContent value) {
        this.qrCodeImage = value;
    }
}
