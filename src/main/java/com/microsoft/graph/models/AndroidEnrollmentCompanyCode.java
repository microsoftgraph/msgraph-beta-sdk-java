package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class to hold specialty enrollment data used for enrolling via Google's Android Management API, such as Token, Url, and QR code content
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidEnrollmentCompanyCode implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AndroidEnrollmentCompanyCode and sets the default values.
     */
    public AndroidEnrollmentCompanyCode() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidEnrollmentCompanyCode
     */
    @jakarta.annotation.Nonnull
    public static AndroidEnrollmentCompanyCode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidEnrollmentCompanyCode();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the enrollmentToken property value. Enrollment Token used by the User to enroll their device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentToken() {
        return this.backingStore.get("enrollmentToken");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQrCodeContent() {
        return this.backingStore.get("qrCodeContent");
    }
    /**
     * Gets the qrCodeImage property value. Generated QR code for the token.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this.backingStore.get("qrCodeImage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("enrollmentToken", this.getEnrollmentToken());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qrCodeContent", this.getQrCodeContent());
        writer.writeObjectValue("qrCodeImage", this.getQrCodeImage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the enrollmentToken property value. Enrollment Token used by the User to enroll their device.
     * @param value Value to set for the enrollmentToken property.
     */
    public void setEnrollmentToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrollmentToken", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     */
    public void setQrCodeContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("qrCodeContent", value);
    }
    /**
     * Sets the qrCodeImage property value. Generated QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     */
    public void setQrCodeImage(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("qrCodeImage", value);
    }
}
